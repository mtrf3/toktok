package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
/* renamed from: X.2BR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BR extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<Object>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Long, Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2BR(InterfaceC88472Yns<? super Long, Object> interfaceC88472Yns, InterfaceC67352kd<? super C2BR> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BR(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<Object> interfaceC67352kd) {
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
            InterfaceC88472Yns<Long, Object> interfaceC88472Yns = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = C1JD.LJJJJI(interfaceC88472Yns, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
