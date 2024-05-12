package X;

/* renamed from: X.Vo4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80840Vo4 implements C0C3 {
    public final /* synthetic */ C80841Vo5 LJLIL;

    public C80840Vo4(C80841Vo5 c80841Vo5) {
        this.LJLIL = c80841Vo5;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        C0C3 c0c3 = this.LJLIL.LLJJJJJIL;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
        if (i == 0) {
            this.LJLIL.LLJL = 0.0f;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C0C3 c0c3 = this.LJLIL.LLJJJJJIL;
        if (c0c3 != null) {
            c0c3.onPageSelected(i);
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        C0C3 c0c3 = this.LJLIL.LLJJJJJIL;
        if (c0c3 != null) {
            c0c3.onPageScrolled(i, f, i2);
        }
        C80841Vo5 c80841Vo5 = this.LJLIL;
        c80841Vo5.LLJJLIIIJLLLLLLLZ = i;
        c80841Vo5.LLJL = f;
        c80841Vo5.LLJLLIL = i;
        int childCount = c80841Vo5.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            c80841Vo5.getChildAt(i3).invalidate();
        }
    }
}
