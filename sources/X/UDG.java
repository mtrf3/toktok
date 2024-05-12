package X;

/* loaded from: classes14.dex */
public final class UDG implements UDJ {
    public final /* synthetic */ C61101NyT LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.UDJ
    public final void cancel() {
        C61101NyT c61101NyT = this.LIZ;
        if (c61101NyT != null) {
            c61101NyT.LIZ();
        }
        this.LIZIZ.invoke();
    }

    @Override // X.UDJ
    public final void execute() {
        C61101NyT c61101NyT = this.LIZ;
        if (c61101NyT != null) {
            c61101NyT.LIZIZ();
        }
    }

    public UDG(C61101NyT c61101NyT, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = c61101NyT;
        this.LIZIZ = interfaceC65784Pro;
    }
}
