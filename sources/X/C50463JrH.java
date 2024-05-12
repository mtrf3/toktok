package X;

/* renamed from: X.JrH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50463JrH implements R47 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    public C50463JrH(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                    return;
                }
                return;
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LIZIZ;
            if (interfaceC65784Pro2 == null) {
                return;
            }
            interfaceC65784Pro2.invoke();
        }
    }
}
