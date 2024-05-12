package com.bytedance.bae.webrtc;

import X.C16880lQ;
import X.X1D;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.bae.webrtc.observer.MicMuteChangedObserver;
import com.bytedance.bae.webrtc.observer.VolumeChangedObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes12.dex */
public class WebRtcAudioManager implements VolumeChangedObserver.OnVolumeChangedListener, MicMuteChangedObserver.OnMicMuteChangedListener {
    public static int MAX_VOLUMED;
    public static int MAX_VOLUMED_VOIP;
    public static boolean blacklistDeviceForOpenSLESUsage;
    public static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    public static boolean useStereoInput;
    public static boolean useStereoOutput;
    public boolean aAudio;
    public int apiLevel;
    public final AudioManager audioManager;
    public boolean hardwareAEC;
    public boolean hardwareAGC;
    public boolean hardwareNS;
    public boolean initialized;
    public int inputBufferSize;
    public int inputChannels;
    public Set<NativeRecordCallbackInfo> lastRecordcallbackInfos;
    public boolean lowLatencyInput;
    public boolean lowLatencyOutput;
    public MicMuteChangedObserver mMicMuteChangedObserver;
    public VolumeChangedObserver mVolumeChangedObserver;
    public int microphoneVolume = 100;
    public long nativeAudioManager;
    public int nativeChannels;
    public int nativeSampleRate;
    public int outputBufferSize;
    public int outputChannels;
    public AudioManagerPhoneStateListener phoneStateListener;
    public int preferAudioLayer;
    public boolean proAudio;
    public AudioManagerRecordingCallback recordingCallback;
    public int sampleRate;

    /* loaded from: classes12.dex */
    public static final class NativeAudioLayer {
    }

    private int getPreferAudioLayer() {
        return 0;
    }

