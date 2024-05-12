package X;

import com.bytedance.pipo.checkout.api.network.model.request.DistrictRequest;
import com.bytedance.pipo.checkout.api.network.model.request.InnerDistrictRequest;
import com.bytedance.pipo.checkout.api.network.model.request.StorePaymentMethodRequest;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.api.network.model.response.StorePaymentMethodResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a51, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92083a51 {
    public final C92097a5F LIZ;
    public final C92081a4z LIZIZ;
    public final String LIZJ;

    public C92083a51(C92078a4w config) {
        C92097a5F c92097a5F;
        o.LJIIIZ(config, "config");
        this.LIZJ = config.LIZJ;
        if (config.LIZ) {
            c92097a5F = new C92097a5F();
        } else {
            c92097a5F = new C92097a5F();
        }
        this.LIZ = c92097a5F;
        this.LIZIZ = new C92081a4z(config.LIZIZ, config.LIZLLL, config.LJ);
    }

    public final Object LIZ(DistrictRequest districtRequest, InterfaceC67352kd<? super C92082a50<List<District>>> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C92097a5F.LIZ(o.LJIILLIIL("/administrative/district", this.LIZIZ.LIZJ), new InnerDistrictRequest(districtRequest.getLanguage(), this.LIZJ, districtRequest.getGeonameid(), districtRequest.getCode()).buildParams(), new C92299a8V(c84654XKg, this, districtRequest));
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, X.InterfaceC67352kd<? super java.util.Map<java.lang.String, java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C93005aJt
            if (r0 == 0) goto L25
            r6 = r9
            X.aJt r6 = (X.C93005aJt) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L33
            if (r0 != r3) goto L2b
            java.lang.Object r1 = r6.LJLIL
            java.util.Map r1 = (java.util.Map) r1
            goto L68
        L25:
            X.aJt r6 = new X.aJt
            r6.<init>(r7, r9)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            java.lang.Object r8 = r6.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r6.LJLIL
            X.a51 r2 = (X.C92083a51) r2
            goto L50
        L3c:
            X.C141335gf.LIZJ(r5)
            java.lang.String r0 = "pipo_cashier_components"
            r6.LJLIL = r7     // Catch: java.lang.Throwable -> L72
            r6.LJLILLLLZI = r8     // Catch: java.lang.Throwable -> L72
            r6.LJLJJL = r1     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r7.LIZJ(r8, r0, r6)     // Catch: java.lang.Throwable -> L72
            if (r5 != r4) goto L4e
            return r4
        L4e:
            r2 = r7
            goto L53
        L50:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Throwable -> L72
        L53:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = "pipo_checkout"
            r6.LJLIL = r5     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r6.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L72
            r6.LJLJJL = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r2.LIZJ(r8, r1, r6)     // Catch: java.lang.Throwable -> L72
            if (r0 != r4) goto L65
            return r4
        L65:
            r1 = r5
            r5 = r0
            goto L6b
        L68:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Throwable -> L72
        L6b:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L72
            java.util.Map r0 = X.C113554cx.LJJLIIIJILLIZJL(r5, r1)     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            X.3mF r0 = X.C113554cx.LJJJLIIL()
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92083a51.LIZIZ(java.lang.String, X.2kd):java.lang.Object");
    }

    public final Object LIZLLL(StorePaymentMethodRequest storePaymentMethodRequest, InterfaceC67352kd<? super C92082a50<StorePaymentMethodResponse>> interfaceC67352kd) {
        String LIZ = this.LIZIZ.LIZ("/payment/v1/store_payment_method");
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C92097a5F.LIZIZ(LIZ, storePaymentMethodRequest.buildParamsMap(), new C92301a8X(c84654XKg));
        return c84654XKg.LIZ();
    }

    public final Object LIZJ(String str, String str2, InterfaceC67352kd<? super java.util.Map<String, String>> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C92081a4z c92081a4z = this.LIZIZ;
        c92081a4z.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c92081a4z.LIZIZ);
        LIZ.append("/check_and_get_text/1c021b00b99011e983d9dbf8129bd13d/normal/");
        LIZ.append(str2);
        C92097a5F.LIZ(X1D.LIZIZ(LIZ), C51029K0z.LJJIIZI(new OSZ("lang", str)), new C92300a8W(c84654XKg));
        return c84654XKg.LIZ();
    }
}
