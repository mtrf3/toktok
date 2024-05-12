package X;

import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import fjb.a;
import kotlin.jvm.internal.IDqS8S1000000_31;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM$onDataError$2", f = "PhoneNumberVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKj, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93057aKj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PhoneNumberVM LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93057aKj(PhoneNumberVM phoneNumberVM, String str, InterfaceC67352kd<? super C93057aKj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = phoneNumberVM;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93057aKj(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(new IDqS8S1000000_31(this.LJLILLLLZI, 2));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