    private boolean init() {
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init(");
            LIZ.append(this);
            LIZ.append(")");
            LIZ.append(WebRtcAudioUtils.getThreadInfo());
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            if (this.initialized) {
                return true;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("audio mode is: ");
            LIZ2.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ2));
            if (Build.VERSION.SDK_INT >= 24 && this.recordingCallback == null) {
                AudioManagerRecordingCallback audioManagerRecordingCallback = new AudioManagerRecordingCallback(this);
                this.recordingCallback = audioManagerRecordingCallback;
                try {
                    this.audioManager.registerAudioRecordingCallback(audioManagerRecordingCallback, null);
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    RXLogging.e("WebRtcAudioManager", stringWriter.toString());
                }
            }
            registerPhoneStateListener(32);
            this.mVolumeChangedObserver = new VolumeChangedObserver(this);
            int i = 0;
            try {
                int mode = this.audioManager.getMode();
                if (mode == 0) {
                    onVolumeChanged(3, this.audioManager.getStreamVolume(3));
                } else if (mode == 3) {
                    onVolumeChanged(0, this.audioManager.getStreamVolume(0));
                }
                this.initialized = true;
            } catch (Exception e2) {
                StringWriter stringWriter2 = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter2));
                RXLogging.e("WebRtcAudioManager", stringWriter2.toString());
            }
            this.mMicMuteChangedObserver = new MicMuteChangedObserver(this);
            try {
                boolean isMicrophoneMute = this.audioManager.isMicrophoneMute();
                if (!isMicrophoneMute) {
                    i = 100;
                }
                this.microphoneVolume = i;
                nativeOnMicMuteChanged(isMicrophoneMute, this.nativeAudioManager);
            } catch (Exception e3) {
                StringWriter stringWriter3 = new StringWriter();
                e3.printStackTrace(new PrintWriter(stringWriter3));
                RXLogging.e("WebRtcAudioManager", stringWriter3.toString());
            }
            return true;
        }
    }

    private boolean isCommunicationModeEnabled() {
        try {
            return 3 == this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            return false;
        }
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, int i7, long j);

    private native void nativeOnHardwareEarbackReleased(boolean z, long j);

    private native void nativeOnHardwareEarbackSupported(boolean z, long j);

    private native void nativeOnMicMuteChanged(boolean z, long j);

    private native void nativeOnPhoneStateListenerRegisterChanged(boolean z, long j);

    private native void onVolumeChanged(int i, int i2, long j);

    private void terminate() {
        AudioManagerRecordingCallback audioManagerRecordingCallback;
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("terminate(");
            LIZ.append(this);
            LIZ.append(")");
            LIZ.append(WebRtcAudioUtils.getThreadInfo());
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            if (Build.VERSION.SDK_INT >= 24 && (audioManagerRecordingCallback = this.recordingCallback) != null) {
                try {
                    this.audioManager.unregisterAudioRecordingCallback(audioManagerRecordingCallback);
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    RXLogging.e("WebRtcAudioManager", stringWriter.toString());
                }
                this.recordingCallback = null;
            }
            registerPhoneStateListener(0);
            VolumeChangedObserver volumeChangedObserver = this.mVolumeChangedObserver;
            if (volumeChangedObserver != null) {
                volumeChangedObserver.release();
                this.mVolumeChangedObserver = null;
            }
            MicMuteChangedObserver micMuteChangedObserver = this.mMicMuteChangedObserver;
            if (micMuteChangedObserver != null) {
                micMuteChangedObserver.release();
                this.mMicMuteChangedObserver = null;
            }
            this.nativeAudioManager = 0L;
            this.initialized = false;
        }
    }

    public native void nativeOnPhoneCallEnd(long j);

    public native void nativeOnPhoneCallStart(long j);

    public native void nativeRecordCallbackChanged(Object[] objArr, long j);

    private int[] getActiveRecordingSessionIds() {
        AudioManager audioManager = this.audioManager;
        if (Build.VERSION.SDK_INT < 24 || audioManager == null) {
            return new int[0];
        }
        try {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < activeRecordingConfigurations.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(activeRecordingConfigurations, i);
                if (audioRecordingConfiguration != null) {
                    arrayList.add(Integer.valueOf(audioRecordingConfiguration.getClientAudioSessionId()));
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) ListProtector.get(arrayList, i2)).intValue();
            }
            return iArr;
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    private int getFixedDevicePlayVolume() {
        try {
            int mode = this.audioManager.getMode();
            int i = 3;
            if (mode != 0) {
                if (mode != 1) {
                    if (mode == 2 || mode == 3) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            }
            return (int) ((this.audioManager.getStreamVolume(i) * 100.0d) / C16880lQ.LLLLLLZZ(this.audioManager, i));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getMode() {
        try {
            return this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getSampleRateForApiLevel() {
        String str;
        try {
            str = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (str == null) {
                return WebRtcAudioUtils.getDefaultSampleRateHz();
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            str = "";
        }
        return CastIntegerProtector.parseInt(str);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean isAAudioSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsage;
        } else {
            deviceIsBlacklistedForOpenSLESUsage = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (deviceIsBlacklistedForOpenSLESUsage) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Build.MODEL);
            LIZ.append(" is blacklisted for OpenSL ES usage!");
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isProAudioSupported() {
        if (Build.VERSION.SDK_INT >= 23 && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return true;
        }
        return false;
    }

    private boolean isRecordShouldUseVoiceRecognition() {
        if (Build.BRAND.equals("samsung")) {
            return true;
        }
        return false;
    }

    private boolean isWiredHeadsetOn() {
        try {
            return this.audioManager.isWiredHeadsetOn();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            return false;
        }
    }

    private void refreshAudioParameters() {
        storeAudioParameters();
        nativeCacheAudioParameters(this.apiLevel, this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, this.preferAudioLayer, this.nativeAudioManager);
    }

    private void storeAudioParameters() {
        int i;
        int minOutputFrameSize;
        int minInputFrameSize;
        this.apiLevel = Build.VERSION.SDK_INT;
        int i2 = 2;
        if (getStereoOutput()) {
            i = 2;
        } else {
            i = 1;
        }
        this.outputChannels = i;
        if (!getStereoInput()) {
            i2 = 1;
        }
        this.inputChannels = i2;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            minOutputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minOutputFrameSize = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = minOutputFrameSize;
        if (this.lowLatencyInput) {
            minInputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minInputFrameSize = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = minInputFrameSize;
        this.preferAudioLayer = getPreferAudioLayer();
    }

    private String getAudioDeviceInfo() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{ Audio State: audio mode: ");
            LIZ.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            LIZ.append(", has mic: ");
            LIZ.append(WebRtcAudioUtils.hasMicrophone());
            LIZ.append(", music active: ");
            LIZ.append(this.audioManager.isMusicActive());
            LIZ.append(", speakerphone: ");
            LIZ.append(this.audioManager.isSpeakerphoneOn());
            LIZ.append(", headset: ");
            LIZ.append(this.audioManager.isWiredHeadsetOn());
            LIZ.append("BT SCO: ");
            LIZ.append(this.audioManager.isBluetoothScoOn());
            LIZ.append("music actived: ");
            LIZ.append(this.audioManager.isMusicActive());
            LIZ.append("permission: ");
            LIZ.append(WebRtcAudioUtils.isPermissionGranted());
            LIZ.append(" bt_sco_available_off_call: ");
            LIZ.append(this.audioManager.isBluetoothScoAvailableOffCall());
            LIZ.append(" }");
            return X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String str;
        if (!isLowLatencyOutputSupported()) {
            return 256;
        }
        try {
            str = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            if (str == null) {
                return 256;
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.e("WebRtcAudioManager", stringWriter.toString());
            str = "";
        }
        return CastIntegerProtector.parseInt(str);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            RXLogging.i("WebRtcAudioManager", "Running emulator, overriding sample rate to 8 kHz.");
            return LiveCenterDelayLoadSetting.DEFAULT;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Default sample rate is overriden to ");
            LIZ.append(WebRtcAudioUtils.getDefaultSampleRateHz());
            LIZ.append(" Hz");
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Sample rate is set to ");
        LIZ2.append(defaultSampleRateHz);
        LIZ2.append(" Hz");
        RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ2));
        return defaultSampleRateHz;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    public boolean isLowLatencyInputSupported() {
        if (isLowLatencyOutputSupported()) {
            return true;
        }
        return false;
    }

    private int getFixedDeviceRecordVolume() {
        return this.microphoneVolume;
    }

    /* loaded from: classes12.dex */
    public class AudioManagerPhoneStateListener extends PhoneStateListener {
        public int callState;

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
        }

        public AudioManagerPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            synchronized (WebRtcAudioManager.this) {
                int i2 = this.callState;
                this.callState = i;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCallStateChanged, from: ");
                LIZ.append(i2);
                LIZ.append(", to: ");
                LIZ.append(i);
                RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
                if (i != 0) {
                    if ((i == 1 || i == 2) && i2 == 0) {
                        if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                            RXLogging.i("WebRtcAudioManager", "startPhoneCall");
                            WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                            webRtcAudioManager.nativeOnPhoneCallStart(webRtcAudioManager.nativeAudioManager);
                        } else {
                            RXLogging.e("WebRtcAudioManager", "nativeAudioManager is null");
                        }
                    }
                } else if (i2 == 1 || i2 == 2) {
                    if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                        RXLogging.i("WebRtcAudioManager", "endPhoneCall");
                        WebRtcAudioManager webRtcAudioManager2 = WebRtcAudioManager.this;
                        webRtcAudioManager2.nativeOnPhoneCallEnd(webRtcAudioManager2.nativeAudioManager);
                    } else {
                        RXLogging.e("WebRtcAudioManager", "nativeAudioManager is null");
                    }
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class AudioManagerRecordingCallback extends AudioManager.AudioRecordingCallback {
        public WebRtcAudioManager manager;

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Set<NativeRecordCallbackInfo> set;
            int i;
            super.onRecordingConfigChanged(list);
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < list.size(); i2++) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(list, i2);
                NativeRecordCallbackInfo nativeRecordCallbackInfo = new NativeRecordCallbackInfo();
                nativeRecordCallbackInfo.audio_session_id = audioRecordingConfiguration.getClientAudioSessionId();
                nativeRecordCallbackInfo.client_audio_source = audioRecordingConfiguration.getClientAudioSource();
                int i3 = Build.VERSION.SDK_INT;
                int i4 = -1;
                if (i3 >= 29) {
                    i = audioRecordingConfiguration.getAudioSource();
                } else {
                    i = -1;
                }
                nativeRecordCallbackInfo.audio_source = i;
                if (i3 >= 29) {
                    if (audioRecordingConfiguration.isClientSilenced()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                }
                nativeRecordCallbackInfo.is_client_silenced = i4;
                hashSet.add(nativeRecordCallbackInfo);
            }
            synchronized (this.manager) {
                WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                if (webRtcAudioManager.nativeAudioManager != 0 && ((set = webRtcAudioManager.lastRecordcallbackInfos) == null || !set.equals(hashSet))) {
                    WebRtcAudioManager.this.nativeRecordCallbackChanged(hashSet.toArray(new NativeRecordCallbackInfo[hashSet.size()]), WebRtcAudioManager.this.nativeAudioManager);
                    WebRtcAudioManager.this.lastRecordcallbackInfos = hashSet;
                }
            }
        }

        public AudioManagerRecordingCallback(WebRtcAudioManager webRtcAudioManager) {
            this.manager = webRtcAudioManager;
        }
    }

    /* loaded from: classes12.dex */
    public final class NativeRecordCallbackInfo {
        public int audio_session_id;
        public int audio_source;
        public int client_audio_source;
        public int is_client_silenced;

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.audio_session_id), Integer.valueOf(this.client_audio_source), Integer.valueOf(this.audio_source), Integer.valueOf(this.is_client_silenced));
        }

        public NativeRecordCallbackInfo() {
            this.audio_session_id = -1;
            this.client_audio_source = -1;
            this.audio_source = -1;
            this.is_client_silenced = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || NativeRecordCallbackInfo.class != obj.getClass()) {
                return false;
            }
            NativeRecordCallbackInfo nativeRecordCallbackInfo = (NativeRecordCallbackInfo) obj;
            if (this.audio_session_id == nativeRecordCallbackInfo.audio_session_id && this.client_audio_source == nativeRecordCallbackInfo.client_audio_source && this.audio_source == nativeRecordCallbackInfo.audio_source && this.is_client_silenced == nativeRecordCallbackInfo.is_client_silenced) {
                return true;
            }
            return false;
        }
    }

    public WebRtcAudioManager(long j) {
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ctor(");
            LIZ.append(this);
            LIZ.append(")");
            LIZ.append(WebRtcAudioUtils.getThreadInfo());
            RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            this.nativeAudioManager = j;
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(ContextUtils.getApplicationContext(), "audio");
            this.audioManager = audioManager;
            MAX_VOLUMED = C16880lQ.LLLLLLZZ(audioManager, 3);
            MAX_VOLUMED_VOIP = C16880lQ.LLLLLLZZ(audioManager, 0);
            refreshAudioParameters();
            WebRtcAudioUtils.logAudioState("WebRtcAudioManager");
        }
    }

    private int SetAudioMode(int i) {
        RXLogging.i("WebRtcAudioManager", "SetAudioMode enter");
        try {
            if (i == getMode()) {
                return 0;
            }
            this.audioManager.setMode(i);
            RXLogging.i("WebRtcAudioManager", "SetAudioMode leave");
            return 0;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void registerPhoneStateListener(final int i) {
        new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: com.bytedance.bae.webrtc.WebRtcAudioManager.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_bae_webrtc_WebRtcAudioManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_bae_webrtc_WebRtcAudioManager$1__run$___twin___() {
                try {
                    WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                    if (webRtcAudioManager.phoneStateListener == null) {
                        webRtcAudioManager.phoneStateListener = new AudioManagerPhoneStateListener();
                    }
                    if (i == 0) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(false);
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(ContextUtils.getApplicationContext(), "phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(WebRtcAudioManager.this.phoneStateListener, i);
                    }
                    if (i == 32) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(true);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("registerPhoneStateListener success with event: ");
                    LIZ.append(i);
                    RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("registerPhoneStateListener (");
                    LIZ2.append(i);
                    LIZ2.append("), error: ");
                    LIZ2.append(th.getCause());
                    LIZ2.append(", ");
                    LIZ2.append(th.getMessage());
                    RXLogging.e("WebRtcAudioManager", X1D.LIZIZ(LIZ2));
                }
            }

            public static void com_bytedance_bae_webrtc_WebRtcAudioManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_bae_webrtc_WebRtcAudioManager$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Overriding default input behavior: setStereoInput(");
            LIZ.append(z);
            LIZ.append(')');
            RXLogging.w("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Overriding default output behavior: setStereoOutput(");
            LIZ.append(z);
            LIZ.append(')');
            RXLogging.w("WebRtcAudioManager", X1D.LIZIZ(LIZ));
            useStereoOutput = z;
        }
    }

    public void notifyPhoneStateListenerRegistered(boolean z) {
        synchronized (this) {
            if (this.nativeAudioManager != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dixing: notifyPhoneStateListenerRegistered: ");
                LIZ.append(z);
                LIZ.append(", ");
                LIZ.append(this.nativeAudioManager);
                RXLogging.i("WebRtcAudioManager", X1D.LIZIZ(LIZ));
                nativeOnPhoneStateListenerRegisterChanged(z, this.nativeAudioManager);
            }
        }
    }

    @Override // com.bytedance.bae.webrtc.observer.MicMuteChangedObserver.OnMicMuteChangedListener
    public void onMicMuteChanged(boolean z) {
        synchronized (this) {
            long j = this.nativeAudioManager;
            if (j != 0) {
                nativeOnMicMuteChanged(z, j);
            }
        }
    }

    public static int getMinInputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    @Override // com.bytedance.bae.webrtc.observer.VolumeChangedObserver.OnVolumeChangedListener
    public void onVolumeChanged(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = MAX_VOLUMED_VOIP;
        } else {
            i3 = MAX_VOLUMED;
        }
        double d = ((i2 * 1.0d) / i3) * 100.0d;
        synchronized (this) {
            long j = this.nativeAudioManager;
            if (j != 0) {
                onVolumeChanged(i, (int) d, j);
            }
        }
    }
}
