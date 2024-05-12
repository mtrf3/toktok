package X;

import com.bytedance.common.jato.gfx.DoFrameController;
import kotlin.jvm.internal.o;

/* renamed from: X.MEm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56476MEm implements PRT {
    public final /* synthetic */ C56477MEn LJLIL;

    public C56476MEm(C56477MEn c56477MEn) {
        this.LJLIL = c56477MEn;
    }

    @Override // X.PRT
    public final void LIZIZ(String s) {
        o.LJIIIZ(s, "s");
        C56477MEn.LIZLLL = true;
        if (C56486MEw.LIZ && C36531EVj.LJI) {
            C35810E3q.LJ(5000L);
        }
        if (C56486MEw.LIZIZ) {
            C35810E3q.LJFF(5000L);
        }
        if (C56486MEw.LIZJ) {
            C35810E3q.LJIIJ(5000L);
        }
    }

    @Override // X.PRT
    public final void onStop(String s) {
        String str;
        o.LJIIIZ(s, "s");
        C56477MEn.LIZLLL = false;
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ(this.LJLIL.LIZ());
        if (LIZIZ != null) {
            if (this.LJLIL.LIZ) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            LIZIZ.LIZ("enter_from", str);
        }
        if (C56486MEw.LIZ && C36531EVj.LJI) {
            C35810E3q.LJIIL();
        }
        if (C56486MEw.LIZIZ) {
            C35810E3q.LJIILJJIL();
        }
        if (C56486MEw.LIZJ) {
            DoFrameController.LIZIZ = 0;
        }
    }
}
