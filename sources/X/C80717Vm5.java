package X;

/* renamed from: X.Vm5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80717Vm5 implements C0C3 {
    public final /* synthetic */ C80716Vm4 LJLIL;

    public C80717Vm5(C80716Vm4 c80716Vm4) {
        this.LJLIL = c80716Vm4;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C80716Vm4 c80716Vm4 = this.LJLIL;
            c80716Vm4.LIZIZ(c80716Vm4.LJLJJLL.getCurrentItem(), 0);
        }
        C0C3 c0c3 = this.LJLIL.LJLJJI;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C0C3 c0c3 = this.LJLIL.LJLJJI;
        if (c0c3 != null) {
            c0c3.onPageSelected(i);
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        C80716Vm4 c80716Vm4 = this.LJLIL;
        int i3 = c80716Vm4.LJLJLJ;
        if (i3 != i) {
            c80716Vm4.LIZLLL(i3, false);
            this.LJLIL.LIZLLL(i, true);
        }
        C80716Vm4 c80716Vm42 = this.LJLIL;
        c80716Vm42.LJLJLJ = i;
        c80716Vm42.LJLJLLL = f;
        c80716Vm42.LIZIZ(i, (int) (c80716Vm42.LJLJJL.getChildAt(i).getWidth() * f));
        this.LJLIL.invalidate();
        C0C3 c0c3 = this.LJLIL.LJLJJI;
        if (c0c3 != null) {
            c0c3.onPageScrolled(i, f, i2);
        }
    }
}
