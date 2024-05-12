package X;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
/* renamed from: X.8YP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YP<A, B, C, D, E> extends AbstractC65781Prl implements InterfaceC88475Ynv<A, B, C, D, E, C76800UCe> {
    public final /* synthetic */ C8YM<RECEIVER> LJLIL;
    public final /* synthetic */ InterfaceC88476Ynw<RECEIVER, A, B, C, D, E, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8YP(C8YM<RECEIVER> c8ym, InterfaceC88476Ynw<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        super(5);
        this.LJLIL = c8ym;
        this.LJLILLLLZI = interfaceC88476Ynw;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C3C8 receiverForHostVM = this.LJLIL.getReceiverForHostVM();
        if (receiverForHostVM == null) {
            receiverForHostVM = this.LJLIL.getActualReceiverHolder().getActualReceiver();
        }
        if (receiverForHostVM != null) {
            this.LJLILLLLZI.invoke(receiverForHostVM, obj, obj2, obj3, obj4, obj5);
        }
        return C76800UCe.LIZ;
    }
}
