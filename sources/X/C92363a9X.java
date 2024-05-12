package X;

import android.graphics.Bitmap;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import com.bytedance.pipo.checkout.api.network.model.response.CashierConfig;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.api.network.model.response.MethodExtra;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IDqS418S0100000_31;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.a9X, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92363a9X extends C92219a7D implements InterfaceC91976a3I {
    public final List<Methods> LJIIZILJ;
    public final List<BankCardRules> LJIJ;
    public final C92083a51 LJIJI;
    public final InterfaceC65784Pro<C76800UCe> LJIJJ;
    public final InterfaceC65784Pro<C76800UCe> LJIJJLI;
    public final C91841a17 LJIL;
    public final List<String> LJJ;
    public final C91828a0u LJJI;
    public final C64962gm LJJIFFI;
    public final List<InterfaceC91946a2o<String>> LJJII;
    public final List<InterfaceC91946a2o<String>> LJJIII;
    public List<? extends InterfaceC91946a2o<String>> LJJIIJ;
    public XKQ LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public final EnumC91839a15 LJJIJ;
    public final EnumC91837a13 LJJIJIIJI;
    public List<Integer> LJJIJIIJIL;
    public final List<String> LJJIJIL;
    public String LJJIJL;
    public final ParcelableSnapshotMutableState LJJIJLIJ;
    public final ParcelableSnapshotMutableState LJJIL;
    public Bitmap LJJIZ;
    public JSONObject LJJJ;
    public final ParcelableSnapshotMutableState LJJJI;
    public final InterfaceC88472Yns<String, C76800UCe> LJJJIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJJJJ;

    public C92363a9X() {
        throw null;
    }

    public final void LJIILLIIL() {
        Methods methods;
        String iconUrl;
        BankCardRules bankCardRules = this.LJJI.LIZLLL;
        if (bankCardRules == null) {
            this.LJJIJLIJ.setValue(this.LJJIJIL);
            return;
        }
        Iterator<Methods> it = this.LJIIZILJ.iterator();
        do {
            methods = null;
            if (!it.hasNext()) {
                break;
            } else {
                methods = it.next();
            }
        } while (!o.LJJJJIZL(methods.getPaymentMethodId(), bankCardRules.getPaymentMethodId(), false));
        Methods methods2 = methods;
        if (methods2 == null || (iconUrl = methods2.getIconUrl()) == null || iconUrl.length() == 0) {
            return;
        }
        this.LJJIJLIJ.setValue(C47261Igj.LJJIJ(iconUrl));
    }

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJJJJ;
    }

    public static /* synthetic */ JSONObject LJIILL(C92363a9X c92363a9X) {
        c92363a9X.getClass();
        return LJIILJJIL(null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C92219a7D
    public final JSONObject LJ(List<OSZ<String, String>> kvs) {
        kotlin.jvm.internal.o.LJIIIZ(kvs, "kvs");
        JSONObject LJ = super.LJ(kvs);
        if (LJ.has("verification_err_msg")) {
            LJ.remove("verification_err_msg");
        }
        LJ.put("verification_err_msg", ((C91941a2j) this.LJIIIZ.getValue()).LIZJ);
        Iterator<String> keys = this.LJJJ.keys();
        kotlin.jvm.internal.o.LJIIIIZZ(keys, "_cardBinParams.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            LJ.put(next, this.LJJJ.opt(next));
        }
        return LJ;
    }

    @Override // X.InterfaceC91976a3I
    public final void LIZJ(Bitmap bitmap, String value) {
        kotlin.jvm.internal.o.LJIIIZ(value, "value");
        C91841a17 c91841a17 = this.LJIL;
        c91841a17.getClass();
        Boolean bool = Boolean.TRUE;
        c91841a17.LIZ = bool;
        c91841a17.LIZIZ = value;
        ((IDqS418S0100000_31) this.LJJJIL).invoke(value);
        if (bitmap == null) {
            return;
        }
        this.LJJIL.setValue(bool);
        this.LJJIZ = bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(java.lang.String r15, X.InterfaceC67352kd<? super X.C92082a50<com.bytedance.pipo.checkout.api.network.model.response.GetUnifiedBinDetailResponse>> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C92644aE4
            if (r0 == 0) goto L8b
            r6 = r3
            X.aE4 r6 = (X.C92644aE4) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r6.LJLJI = r2
        L14:
            java.lang.Object r2 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L91
            X.C141335gf.LIZJ(r2)
        L22:
            return r2
        L23:
            X.C141335gf.LIZJ(r2)
            com.bytedance.pipo.checkout.api.network.model.request.GetUnifiedBinDetail r7 = new com.bytedance.pipo.checkout.api.network.model.request.GetUnifiedBinDetail
            r8 = 0
            r12 = 15
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r7.setCardNumber(r15)
            X.a8u r0 = X.C92105a5N.LIZ
            r2 = 0
            if (r0 != 0) goto L62
            r0 = r8
        L3b:
            r7.setCountryOrRegion(r0)
            X.a8u r0 = X.C92105a5N.LIZ
            if (r0 != 0) goto L5f
            r0 = r8
        L43:
            r7.setMerchantUserId(r0)
            java.lang.String r0 = X.C91965a37.LIZ
            r7.setNonce(r0)
            com.bytedance.pipo.checkout.api.network.model.request.GetUnifiedBinDetailRequest r4 = new com.bytedance.pipo.checkout.api.network.model.request.GetUnifiedBinDetailRequest
            r4.<init>(r7)
            X.a8u r0 = X.C92105a5N.LIZ
            if (r0 != 0) goto L5c
        L54:
            r4.setMerchantId(r8)
            X.a51 r0 = r14.LJIJI
            if (r0 != 0) goto L65
            goto L22
        L5c:
            java.lang.String r8 = r0.LJLIL
            goto L54
        L5f:
            java.lang.String r0 = r0.LJLILLLLZI
            goto L43
        L62:
            java.lang.String r0 = r0.LJLJJL
            goto L3b
        L65:
            r6.LJLJI = r1
            X.a4z r1 = r0.LIZIZ
            java.lang.String r0 = "/payment/v1/get_unified_bin_detail"
            java.lang.String r3 = r1.LIZ(r0)
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r6)
            r2.<init>(r0)
            java.util.Map r1 = r4.buildParamsMap()
            X.a8b r0 = new X.a8b
            r0.<init>(r2)
            X.C92097a5F.LIZIZ(r3, r1, r0)
            java.lang.Object r2 = r2.LIZ()
            if (r2 != r5) goto L22
            return r5
        L8b:
            X.aE4 r6 = new X.aE4
            r6.<init>(r14, r3)
            goto L14
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92363a9X.LJIIZILJ(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92363a9X(MethodExtra methodExtra, List supportedCards, List rules, C92083a51 c92083a51, InterfaceC88472Yns interfaceC88472Yns, Elements elements) {
        super(elements, null, true, "", interfaceC88472Yns, null, null, 422);
        int i;
        XIA coroutineContext = C78613UtF.LIZJ;
        C92642aE2 onShowNetErrorPopup = C92642aE2.LJLIL;
        C92643aE3 onClickNetErrorPopupOk = C92643aE3.LJLIL;
        kotlin.jvm.internal.o.LJIIIZ(methodExtra, "methodExtra");
        kotlin.jvm.internal.o.LJIIIZ(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.o.LJIIIZ(supportedCards, "supportedCards");
        kotlin.jvm.internal.o.LJIIIZ(rules, "rules");
        kotlin.jvm.internal.o.LJIIIZ(onShowNetErrorPopup, "onShowNetErrorPopup");
        kotlin.jvm.internal.o.LJIIIZ(onClickNetErrorPopupOk, "onClickNetErrorPopupOk");
        this.LJIIZILJ = supportedCards;
        this.LJIJ = rules;
        this.LJIJI = c92083a51;
        this.LJIJJ = onShowNetErrorPopup;
        this.LJIJJLI = onClickNetErrorPopupOk;
        this.LJIL = new C91841a17();
        ArrayList arrayList = new ArrayList(C32I.LJJL(supportedCards, 10));
        Iterator it = supportedCards.iterator();
        while (it.hasNext()) {
            arrayList.add(((Methods) it.next()).getPaymentMethod());
        }
        this.LJJ = arrayList;
        List<BankCardRules> list = this.LJIJ;
        List<Methods> list2 = this.LJIIZILJ;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        Iterator<Methods> it2 = list2.iterator();
        while (it2.hasNext()) {
            String paymentMethodId = it2.next().getPaymentMethodId();
            if (paymentMethodId == null) {
                paymentMethodId = "";
            }
            arrayList2.add(paymentMethodId);
        }
        C91828a0u c91828a0u = new C91828a0u(true, list, arrayList2);
        this.LJJI = c91828a0u;
        this.LJJIFFI = C48841JEv.LIZ(coroutineContext);
        this.LJJII = ORZ.LLIIIZ(C47261Igj.LJJIJ(new C92177a6X(c91828a0u)), this.LJ);
        this.LJJIII = ORZ.LLJI(this.LJ);
        this.LJJIIJ = this.LJ;
        this.LJJIJIIJIL = C47261Igj.LJJIJ(19);
        List<Methods> list3 = this.LJIIZILJ;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(list3, 10));
        Iterator<Methods> it3 = list3.iterator();
        while (it3.hasNext()) {
            String iconUrl = it3.next().getIconUrl();
            if (iconUrl == null) {
                iconUrl = "";
            }
            arrayList3.add(iconUrl);
        }
        this.LJJIJIL = arrayList3;
        this.LJJIJLIJ = C78966Uyw.LJJJIL(arrayList3);
        this.LJJIL = C78966Uyw.LJJJIL(Boolean.FALSE);
        this.LJJJ = LJIILL(this);
        this.LJJJI = C78966Uyw.LJJJIL(null);
        this.LJJJIL = new IDqS418S0100000_31(this, 44);
        this.LJJJJ = new IDqS418S0100000_31(this, 43);
        List<InterfaceC91946a2o<String>> list4 = this.LJJII;
        kotlin.jvm.internal.o.LJIIIZ(list4, "<set-?>");
        this.LJ = list4;
        CashierConfig cashierConfig = methodExtra.getCashierConfig();
        this.LJJIJ = C91969a3B.LIZLLL(cashierConfig != null ? cashierConfig.getCardType() : null);
        CashierConfig cashierConfig2 = methodExtra.getCashierConfig();
        String prepaidType = cashierConfig2 != null ? cashierConfig2.getPrepaidType() : null;
        try {
        } catch (NoSuchElementException unused) {
            r2 = EnumC91837a13.UNKNOWN;
        }
        for (EnumC91837a13 enumC91837a13 : EnumC91837a13.values()) {
            if (o.LJJJJIZL(enumC91837a13.getType(), prepaidType, true)) {
                this.LJJIJIIJI = enumC91837a13;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static JSONObject LJIILJJIL(Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, String str6, String str7) {
        String LIZLLL;
        JSONObject jSONObject = new JSONObject();
        String str8 = null;
        if (bool == null) {
            LIZLLL = null;
        } else {
            LIZLLL = C92047a4R.LIZLLL(bool.booleanValue());
        }
        jSONObject.put("is_identified", LIZLLL);
        jSONObject.put("card_brand", str);
        jSONObject.put("card_ccdc", str2);
        jSONObject.put("is_prepaid", str3);
        jSONObject.put("card_number_length", str4);
        jSONObject.put("card_country_code", str5);
        if (bool2 != null) {
            str8 = C92047a4R.LIZLLL(bool2.booleanValue());
        }
        jSONObject.put("is_channel_support", str8);
        jSONObject.put("is_ccdc_support", str6);
        jSONObject.put("is_prepaid_support", str7);
        return jSONObject;
    }
}
