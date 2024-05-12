package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.AutoMsgFetchNode$tryLandToChat$1$1$2", f = "AutoMsgFetchNode.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.2p3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70092p3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C70172pB LJLILLLLZI;
    public final /* synthetic */ C70392pX LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70092p3(C70172pB c70172pB, C70392pX c70392pX, InterfaceC67352kd<? super C70092p3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c70172pB;
        this.LJLJI = c70392pX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70092p3(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C70172pB c70172pB = this.LJLILLLLZI;
            String str = this.LJLJI.LIZLLL;
            this.LJLIL = 1;
            if (c70172pB.LIZIZ(str, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
