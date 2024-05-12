package X;

import android.os.Bundle;
import defpackage.e1;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wje, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83114Wje implements InterfaceC88472Yns<C83116Wjg, C76800UCe> {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final Bundle LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C83116Wjg c83116Wjg) {
        C83116Wjg configure = c83116Wjg;
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(C51914KZa.LJLIL, "<set-?>");
        C43317GzJ c43317GzJ = C43317GzJ.LJLIL;
        o.LJIIIZ(c43317GzJ, "<set-?>");
        configure.LIZ = c43317GzJ;
        C43319GzL c43319GzL = C43319GzL.LJLIL;
        o.LJIIIZ(c43319GzL, "<set-?>");
        configure.LIZIZ = c43319GzL;
        WJ9 wj9 = WJ9.LJLIL;
        o.LJIIIZ(wj9, "<set-?>");
        configure.LIZJ = wj9;
        configure.LIZLLL = wj9;
        C34499DgN c34499DgN = C34499DgN.LJLIL;
        o.LJIIIZ(c34499DgN, "<set-?>");
        configure.LJ = c34499DgN;
        DIG dig = DIG.LJLIL;
        o.LJIIIZ(dig, "<set-?>");
        configure.LJFF = dig;
        C34441DfR c34441DfR = C34441DfR.LJLIL;
        o.LJIIIZ(c34441DfR, "<set-?>");
        configure.LJI = c34441DfR;
        o.LJIIIZ(C34442DfS.LJLIL, "<set-?>");
        o.LJIIIZ(C34364DeC.LJLIL, "<set-?>");
        C34437DfN c34437DfN = C34437DfN.LJLIL;
        o.LJIIIZ(c34437DfN, "<set-?>");
        configure.LJII = c34437DfN;
        configure.LJIIJ = C43148Gwa.LJLIL;
        configure.LJIIL = C78886Uxe.LJFF().LIZIZ();
        G8Z g8z = G8Z.LJLIL;
        o.LJIIIZ(g8z, "<set-?>");
        configure.LJIIJJI = g8z;
        configure.LJIILIIL = C140465fG.LIZ();
        configure.LJIILJJIL = this.LJLILLLLZI;
        if (this.LJLJI) {
            configure.LJIILLIIL = new C83121Wjl();
            C34438DfO c34438DfO = C34438DfO.LJLIL;
            o.LJIIIZ(c34438DfO, "<set-?>");
            configure.LIZLLL = c34438DfO;
        }
        if (this.LJLJJI && this.LJLJJLL) {
            configure.LJIILLIIL = new C83157WkL(this.LJLIL);
        }
        Bundle bundle = this.LJLJL;
        if (bundle != null && bundle.getBoolean("exterior_record_page_memory")) {
            configure.LJIILLIIL = new C83125Wjp();
            HYV.LIZ = true;
            C34439DfP c34439DfP = C34439DfP.LJLIL;
            o.LJIIIZ(c34439DfP, "<set-?>");
            configure.LIZJ = c34439DfP;
            C34440DfQ c34440DfQ = C34440DfQ.LJLIL;
            o.LJIIIZ(c34440DfQ, "<set-?>");
            configure.LIZLLL = c34440DfQ;
        } else {
            HYV.LIZ = false;
        }
        configure.LJIJJ = new AqS180S0100000_14(this, 336);
        String str = this.LJLJJL;
        o.LJIIIZ(str, "<set-?>");
        configure.LJIJI = str;
        configure.LJIILL = this.LJLJLJ;
        configure.LJIIZILJ = this.LJLJLLL;
        return C76800UCe.LIZ;
    }

    public C83114Wje(String uid, boolean z, boolean z2, boolean z3, String curPage, boolean z4, Bundle bundle, boolean z5, int i) {
        bundle = (i & 64) != 0 ? null : bundle;
        z5 = (i & 128) != 0 ? false : z5;
        boolean LIZ = (i & 256) != 0 ? e1.LIZ(31744, "update_beauty_download_status_from_bg_thread", true, false) : false;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(curPage, "curPage");
        this.LJLIL = uid;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = curPage;
        this.LJLJJLL = z4;
        this.LJLJL = bundle;
        this.LJLJLJ = z5;
        this.LJLJLLL = LIZ;
    }
}
