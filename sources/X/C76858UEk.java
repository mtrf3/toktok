package X;

/* renamed from: X.UEk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76858UEk implements R3Y {
    public final /* synthetic */ InterfaceC76859UEl LJLIL;

    @Override // X.R3Y
    public final void onCancel() {
    }

    @Override // X.R3Y
    public final void onSuccess() {
        InterfaceC76859UEl interfaceC76859UEl = this.LJLIL;
        if (interfaceC76859UEl != null) {
            interfaceC76859UEl.onSuccess();
        }
    }

    public C76858UEk(InterfaceC76859UEl interfaceC76859UEl) {
        this.LJLIL = interfaceC76859UEl;
    }
}
