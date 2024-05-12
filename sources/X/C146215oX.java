package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.aicaption.AICaptionComponent$saveLocalImage$1", f = "AICaptionComponent.kt", l = {551}, m = "invokeSuspend")
/* renamed from: X.5oX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146215oX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C152695yz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146215oX(C152695yz c152695yz, InterfaceC67352kd<? super C146215oX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c152695yz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C146215oX(this.LJLILLLLZI, interfaceC67352kd);
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
            C152695yz c152695yz = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c152695yz.LLIILZL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
