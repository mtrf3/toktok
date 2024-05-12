package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Zgu, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90588Zgu extends AbstractC90102ZXu {
    public final /* synthetic */ DialogC90863ZlL LIZ;

    @Override // X.AbstractC90102ZXu
    public final void LJIIJ() {
        this.LIZ.LJJIII();
    }

    public C90588Zgu(DialogC90863ZlL dialogC90863ZlL) {
        this.LIZ = dialogC90863ZlL;
    }

    @Override // X.AbstractC90102ZXu
    public final void LJII(ZY4 zy4) {
        DialogC90863ZlL dialogC90863ZlL = this.LIZ;
        dialogC90863ZlL.LJLJJLL = zy4;
        dialogC90863ZlL.LJJIIJ();
        this.LIZ.LJJII();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIL(ZY4 zy4) {
        boolean z;
        DialogC90863ZlL dialogC90863ZlL = this.LIZ;
        if (dialogC90863ZlL.LJZL != zy4) {
            AbstractC90587Zgt abstractC90587Zgt = (AbstractC90587Zgt) ((HashMap) dialogC90863ZlL.LJZI).get(zy4.LIZJ);
            if (abstractC90587Zgt != null) {
                int i = abstractC90587Zgt.LJLIL.LJIILJJIL;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                abstractC90587Zgt.setMute(z);
                abstractC90587Zgt.LJLJI.setProgress(i);
            }
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZLLL(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJJIII();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJ(ZY5 zy5, ZY4 zy4) {
        ZY3 LIZ;
        C90092ZXk c90092ZXk;
        if (zy4 == this.LIZ.LJLJJLL) {
            AbstractC90096ZXo abstractC90096ZXo = ZY5.LIZJ.LJIIZILJ;
            if ((abstractC90096ZXo instanceof AbstractC90599Zh5) && abstractC90096ZXo != null) {
                ZY2 zy2 = zy4.LIZ;
                zy2.getClass();
                ZY5.LIZIZ();
                for (ZY4 zy42 : Collections.unmodifiableList(zy2.LIZIZ)) {
                    if (!this.LIZ.LJLJJLL.LIZIZ().contains(zy42) && (LIZ = this.LIZ.LJLJJLL.LIZ(zy42)) != null && (c90092ZXk = LIZ.LIZ) != null && c90092ZXk.LIZLLL && !((ArrayList) this.LIZ.LJLJLJ).contains(zy42)) {
                        this.LIZ.LJJIIJ();
                        this.LIZ.LJJII();
                        return;
                    }
                }
            }
        }
        this.LIZ.LJJIII();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJI(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJJIII();
    }
}
