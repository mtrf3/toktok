package com.ss.android.vesdk.audio;

import X.C06460Ne;
import X.C16880lQ;
import X.C39207Fa7;
import X.C63836P3o;
import X.C63839P3r;
import X.C63868P4u;
import X.C78929UyL;
import X.C78946Uyc;
import X.EnumC63837P3p;
import X.IC8;
import X.InterfaceC63840P3s;
import X.InterfaceC63841P3t;
import X.OHW;
import X.P3M;
import X.P3N;
import X.P4Q;
import X.RunnableC63838P3q;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;
import jp3.c;
import kotlin.jvm.internal.AqS177S0100000_11;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TEAudioRecord implements InterfaceC63841P3t {
    public InterfaceC63840P3s mAudioCallback;
    public VEAudioCaptureSettings mAudioCaptureSettings;
    public AudioRecord mAudioRecord;
    public long mAudioRecordStartTime;
    public long mAudioRecordStopTime;
    public int mBufferSizeInBytes;
    public ByteBuffer mByteBuffer;
    public Handler mHandler;
    public double mSampleNanoTimePerSecond;
    public int mSampleSize;
    public C63839P3r mTimestampStrategy;
    public static final String TAG = C16880lQ.LJLLJ(TEAudioRecord.class);
    public static final int[] SUGGEST_SAMPLERATE_ARRAY = {44100, LiveCenterDelayLoadSetting.DEFAULT, 11025, 16000, 22050};
    public static final int[] SUGGEST_CHANNEL_ARRAY = {2, 1};
    public int mSampleRate = 44100;
    public int mChannels = 2;
    public int mBitsPerSample = 16;
    public int mAudioSource = 1;
    public int hasInited = -1;

    private int getSysAudioFormat(int i) {
        if (i != 8) {
            return i != 16 ? 1 : 2;
        }
        return 3;
    }

    private int getSysAudioSource(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 5;
            if (i != 5) {
                i2 = 6;
                if (i != 6) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private int getSysChannelConfig(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 12;
        }
        return 16;
    }

    public void release() {
        release(null);
    }

    public void setAudioDevice(IC8 ic8) {
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    public int getRecordingState() {
        return this.mAudioRecord.getRecordingState();
    }

    public int getState() {
        return this.mAudioRecord.getState();
    }

    public int init() {
        return init(this.mAudioSource, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public int read() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(this.mByteBuffer, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", System.currentTimeMillis() - this.mAudioRecordStartTime);
                    c.LIZ("vesdk_record_audio_first_frame", "business", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                this.mAudioRecordStartTime = 0L;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    public TEAudioRecord() {
    }

    public int getBufferSize() {
        return this.mBufferSizeInBytes;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public ByteBuffer getPcmBuffer() {
        return this.mByteBuffer;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public TEAudioRecord(C63839P3r c63839P3r) {
        this.mTimestampStrategy = c63839P3r;
    }

    @Override // X.InterfaceC63842P3u
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        VEAudioCaptureSettings vEAudioCaptureSettings2;
        this.mAudioCaptureSettings = vEAudioCaptureSettings;
        int init = init(vEAudioCaptureSettings.getAudioSource(), vEAudioCaptureSettings.getSampleRate(), vEAudioCaptureSettings.getChannel(), vEAudioCaptureSettings.getBitSamples());
        if (this.mAudioCallback != null && (vEAudioCaptureSettings2 = this.mAudioCaptureSettings) != null) {
            VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder(vEAudioCaptureSettings2);
            builder.setSampleRate(this.mSampleRate);
            builder.setChannel(this.mChannels);
            builder.setBitSamples(this.mBitsPerSample);
            this.mAudioCallback.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT, 0, this.mAudioCaptureSettings);
        }
        C63868P4u.LJ(0, 1L, "te_record_audio_mic_type");
        C63868P4u.LJ(0, this.mSampleRate, "te_record_audio_mic_sample_rate");
        int i = this.mBufferSizeInBytes;
        int i2 = this.mChannels;
        if (i2 == 0) {
            i2 = 1;
        }
        C63868P4u.LJ(0, (i / i2) / 2, "te_record_audio_mic_frame_per_buffer");
        return init;
    }

    public int read(byte[] bArr) {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(bArr, 0, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", System.currentTimeMillis() - this.mAudioRecordStartTime);
                    c.LIZ("vesdk_record_audio_first_frame", "business", jSONObject);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                this.mAudioRecordStartTime = 0L;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // X.InterfaceC63842P3u
    public void release(Cert cert) {
        if (this.mAudioRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                P3M p3m = new P3M(this.mAudioRecord);
                OHW LIZ = C78946Uyc.LIZ(cert, new String[]{"audio"}, "audio_release", 100403);
                C78929UyL.LIZIZ(LIZ, "android/media/AudioRecord", "release()V", null);
                C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(p3m, 2));
            } catch (Exception e) {
                P4Q.LIZIZ(P3N.class, "Exception occur:", e);
            }
            this.hasInited = -1;
            C63868P4u.LJ(0, System.currentTimeMillis() - currentTimeMillis, "te_record_audio_release_record_time");
        }
    }

    @Override // X.InterfaceC63841P3t
    public void setAudioCallback(InterfaceC63840P3s interfaceC63840P3s) {
        this.mAudioCallback = interfaceC63840P3s;
    }

    @Override // X.InterfaceC63841P3t
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    @Override // X.InterfaceC63842P3u
    public int start(Cert cert) {
        this.mAudioRecordStartTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (this.mAudioRecord.getRecordingState() == 3) {
            return -2;
        }
        try {
            P3N.LIZ(this.mAudioRecord, cert);
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start hashCode:");
            LIZ.append(this.mAudioRecord.hashCode());
            P4Q.LJFF(str, X1D.LIZIZ(LIZ));
            C63839P3r c63839P3r = this.mTimestampStrategy;
            if (c63839P3r != null) {
                c63839P3r.LIZ = 0L;
                Context context = VERuntime.getInstance().getContext();
                if (context == null) {
                    P4Q.LIZJ(C63839P3r.LIZIZ, "context null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        P4Q.LIZJ(C63839P3r.LIZIZ, "pm null");
                    } else {
                        packageManager.hasSystemFeature("android.hardware.audio.pro");
                    }
                }
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC63838P3q(this));
            }
            C63868P4u.LJ(0, System.currentTimeMillis() - this.mAudioRecordStartTime, "te_record_audio_start_record_time");
            return 0;
        } catch (Exception e) {
            P4Q.LIZJ(TAG, Log.getStackTraceString(e));
            release(null);
            return -603;
        }
    }

    @Override // X.InterfaceC63842P3u
    public int stop(Cert cert) {
        this.mAudioRecordStartTime = 0L;
        this.mAudioRecordStopTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        try {
            P3N.LIZIZ(this.mAudioRecord, cert);
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop hashCode:");
            LIZ.append(this.mAudioRecord.hashCode());
            P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            P4Q.LIZJ(TAG, Log.getStackTraceString(e));
        }
        C63868P4u.LJ(0, System.currentTimeMillis() - this.mAudioRecordStopTime, "te_record_audio_stop_record_time");
        return 0;
    }

    public int init(int i) {
        this.mAudioSource = i;
        return init(i, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public int init(int i, int i2, int i3) {
        return init(this.mAudioSource, i, i2, i3);
    }

    private int initAudioRecord(int i, int i2, int i3, int i4) {
        AudioDeviceInfo audioDeviceInfo;
        int sysAudioSource = getSysAudioSource(i);
        int sysChannelConfig = getSysChannelConfig(i3);
        int sysAudioFormat = getSysAudioFormat(i4);
        int minBufferSize = AudioRecord.getMinBufferSize(i2, sysChannelConfig, sysAudioFormat);
        try {
            AudioRecord audioRecord = new AudioRecord(sysAudioSource, i2, sysChannelConfig, sysAudioFormat, minBufferSize);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                VEAudioCaptureSettings vEAudioCaptureSettings = this.mAudioCaptureSettings;
                if (vEAudioCaptureSettings != null && vEAudioCaptureSettings.isPreferBuiltinMicInBluetoothScene() && Build.VERSION.SDK_INT >= 23) {
                    new C63836P3o();
                    if (C63836P3o.LIZ() == EnumC63837P3p.BLUETOOTH) {
                        AudioRecord audioRecord2 = this.mAudioRecord;
                        AudioDeviceInfo[] devices = ((AudioManager) C16880lQ.LLILL(VERuntime.getInstance().getContext(), "audio")).getDevices(1);
                        int length = devices.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                audioDeviceInfo = null;
                                break;
                            }
                            audioDeviceInfo = devices[i5];
                            if (audioDeviceInfo.getType() == 15) {
                                break;
                            }
                            i5++;
                        }
                        audioRecord2.setPreferredDevice(audioDeviceInfo);
                    }
                }
                this.mSampleRate = i2;
                this.mChannels = i3;
                this.mBitsPerSample = i4;
                this.mBufferSizeInBytes = minBufferSize;
                String str = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Init audio recorder succeed, apply audio record sample rate ");
                LIZ.append(this.mSampleRate);
                LIZ.append(" channels ");
                LIZ.append(this.mChannels);
                LIZ.append(" buffer ");
                LIZ.append(this.mBufferSizeInBytes);
                LIZ.append(" state ");
                LIZ.append(this.mAudioRecord.getState());
                P4Q.LJFF(str, X1D.LIZIZ(LIZ));
                this.mByteBuffer = ByteBuffer.allocateDirect(this.mBufferSizeInBytes);
                this.mSampleNanoTimePerSecond = 1.0E9d / this.mSampleRate;
                this.mSampleSize = (this.mChannels * this.mBitsPerSample) / 8;
                return 0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Audio record is not initialized![");
            LIZ2.append(this.mSampleRate);
            LIZ2.append(",");
            LIZ2.append(this.mChannels);
            LIZ2.append(",");
            LIZ2.append(i4);
            throw new Exception(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            P4Q.LIZJ(TAG, Log.getStackTraceString(e));
            release(null);
            this.mSampleRate = 44100;
            this.mChannels = 2;
            this.mBitsPerSample = 16;
            return -100;
        }
    }

    public int init(int i, int i2, int i3, int i4) {
        String str = TAG;
        StringBuilder LIZJ = C06460Ne.LIZJ("init audioSource: ", i, ", sampleRate: ", i2, ", channels: ");
        LIZJ.append(i3);
        LIZJ.append(", bitsPerSample: ");
        LIZJ.append(i4);
        P4Q.LJFF(str, X1D.LIZIZ(LIZJ));
        if (this.hasInited == 0) {
            P4Q.LJFF(str, "has inited");
            return 0;
        }
        int initAudioRecord = initAudioRecord(i, i2, i3, i4);
        if (initAudioRecord == 0) {
            this.hasInited = 0;
            return 0;
        }
        release(null);
        for (int i5 : SUGGEST_SAMPLERATE_ARRAY) {
            for (int i6 : SUGGEST_CHANNEL_ARRAY) {
                initAudioRecord = initAudioRecord(i, i5, i6, i4);
                if (initAudioRecord == 0) {
                    return 0;
                }
                release(null);
            }
        }
        this.hasInited = initAudioRecord;
        return initAudioRecord;
    }
}
