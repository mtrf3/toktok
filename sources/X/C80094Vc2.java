package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vc2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80094Vc2 extends AbstractC80095Vc3 {
    @Override // X.AbstractC80095Vc3
    public final int LIZLLL() {
        return this.LIZ.LJLLLLLL;
    }

    @Override // X.AbstractC80095Vc3
    public final int LJ() {
        return this.LIZ.getPaddingTop();
    }

    @Override // X.AbstractC80095Vc3
    public final int LJFF() {
        C0A2 c0a2 = this.LIZ;
        return (c0a2.LJLLLLLL - c0a2.getPaddingTop()) - this.LIZ.getPaddingBottom();
    }

    public C80094Vc2(C0A2 c0a2) {
        super(c0a2);
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZ(View view) {
        return this.LIZ.LJJJJIZL(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.LJJJJJL(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZJ(View view) {
        return this.LIZ.LJJJJLL(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }
}
