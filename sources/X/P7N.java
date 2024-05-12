package X;

import android.hardware.Camera;

/* loaded from: classes12.dex */
public final class P7N implements Camera.PreviewCallback {
    public final /* synthetic */ P7O LIZ;

    public P7N(P7O p7o) {
        this.LIZ = p7o;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.Camera.PreviewCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPreviewFrame(byte[] r10, android.hardware.Camera r11) {
        /*
            r9 = this;
            X.P7O r4 = r9.LIZ
            r4.getClass()
            r3 = 0
            if (r10 == 0) goto L56
            int r7 = r10.length
            if (r7 <= 0) goto L56
            com.ss.android.ttvecamera.TEFrameSizei r2 = r4.LIZJ
            if (r2 == 0) goto L56
            int r1 = r4.LJIIL
            r0 = 3
            if (r1 >= r0) goto L56
            int r0 = r1 + 1
            r4.LJIIL = r0
            int r8 = r2.width
            int r0 = r2.height
            int r8 = r8 * r0
            if (r8 <= r7) goto L44
            java.lang.String r2 = X.P7O.LJIILLIIL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "checkPreviewData failed: mSize: "
            r1.append(r0)
            com.ss.android.ttvecamera.TEFrameSizei r0 = r4.LIZJ
            r1.append(r0)
            java.lang.String r0 = ", length: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63922P6w.LIZIZ(r2, r0)
        L3e:
            if (r11 == 0) goto L43
            r11.addCallbackBuffer(r10)
        L43:
            return
        L44:
            int r6 = r8 / 300
            int r5 = r6 / 2
            r4 = r10[r3]
            r3 = r10[r8]
            r2 = 0
            goto L91
        L4e:
            r1 = r10[r1]
            if (r4 != r1) goto L56
            r0 = r10[r0]
            if (r3 == r0) goto L8b
        L56:
            X.P6E r3 = new X.P6E
            X.P7O r0 = r9.LIZ
            com.ss.android.ttvecamera.TEFrameSizei r0 = r0.LIZJ
            int r6 = r0.width
            int r2 = r0.height
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            r3.<init>(r6, r2, r0)
            X.P7O r0 = r9.LIZ
            X.X10 r0 = r0.LIZLLL
            int r2 = r0.LLLFFI()
            X.P6b r1 = X.EnumC63901P6b.PIXEL_FORMAT_NV21
            X.P7O r0 = r9.LIZ
            X.X10 r0 = r0.LIZLLL
            X.X0g r0 = r0.LLJJJJLIIL()
            int r0 = r0.LJLJJI
            r3.LJ(r10, r2, r1, r0)
            X.P7O r0 = r9.LIZ
            X.P7P r0 = r0.LIZ
            if (r0 == 0) goto L3e
            r0.onFrameCaptured(r3)
            goto L3e
        L8b:
            int r2 = r2 + 1
            r0 = 300(0x12c, float:4.2E-43)
            if (r2 >= r0) goto L3e
        L91:
            int r1 = r2 * r6
            int r0 = r2 * r5
            int r0 = r0 + r8
            if (r1 >= r7) goto L3e
            if (r0 < r7) goto L4e
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7N.onPreviewFrame(byte[], android.hardware.Camera):void");
    }
}
