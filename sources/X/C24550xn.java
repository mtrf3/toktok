package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24550xn {
    public final Object LIZ;

    public /* synthetic */ C24550xn() {
        this.LIZ = new ArrayList();
    }

    public final int LJ() {
        int intValue;
        if (((List) this.LIZ).size() > 0) {
            int intValue2 = ((Number) ListProtector.get((List) this.LIZ, 0)).intValue();
            while ((!((List) this.LIZ).isEmpty()) && ((Number) ListProtector.get((List) this.LIZ, 0)).intValue() == intValue2) {
                List list = (List) this.LIZ;
                ListProtector.set(list, 0, ORZ.LLFF(list));
                List list2 = (List) this.LIZ;
                ListProtector.remove(list2, list2.size() - 1);
                int size = ((List) this.LIZ).size();
                int size2 = ((List) this.LIZ).size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) ListProtector.get((List) this.LIZ, i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) ListProtector.get((List) this.LIZ, i3)).intValue();
                    if (i2 < size && (intValue = ((Number) ListProtector.get((List) this.LIZ, i2)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            ListProtector.set((List) this.LIZ, i, Integer.valueOf(intValue));
                            ListProtector.set((List) this.LIZ, i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        ListProtector.set((List) this.LIZ, i, Integer.valueOf(intValue4));
                        ListProtector.set((List) this.LIZ, i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        "Set is empty".toString();
        C24780yA.LIZJ("Set is empty");
        throw null;
    }

    public /* synthetic */ C24550xn(C37905EuD c37905EuD) {
        this.LIZ = c37905EuD;
    }

    public final void LIZ(int i) {
        if (!((List) this.LIZ).isEmpty()) {
            if (((Number) ListProtector.get((List) this.LIZ, 0)).intValue() != i) {
                Object obj = this.LIZ;
                if (((Number) C64504PTg.LIZIZ((List) obj, -1, (List) obj)).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = ((List) this.LIZ).size();
        ((List) this.LIZ).add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) ListProtector.get((List) this.LIZ, i2)).intValue();
            if (i <= intValue) {
                break;
            }
            ListProtector.set((List) this.LIZ, size, Integer.valueOf(intValue));
            size = i2;
        }
        ListProtector.set((List) this.LIZ, size, Integer.valueOf(i));
    }

    public /* synthetic */ C24550xn(QI3 qi3) {
        this.LIZ = qi3;
    }

    public final String[] LIZIZ(QI4 qi4, boolean z, QHC qhc) {
        String[] strArr;
        String[] strArr2;
        C66770QIk LJI = qi4.LJI();
        if (z) {
            strArr = LJI.LIZIZ;
        } else {
            strArr = LJI.LIZ;
        }
        if (qhc != null && (!TextUtils.isEmpty(qhc.LJII) || !TextUtils.isEmpty(qhc.LJIIIIZZ))) {
            if (qhc.LJIIIZ == null) {
                qhc.LJIIIZ = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    int indexOf = strArr[i].indexOf("/service/2/app_log/");
                    if (indexOf > 0) {
                        String substring = strArr[i].substring(0, indexOf);
                        String substring2 = strArr[i].substring(indexOf);
                        if (!TextUtils.isEmpty(qhc.LJII) && qhc.LJII.startsWith("https://") && !qhc.LJII.endsWith("/")) {
                            substring = qhc.LJII;
                        }
                        if (!TextUtils.isEmpty(qhc.LJIIIIZZ) && qhc.LJIIIIZZ.startsWith("/") && qhc.LJIIIIZZ.endsWith("/")) {
                            substring2 = qhc.LJIIIIZZ;
                        }
                        qhc.LJIIIZ[i] = i0.LJFF(substring, substring2);
                    } else {
                        qhc.LJIIIZ[i] = strArr[i];
                    }
                }
            }
            if (!qhc.LJIIJ && (strArr2 = qhc.LJIIIZ) != null && strArr2.length > 0 && strArr2.length > 0) {
                strArr = strArr2;
            }
        }
        Application application = qi4.LJLJI.LJIIJ;
        int length = strArr.length;
        String[] strArr3 = new String[length];
        boolean z2 = ((QI3) this.LIZ).LJIJI;
        for (int i2 = 0; i2 < length; i2++) {
            strArr3[i2] = strArr[i2];
            if (z2) {
                StringBuilder LIZ = X1D.LIZ();
                strArr3[i2] = JBR.LJFF(LIZ, strArr3[i2], "?tt_data=a", LIZ);
            }
            String LIZ2 = ((QI3) this.LIZ).LIZ(application, strArr3[i2], QKO.L1);
            strArr3[i2] = LIZ2;
            strArr3[i2] = QH8.LJ(LIZ2, QDS.LIZLLL);
        }
        return strArr3;
    }

    public final Object LIZJ(JSONObject jSONObject, String str, Class cls) {
        Object obj = null;
        if (jSONObject == null) {
            QI3 qi3 = (QI3) this.LIZ;
            if (qi3.LJIIL == null) {
                return null;
            }
            QI6 qi6 = qi3.LJIIL;
            return qi6.LJFF.LJ.LIZJ(qi6.LIZLLL, str, cls);
        }
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            try {
                obj = cls.cast(opt);
            } catch (Throwable th) {
                ((QI3) this.LIZ).LJJIZ.LJIILL(Collections.singletonList("ApiParamsUtil"), "getValue cast failed", th, new Object[0]);
            }
        }
        if (obj == null) {
            return "";
        }
        return obj;
    }

    public final void LIZLLL(String url, String bridgeName, JSONObject jSONObject, C37701Eqv c37701Eqv) {
        o.LJIIJ(url, "url");
        o.LJIIJ(bridgeName, "bridgeName");
        C37904EuC c37904EuC = ((C37905EuD) this.LIZ).LIZ.LIZ;
        C37903EuB c37903EuB = c37904EuC.LIZ;
        if (c37903EuB != null) {
            C37955Ev1 c37955Ev1 = new C37955Ev1(c37904EuC);
            c37955Ev1.LJ = url;
            String optString = jSONObject.optString("__callback_id", "prefetch_callback");
            o.LJFF(optString, "msg.optString(\"__callbac…id\", \"prefetch_callback\")");
            c37955Ev1.LIZJ = optString;
            c37955Ev1.LIZLLL = bridgeName;
            String optString2 = jSONObject.optString("__msg_type", "callback");
            o.LJFF(optString2, "msg.optString(\"__msg_type\", \"callback\")");
            c37955Ev1.LJFF = optString2;
            c37955Ev1.LJI = jSONObject.optJSONObject("data");
            c37955Ev1.LJIIIIZZ = "DEFAULT";
            c37955Ev1.LIZIZ(EnumC37907EuF.Worker);
            c37903EuB.LIZ(c37955Ev1, new C37914EuM(c37701Eqv), c37904EuC, null);
        }
    }
}
