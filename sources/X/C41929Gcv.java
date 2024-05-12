package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gcv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41929Gcv extends AbstractC41925Gcr {
    public final C41932Gcy LJIIIIZZ;

    @Override // X.AbstractC41925Gcr
    public final String LJFF() {
        return "record";
    }

    @Override // X.AbstractC41925Gcr
    public final void LJIIJ() {
        if (this.LJIIIIZZ.LJLIL == null) {
            LIZJ("");
        } else {
            super.LJIIJ();
        }
    }

    public C41929Gcv(C41932Gcy param) {
        o.LJIIIZ(param, "param");
        this.LJIIIIZZ = param;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r0.isEmpty() != true) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // X.AbstractC41925Gcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd r16) {
        /*
            r15 = this;
            X.Gcy r0 = r15.LJIIIIZZ
            com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel r0 = r0.LJLIL
            if (r0 != 0) goto L8
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            long r7 = java.lang.System.currentTimeMillis()
            java.util.List r1 = r0.getAllFrames()
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L6
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1b
            goto L6
        L1b:
            int r0 = X.AbstractC41925Gcr.LJ()
            java.util.List r14 = X.C86793Y4n.LJIIZILJ(r0, r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            X.Gcy r0 = r15.LJIIIIZZ
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L5d
            java.util.Iterator r13 = r0.iterator()
            r11 = 0
            r1 = 0
        L36:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r13.next()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            long r9 = r0.getEndTime()
            long r7 = r0.getStartTime()
            long r9 = r9 - r7
            long r1 = r1 + r9
            goto L36
        L4d:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L5d
            X.Gcy r0 = r15.LJIIIIZZ
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L5f
            boolean r0 = r0.isEmpty()
            if (r0 != r5) goto L5f
        L5d:
            r1 = -1
        L5f:
            X.AbstractC41925Gcr.LJI(r3, r1)
            java.lang.String r4 = r15.LIZLLL()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r14.iterator()
        L6f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lad
            int r2 = r6 + 1
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.shortvideo.model.FrameItem r0 = (com.ss.android.ugc.aweme.shortvideo.model.FrameItem) r0
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L8e
        L8c:
            r6 = r2
            goto L6f
        L8e:
            android.graphics.Bitmap r1 = com.bytedance.common.utility.BitmapUtils.decodeBitmap(r1)
            if (r1 != 0) goto L95
            goto L8c
        L95:
            int r0 = r15.LIZ
            float r0 = (float) r0
            android.graphics.Bitmap r0 = X.C86793Y4n.LJJIJIL(r1, r0, r0)
            java.io.File r0 = r15.LJIIIZ(r6, r0)
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = "file.absolutePath"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.add(r1)
            goto L8c
        Lad:
            java.lang.String r0 = X.AbstractC41925Gcr.LJIIIIZZ(r4, r3)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41929Gcv.LIZ(X.2kd):java.lang.Object");
    }
}
