package X;

import com.bytedance.ies.xelement.LynxScrollView;

/* loaded from: classes15.dex */
public final class VVC implements VVJ {
    public final /* synthetic */ LynxScrollView LIZ;

    @Override // X.VVJ
    public final void LIZ() {
        VNU vnu;
        VNL vnl;
        LynxScrollView lynxScrollView = this.LIZ;
        if (lynxScrollView.LJLJJI && (vnu = lynxScrollView.mContext) != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(new VNN(lynxScrollView.getSign(), "scrolltobounce"));
        }
    }

    public VVC(LynxScrollView lynxScrollView) {
        this.LIZ = lynxScrollView;
    }
}
