package X;

import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: X.VQd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79711VQd implements VRC {
    public final /* synthetic */ OCW LIZ;
    public final /* synthetic */ C79720VQm LIZIZ;

    @Override // X.VRC
    public final void LIZ(String str) {
        T t;
        this.LIZIZ.LJIIJJI.remove(str);
        C79720VQm c79720VQm = this.LIZIZ;
        if (c79720VQm.LIZJ != null && (t = c79720VQm.LIZ.mView) != 0) {
            ViewGroup viewGroup = (ViewGroup) t.getParent();
            ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
            if (viewGroup != null) {
                C16880lQ.LJLLL(t, viewGroup);
            }
            int[] iArr = new int[2];
            c79720VQm.LIZJ.getLocationOnScreen(iArr);
            c79720VQm.LIZLLL.removeChild(c79720VQm.LIZ);
            c79720VQm.LIZLLL.insertChild(c79720VQm.LIZ, c79720VQm.LIZIZ);
            int left = t.getLeft() + iArr[0];
            int top = t.getTop() - iArr[1];
            LynxUI lynxUI = c79720VQm.LIZ;
            lynxUI.updateLayout(left, top, layoutParams.width, layoutParams.height, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, lynxUI.getBound());
        }
        OCW ocw = this.LIZ;
        if (ocw != null) {
            ((C79638VNi) ocw).LIZ();
        }
        this.LIZIZ.LJIIIZ = false;
    }

    public C79711VQd(C79720VQm c79720VQm, OCW ocw) {
        this.LIZIZ = c79720VQm;
        this.LIZ = ocw;
    }
}
