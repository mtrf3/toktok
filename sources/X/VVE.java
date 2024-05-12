package X;

import com.bytedance.ies.xelement.LynxScrollView;

/* loaded from: classes15.dex */
public final class VVE implements VVI {
    public final /* synthetic */ LynxScrollView LIZ;

    public VVE(LynxScrollView lynxScrollView) {
        this.LIZ = lynxScrollView;
    }

    @Override // X.VVI
    public final void LIZ(int i, int i2, int i3, int i4) {
        if (!((VVF) this.LIZ.mView).getMEnableBounce()) {
            return;
        }
        if (((VVF) this.LIZ.mView).getMScrollDirection() == VVD.HORIZONTAL_LEFT || ((VVF) this.LIZ.mView).getMScrollDirection() == VVD.HORIZONTAL_RIGHT) {
            LynxScrollView lynxScrollView = this.LIZ;
            int i5 = lynxScrollView.LJZI;
            lynxScrollView.LJJIII(i5 + i, 0, i5 + i3, 0, "scroll");
        } else {
            LynxScrollView lynxScrollView2 = this.LIZ;
            int i6 = lynxScrollView2.LJZI;
            lynxScrollView2.LJJIII(0, i6 + i2, 0, i6 + i4, "scroll");
        }
    }
}
