package com.ss.android.vesdk;

import X.C01R;
import X.C63867P4t;
import X.C63878P5e;
import X.InterfaceC63875P5b;
import X.P4Q;
import X.P5Y;
import X.X1D;
import Y.ACallableS88S0200000_11;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;

/* loaded from: classes12.dex */
public class VEAudioRecorder implements GenericLifecycleObserver {
    public VEAudioEncodeSettings mAudioEncodeSettings;
    public P5Y mAudioRecorder;
    public long mCurrentTime;
    public VERuntime mRuntime;
    public String mWavFilePath;
    public boolean mbRecording;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destory();
        }
    }

    public long stopRecord() {
        return stopRecord(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destory() {
        boolean z;
        if (Build.VERSION.SDK_INT < 31) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioRecorder destory in. mbRecording = ");
        LIZ.append(this.mbRecording);
        LIZ.append(", releaseAudioRecoder = ");
        LIZ.append(z);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ));
        P5Y p5y = this.mAudioRecorder;
        synchronized (p5y) {
            p5y.LIZJ(p5y.LJLJJLL);
        }
    }

    public String getWavFilePath() {
        if (!this.mbRecording) {
            return this.mWavFilePath;
        }
        throw new VEException(-105, "audio is recording");
    }

    public String toAAC() {
        C63878P5e resManager = this.mRuntime.getResManager();
        resManager.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(resManager.LIZ());
        LIZ.append(File.separator);
        LIZ.append(System.currentTimeMillis());
        LIZ.append("_");
        LIZ.append("record");
        LIZ.append(".aac");
        return X1D.LIZIZ(LIZ);
    }

    public VEAudioRecorder() {
        this.mRuntime = VERuntime.getInstance();
        this.mAudioRecorder = new P5Y(new TEDubWriter());
    }

    public long getCurrentTime() {
        return this.mCurrentTime;
    }

    public VEAudioRecorder(LifecycleOwner lifecycleOwner) {
        this();
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public void destory(Cert cert) {
        boolean z;
        if (Build.VERSION.SDK_INT < 31) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioRecorder destory in. mbRecording = ");
        LIZ.append(this.mbRecording);
        LIZ.append(", releaseAudioRecoder = ");
        LIZ.append(z);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ));
        this.mAudioRecorder.LIZJ(cert);
    }

    public void setRecorderListener(InterfaceC63875P5b interfaceC63875P5b) {
        this.mAudioRecorder.LJLJJI = interfaceC63875P5b;
    }

    public long stopRecord(Cert cert) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioRecorder stopRecord in. mbRecording = ");
        LIZ.append(this.mbRecording);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ));
        if (!this.mbRecording) {
            return -105L;
        }
        P5Y p5y = this.mAudioRecorder;
        TEDubWriter tEDubWriter = p5y.LJLIL;
        if (tEDubWriter != null) {
            this.mCurrentTime = tEDubWriter.LIZIZ;
        }
        synchronized (p5y) {
            VEAudioCapture vEAudioCapture = p5y.LJLILLLLZI;
            if (vEAudioCapture == null) {
                P4Q.LJFF("TEBufferedAudioCaptureRecorder", "call stopRecording()  audioCpature is null");
            } else {
                p5y.LJLJJLL = cert;
                if (Build.VERSION.SDK_INT >= 31) {
                    vEAudioCapture.stop();
                    p5y.LJLILLLLZI.release(p5y.LJLJJLL);
                    p5y.LJLILLLLZI = null;
                } else if (p5y.LIZIZ(new ACallableS88S0200000_11(cert, p5y, 3), "stopRecording") != 0) {
                    z = false;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("call stopRecording() retValue:");
                    LIZ2.append(z);
                    P4Q.LJFF("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZ2));
                }
                z = true;
                StringBuilder LIZ22 = X1D.LIZ();
                LIZ22.append("call stopRecording() retValue:");
                LIZ22.append(z);
                P4Q.LJFF("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZ22));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Stop record ,current time is ");
        LIZ3.append(this.mCurrentTime);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ3));
        this.mbRecording = false;
        C63867P4t.LIZLLL("iesve_veaudiorecorder_audio_record", null);
        return this.mCurrentTime;
    }

    public int delete(int i, int i2) {
        if (i >= i2 || i < 0) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veaudiorecorder_audio_delete", null);
        return TEVideoUtils.nativeClearWavSeg(this.mWavFilePath, i, i2);
    }

    public int init(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.mAudioEncodeSettings = vEAudioEncodeSettings;
        this.mbRecording = false;
        this.mWavFilePath = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioRecorder init in. mWavFilePath = ");
        LIZ.append(this.mWavFilePath);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ));
        this.mAudioRecorder.LIZ();
        return 0;
    }

    public int init(VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        return init(null, vEAudioEncodeSettings, i);
    }

    public int init(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        this.mAudioEncodeSettings = vEAudioEncodeSettings;
        this.mbRecording = false;
        if (TextUtils.isEmpty(str)) {
            P4Q.LJFF("VEAudioRecorder", "Empty directory use default path");
            C63878P5e resManager = this.mRuntime.getResManager();
            resManager.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(resManager.LIZ());
            LIZ.append(File.separator);
            LIZ.append(System.currentTimeMillis());
            LIZ.append("_");
            LIZ.append("record");
            LIZ.append(".wav");
            this.mWavFilePath = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Use wav save path ");
            LIZ2.append(str);
            P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ2));
            this.mWavFilePath = str;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("VEAudioRecorder init in. mWavFilePath = ");
        LIZ3.append(this.mWavFilePath);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ3));
        this.mAudioRecorder.LIZ();
        String str2 = this.mWavFilePath;
        P5Y p5y = this.mAudioRecorder;
        p5y.getClass();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("call getSampleRateInHz():");
        C01R.LIZJ(LIZ4, p5y.LJLJJL, LIZ4, "TEBufferedAudioCaptureRecorder");
        TEVideoUtils.nativeGenerateMuteWav(str2, p5y.LJLJJL, 2, i);
        return 0;
    }

    public int startRecord(float f, int i, int i2) {
        return startRecord(f, i, i2, null);
    }

    public int startRecord(float f, int i, int i2, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioRecorder startRecord in. mbRecording = ");
        LIZ.append(this.mbRecording);
        P4Q.LJFF("VEAudioRecorder", X1D.LIZIZ(LIZ));
        if (this.mbRecording) {
            return -105;
        }
        P5Y p5y = this.mAudioRecorder;
        String str = this.mWavFilePath;
        double d = f;
        synchronized (p5y) {
            if (Build.VERSION.SDK_INT < 31 || p5y.LIZ() == 0) {
                if (p5y.LJLILLLLZI == null) {
                    P4Q.LJFF("TEBufferedAudioCaptureRecorder", "call startRecording()  audioCpature is null");
                } else {
                    p5y.LJLJL = str;
                    p5y.LJLJLJ = d;
                    p5y.LJLJLLL = i;
                    p5y.LJLL = i2;
                    p5y.LJLJJLL = cert;
                    int LIZIZ = p5y.LIZIZ(new ACallableS88S0200000_11(cert, p5y, 2), "startRecording()");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("call startRecording  path:");
                    LIZ2.append(str);
                    LIZ2.append(" speed:");
                    LIZ2.append(d);
                    LIZ2.append(" startMs:");
                    LIZ2.append(i);
                    LIZ2.append(" durationMs:");
                    LIZ2.append(i2);
                    LIZ2.append(" retValue:");
                    LIZ2.append(LIZIZ);
                    P4Q.LJFF("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZ2));
                }
            }
        }
        this.mbRecording = true;
        return 0;
    }
}
