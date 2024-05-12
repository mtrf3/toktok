package X;

import Y.AfS56S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspPreviewManager$preloadAddress$1$deferred$1", f = "OspPreviewManager.kt", l = {244}, m = "invokeSuspend")
/* renamed from: X.All, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27189All extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AddressListData>, Object> {
    public int LJLIL;

    public C27189All(InterfaceC67352kd<? super C27189All> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27189All(interfaceC67352kd);
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
            AddressApi.LIZ.getClass();
            AbstractC73672Svk LIZJ = C27096AkG.LIZJ(null);
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            xks.LJIILIIL(new AqS170S0100000_4(LIZJ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(xks, 92), new AfS56S0100000_4(xks, 93)), 1046));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AddressListData> interfaceC67352kd) {
        return new C27189All(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
