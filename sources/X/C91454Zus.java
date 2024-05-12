package X;

/* renamed from: X.Zus, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91454Zus implements C0C3 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public int LJLJI = 1;
    public int LJLJJI;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLJJI = i;
        if (i != 0) {
            return;
        }
        this.LJLILLLLZI.invoke(Integer.valueOf(this.LJLJI));
        this.LJLIL.invoke();
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        this.LJLJI = i;
        if (this.LJLJJI == 0 && i != 1) {
            this.LJLILLLLZI.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91454Zus(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC88472Yns;
    }
}
