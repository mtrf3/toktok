package X;

/* renamed from: X.Fre, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40294Fre extends QNA {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ = null;
    public final /* synthetic */ boolean LIZIZ = true;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public C40294Fre(InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

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
}
