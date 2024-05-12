package X;

import com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.ecaction.ShowInboxEntranceCache$refreshCartItemCount$1", f = "ShowInboxEntranceCache.kt", l = {23}, m = "invokeSuspend")
/* renamed from: X.2wC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74522wC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C74682wS LJLIL;
    public int LJLILLLLZI;

    public C74522wC(InterfaceC67352kd<? super C74522wC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74522wC(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C74682wS c74682wS;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                c74682wS = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c74682wS = C74682wS.LIZ;
            C74542wE c74542wE = ECActionApi.LIZ;
            this.LJLIL = c74682wS;
            this.LJLILLLLZI = 1;
            obj = c74542wE.LIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Number) obj).intValue() <= 0) {
            z = false;
        }
        c74682wS.getClass();
        C74682wS.LIZJ = z;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C74522wC(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
