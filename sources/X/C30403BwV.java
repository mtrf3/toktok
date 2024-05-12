package X;

/* renamed from: X.BwV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30403BwV implements InterfaceC30406BwY {
    public final /* synthetic */ C30402BwU LIZ;

    @Override // X.InterfaceC30406BwY
    public final void onDialogShow() {
        C30402BwU c30402BwU = this.LIZ;
        InterfaceC30405BwX interfaceC30405BwX = c30402BwU.LIZJ;
        if (interfaceC30405BwX != null) {
            c30402BwU.LIZ.getLifecycle().addObserver(interfaceC30405BwX);
        }
    }

    public C30403BwV(C30402BwU c30402BwU) {
        this.LIZ = c30402BwU;
    }
}
