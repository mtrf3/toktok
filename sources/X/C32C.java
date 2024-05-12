package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadReactionIndicatorFactoryKt$getUnreadReactionIndicatorParameters$oldestMessageIndexWithUnreadMessageProperty$1", f = "UnreadReactionIndicatorFactory.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.32C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32C extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Long>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32C(long j, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32C(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            AnonymousClass329.LIZ.getClass();
            C96413qP.LIZ.LJIIIZ();
            C63152OqS c63152OqS = C63152OqS.LIZIZ;
            String str = this.LJLILLLLZI;
            long j = this.LJLJI;
            this.LJLIL = 1;
            obj = c63152OqS.LIZIZ(j, str);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Long> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
