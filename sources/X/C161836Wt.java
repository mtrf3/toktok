package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace.handlers.MusicReplaceParamsHandler$handleData$2$1", f = "MusicReplaceParamsHandler.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.6Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161836Wt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166036fP>, Object> {
    public int LJLIL;

    public C161836Wt(InterfaceC67352kd<? super C161836Wt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C161836Wt(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            obj = C167106h8.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166036fP> interfaceC67352kd) {
        return new C161836Wt(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
