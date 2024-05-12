package X;

/* renamed from: X.BwW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30404BwW implements InterfaceC30406BwY {
    public final /* synthetic */ C30401BwT LIZ;

    @Override // X.InterfaceC30406BwY
    public final void onDialogShow() {
        C30401BwT c30401BwT = this.LIZ;
        InterfaceC30405BwX interfaceC30405BwX = c30401BwT.LIZJ;
        if (interfaceC30405BwX != null) {
            c30401BwT.LIZ.getLifecycle().addObserver(interfaceC30405BwX);
        }
    }

    public C30404BwW(C30401BwT c30401BwT) {
        this.LIZ = c30401BwT;
    }
}
