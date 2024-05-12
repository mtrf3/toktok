package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: X.VcZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80127VcZ {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ FlexboxLayoutManager LJII;

    public final void LIZIZ() {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        boolean z = false;
        this.LJFF = false;
        this.LJI = false;
        if (this.LJII.LJIILLIIL()) {
            FlexboxLayoutManager flexboxLayoutManager = this.LJII;
            int i = flexboxLayoutManager.LJZ;
            if (i == 0) {
                if (flexboxLayoutManager.LJLZ == 1) {
                    z = true;
                }
                this.LJ = z;
                return;
            } else {
                if (i == 2) {
                    z = true;
                }
                this.LJ = z;
                return;
            }
        }
        FlexboxLayoutManager flexboxLayoutManager2 = this.LJII;
        int i2 = flexboxLayoutManager2.LJZ;
        if (i2 == 0) {
            if (flexboxLayoutManager2.LJLZ == 3) {
                z = true;
            }
            this.LJ = z;
        } else {
            if (i2 == 2) {
                z = true;
            }
            this.LJ = z;
        }
    }

    public final void LIZ() {
        int LJIIJ;
        int LJIIJ2;
        if (!this.LJII.LJIILLIIL()) {
            FlexboxLayoutManager flexboxLayoutManager = this.LJII;
            if (flexboxLayoutManager.LLD) {
                if (this.LJ) {
                    LJIIJ2 = flexboxLayoutManager.LLII.LJI();
                } else {
                    LJIIJ2 = flexboxLayoutManager.LJLLLL - flexboxLayoutManager.LLII.LJIIJ();
                }
                this.LIZJ = LJIIJ2;
                return;
            }
        }
        if (this.LJ) {
            LJIIJ = this.LJII.LLII.LJI();
        } else {
            LJIIJ = this.LJII.LLII.LJIIJ();
        }
        this.LIZJ = LJIIJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorInfo{mPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", mFlexLinePosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mCoordinate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mPerpendicularCoordinate=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mLayoutFromEnd=");
        LIZ.append(this.LJ);
        LIZ.append(", mValid=");
        LIZ.append(this.LJFF);
        LIZ.append(", mAssignedFromSavedState=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, '}', LIZ);
    }

    public C80127VcZ(FlexboxLayoutManager flexboxLayoutManager) {
        this.LJII = flexboxLayoutManager;
    }
}
