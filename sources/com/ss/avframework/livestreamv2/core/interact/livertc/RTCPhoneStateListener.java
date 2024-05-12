package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.C012403c;
import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.google.android.gms.common.ConnectionResult;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class RTCPhoneStateListener extends PhoneStateListener {
    public Context applicationContext;
    public Boolean defaultRouter2Speaker;
    public Boolean forceEnableSpeaker;
    public boolean isSpeakerphoneOn;
    public RTCVideo mEngine;
    public volatile MuteState mMuteAllRemoteAudio;
    public volatile MuteState mMuteLocalAudio;
    public AtomicInteger mOnPhoneCallCount = new AtomicInteger(0);
    public RTCEngineWrapper mRtcEngineWrapper;

    private AudioManager getAudioManager() {
        return (AudioManager) C16880lQ.LLILL(this.applicationContext, "audio");
    }

    private void onCallEnd() {
        final boolean z;
        if (!this.mOnPhoneCallCount.compareAndSet(0, 0) && this.mOnPhoneCallCount.decrementAndGet() == 0 && this.mEngine != null) {
            LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged END");
            RTCEngineWrapper rTCEngineWrapper = this.mRtcEngineWrapper;
            if (rTCEngineWrapper != null) {
                rTCEngineWrapper.callEndResumeAudio();
            }
            if (!isHeadsetOn()) {
                Boolean bool = this.forceEnableSpeaker;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    Boolean bool2 = this.defaultRouter2Speaker;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = this.isSpeakerphoneOn;
                    }
                }
                postDelay(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.livertc.RTCPhoneStateListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_livertc_RTCPhoneStateListener$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_livertc_RTCPhoneStateListener$1__run$___twin___() {
                        AudioPlaybackDevice audioPlaybackDevice;
                        RTCVideo rTCVideo = RTCPhoneStateListener.this.mEngine;
                        if (z) {
                            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE;
                        } else {
                            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE;
                        }
                        rTCVideo.setAudioPlaybackDevice(audioPlaybackDevice);
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_livertc_RTCPhoneStateListener$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_livertc_RTCPhoneStateListener$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            }
        }
    }

    private void onCallRinging() {
        RTCEngineWrapper rTCEngineWrapper;
        LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged RING");
        if (this.mEngine != null && this.mOnPhoneCallCount.compareAndSet(0, 0) && !isHeadsetOn() && (rTCEngineWrapper = this.mRtcEngineWrapper) != null) {
            this.isSpeakerphoneOn = rTCEngineWrapper.isSpeakerPhoneOn();
        }
    }

    private void onCallStart() {
        if (this.mOnPhoneCallCount.getAndIncrement() == 0 && this.mEngine != null) {
            LogUtil.d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged StartCall");
            RTCEngineWrapper rTCEngineWrapper = this.mRtcEngineWrapper;
            if (rTCEngineWrapper != null) {
                rTCEngineWrapper.callStartMuteAudio();
            }
        }
    }

    private boolean isHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        if (!audioManager.isBluetoothScoOn() && !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    /* loaded from: classes12.dex */
    public static class PhoneCallHandler extends Handler {
        public PhoneCallHandler(Looper looper) {
            super(looper);
        }

        public void doExec(Runnable runnable) {
            post(runnable);
        }
    }

    public static Looper register(Runnable runnable) {
        Looper looper;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = null;
        }
        if (C16880lQ.LLJJJJ() != null) {
            looper = C16880lQ.LLJJJJ();
        }
        if (looper == null) {
            return null;
        }
        new PhoneCallHandler(looper).doExec(runnable);
        return looper;
    }

    @Override // android.telephony.PhoneStateListener
    public void onServiceStateChanged(ServiceState serviceState) {
        super.onServiceStateChanged(serviceState);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomPhoneStateListener onServiceStateChanged: ");
        LIZ.append(serviceState);
        LogUtil.d("RtcPhoneStateListener", X1D.LIZIZ(LIZ));
    }

    public void setDefaultRouter2Speaker(boolean z) {
        this.defaultRouter2Speaker = Boolean.valueOf(z);
    }

    public void setSpeakerphoneOn(boolean z) {
        this.forceEnableSpeaker = Boolean.valueOf(z);
    }

    public RTCPhoneStateListener(Context context, RTCEngineWrapper rTCEngineWrapper) {
        this.applicationContext = C16880lQ.LLLLL(context);
        this.mEngine = rTCEngineWrapper.getRtcEngine();
        this.mRtcEngineWrapper = rTCEngineWrapper;
    }

    public static void postDelay(Runnable runnable, int i) {
        Looper looper = null;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        }
        if (C16880lQ.LLJJJJ() != null) {
            looper = C16880lQ.LLJJJJ();
        }
        if (looper == null) {
            return;
        }
        new PhoneCallHandler(looper).postDelayed(runnable, i);
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i, String str) {
        LogUtil.e("RtcPhoneStateListener", C012403c.LIZLLL("CustomPhoneStateListener state: ", i, " incomingNumber: ", str));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                onCallStart();
                return;
            }
            onCallRinging();
            return;
        }
        onCallEnd();
    }
}
