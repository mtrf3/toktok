package X;

import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import java.util.Locale;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper$fetchRegion$1", f = "PaymentCacheHelper.kt", l = {74}, m = "invokeSuspend")
/* renamed from: X.Ak9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27089Ak9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C27089Ak9(InterfaceC67352kd<? super C27089Ak9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27089Ak9(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            String LIZ = C85990Xow.LIZ();
            if (LIZ != null) {
                str = LIZ.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            PaymentCacheHelper.LIZLLL = new Region(null, null, str, null, null, null, 59, null);
            Region region = PaymentCacheHelper.LIZLLL;
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            AddressApi.LIZ.getClass();
            C27096AkG.LJFF(region, null, null).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 0));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PaymentCacheHelper.LIZLLL = (Region) obj;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C27089Ak9(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
