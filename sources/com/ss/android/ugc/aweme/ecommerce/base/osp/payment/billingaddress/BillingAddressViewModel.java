package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.B21;
import X.B2C;
import X.B2I;
import X.C19N;
import X.C1A7;
import X.C221108m2;
import X.C27739Aud;
import X.C28114B1q;
import X.C47261Igj;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65330PkU;
import X.C65352Pkq;
import X.C71661SAn;
import X.C78685UuP;
import X.FKM;
import X.InterfaceC57784Mm4;
import X.OJD;
import X.ORZ;
import X.SAN;
import X.SB1;
import X.SB8;
import X.SB9;
import X.SBA;
import X.SBC;
import X.SBE;
import X.V1M;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.dto.SelectRegionDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillingAddressViewModel extends AssemViewModel<SBE> {
    public BillingFragmentEnterParams LJLILLLLZI;
    public AqS143S0200000_12 LJLJI;
    public boolean LJLJJL;
    public List<Region> LJLJLJ;
    public final Map<String, List<PaymentElement>> LJLIL = new LinkedHashMap();
    public final List<String> LJLJJI = C47261Igj.LJJIJIIJI("eg_ccdc_global_billing_address_city", "eg_ccdc_global_billing_address_state");
    public final List<String> LJLJJLL = new ArrayList();
    public final List<String> LJLJL = new ArrayList();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 207));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(SB9.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final SBE defaultState() {
        return new SBE(0);
    }

    public final PaymentMethod jv0() {
        BillingFragmentEnterParams billingFragmentEnterParams = this.LJLILLLLZI;
        if (billingFragmentEnterParams != null) {
            return billingFragmentEnterParams.getCcdcPayment();
        }
        return null;
    }

    public final Region kv0() {
        return (Region) this.LJLL.getValue();
    }

    public final boolean qv0() {
        ((ArrayList) this.LJLJJLL).clear();
        ((ArrayList) this.LJLJL).clear();
        List<InterfaceC57784Mm4> list = getState().LJLJJL;
        boolean z = false;
        if (list != null) {
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                if (interfaceC57784Mm4 instanceof SBC) {
                    SBC sbc = (SBC) interfaceC57784Mm4;
                    for (String str : sbc.getIds()) {
                        String pv0 = pv0(str, (List) ((LinkedHashMap) this.LJLIL).get(str));
                        if (C78685UuP.LJJJZ(pv0)) {
                            z = true;
                        }
                        sbc.LLIIIJ(pv0);
                    }
                }
            }
        }
        return z;
    }

    public final void mv0() {
        PaymentInfo paymentInfo;
        PaymentMethodInfo paymentMethodInfo;
        List<PaymentElement> paymentElements;
        PaymentElement paymentElement;
        PaymentMethod jv0 = jv0();
        if (jv0 != null) {
            List<ElementDTO> LIZJ = jv0.LIZJ();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LIZJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                SAN san = SAN.LIZ;
                String str = ((ElementDTO) next).id;
                san.getClass();
                if (SAN.LJFF(str)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ElementDTO elementDTO = (ElementDTO) it2.next();
                Map<String, List<PaymentElement>> map = this.LJLIL;
                String str2 = elementDTO.id;
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str2, C47261Igj.LJJIJ(elementDTO.LIZ()));
            }
        }
        List list = (List) ((LinkedHashMap) this.LJLIL).get("eg_ccdc_global_billing_address_country_regin");
        if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLL(list)) != null) {
            paymentElement.setParamValue(kv0().code);
        }
        BillingFragmentEnterParams billingFragmentEnterParams = this.LJLILLLLZI;
        if (billingFragmentEnterParams != null && (paymentInfo = billingFragmentEnterParams.getPaymentInfo()) != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (paymentElements = paymentMethodInfo.getPaymentElements()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PaymentElement paymentElement2 : paymentElements) {
                SAN san2 = SAN.LIZ;
                String element = paymentElement2.getElement();
                san2.getClass();
                if (SAN.LJFF(element)) {
                    arrayList2.add(paymentElement2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                PaymentElement paymentElement3 = (PaymentElement) it3.next();
                Map<String, List<PaymentElement>> map2 = this.LJLIL;
                String element2 = paymentElement3.getElement();
                if (element2 == null) {
                    element2 = "";
                }
                map2.put(element2, C47261Igj.LJJIJ(PaymentElement.copy$default(paymentElement3, null, null, null, null, null, 31, null)));
                if (C78685UuP.LJJJZ(paymentElement3.getParamValue())) {
                    this.LJLJJL = true;
                }
            }
        }
    }

    public final List<InterfaceC57784Mm4> gv0(List<? extends B2I> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        PaymentMethod jv0 = jv0();
        if (jv0 != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                B2I b2i = (B2I) it.next();
                if (b2i instanceof C28114B1q) {
                    ElementDTO elementDTO = b2i.LIZ;
                    hashMap.put(elementDTO.id, elementDTO);
                    if (hashMap.size() == 1) {
                        arrayList.add(new C71661SAn(jv0, hashMap));
                    }
                } else if (b2i instanceof B21) {
                    arrayList.add(new SB1(jv0, (B21) b2i));
                } else if (b2i instanceof B2C) {
                    arrayList.add(new SB8(jv0, (B2C) b2i));
                }
            }
        }
        return arrayList;
    }

    public final void hv0(Address address) {
        PaymentElement paymentElement;
        Map LJJIJIL = C1A7.LJJIJIL(address, SBA.LJLIL);
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL).entrySet()) {
            if (LJJIJIL != null) {
                String str = (String) ((LinkedHashMap) LJJIJIL).get(entry.getKey());
                if (str != null) {
                    List list = (List) ((LinkedHashMap) this.LJLIL).get(entry.getKey());
                    if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLL(list)) != null) {
                        paymentElement.setParamValue(str);
                    }
                }
            }
        }
    }

    public final String lv0(Integer num) {
        if (num != null) {
            num.intValue();
            return FKM.LIZ().getString(num.intValue());
        }
        return null;
    }

    public final void iv0(List<Region> list, boolean z) {
        String str;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJLJLJ = list;
        String str2 = null;
        if (!z) {
            Region region = (Region) ORZ.LJLLLLLL(1, list);
            if (region != null) {
                str = region.name;
            } else {
                str = null;
            }
            ov0("eg_ccdc_global_billing_address_city", str);
        }
        Region region2 = (Region) ORZ.LJLLLL(list);
        if (region2 != null) {
            str2 = region2.name;
        }
        ov0("eg_ccdc_global_billing_address_state", str2);
    }

    public final void nv0(String eventName, String str) {
        Integer status;
        List<Region> districts;
        AqS143S0200000_12 aqS143S0200000_12;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_district_panel_changed_v2")) {
            SelectRegionDTO selectRegionDTO = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SelectRegionDTO.class)));
                if (!(fromJson instanceof SelectRegionDTO)) {
                    fromJson = null;
                }
                selectRegionDTO = (SelectRegionDTO) fromJson;
            } catch (s unused) {
            }
            if (selectRegionDTO == null || (status = selectRegionDTO.getStatus()) == null || status.intValue() != 2 || (districts = selectRegionDTO.getDistricts()) == null || (aqS143S0200000_12 = this.LJLJI) == null) {
                return;
            }
            aqS143S0200000_12.invoke(districts);
        }
    }

    public final void ov0(String str, String str2) {
        List<PaymentElement> list = (List) ((LinkedHashMap) this.LJLIL).get(str);
        if (list != null) {
            PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLL(list);
            if (paymentElement != null) {
                paymentElement.setParamValue(str2);
            }
            this.LJLIL.put(str, list);
        }
    }

    public final String pv0(String str, List<PaymentElement> list) {
        String str2;
        PaymentElement paymentElement;
        String paramName;
        PaymentElement paymentElement2;
        String str3 = null;
        if (list != null && (paymentElement2 = (PaymentElement) ORZ.LJLLLLLL(0, list)) != null) {
            str2 = paymentElement2.getParamValue();
        } else {
            str2 = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1675358935:
                    if (str.equals("eg_ccdc_global_billing_address_state") && (str2 == null || str2.length() == 0)) {
                        str3 = lv0(Integer.valueOf(R.string.r9h));
                        break;
                    }
                    break;
                case -396027285:
                    if (str.equals("eg_ccdc_global_billing_address_street")) {
                        if (str2 == null || str2.length() == 0) {
                            str3 = V1M.LJJ("pipo_common_error_required_field", "pipo_common_payin_address");
                            break;
                        } else if (str2.length() > 79) {
                            str3 = lv0(Integer.valueOf(R.string.f5t));
                            break;
                        }
                    }
                    break;
                case -304863367:
                    if (str.equals("eg_ccdc_global_billing_address_postal_code") && (str2 == null || str2.length() == 0)) {
                        str3 = V1M.LJJ("pipo_common_error_required_field", "pipo_common_payin_postalcode");
                        break;
                    }
                    break;
                case -193077805:
                    if (str.equals("eg_ccdc_global_billing_address_city")) {
                        OJD ojd = new OJD("^[0-9\\-\\+\\(\\)?~\\[\\]@#$%\\^&*\\\\\\/`+=_（）「」{}【】、|？。，》《！!,.<>]+$");
                        if (str2 == null || str2.length() == 0) {
                            str3 = lv0(Integer.valueOf(R.string.f63));
                            break;
                        } else if (C19N.LJ("ecom_billing_address_regx_switch", false) && ojd.matches(str2)) {
                            str3 = lv0(Integer.valueOf(R.string.f62));
                            break;
                        }
                    }
                    break;
            }
        }
        if (list != null && (paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list)) != null && (paramName = paymentElement.getParamName()) != null) {
            if (str3 == null || str3.length() == 0) {
                ((ArrayList) this.LJLJL).add(paramName);
            } else {
                ((ArrayList) this.LJLJJLL).add(paramName);
            }
        }
        return str3;
    }
}
