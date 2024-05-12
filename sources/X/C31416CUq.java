package X;

/* renamed from: X.CUq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31416CUq implements R47 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ = null;
    public final /* synthetic */ boolean LIZIZ = true;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public C31416CUq(InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        this.LIZJ.invoke();
    }
}
