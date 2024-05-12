package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.IMSearchDefaultRepository$refreshDefaultPage$1$2", f = "IMSearchDefaultRepository.kt", l = {159}, m = "invokeSuspend")
/* renamed from: X.335, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass335 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super AnonymousClass333>, Object> {
    public int LJLIL;
    public final /* synthetic */ C33A LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass335(C33A c33a, InterfaceC67352kd<? super AnonymousClass335> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c33a;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass335(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super AnonymousClass333> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C776532z c776532z = this.LJLILLLLZI.LIZJ;
            this.LJLIL = 1;
            obj = c776532z.LIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
