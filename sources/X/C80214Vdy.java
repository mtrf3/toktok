package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.Vdy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80214Vdy<V extends View> extends C06C<V> {
    public int tempLeftRightOffset;
    public int tempTopBottomOffset;
    public C80215Vdz viewOffsetHelper;

    public int getLeftAndRightOffset() {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            return c80215Vdz.LJ;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            return c80215Vdz.LIZLLL;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null && c80215Vdz.LJI) {
            return true;
        }
        return false;
    }

    public boolean isVerticalOffsetEnabled() {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null && c80215Vdz.LJFF) {
            return true;
        }
        return false;
    }

    public C80214Vdy() {
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            c80215Vdz.LJI = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            if (!c80215Vdz.LJI || c80215Vdz.LJ == i) {
                return false;
            }
            c80215Vdz.LJ = i;
            c80215Vdz.LIZ();
            return true;
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            return c80215Vdz.LIZIZ(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        if (c80215Vdz != null) {
            c80215Vdz.LJFF = z;
        }
    }

    public C80214Vdy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutChild(C45621qg c45621qg, V v, int i) {
        c45621qg.LJIIJ(i, v);
    }

    @Override // X.C06C
    public boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        layoutChild(c45621qg, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C80215Vdz(v);
        }
        C80215Vdz c80215Vdz = this.viewOffsetHelper;
        c80215Vdz.LIZIZ = c80215Vdz.LIZ.getTop();
        c80215Vdz.LIZJ = c80215Vdz.LIZ.getLeft();
        this.viewOffsetHelper.LIZ();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.LIZIZ(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 != 0) {
            C80215Vdz c80215Vdz2 = this.viewOffsetHelper;
            if (c80215Vdz2.LJI && c80215Vdz2.LJ != i3) {
                c80215Vdz2.LJ = i3;
                c80215Vdz2.LIZ();
            }
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }
}
