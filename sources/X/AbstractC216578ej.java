package X;

import X.C216028dq;
import android.graphics.Bitmap;
import android.graphics.Paint;

/* renamed from: X.8ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC216578ej<T extends C216028dq> extends AbstractC216708ew<T> {
    public Bitmap LJIIJ;
    public final Paint LJIIJJI = new Paint();

    @Override // X.AbstractC216708ew
    public void LJIIIZ() {
        Bitmap bitmap;
        super.LJIIIZ();
        Bitmap bitmap2 = this.LJIIJ;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.LJIIJ) != null) {
            bitmap.recycle();
        }
        this.LJIIJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @Override // X.AbstractC216708ew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.graphics.Canvas r7, X.C216758f1 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r7.save()
            r4 = r6
            X.8ei r4 = (X.C216568ei) r4
            float r1 = r4.LJIIL
            float r0 = r4.LJIILIIL
            r3 = 0
            r7.rotate(r3, r1, r0)
            X.8eI r0 = r8.LIZJ
            boolean r0 = r0.LJIIIIZZ
            if (r0 == 0) goto La5
            float r0 = r6.LIZLLL
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2a
            float r0 = r6.LJ
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L2e
        L2a:
            r7.restore()
            return
        L2e:
            android.graphics.Bitmap r5 = r6.LJIIJ
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L6c
            T extends X.8dp r0 = r6.LIZ
            X.8dq r0 = (X.C216028dq) r0
            if (r0 != 0) goto L5b
        L3a:
            android.graphics.Paint r1 = r6.LJIIJJI
            T extends X.8dp r0 = r6.LIZ
            X.8dq r0 = (X.C216028dq) r0
            if (r0 != 0) goto L56
            r0 = 255(0xff, float:3.57E-43)
        L44:
            r1.setAlpha(r0)
            android.graphics.Bitmap r3 = r6.LJIIJ
            kotlin.jvm.internal.o.LJI(r3)
            float r2 = r4.LJIIL
            float r1 = r4.LJIILIIL
            android.graphics.Paint r0 = r6.LJIIJJI
            r7.drawBitmap(r3, r2, r1, r0)
            goto L2a
        L56:
            int r0 = r0.LJIIIZ()
            goto L44
        L5b:
            boolean r0 = r0.LJI
            if (r0 != r2) goto L3a
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L6c
            android.graphics.Bitmap r0 = r6.LJIIJ
            if (r0 != 0) goto La1
        L69:
            r0 = 0
            r6.LJIIJ = r0
        L6c:
            T extends X.8dp r0 = r6.LIZ
            X.8dq r0 = (X.C216028dq) r0
            if (r0 != 0) goto L9e
        L72:
            float r0 = r6.LIZLLL
            int r2 = (int) r0
            float r0 = r6.LJ
            int r1 = (int) r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r6.LJIIJ = r0
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r0 = r6.LJIIJ
            kotlin.jvm.internal.o.LJI(r0)
            r2.<init>(r0)
            float r1 = r4.LJIIL
            float r0 = r4.LJIILIIL
            r6.LJIIJ(r3)
            r6.LJIIJJI(r3)
            r6.LJII(r2, r8)
            r6.LJIIJ(r1)
            r6.LJIIJJI(r0)
            goto L3a
        L9e:
            r0.LJI = r1
            goto L72
        La1:
            r0.recycle()
            goto L69
        La5:
            r6.LJII(r7, r8)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC216578ej.LIZIZ(android.graphics.Canvas, X.8f1):void");
    }
}
