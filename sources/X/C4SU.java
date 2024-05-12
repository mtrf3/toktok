package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.utils.SearchGeckoManager$fetchResource$2$1", f = "SearchGeckoManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4SU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C61295O3v LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, C61295O3v, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4SU(C61295O3v c61295O3v, InterfaceC88471Ynr<? super Boolean, ? super C61295O3v, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C4SU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c61295O3v;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4SU(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C61295O3v c61295O3v = this.LJLIL;
        if (!c61295O3v.LJZL || c61295O3v.getFilePath() == null) {
            InterfaceC88471Ynr<Boolean, C61295O3v, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Boolean.FALSE, this.LJLIL);
            }
        } else {
            C61295O3v c61295O3v2 = this.LJLIL;
            InterfaceC88471Ynr<Boolean, C61295O3v, C76800UCe> interfaceC88471Ynr2 = this.LJLILLLLZI;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(Boolean.TRUE, c61295O3v2);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
