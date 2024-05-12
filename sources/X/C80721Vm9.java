package X;

import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.Vm9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80721Vm9 implements C0C3 {
    public final C0C3 LJLIL;
    public final /* synthetic */ C80766Vms LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.onPageScrollStateChanged(i);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        PagerAdapter adapter;
        adapter = super/*X.Vmv*/.getAdapter();
        if (this.LJLILLLLZI.LJJIJL() && adapter != null) {
            i = TB3.LIZ(adapter, i, -1);
        }
        this.LJLIL.onPageSelected(i);
    }

    public C80721Vm9(C80766Vms c80766Vms, C0C3 c0c3) {
        this.LJLILLLLZI = c80766Vms;
        this.LJLIL = c0c3;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter;
        adapter = super/*X.Vmv*/.getAdapter();
        if (this.LJLILLLLZI.LJJIJL() && adapter != null) {
            if (i == adapter.getCount() - 1 && f == 0.0f) {
                i--;
                i2 = this.LJLILLLLZI.getWidth();
                f = 1.0f;
            }
            this.LJLIL.onPageScrolled((r1 - (i + 1)) - 1, 1.0f - f, this.LJLILLLLZI.getWidth() - i2);
            return;
        }
        this.LJLIL.onPageScrolled(i, f, i2);
    }
}
