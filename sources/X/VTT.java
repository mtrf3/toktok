package X;

import com.bytedance.ies.xelement.viewpager.CustomAppBarLayout$Behavior;

/* loaded from: classes15.dex */
public final class VTT extends VTW {
    public final /* synthetic */ CustomAppBarLayout$Behavior LIZ;

    public VTT(CustomAppBarLayout$Behavior customAppBarLayout$Behavior) {
        this.LIZ = customAppBarLayout$Behavior;
    }

    @Override // X.VTW
    public final boolean LIZ(C80217Ve1 c80217Ve1) {
        if ((c80217Ve1 instanceof VTR) && !((VTR) c80217Ve1).LJLZ && this.LIZ.getTopAndBottomOffset() / c80217Ve1.getTotalScrollRange() <= -1) {
            return false;
        }
        return true;
    }
}
