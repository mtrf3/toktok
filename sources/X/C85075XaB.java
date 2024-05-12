package X;

/* renamed from: X.XaB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85075XaB implements InterfaceC85082XaI {
    public final /* synthetic */ C85069Xa5 LIZ;

    public C85075XaB(C85069Xa5 c85069Xa5) {
        this.LIZ = c85069Xa5;
    }

    @Override // X.InterfaceC85082XaI
    public final void LIZ(long j, boolean z) {
        EnumC80000VaW enumC80000VaW;
        InterfaceC85091XaR interfaceC85091XaR = this.LIZ.LIZ;
        if (z) {
            enumC80000VaW = EnumC80000VaW.SEEK_SUCCESS;
        } else {
            enumC80000VaW = EnumC80000VaW.SEEK_FAILED;
        }
        interfaceC85091XaR.LIZLLL(enumC80000VaW, j);
    }
}
