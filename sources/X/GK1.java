package X;

/* loaded from: classes8.dex */
public final class GK1 implements R3Y {
    public final /* synthetic */ GK0 LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.R3Y
    public final void onCancel() {
        this.LJLIL.LJLJJLL = false;
    }

    @Override // X.R3Y
    public final void onSuccess() {
        this.LJLIL.LJLJJLL = true;
        this.LJLILLLLZI.invoke();
    }

    public GK1(GK0 gk0, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = gk0;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
