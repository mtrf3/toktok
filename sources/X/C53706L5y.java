package X;

/* renamed from: X.L5y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53706L5y implements InterfaceC04760Gq<C0GY> {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final /* synthetic */ C0GU<C0GY> LIZJ;

    @Override // X.InterfaceC04760Gq
    public final void onResult(C0GY c0gy) {
        C0GY c0gy2 = c0gy;
        if (c0gy2 == null) {
            return;
        }
        this.LIZ.setComposition(c0gy2);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LIZJ.LJII(this);
    }

    public C53706L5y(C29701Eo c29701Eo, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C0GU<C0GY> c0gu) {
        this.LIZ = c29701Eo;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = c0gu;
    }
}
