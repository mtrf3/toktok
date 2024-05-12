package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.helper.SessionListRefreshHelper$updateData$1", f = "SessionListRefreshHelper.kt", l = {87}, m = "invokeSuspend")
/* renamed from: X.37P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37P extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82153Kh LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC81953Jn LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37P(C82153Kh c82153Kh, int i, InterfaceC81953Jn interfaceC81953Jn, InterfaceC67352kd<? super C37P> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82153Kh;
        this.LJLJI = i;
        this.LJLJJI = interfaceC81953Jn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37P(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C37Q c37q = this.LJLILLLLZI.LIZJ;
            int i2 = this.LJLJI;
            InterfaceC81953Jn interfaceC81953Jn = this.LJLJJI;
            this.LJLIL = 1;
            if (c37q.LIZIZ(i2, interfaceC81953Jn, this) == enumC58928NAu) {
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
