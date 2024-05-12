package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment;

import X.C237429Tm;
import X.C28066Azu;
import X.C30941Ji;
import X.C32I;
import X.C47261Igj;
import X.C58911NAd;
import X.C61878OQg;
import X.C67646Qgk;
import X.C67887Qkd;
import X.C67907Qkx;
import X.C67959Qln;
import X.C67960Qlo;
import X.C67964Qls;
import X.C67981Qm9;
import X.C68164Qp6;
import X.C68168QpA;
import X.C78983UzD;
import X.C85990Xow;
import X.EF7;
import X.EnumC67961Qlp;
import X.InterfaceC67979Qm7;
import X.InterfaceC88472Yns;
import X.ORY;
import X.QH7;
import X.X1D;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class GooglePayProcess {
    public static C68164Qp6 LIZ;
    public static LifecycleOwner LIZIZ;
    public static List<String> LIZJ;
    public static List<PaymentElement> LIZLLL;
    public static final List<EnumC67961Qlp> LJ = C47261Igj.LJJIJIIJI(EnumC67961Qlp.ParameterError, EnumC67961Qlp.GoogleAPIError, EnumC67961Qlp.LaunchActivityError, EnumC67961Qlp.ParseError);
    public static final GooglePayProcess$lifecycleObserver$1 LJFF = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            Lifecycle lifecycle;
            LifecycleOwner lifecycleOwner = GooglePayProcess.LIZIZ;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(GooglePayProcess.LJFF);
            }
            GooglePayProcess.LIZIZ = null;
            GooglePayProcess.LIZ = null;
            GooglePayProcess.LIZJ = null;
            GooglePayProcess.LIZLLL = null;
        }
    };

    public static boolean LIZ() {
        boolean z;
        C68164Qp6 c68164Qp6;
        AtomicBoolean atomicBoolean;
        C68164Qp6 c68164Qp62;
        if (o.LJ(EF7.LJIILIIL, "local_test") && (c68164Qp62 = LIZ) != null) {
            Object value = c68164Qp62.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-repo>(...)");
            if (((Keva) value).getBoolean("force_gp_enable", false)) {
                z = true;
                c68164Qp6 = LIZ;
                if ((c68164Qp6 == null && (atomicBoolean = c68164Qp6.LIZ) != null && atomicBoolean.get()) || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        c68164Qp6 = LIZ;
        if (c68164Qp6 == null) {
        }
        return false;
    }

    public static List LIZIZ(PaymentMethodsData paymentMethodsData) {
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        List<String> list3;
        List[] listArr = new List[2];
        Object obj = null;
        if (paymentMethodsData != null) {
            list = paymentMethodsData.paymentMethods;
        } else {
            list = null;
        }
        listArr[0] = list;
        if (paymentMethodsData != null) {
            list2 = paymentMethodsData.LJ();
        } else {
            list2 = null;
        }
        listArr[1] = list2;
        Iterator it = ((ArrayList) C32I.LJJLI(ORY.LJJIJLIJ(listArr))).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (LJ((PaymentMethod) next)) {
                obj = next;
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        if (paymentMethod == null || (list3 = paymentMethod.supportCardList) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        LIZJ = list3;
        return list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Context context) {
        try {
            LifecycleOwner lifecycleOwner = LIZIZ;
            o.LJII(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            if (o.LJ(lifecycleOwner, (LifecycleOwner) context)) {
                return;
            }
            LIZIZ = (LifecycleOwner) context;
            ((LifecycleOwner) context).getLifecycle().addObserver(LJFF);
            LIZ = new C68164Qp6(context);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GooglePayProcess.init failed : ");
            LIZ2.append(e.getMessage());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
        }
    }

    public static boolean LJ(PaymentMethod paymentMethod) {
        if (paymentMethod != null && o.LJ(paymentMethod.id, "pm_pi_ptw_googlepay_c_d")) {
            return true;
        }
        return false;
    }

    public static void LJI(List list) {
        C68164Qp6 c68164Qp6;
        if (LIZIZ != null && (c68164Qp6 = LIZ) != null && c68164Qp6.LIZJ != null) {
            if (C67959Qln.LJII) {
                C67960Qlo c67960Qlo = C67959Qln.LJFF;
                if (c67960Qlo != null) {
                    c67960Qlo.LIZIZ("pipo_googlepayapi_isready_start", null, null);
                    C58911NAd c58911NAd = C67959Qln.LJ;
                    if (c58911NAd != null) {
                        JSONObject jSONObject = C58911NAd.LJFF;
                        jSONObject.put("allowedPaymentMethods", new JSONArray().put(c58911NAd.LIZ(list)));
                        String jSONObject2 = jSONObject.toString();
                        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
                        QH7.LJIIIZ(jSONObject2, "isReadyToPayRequestJson cannot be null!");
                        isReadyToPayRequest.zzf = jSONObject2;
                        C67907Qkx c67907Qkx = C67959Qln.LIZIZ;
                        if (c67907Qkx != null) {
                            C67887Qkd c67887Qkd = new C67887Qkd();
                            c67887Qkd.LIZLLL = 23705;
                            c67887Qkd.LIZ = new C30941Ji(isReadyToPayRequest);
                            C67646Qgk LIZLLL2 = c67907Qkx.LIZLLL(0, c67887Qkd.LIZ());
                            o.LJIIIIZZ(LIZLLL2, "mPaymentsClient.isReadyToPay(request)");
                            LIZLLL2.LIZIZ(new C67981Qm9());
                            return;
                        }
                        o.LJIJI("mPaymentsClient");
                        throw null;
                    }
                    o.LJIJI("utils");
                    throw null;
                }
                o.LJIJI("monitor");
                throw null;
            }
            throw new Error("need to call init first");
        }
    }

    public static PaymentInfo LIZLLL(PaymentInfo paymentInfo, JSONArray jSONArray) {
        String str;
        String str2;
        List<PaymentElement> list;
        if (LIZIZ == null || paymentInfo == null) {
            return null;
        }
        try {
            List list2 = (List) GsonProtectorUtils.fromJson((Gson) C237429Tm.LIZ.getValue(), jSONArray.toString(), new C68168QpA().getType());
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.id;
                str2 = paymentMethod.token;
            } else {
                str = null;
                str2 = null;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(PaymentElement.copy$default((PaymentElement) it.next(), null, null, null, Boolean.FALSE, null, 23, null));
            }
            PaymentInfo LIZ2 = PaymentInfo.LIZ(paymentInfo, new PaymentMethodInfo(str, str2, arrayList, null, null, null, null, 64, null), null, null, 62);
            PaymentMethodInfo paymentMethodInfo = LIZ2.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                list = paymentMethodInfo.getPaymentElements();
            } else {
                list = null;
            }
            LIZLLL = list;
            return LIZ2;
        } catch (s e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("GooglePayProcess.mergePaymentInfo:Google Pay merge PaymentInfo error : ");
            LIZ3.append(e.getMessage());
            LIZ3.append(' ');
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
            return null;
        }
    }

    public static void LJFF(C28066Azu c28066Azu, InterfaceC88472Yns interfaceC88472Yns) {
        C68164Qp6 c68164Qp6;
        String str;
        if (LIZIZ != null && (c68164Qp6 = LIZ) != null) {
            c68164Qp6.LIZLLL = interfaceC88472Yns;
            if (c68164Qp6.LIZJ != null) {
                String LIZ2 = C85990Xow.LIZ();
                if (LIZ2 != null) {
                    str = LIZ2.toUpperCase(Locale.ROOT);
                    o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                } else {
                    str = "";
                }
                c28066Azu.LIZIZ = str;
                List<String> list = LIZJ;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                o.LJIIIZ(list, "<set-?>");
                c28066Azu.LIZLLL = list;
                if (C67959Qln.LJII) {
                    try {
                        C67959Qln.LJ(c28066Azu.LIZLLL, c28066Azu.LIZ());
                        return;
                    } catch (Throwable unused) {
                        C67964Qls c67964Qls = new C67964Qls(EnumC67961Qlp.ParseError, null);
                        InterfaceC67979Qm7 interfaceC67979Qm7 = C67959Qln.LIZLLL;
                        if (interfaceC67979Qm7 != null) {
                            interfaceC67979Qm7.LIZ(c67964Qls);
                            return;
                        } else {
                            o.LJIJI("callback");
                            throw null;
                        }
                    }
                }
                throw new Error("need to call init first");
            }
        }
    }
}
