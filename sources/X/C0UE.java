package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.0UE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UE {
    public final Object LIZ;
    public Object LIZIZ;

    public /* synthetic */ C0UE(C0NU c0nu) {
        this.LIZ = c0nu;
    }

    public final List LIZJ() {
        List list = (List) this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((AbstractC41507GQt) it.next()).LJI(), arrayList);
        }
        return arrayList;
    }

    public final String LIZLLL() {
        List list = (List) this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(((AbstractC41507GQt) next).LJIILLIIL((CharSequence) this.LIZ));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    while (it2.hasNext()) {
                        obj = i0.LJFF((String) obj, (String) it2.next());
                    }
                }
                String str = (String) obj;
                if (str == null) {
                    return "";
                }
                return str;
            }
        }
    }

    public /* synthetic */ C0UE() {
        this.LIZ = new ConcurrentHashMap();
        this.LIZIZ = new ConcurrentHashMap();
    }

    public final BankCardRule LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            BankCardRule bankCardRule = (BankCardRule) next;
            String str2 = bankCardRule.cardBrandRegex;
            if (str2 != null && str2.length() != 0 && Pattern.matches(bankCardRule.cardBrandRegex, str)) {
                obj = next;
                break;
            }
        }
        return (BankCardRule) obj;
    }

    public final PaymentMethod LIZIZ(String str) {
        String str2;
        BankCardRule LIZ = LIZ(str);
        if (LIZ == null || (str2 = LIZ.paymentMethodId) == null) {
            return null;
        }
        SAN.LIZ.getClass();
        return SAN.LIZJ.get(str2);
    }

    public /* synthetic */ C0UE(CharSequence charSequence, ORV orv) {
        this.LIZ = charSequence;
        this.LIZIZ = orv;
    }

    public final SEX LJ(String id, String... values) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(values, "values");
        SEX sex = new SEX(0);
        InterfaceC71754SEc interfaceC71754SEc = (InterfaceC71754SEc) ((ConcurrentHashMap) this.LIZ).get(id);
        if (interfaceC71754SEc != null) {
            return interfaceC71754SEc.LIZ((String[]) Arrays.copyOf(values, values.length));
        }
        return sex;
    }
}
