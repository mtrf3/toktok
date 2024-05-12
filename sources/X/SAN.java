package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SAN {
    public static final SAN LIZ = new SAN();
    public static final SimpleDateFormat LIZIZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
    public static final ConcurrentHashMap<String, PaymentMethod> LIZJ = new ConcurrentHashMap<>();

    public static String LIZJ(String str) {
        if (ORZ.LJLJJI(str, C71691SBr.LIZLLL)) {
            return "date";
        }
        if (ORZ.LJLJJI(str, C71691SBr.LJ)) {
            return "holder";
        }
        if (ORZ.LJLJJI(str, C71691SBr.LJFF)) {
            return "card_number";
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static void LIZLLL(PaymentMethodsData paymentMethodsData) {
        LIZJ.clear();
        Iterator it = ((ArrayList) C32I.LJJLI(ORY.LJJIJLIJ(new List[]{paymentMethodsData.paymentMethods, paymentMethodsData.storedMethods}))).iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            LIZ.getClass();
            LIZ(paymentMethod, 1);
        }
    }

    public static boolean LJ(String str) {
        List<PaymentMethod> list;
        if (str == null) {
            return false;
        }
        if (!o.LJ(str, "pm_pi_atmcard_all")) {
            PaymentMethod paymentMethod = LIZJ.get("pm_pi_atmcard_all");
            if (paymentMethod == null || (list = paymentMethod.subPaymentMethods) == null) {
                return false;
            }
            for (PaymentMethod paymentMethod2 : list) {
                if (o.LJ(paymentMethod2.id, str)) {
                    if (paymentMethod2 == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean LJFF(String str) {
        if (str == null) {
            return false;
        }
        return ujb.o.LJJJLIIL(str, "eg_ccdc_global_billing_address", false);
    }

    public static void LIZ(PaymentMethod paymentMethod, int i) {
        if (i < 0) {
            return;
        }
        ConcurrentHashMap<String, PaymentMethod> concurrentHashMap = LIZJ;
        paymentMethod.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        String str = paymentMethod.id;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ2.append(str);
        String str3 = paymentMethod.token;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ2.append(str2);
        concurrentHashMap.put(X1D.LIZIZ(LIZ2), paymentMethod);
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null) {
            for (PaymentMethod paymentMethod2 : list) {
                LIZ.getClass();
                LIZ(paymentMethod2, i - 1);
            }
        }
    }

    public static List LJI(List list, List list2) {
        if (list == null) {
            if (list2 == null) {
                return C61878OQg.INSTANCE;
            }
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String element = ((PaymentElement) it.next()).getElement();
            if (element != null) {
                hashSet.add(element);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ORZ.LJLJJI(((PaymentElement) obj).getElement(), hashSet)) {
                arrayList.add(obj);
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        ((ArrayList) LLJILJILJ).addAll(list2);
        return LLJILJILJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodDetails> r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SAN.LIZIZ(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
