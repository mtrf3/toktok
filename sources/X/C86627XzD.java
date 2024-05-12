package X;

/* renamed from: X.XzD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86627XzD implements InterfaceC58736N3k {
    public final /* synthetic */ InterfaceC86632XzI LIZ;

    @Override // X.InterfaceC58736N3k
    public final void onFailure() {
        this.LIZ.LJIILL("Context cannot be null");
    }

    public C86627XzD(C86621Xz7 c86621Xz7) {
        this.LIZ = c86621Xz7;
    }

    @Override // X.InterfaceC58736N3k
    public final void onSuccess(String str) {
        boolean z;
        InterfaceC86632XzI interfaceC86632XzI = this.LIZ;
        C79508VIi c79508VIi = new C79508VIi();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        }
        c79508VIi.LIZ = str;
        interfaceC86632XzI.LIZ(c79508VIi, "");
    }
}
