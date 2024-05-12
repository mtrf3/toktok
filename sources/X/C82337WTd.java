package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.combination.NowsRecordTabComponent$asyncApi$1", f = "NowsRecordTabComponent.kt", l = {352}, m = "invokeSuspend")
/* renamed from: X.WTd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82337WTd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82334WTa LJLILLLLZI;
    public final /* synthetic */ Class<T> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<T, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C82337WTd(C82334WTa c82334WTa, Class<T> cls, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C82337WTd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82334WTa;
        this.LJLJI = cls;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82337WTd(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C82334WTa c82334WTa = this.LJLILLLLZI;
            C33R<Boolean> c33r = c82334WTa.LJLL;
            C82340WTg c82340WTg = new C82340WTg(c82334WTa, this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (c33r.collect(c82340WTg, this) == enumC58928NAu) {
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
