package X;

import Y.IDfS126S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.manager.core.TvCasting$initialize$1", f = "TvCastingFeature.kt", l = {69}, m = "invokeSuspend")
/* renamed from: X.2qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71092qf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C71092qf(InterfaceC67352kd<? super C71092qf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71092qf(interfaceC67352kd);
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
            if (C71042qa.LIZIZ == null) {
                C71082qe c71082qe = new C71082qe();
                XLM LJII = c71082qe.LIZ.LJII();
                IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(c71082qe, 7);
                this.LJLIL = 1;
                if (LJII.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C71092qf(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
