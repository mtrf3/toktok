package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28861Bi extends AbstractC03050Ab {
    @Override // X.AbstractC03050Ab
    public final int LJFF() {
        return this.LIZ.LJLLLLLL;
    }

    @Override // X.AbstractC03050Ab
    public final int LJI() {
        C0A2 c0a2 = this.LIZ;
        return c0a2.LJLLLLLL - c0a2.getPaddingBottom();
    }

    @Override // X.AbstractC03050Ab
    public final int LJII() {
        return this.LIZ.getPaddingBottom();
    }

    @Override // X.AbstractC03050Ab
    public final int LJIIIIZZ() {
        return this.LIZ.LJLLL;
    }

    @Override // X.AbstractC03050Ab
    public final int LJIIIZ() {
        return this.LIZ.LJLLJ;
    }

    @Override // X.AbstractC03050Ab
    public final int LJIIJ() {
        return this.LIZ.getPaddingTop();
    }

    @Override // X.AbstractC03050Ab
    public final int LJIIJJI() {
        C0A2 c0a2 = this.LIZ;
        return (c0a2.LJLLLLLL - c0a2.getPaddingTop()) - this.LIZ.getPaddingBottom();
    }

    public C28861Bi(C0A2 c0a2) {
        super(c0a2);
    }

    @Override // X.AbstractC03050Ab
    public final int LIZIZ(View view) {
        return this.LIZ.LJJJJIZL(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // X.AbstractC03050Ab
    public final int LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.LJJJJJL(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC03050Ab
    public final int LIZLLL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.LJJJJL(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC03050Ab
    public final int LJ(View view) {
        return this.LIZ.LJJJJLL(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // X.AbstractC03050Ab
    public final int LJIILIIL(View view) {
        this.LIZ.LJJLIIIIJ(view, this.LIZJ);
        return this.LIZJ.bottom;
    }

    @Override // X.AbstractC03050Ab
    public final int LJIILJJIL(View view) {
        this.LIZ.LJJLIIIIJ(view, this.LIZJ);
        return this.LIZJ.top;
    }

    @Override // X.AbstractC03050Ab
    public final void LJIILL(int i) {
        this.LIZ.LJJLIIIJLLLLLLLZ(i);
    }
}
