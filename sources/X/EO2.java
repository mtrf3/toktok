package X;

import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$initMerchantUserId$1$1$1", f = "PayAuthHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EO2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PaymentData LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EO2(PaymentData paymentData, InterfaceC67352kd<? super EO2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = paymentData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EO2(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.C141335gf.LIZJ(r6)
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = r5.LJLIL
            com.google.gson.m r2 = r0.cashier
            r4 = 0
            if (r2 == 0) goto L24
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L24
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L24
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L24
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L24
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> L24
            if (r0 != 0) goto L21
            r1 = r4
        L21:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r1 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r1     // Catch: com.google.gson.s -> L24
            goto L25
        L24:
            r1 = r4
        L25:
            X.EO3.LIZ = r1
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = r5.LJLIL
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PipoTokenInfo r0 = r0.pipoTokenInfo
            X.EO3.LIZIZ = r0
            X.16n r3 = X.C22780uw.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r0 = X.EO3.LIZ
            if (r0 == 0) goto L52
            java.lang.String r2 = r0.merchantUserId
        L35:
            r3.getClass()
            X.16o r0 = X.C276216o.LJIIL
            X.16m r1 = r0.LIZ
            if (r1 == 0) goto L46
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L46
            r1.LJIJI = r2
        L46:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r0 = X.EO3.LIZ
            if (r0 == 0) goto L4c
            java.lang.String r4 = r0.nonce
        L4c:
            r3.LJFF(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L52:
            r2 = r4
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
