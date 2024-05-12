package X;

import android.graphics.Matrix;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.acG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94144acG implements InterfaceC93781aWP {
    public C93779aWN LIZ;
    public Matrix LIZIZ = new Matrix();
    public final C93782aWQ LIZJ;
    public final /* synthetic */ C93603aTX LIZLLL;

    @Override // X.InterfaceC93781aWP
    public final void LIZJ() {
        C93603aTX c93603aTX = this.LIZLLL;
        c93603aTX.LJLJJI = true;
        C94211adL c94211adL = c93603aTX.LJLJLJ;
        if (c94211adL != null) {
            this.LIZ = new C93779aWN(this.LIZJ, c94211adL);
            Matrix matrix = new Matrix();
            matrix.setRotate(c94211adL.LJLJJL);
            this.LIZIZ = matrix;
        }
    }

    @Override // X.InterfaceC93781aWP
    public final void LJJIIZI(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        AbstractC94143acF abstractC94143acF = this.LIZLLL.LJLJL;
        if (abstractC94143acF != null) {
            abstractC94143acF.LJJIIZI(ev);
        }
        this.LIZLLL.LJLJJI = false;
    }

    public C94144acG(C93603aTX c93603aTX, C93782aWQ c93782aWQ) {
        this.LIZLLL = c93603aTX;
        this.LIZJ = c93782aWQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        if (r2 > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
    
        r2 = (r3 + r2) - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        r2 = r1 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        if (r2 > 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    @Override // X.InterfaceC93781aWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(float r13, float r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94144acG.LIZ(float, float):void");
    }
}
