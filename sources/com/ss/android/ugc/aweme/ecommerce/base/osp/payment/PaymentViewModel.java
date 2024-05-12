package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.B0F;
import X.B1J;
import X.B1K;
import X.B1M;
import X.B2I;
import X.B2K;
import X.B2R;
import X.C221108m2;
import X.C27993Ayj;
import X.C28060Azo;
import X.C28087B0p;
import X.C28102B1e;
import X.C28104B1g;
import X.C36636EZk;
import X.C47261Igj;
import X.C61841OOv;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.C780334l;
import X.C78565UsT;
import X.C78613UtF;
import X.InterfaceC60061Nhh;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.SCQ;
import X.SCS;
import X.XKQ;
import X.XKX;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import defpackage.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class PaymentViewModel extends JediViewModel<PaymentState> implements InterfaceC60061Nhh {
    public static List<? extends Object> LLF = C61878OQg.INSTANCE;
    public static boolean LLFF;
    public Address LJLJL;
    public List<PaymentPrice> LJLJLJ;
    public Summary LJLJLLL;
    public B1K LJLL;
    public List<? extends Object> LJLLLL;
    public final Map<String, BindInfoItem> LJLLLLLL;
    public HashMap<String, Object> LJLZ;
    public PaymentMethodsData LJZ;
    public String LJZI;
    public final C62822Ol8 LJZL;
    public XKQ LL;
    public InterfaceC88472Yns<? super InterfaceC67352kd<? super C27993Ayj>, ? extends Object> LLD;
    public InterfaceC88472Yns<? super B0F, C76800UCe> LJLJJLL = B2K.LJLIL;
    public String LJLLI = "";
    public boolean LJLLILLLL = true;
    public final Map<String, Map<String, List<PaymentElement>>> LJLLJ = new LinkedHashMap();
    public final Map<String, InstallmentPlan> LJLLL = new LinkedHashMap();

    static {
        f0.LIZ.getClass();
        LLFF = f0.LIZ().LIZ();
    }

    public final SCQ Kv0() {
        return (SCQ) this.LJZL.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final PaymentState kv0() {
        return new PaymentState(null, null, null, null, false, null, null, false, null, null, null, null, 4095, null);
    }

    public PaymentViewModel() {
        new ArrayList();
        this.LJLLLLLL = new LinkedHashMap();
        this.LJZI = "";
        this.LJZL = C221108m2.LIZIZ(B2R.LJLIL);
    }

    public static boolean Qv0(PaymentMethod paymentMethod) {
        B1J b1j;
        PaymentMethod paymentMethod2;
        List<? extends Object> list = LLF;
        if (list == null || list.isEmpty() || paymentMethod == null) {
            return false;
        }
        Iterator<? extends Object> it = LLF.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof B1J) && (b1j = (B1J) next) != null && (paymentMethod2 = b1j.LIZ) != null) {
                str = paymentMethod2.id;
            }
            if (o.LJ(str, paymentMethod.id)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final InstallmentPlan Mv0(PaymentMethod paymentMethod) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        return (InstallmentPlan) ((LinkedHashMap) this.LJLLL).get(paymentMethod.LJFF());
    }

    public final String Pv0(PaymentMethod paymentMethod) {
        List<PaymentPrice> list;
        PaymentPrice paymentPrice;
        Summary summary;
        if (paymentMethod == null || paymentMethod.id == null || (list = this.LJLJLJ) == null) {
            return null;
        }
        Iterator<PaymentPrice> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                paymentPrice = it.next();
                if (o.LJ(paymentPrice.paymentMethodId, paymentMethod.id)) {
                    break;
                }
            } else {
                paymentPrice = null;
                break;
            }
        }
        PaymentPrice paymentPrice2 = paymentPrice;
        if (paymentPrice2 == null || (summary = paymentPrice2.paymentSummary) == null) {
            return null;
        }
        return summary.getDesc();
    }

    public static int Nv0(PaymentMethod paymentMethod, List paymentList) {
        Object obj;
        B1J b1j;
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(paymentList, "paymentList");
        Iterator it = paymentList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            if ((obj instanceof B1J) && C61841OOv.LIZIZ(((B1J) obj).LIZ, paymentMethod)) {
                break;
            }
        }
        if (!(obj instanceof B1J) || (b1j = (B1J) obj) == null) {
            return 0;
        }
        return b1j.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Hv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.B1H
            if (r0 == 0) goto L4a
            r4 = r7
            X.B1H r4 = (X.B1H) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJL
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L50
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r3
            kotlin.jvm.internal.AqS108S0300000_4 r1 = new kotlin.jvm.internal.AqS108S0300000_4
            r0 = 9
            r1.<init>(r2, r6, r3, r0)
            r2.setState(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            X.C141335gf.LIZJ(r3)
            if (r6 != 0) goto L3b
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3b:
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r0
            java.lang.Object r3 = r5.Jv0(r6, r4)
            if (r3 != r2) goto L48
            return r2
        L48:
            r2 = r5
            goto L24
        L4a:
            X.B1H r4 = new X.B1H
            r4.<init>(r5, r7)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.Hv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, X.2kd):java.lang.Object");
    }

    public final void Iv0(PaymentInfo paymentInfo, PaymentMethod paymentMethod) {
        String str;
        String str2;
        List<PaymentElement> paymentElements;
        List<ElementDTO> list;
        PaymentElement paymentElement;
        PaymentElement paymentElement2;
        PaymentElement paymentElement3;
        PaymentElement copy$default;
        if (paymentMethod == null) {
            return;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null && (paymentElements = paymentMethodInfo.getPaymentElements()) != null && !paymentElements.isEmpty()) {
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (paymentMethod2 != null) {
                list = paymentMethod2.LIZJ();
            } else {
                list = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (ElementDTO elementDTO : list) {
                    String str3 = elementDTO.id;
                    if (str3 != null) {
                        List<ElementDTO> LIZJ = elementDTO.LIZJ();
                        ArrayList arrayList = new ArrayList();
                        for (ElementDTO elementDTO2 : LIZJ) {
                            List<PaymentElement> paymentElements2 = paymentMethodInfo.getPaymentElements();
                            if (paymentElements2 != null) {
                                Iterator<PaymentElement> it = paymentElements2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        paymentElement3 = it.next();
                                        if (o.LJ(elementDTO2.id, paymentElement3.getElement())) {
                                            break;
                                        }
                                    } else {
                                        paymentElement3 = null;
                                        break;
                                    }
                                }
                                PaymentElement paymentElement4 = paymentElement3;
                                if (paymentElement4 != null && (copy$default = PaymentElement.copy$default(paymentElement4, null, null, null, null, null, 31, null)) != null) {
                                    arrayList.add(copy$default);
                                }
                            }
                        }
                        linkedHashMap.put(str3, arrayList);
                    }
                }
            }
            linkedHashMap.put("save_element", C47261Igj.LJJIJ(new PaymentElement("save_element", "save_element", String.valueOf(o.LJ(paymentMethodInfo.isChooseSave(), Boolean.TRUE)), null, null, 24, null)));
            List<PaymentElement> paymentElements3 = paymentMethodInfo.getPaymentElements();
            if (paymentElements3 != null) {
                Iterator<PaymentElement> it2 = paymentElements3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        paymentElement = it2.next();
                        if (o.LJ("sub_payment_id_element", paymentElement.getElement())) {
                            break;
                        }
                    } else {
                        paymentElement = null;
                        break;
                    }
                }
            } else {
                paymentElement = null;
            }
            List<PaymentElement> paymentElements4 = paymentMethodInfo.getPaymentElements();
            if (paymentElements4 != null) {
                Iterator<PaymentElement> it3 = paymentElements4.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        paymentElement2 = it3.next();
                        if (o.LJ("sub_payment_token_element", paymentElement2.getElement())) {
                            break;
                        }
                    } else {
                        paymentElement2 = null;
                        break;
                    }
                }
            } else {
                paymentElement2 = null;
            }
            if (paymentElement != null && paymentElement2 != null) {
                linkedHashMap.put("sub_payment_type_element", C47261Igj.LJJIJIIJI(paymentElement, paymentElement2));
            }
            this.LJLLJ.put(paymentMethod.LJFF(), linkedHashMap);
        }
        if (paymentMethod.LJIILJJIL(paymentInfo.paymentMethod) && paymentMethod.unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE) {
            PaymentElement[] paymentElementArr = new PaymentElement[2];
            PaymentMethod paymentMethod3 = paymentInfo.paymentMethod;
            String str4 = "";
            if (paymentMethod3 == null || (str = paymentMethod3.id) == null) {
                str = "";
            }
            paymentElementArr[0] = new PaymentElement("sub_payment_id_element", "sub_payment_id_element", str, null, null, 24, null);
            PaymentMethod paymentMethod4 = paymentInfo.paymentMethod;
            if (paymentMethod4 != null && (str2 = paymentMethod4.token) != null) {
                str4 = str2;
            }
            paymentElementArr[1] = new PaymentElement("sub_payment_token_element", "sub_payment_token_element", str4, null, null, 24, null);
            Sv0(paymentMethod, "sub_payment_type_element", C47261Igj.LJJIJIIJI(paymentElementArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Jv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r20, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo> r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.Jv0(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, X.2kd):java.lang.Object");
    }

    public final List<PaymentElement> Lv0(PaymentMethod paymentMethod, String str) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        Map map = (Map) ((LinkedHashMap) this.LJLLJ).get(paymentMethod.LJFF());
        if (map == null) {
            map = new LinkedHashMap();
        }
        List<PaymentElement> list = (List) map.get(str);
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_resend_pay_request")) {
            setState(C28102B1e.LJLIL);
        } else {
            if (!o.LJ(eventName, "ec_payment_page_refresh_data")) {
                return;
            }
            setState(C28104B1g.LJLIL);
            C78565UsT.LJJIJ(this, C78613UtF.LIZJ, new C28087B0p(this, null));
        }
    }

    public final String Ov0(PaymentMethod paymentMethod, Summary summary, String str) {
        Summary summary2;
        Price total;
        String priceStr;
        Price total2;
        String priceStr2;
        if (summary != null && (total2 = summary.getTotal()) != null && (priceStr2 = total2.getPriceStr()) != null) {
            str = priceStr2;
        }
        PaymentPrice paymentPrice = null;
        if (paymentMethod == null || paymentMethod.id == null) {
            return str;
        }
        List<PaymentPrice> list = this.LJLJLJ;
        if (list != null) {
            Iterator<PaymentPrice> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaymentPrice next = it.next();
                if (o.LJ(next.paymentMethodId, paymentMethod.id)) {
                    paymentPrice = next;
                    break;
                }
            }
            PaymentPrice paymentPrice2 = paymentPrice;
            if (paymentPrice2 == null || (summary2 = paymentPrice2.paymentSummary) == null || (total = summary2.getTotal()) == null || (priceStr = total.getPriceStr()) == null) {
                return str;
            }
            return priceStr;
        }
        return str;
    }

    public final void Rv0(PaymentMethod paymentMethod, boolean z, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        CommuteType commuteType;
        if (paymentMethod == null) {
            return;
        }
        BindInfoReqInfo[] bindInfoReqInfoArr = new BindInfoReqInfo[1];
        String str = paymentMethod.id;
        String str2 = paymentMethod.token;
        String uuid = UUID.randomUUID().toString();
        paymentMethod.LIZLLL = uuid;
        CommuteInfo LJ = paymentMethod.LJ();
        if (LJ != null) {
            commuteType = LJ.commuteType;
        } else {
            commuteType = null;
        }
        bindInfoReqInfoArr[0] = new BindInfoReqInfo(str, str2, uuid, commuteType, "snssdk1180://ec/app_bind_result");
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C28060Azo(C47261Igj.LJII(bindInfoReqInfoArr), this, z, paymentMethod, interfaceC88472Yns, null), 2);
    }

    public final void Sv0(PaymentMethod paymentMethod, String str, List<PaymentElement> paymentElements) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(paymentElements, "paymentElements");
        Map<String, List<PaymentElement>> map = (Map) ((LinkedHashMap) this.LJLLJ).get(paymentMethod.LJFF());
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        this.LJLLJ.put(paymentMethod.LJFF(), map);
        map.put(str, paymentElements);
    }

    public final String Tv0(B2I elementVO, PaymentMethod paymentMethod, List<PaymentElement> values) {
        o.LJIIIZ(elementVO, "elementVO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(values, "values");
        String LIZIZ = SCS.LIZIZ(elementVO.LIZ, paymentMethod, values);
        if (o.LJ(LIZIZ, "system_error")) {
            setState(B1M.LJLIL);
            return "";
        }
        return LIZIZ;
    }
}
