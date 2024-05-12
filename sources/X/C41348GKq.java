package X;

/* renamed from: X.GKq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41348GKq implements R3Y {
    public final /* synthetic */ C41346GKo LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.R3Y
    public final void onCancel() {
        this.LJLIL.LJLJL = false;
    }

    @Override // X.R3Y
    public final void onSuccess() {
        this.LJLIL.LJLJL = true;
        this.LJLILLLLZI.invoke();
    }

    public C41348GKq(C41346GKo c41346GKo, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = c41346GKo;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
