package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vc1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80093Vc1 extends AbstractC80095Vc3 {
    @Override // X.AbstractC80095Vc3
    public final int LIZLLL() {
        return this.LIZ.LJLLLL;
    }

    @Override // X.AbstractC80095Vc3
    public final int LJ() {
        return this.LIZ.getPaddingLeft();
    }

    @Override // X.AbstractC80095Vc3
    public final int LJFF() {
        C0A2 c0a2 = this.LIZ;
        return (c0a2.LJLLLL - c0a2.getPaddingLeft()) - this.LIZ.getPaddingRight();
    }

    public C80093Vc1(C0A2 c0a2) {
        super(c0a2);
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZ(View view) {
        return this.LIZ.LJJJJLI(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.LJJJJL(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC80095Vc3
    public final int LIZJ(View view) {
        return this.LIZ.LJJJJJ(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }
}
