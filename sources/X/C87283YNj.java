package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: X.YNj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87283YNj implements TEVideoUtils.CompileProbeListener2 {
    public final /* synthetic */ InterfaceC87286YNm LIZ;
    public final /* synthetic */ VEVideoEncodeSettings LIZIZ;
    public final /* synthetic */ int LIZJ;

    public C87283YNj(C45014Hla c45014Hla, VEVideoEncodeSettings vEVideoEncodeSettings, int i) {
        this.LIZ = c45014Hla;
        this.LIZIZ = vEVideoEncodeSettings;
        this.LIZJ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // com.ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompileProbeResult2(int r19, int r20, float r21, float r22, int r23, int r24, int r25, int r26, float r27) {
        /*
            r18 = this;
            r7 = r22
            r5 = r18
            X.YNm r0 = r5.LIZ
            if (r0 == 0) goto L5f
            r12 = r26
            r11 = r25
            int r1 = java.lang.Math.min(r11, r12)
            r0 = 716(0x2cc, float:1.003E-42)
            if (r1 <= r0) goto L60
            r0 = 724(0x2d4, float:1.015E-42)
            if (r1 >= r0) goto L7e
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
            long r0 = r0.mBitrate
            float r7 = (float) r0
        L23:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2b
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r0
        L2b:
            X.YNm r3 = r5.LIZ
            int r8 = r5.LIZJ
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
            int r14 = r0.mCrf
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
            int r2 = r0.mGop
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoSWEncodeSettings r0 = r0.mSWEncodeSetting
            double r0 = r0.mQPOffset
            r9 = r23
            r6 = r21
            r13 = r27
            r5 = r20
            r4 = r19
            r10 = r24
            r15 = r2
            r16 = r0
            r3.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L5f:
            return
        L60:
            r0 = 572(0x23c, float:8.02E-43)
            if (r1 <= r0) goto L23
            r0 = 580(0x244, float:8.13E-43)
            if (r1 >= r0) goto L23
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
            long r3 = r0.mBitrate
            double r1 = (double) r3
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
            double r3 = r0.mSd_bitrate_ratio
            goto L9b
        L7e:
            r0 = 1076(0x434, float:1.508E-42)
            if (r1 <= r0) goto L60
            r0 = 1084(0x43c, float:1.519E-42)
            if (r1 >= r0) goto L23
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
            long r3 = r0.mBitrate
            double r1 = (double) r3
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = r5.LIZIZ
            com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings r0 = r0.getVideoCompileEncodeSetting()
            com.ss.android.vesdk.settings.VEVideoHWEncodeSettings r0 = r0.mHWEncodeSetting
            double r3 = r0.mFullHd_bitrate_ratio
        L9b:
            double r1 = r1 * r3
            float r7 = (float) r1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87283YNj.onCompileProbeResult2(int, int, float, float, int, int, int, int, float):void");
    }
}
