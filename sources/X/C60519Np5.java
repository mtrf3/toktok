package X;

/* renamed from: X.Np5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60519Np5 implements GBL {
    public final /* synthetic */ InterfaceC60521Np7 LJLIL;

    @Override // X.GBL
    public final void onExit() {
        InterfaceC60521Np7 interfaceC60521Np7 = this.LJLIL;
        if (interfaceC60521Np7 != null) {
            interfaceC60521Np7.onExit();
        }
    }

    public C60519Np5(InterfaceC60521Np7 interfaceC60521Np7) {
        this.LJLIL = interfaceC60521Np7;
    }

    @Override // X.GBL
    public final void onChanged(String str, String str2) {
        InterfaceC60521Np7 interfaceC60521Np7 = this.LJLIL;
        if (interfaceC60521Np7 != null) {
            interfaceC60521Np7.onChanged(str, str2);
        }
    }
}
