package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.B1Z;
import X.B21;
import X.B2I;
import X.C141335gf;
import X.C19N;
import X.C221108m2;
import X.C27500Aqm;
import X.C28112B1o;
import X.C28114B1q;
import X.C28118B1u;
import X.C3C5;
import X.C47261Igj;
import X.C53318KwE;
import X.C61878OQg;
import X.C62822Ol8;
import X.C71674SBa;
import X.C71677SBd;
import X.C71678SBe;
import X.C71680SBg;
import X.C78685UuP;
import X.FKM;
import X.InterfaceC57784Mm4;
import X.InterfaceC71675SBb;
import X.InterfaceC71676SBc;
import X.OJD;
import X.ORZ;
import X.OSZ;
import X.SAN;
import X.SBB;
import X.SBC;
import X.SBZ;
import X.SCQ;
import X.SCS;
import X.T5T;
import X.V1M;
import android.text.Editable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CCDCAddCardViewModel extends AssemViewModel<C71677SBd> {
    public static final /* synthetic */ int LJLLJ = 0;
    public final Map<String, List<PaymentElement>> LJLIL = new LinkedHashMap();
    public EnterParams LJLILLLLZI;
    public String LJLJI;
    public PaymentInfo LJLJJI;
    public int LJLJJL;
    public IPaymentFragmentStyle LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final List<String> LJLJLJ;
    public String LJLJLLL;
    public final C62822Ol8 LJLL;
    public AqS143S0200000_12 LJLLI;
    public List<Region> LJLLILLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C71677SBd defaultState() {
        return new C71677SBd(0);
    }

    public final List<InterfaceC57784Mm4> gv0() {
        ArrayList arrayList = new ArrayList();
        PaymentMethod paymentMethod = ((C71677SBd) getState()).LJLIL;
        if (paymentMethod != null) {
            List<ElementDTO> LIZJ = paymentMethod.LIZJ();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) LIZJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ElementDTO elementDTO = (ElementDTO) next;
                SAN san = SAN.LIZ;
                String str = elementDTO.id;
                san.getClass();
                if (SAN.LJFF(str) && !o.LJ(elementDTO.id, "eg_ccdc_global_billing_address_country_regin")) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ElementDTO elementDTO2 = (ElementDTO) it2.next();
                B1Z.LJIIIIZZ.getClass();
                B2I LIZIZ = C28118B1u.LIZIZ(elementDTO2, paymentMethod);
                if (LIZIZ != null) {
                    arrayList3.add(LIZIZ);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            HashMap hashMap = new HashMap();
            PaymentMethod paymentMethod2 = ((C71677SBd) getState()).LJLIL;
            if (paymentMethod2 != null) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    B2I b2i = (B2I) it3.next();
                    if (b2i instanceof C28114B1q) {
                        ElementDTO elementDTO3 = b2i.LIZ;
                        hashMap.put(elementDTO3.id, elementDTO3);
                        if (hashMap.size() == 1) {
                            arrayList4.add(new C71678SBe(paymentMethod2, hashMap, null, new Object()));
                        }
                    } else if (b2i instanceof B21) {
                        arrayList4.add(new C71680SBg(paymentMethod2, (B21) b2i, new Object()));
                    }
                }
            }
            arrayList.addAll(arrayList4);
            ov0(arrayList);
        }
        return arrayList;
    }

    public final SCQ iv0() {
        return (SCQ) this.LJLJL.getValue();
    }

    public CCDCAddCardViewModel() {
        int i = 0;
        do {
            i++;
        } while (i < 4);
        this.LJLJL = C221108m2.LIZIZ(C71674SBa.LJLIL);
        this.LJLJLJ = C47261Igj.LJJIJIIJI("eg_ccdc_global_billing_address_city", "eg_ccdc_global_billing_address_state", "eg_ccdc_global_expiration_date", "eg_ccdc_global_cvv");
        this.LJLJLLL = "";
        this.LJLL = C221108m2.LIZIZ(SBB.LJLIL);
    }

    public final boolean hv0() {
        if (!C27500Aqm.LIZ()) {
            return true;
        }
        return lv0().getFirst().booleanValue();
    }

    public final OSZ<Boolean, List<String>> lv0() {
        String str;
        PaymentMethod paymentMethod;
        PaymentElement paymentElement;
        PaymentMethod paymentMethod2 = getState().LJLIL;
        if (paymentMethod2 == null) {
            return new OSZ<>(Boolean.FALSE, C61878OQg.INSTANCE);
        }
        List<InterfaceC57784Mm4> list = getState().LJLILLLLZI;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        List list2 = (List) linkedHashMap.get("sub_payment_type_element");
        PaymentMethod paymentMethod3 = null;
        if (list2 != null && (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list2)) != null) {
            str = paymentElement.getParamValue();
        } else {
            str = null;
        }
        List<PaymentMethod> list3 = paymentMethod2.subPaymentMethods;
        if (list3 != null) {
            Iterator<PaymentMethod> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaymentMethod next = it.next();
                if (o.LJ(next.id, str)) {
                    paymentMethod3 = next;
                    break;
                }
            }
            paymentMethod3 = paymentMethod3;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
            if (interfaceC57784Mm4 instanceof InterfaceC71675SBb) {
                B2I LLJILJIL = ((InterfaceC71675SBb) interfaceC57784Mm4).LLJILJIL();
                if (LLJILJIL != null) {
                    List<PaymentElement> list4 = (List) linkedHashMap.get(LLJILJIL.LIZ.id);
                    if (list4 == null) {
                        list4 = C61878OQg.INSTANCE;
                    }
                    if (paymentMethod3 == null) {
                        paymentMethod = paymentMethod2;
                    } else {
                        paymentMethod = paymentMethod3;
                    }
                    if (vv0(LLJILJIL, paymentMethod, list4) == null) {
                        arrayList.add(C28112B1o.LJIILIIL(LLJILJIL.LIZ.paramName));
                    }
                }
                z = false;
            }
        }
        return new OSZ<>(Boolean.valueOf(z), arrayList);
    }

    public final List<PaymentElement> jv0(String str) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LJLIL).get(str);
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public final String kv0(Integer num) {
        if (num != null) {
            num.intValue();
            return FKM.LIZ().getString(num.intValue());
        }
        return null;
    }

    public final void mv0(boolean z) {
        setState(new AqS16S0010000_12(z, 1));
    }

    public final void nv0(List<? extends InterfaceC57784Mm4> list) {
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        if (((Number) C53318KwE.LIZ.getValue()).intValue() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof InterfaceC71676SBc) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC71676SBc) it2.next()).LLZIL(5);
            }
            InterfaceC71676SBc interfaceC71676SBc = (InterfaceC71676SBc) ORZ.LLFII(arrayList);
            if (interfaceC71676SBc != null) {
                interfaceC71676SBc.LLZIL(6);
            }
        }
        setStateImmediate(new AqS178S0100000_12(LLJILJILJ, (List<Tab>) LiveTryModeCountDownThresholdSetting.DEFAULT));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ov0(java.util.List<X.InterfaceC57784Mm4> r15) {
        /*
            r14 = this;
            boolean r0 = X.C27500Aqm.LIZ()
            if (r0 == 0) goto L64
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r4 = r15.iterator()
            r3 = 0
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r2 = r4.next()
            X.Mm4 r2 = (X.InterfaceC57784Mm4) r2
            r1 = 8
            if (r3 != 0) goto L5b
            r8 = 0
        L1e:
            int r7 = X.C45804HyK.LJJI(r1)
        L22:
            r0 = 25
            int r6 = X.C79081V1x.LJII(r0)
            X.4ih r5 = new X.4ih
            r9 = 0
            r12 = 1
            r13 = 248(0xf8, float:3.48E-43)
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2 instanceof X.SBP
            if (r0 == 0) goto Ld
            boolean r0 = r2 instanceof X.SBC
            r1 = 0
            if (r0 == 0) goto L4b
            r0 = r2
            X.SBC r0 = (X.SBC) r0
            if (r0 == 0) goto L4b
            java.util.List r0 = r0.getIds()
            if (r0 == 0) goto L4b
            java.lang.Object r1 = X.ORZ.LJLLLL(r0)
        L4b:
            java.util.List<java.lang.String> r0 = r14.LJLJLJ
            boolean r0 = X.ORZ.LJLJJI(r1, r0)
            if (r0 == 0) goto Ld
            int r3 = r3 + 1
            X.SBP r2 = (X.SBP) r2
            r2.LJLLLLLL(r5)
            goto Ld
        L5b:
            int r8 = X.C45804HyK.LJJI(r1)
            r0 = 1
            if (r3 != r0) goto L1e
            r7 = 0
            goto L22
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel.ov0(java.util.List):void");
    }

    public final void pv0(boolean z) {
        setState(new AqS16S0010000_12(z, 2));
        for (InterfaceC57784Mm4 interfaceC57784Mm4 : getState().LJLILLLLZI) {
            if (interfaceC57784Mm4 instanceof SBC) {
                ((SBC) interfaceC57784Mm4).LLIIIJ(null);
            }
        }
    }

    public static void qv0(PaymentInfo paymentInfo, List list) {
        String str;
        if (list == null || list.isEmpty()) {
            return;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            SAN san = SAN.LIZ;
            List<PaymentElement> paymentElements = paymentMethodInfo.getPaymentElements();
            san.getClass();
            paymentMethodInfo.setPaymentElements(SAN.LJI(paymentElements, list));
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.LJFF();
        } else {
            str = null;
        }
        PaymentCacheHelper.LIZ(str, list);
    }

    public final void rv0(String str, String str2) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LJLIL).get(str);
        if (list != null) {
            PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLL(list);
            if (paymentElement != null) {
                paymentElement.setParamValue(str2);
            }
            sv0(str, list);
        }
    }

    public final void sv0(String str, List<PaymentElement> paymentElements) {
        o.LJIIIZ(paymentElements, "paymentElements");
        this.LJLIL.put(str, paymentElements);
    }

    public final String uv0(String str, List<PaymentElement> list) {
        String str2;
        PaymentElement paymentElement;
        if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list)) != null) {
            str2 = paymentElement.getParamValue();
        } else {
            str2 = null;
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1675358935:
                if (!str.equals("eg_ccdc_global_billing_address_state")) {
                    return null;
                }
                if (str2 != null && str2.length() != 0) {
                    return null;
                }
                return kv0(Integer.valueOf(R.string.r9h));
            case -396027285:
                if (!str.equals("eg_ccdc_global_billing_address_street")) {
                    return null;
                }
                if (str2 == null || str2.length() == 0) {
                    return V1M.LJJ("pipo_common_error_required_field", "pipo_common_payin_address");
                }
                if (str2.length() <= 79) {
                    return null;
                }
                return kv0(Integer.valueOf(R.string.f5t));
            case -304863367:
                if (!str.equals("eg_ccdc_global_billing_address_postal_code")) {
                    return null;
                }
                if (str2 != null && str2.length() != 0) {
                    return null;
                }
                return V1M.LJJ("pipo_common_error_required_field", "pipo_common_payin_postalcode");
            case -193077805:
                if (!str.equals("eg_ccdc_global_billing_address_city")) {
                    return null;
                }
                OJD ojd = new OJD("^[0-9\\-\\+\\(\\)?~\\[\\]@#$%\\^&*\\\\\\/`+=_（）「」{}【】、|？。，》《！!,.<>]+$");
                if (str2 == null || str2.length() == 0) {
                    return kv0(Integer.valueOf(R.string.f63));
                }
                if (!C19N.LJ("ecom_billing_address_regx_switch", false) || !ojd.matches(str2)) {
                    return null;
                }
                return kv0(Integer.valueOf(R.string.f62));
            default:
                return null;
        }
    }

    public final String vv0(B2I b2i, PaymentMethod paymentMethod, List<PaymentElement> list) {
        String LIZIZ = SCS.LIZIZ(b2i.LIZ, paymentMethod, list);
        if (o.LJ(LIZIZ, "system_error")) {
            setState(SBZ.LJLIL);
            return "";
        }
        return LIZIZ;
    }

    public final void tv0(ElementDTO elementDTO, PaymentMethod paymentMethod, List values, RecyclerView recyclerView, T5T t5t) {
        List<BankCardRule> list;
        Editable text;
        Editable text2;
        View focusSearch;
        PaymentMethodsData paymentMethodsData;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(values, "values");
        try {
            if (((Number) C53318KwE.LIZ.getValue()).intValue() == 2) {
                String str = paymentMethod.id;
                EnterParams enterParams = this.LJLILLLLZI;
                Boolean bool = null;
                if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null) {
                    list = paymentMethodsData.LIZJ();
                } else {
                    list = null;
                }
                if (!SCS.LIZ(str, elementDTO.id, list, values) || (text = t5t.getText()) == null || text.length() == 0 || (text2 = t5t.getText()) == null || t5t.getSelectionEnd() != text2.length() || C78685UuP.LJJJZ(SCS.LIZIZ(elementDTO, paymentMethod, values))) {
                    return;
                }
                if (recyclerView != null && (focusSearch = recyclerView.focusSearch(t5t, 2)) != null) {
                    bool = Boolean.valueOf(focusSearch.requestFocus());
                }
                C3C5.m7constructorimpl(bool);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
