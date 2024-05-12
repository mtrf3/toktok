package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.utils.SearchInitTaskHelper$run$3$1", f = "SearchInitTaskHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69042nM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C69042nM(InterfaceC67352kd<? super C69042nM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69042nM(interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            if (!FPI.LIZ) {
                FPI.LIZ(EF7.LIZIZ(), false);
            }
            new FPJ("snapboost_list_search.txt").LIZJ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
