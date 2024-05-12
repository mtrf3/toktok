package X;

/* renamed from: X.CXx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31501CXx implements C0C3 {
    public final /* synthetic */ C31500CXw LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C31501CXx(C31500CXw c31500CXw) {
        this.LJLIL = c31500CXw;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C31500CXw c31500CXw = this.LJLIL;
        int i2 = c31500CXw.LJLJL;
        if (i2 > 0) {
            int i3 = i % i2;
            if (i3 < i2) {
                c31500CXw.setPosition(i3);
            } else {
                c31500CXw.setPosition(0);
            }
        }
    }
}
