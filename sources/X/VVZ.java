package X;

import com.bytedance.ies.xelement.LynxPullRefreshView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VVZ implements InterfaceC79839VVb {
    public final /* synthetic */ LynxPullRefreshView LJLIL;

    public VVZ(LynxPullRefreshView lynxPullRefreshView) {
        this.LJLIL = lynxPullRefreshView;
    }

    @Override // X.InterfaceC79839VVb
    public final void LJIIJ(InterfaceC78979Uz9 it) {
        VNL vnl;
        o.LJIIJ(it, "it");
        LynxPullRefreshView lynxPullRefreshView = this.LJLIL;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(new VNN(lynxPullRefreshView.getSign(), "startloadmore"));
        }
    }
}
