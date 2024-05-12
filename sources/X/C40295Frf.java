package X;

/* renamed from: X.Frf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40295Frf extends QNA {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        if (z) {
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

    public C40295Frf(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = z;
        this.LIZJ = interfaceC65784Pro2;
    }
}
