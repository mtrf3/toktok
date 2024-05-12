package X;

/* renamed from: X.K3d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51085K3d implements C0C3 {
    public boolean LJLIL;
    public Integer LJLILLLLZI;
    public final /* synthetic */ C51087K3f LJLJI;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C51085K3d(C51087K3f c51087K3f) {
        this.LJLJI = c51087K3f;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (!this.LJLIL) {
                this.LJLILLLLZI = Integer.valueOf(this.LJLJI.LIZ());
            }
            this.LJLIL = true;
            return;
        }
        this.LJLIL = false;
        this.LJLILLLLZI = null;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z = true;
        if (this.LJLILLLLZI != null) {
            C40517FvF c40517FvF = new C40517FvF(0, 1);
            Integer num = this.LJLILLLLZI;
            if (num != null && c40517FvF.LJIILJJIL(num.intValue())) {
                InterfaceC50244Jnk interfaceC50244Jnk = this.LJLJI.LIZIZ;
                if (i != 0) {
                    z = false;
                }
                interfaceC50244Jnk.LIZJ(z);
                return;
            }
            return;
        }
        if (i != 0) {
            this.LJLJI.LIZIZ.LIZ();
        } else {
            this.LJLJI.LIZIZ.LIZIZ();
        }
    }
}
