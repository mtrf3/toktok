package X;

import com.bytedance.ies.xelement.LynxPullRefreshView;

/* renamed from: X.OWi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62036OWi extends C78977Uz7 {
    public final /* synthetic */ LynxPullRefreshView LJLILLLLZI;

    @Override // X.InterfaceC80179VdP
    public final void LIZ() {
    }

    @Override // X.InterfaceC80179VdP
    public final void LJI() {
    }

    @Override // X.InterfaceC80179VdP
    public final void LJIILIIL() {
        VNL vnl;
        LynxPullRefreshView lynxPullRefreshView = this.LJLILLLLZI;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(new VNN(lynxPullRefreshView.getSign(), "headerreleased"));
        }
    }

    @Override // X.InterfaceC80179VdP
    public final void LJJ() {
        VNL vnl;
        LynxPullRefreshView lynxPullRefreshView = this.LJLILLLLZI;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(new VNN(lynxPullRefreshView.getSign(), "footerreleased"));
        }
    }

    public C62036OWi(LynxPullRefreshView lynxPullRefreshView) {
        this.LJLILLLLZI = lynxPullRefreshView;
    }

    @Override // X.InterfaceC80179VdP
    public final void LIZLLL(boolean z, float f) {
        VNL vnl;
        LynxPullRefreshView lynxPullRefreshView = this.LJLILLLLZI;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(lynxPullRefreshView.getSign(), "headeroffset");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "isDragging");
            c49615Jdb.LIZJ(Float.valueOf(f), "offsetPercent");
            vnl.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.InterfaceC80179VdP
    public final void LJIILJJIL(boolean z, float f) {
        VNL vnl;
        LynxPullRefreshView lynxPullRefreshView = this.LJLILLLLZI;
        VNU vnu = lynxPullRefreshView.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            C49615Jdb c49615Jdb = new C49615Jdb(lynxPullRefreshView.getSign(), "footeroffset");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "isDragging");
            c49615Jdb.LIZJ(Float.valueOf(f), "offsetPercent");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
