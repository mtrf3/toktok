package X;

import com.bytedance.ies.xelement.LynxPullRefreshView;
import kotlin.jvm.internal.o;

/* renamed from: X.VVa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79838VVa implements InterfaceC79840VVc {
    public final /* synthetic */ LynxPullRefreshView LJLIL;

    public C79838VVa(LynxPullRefreshView lynxPullRefreshView) {
        this.LJLIL = lynxPullRefreshView;
    }

    @Override // X.InterfaceC79840VVc
    public final void LJIJJLI(C80164VdA it) {
        VNL vnl;
        o.LJIIJ(it, "it");
        LynxPullRefreshView lynxPullRefreshView = this.LJLIL;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(lynxPullRefreshView.getSign(), "startrefresh");
            c49615Jdb.LIZJ(Boolean.valueOf(this.LJLIL.LJLJJL), "isManual");
            vnl.LIZIZ(c49615Jdb);
        }
        this.LJLIL.LJLJJL = true;
    }
}
