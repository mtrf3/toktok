package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$fetchResource$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3N3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3N3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C3N3(InterfaceC67352kd<? super C3N3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3N3(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LJ().LIZJ("fetchResource");
        ((C4Z2) C96423qQ.LIZ()).LIZ(EnumC100693xJ.ENTER_SESSION_LIST);
        C96963rI.LJ().getClass();
        C84543Tm.LIZIZ();
        C107064Ic.LIZ();
        if (((Number) C4D2.LIZ.getValue()).intValue() == 1) {
            C78866UxK.LJJLIIIIJ();
        }
        C81843Jc.LJ().LIZ("fetchResource");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C3N3(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
