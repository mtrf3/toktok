package X;

import Y.ACallableS88S0200000_11;
import android.os.ConditionVariable;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class P5Y implements P4F {
    public final TEDubWriter LJLIL;
    public VEAudioCapture LJLILLLLZI;
    public final ConditionVariable LJLJI = new ConditionVariable();
    public InterfaceC63875P5b LJLJJI = null;
    public int LJLJJL = 44100;
    public Cert LJLJJLL;
    public String LJLJL;
    public double LJLJLJ;
    public int LJLJLLL;
    public int LJLL;

    public final synchronized int LIZ() {
        if (this.LJLILLLLZI != null) {
            return 0;
        }
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
        builder.setSampleRate(44100);
        builder.setChannel(2);
        builder.setAudioCaptureLowLatency(false);
        VEAudioCaptureSettings build = builder.build();
        VEAudioCapture vEAudioCapture = new VEAudioCapture();
        this.LJLILLLLZI = vEAudioCapture;
        vEAudioCapture.addCaptureListener(this);
        int LIZIZ = LIZIZ(new ACallableS88S0200000_11(build, this, 1), "init()");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("call init, sourceId:");
        LIZ.append(1);
        LIZ.append(" retValue:");
        LIZ.append(LIZIZ);
        P4Q.LJFF("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZ));
        return LIZIZ;
    }

    public P5Y(TEDubWriter tEDubWriter) {
        this.LJLIL = tEDubWriter;
    }

    public final synchronized void LIZJ(Cert cert) {
        VEAudioCapture vEAudioCapture = this.LJLILLLLZI;
        if (vEAudioCapture != null) {
            vEAudioCapture.release(cert);
            this.LJLILLLLZI = null;
        }
        TEDubWriter tEDubWriter = this.LJLIL;
        if (tEDubWriter != null) {
            long j = tEDubWriter.LIZ;
            if (j != 0) {
                tEDubWriter.nativeDestroy(j);
            }
        }
        P4Q.LJFF("TEBufferedAudioCaptureRecorder", "call unInit() finished!");
    }

    @Override // X.P4F
    public final void onReceive(VEAudioSample vEAudioSample) {
        byte[] bArr;
        if (this.LJLIL != null) {
            if (vEAudioSample.getSampleBuffer() instanceof C63874P5a) {
                bArr = ((C63874P5a) vEAudioSample.getSampleBuffer()).LIZ.array();
            } else {
                if (vEAudioSample.getSampleBuffer() instanceof P5Z) {
                    bArr = ((P5Z) vEAudioSample.getSampleBuffer()).LIZ;
                }
                P4Q.LIZJ("TEBufferedAudioCaptureRecorder", "sample buffer is empty!");
            }
            if (bArr != null) {
                TEDubWriter tEDubWriter = this.LJLIL;
                int byteSize = vEAudioSample.getByteSize();
                long j = tEDubWriter.LIZ;
                if (j != 0) {
                    tEDubWriter.nativeAddPCMData(j, bArr, byteSize);
                    tEDubWriter.LIZIZ = tEDubWriter.nativeGetCurrentTime(tEDubWriter.LIZ);
                }
                InterfaceC63875P5b interfaceC63875P5b = this.LJLJJI;
                if (interfaceC63875P5b != null) {
                    interfaceC63875P5b.LIZIZ(vEAudioSample.getByteSize(), bArr);
                    return;
                }
                return;
            }
            P4Q.LIZJ("TEBufferedAudioCaptureRecorder", "sample buffer is empty!");
        }
    }

    public final int LIZIZ(Callable callable, String str) {
        Integer num;
        int i;
        this.LJLJI.close();
        try {
            num = (Integer) callable.call();
            if (num.intValue() == 0) {
                if (this.LJLJI.block(LiveNetAdaptiveHurryTimeSetting.DEFAULT)) {
                    i = 0;
                } else {
                    i = -1;
                }
                num = Integer.valueOf(i);
                if (num.intValue() == -1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" timeout ! timeoutMs:");
                    LIZ.append(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                    P4Q.LIZJ("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZ));
                }
            }
        } catch (Exception e) {
            num = -1;
            C16880lQ.LLLLIIL(e);
        }
        return num.intValue();
    }

    @Override // X.P4F
    public final void onError(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("errorType:", i, " ret:", i2, " msg:");
        LIZJ.append(str);
        P4Q.LIZJ("TEBufferedAudioCaptureRecorder", X1D.LIZIZ(LIZJ));
        InterfaceC63875P5b interfaceC63875P5b = this.LJLJJI;
        if (interfaceC63875P5b != null) {
            interfaceC63875P5b.onError(i, i2, str);
        }
        this.LJLJI.open();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2 != 0) goto L16;
     */
    @Override // X.P4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInfo(int r19, int r20, double r21, java.lang.Object r23) {
        /*
            r18 = this;
            r2 = r23
            int r0 = com.ss.android.vesdk.VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT
            java.lang.String r1 = "TEBufferedAudioCaptureRecorder"
            r4 = r19
            r5 = r18
            if (r4 != r0) goto L2f
            java.lang.String r0 = "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_INIT"
            X.P4Q.LJFF(r1, r0)
            if (r2 == 0) goto L29
            com.ss.android.vesdk.VEAudioCaptureSettings r2 = (com.ss.android.vesdk.VEAudioCaptureSettings) r2
            int r0 = r2.getSampleRate()
            r5.LJLJJL = r0
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_INIT samplerate:"
            r2.append(r0)
            int r0 = r5.LJLJJL
            X.C01R.LIZJ(r2, r0, r2, r1)
        L29:
            android.os.ConditionVariable r0 = r5.LJLJI
            r0.open()
            return
        L2f:
            int r0 = com.ss.android.vesdk.VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START
            r6 = 0
            if (r4 != r0) goto L6f
            java.lang.String r0 = "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_START"
            X.P4Q.LJFF(r1, r0)
            com.ss.android.ttve.audio.TEDubWriter r8 = r5.LJLIL
            if (r8 == 0) goto L69
            java.lang.String r11 = r5.LJLJL
            int r12 = r5.LJLJJL
            r13 = 2
            double r14 = r5.LJLJLJ
            int r3 = r5.LJLJLLL
            int r2 = r5.LJLL
            long r9 = r8.LIZ
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L5e
            r2 = -112(0xffffffffffffff90, float:NaN)
        L51:
            java.lang.String r0 = "init wav file failed, ret = "
            X.Q7K.LJ(r0, r2, r1)
        L56:
            X.P5b r0 = r5.LJLJJI
            if (r0 == 0) goto L29
            r0.LIZ(r4)
            goto L29
        L5e:
            r16 = r3
            r17 = r2
            int r2 = r8.nativeInitWavFile(r9, r11, r12, r13, r14, r16, r17)
            if (r2 == 0) goto L56
            goto L51
        L69:
            java.lang.String r0 = "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_START, audioWritter is null !"
            X.P4Q.LJFF(r1, r0)
            goto L29
        L6f:
            int r0 = com.ss.android.vesdk.VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP
            if (r4 != r0) goto L8e
            java.lang.String r0 = "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_STOP"
            X.P4Q.LJFF(r1, r0)
            com.ss.android.ttve.audio.TEDubWriter r3 = r5.LJLIL
            if (r3 == 0) goto L29
            long r1 = r3.LIZ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L8a
        L82:
            X.P5b r0 = r5.LJLJJI
            if (r0 == 0) goto L29
            r0.LIZ(r4)
            goto L29
        L8a:
            r3.nativeCloseWavFile(r1)
            goto L82
        L8e:
            java.lang.String r0 = "oninfo other type : "
            X.Q4K.LJ(r0, r4, r1)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P5Y.onInfo(int, int, double, java.lang.Object):void");
    }
}
