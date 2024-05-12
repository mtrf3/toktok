package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.J5a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48586J5a extends AbstractC48596J5k {
    public static final /* synthetic */ int LIZJ = 0;

    @Override // X.AbstractC48600J5o
    public final void LIZIZ() {
        LJI().LIZIZ("cl_net_quality_level", new C48594J5i(0));
        LJI().LIZIZ("cl_is_charging", null);
        LJI().LIZIZ("cl_battery_pct", null);
        LJI().LIZIZ("cl_is_wifi", null);
    }

    @Override // X.AbstractC48600J5o
    public final ConcurrentHashMap<String, String> LJFF() {
        java.util.Set<String> keySet = LJI().LIZIZ.keySet();
        if (keySet != null) {
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                LIZJ(it.next());
            }
        }
        return LJI().LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC48600J5o
    public final String LIZJ(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        switch (str.hashCode()) {
            case -54408432:
                if (str.equals("cl_is_charging")) {
                    C48598J5m LJI = LJI();
                    C46625IRp LJIIJ = UC0.LJIIJ(C48602J5q.LIZIZ);
                    if (LJIIJ != null) {
                        C46628IRs c46628IRs = LJIIJ.LIZ;
                        c46628IRs.LJI();
                        i2 = c46628IRs.LJLJJL;
                    }
                    LJI.LJFF(Integer.valueOf(i2), str);
                    break;
                }
                break;
            case 234045236:
                if (str.equals("cl_is_wifi")) {
                    C48598J5m LJI2 = LJI();
                    Context context = C48602J5q.LIZIZ;
                    if (context != null) {
                        i = C48203Ivv.LJFF(context);
                    } else {
                        i = -1;
                    }
                    LJI2.LJFF(Integer.valueOf(i), str);
                    break;
                }
                break;
            case 1253160652:
                if (str.equals("cl_net_quality_level")) {
                    LJI().LJFF(Integer.valueOf(TTNetInit.getEffectiveConnectionType()), str);
                    break;
                }
                break;
            case 1268176089:
                if (str.equals("cl_battery_pct")) {
                    C48598J5m LJI3 = LJI();
                    C46625IRp LJIIJ2 = UC0.LJIIJ(C48602J5q.LIZIZ);
                    if (LJIIJ2 != null) {
                        i3 = LJIIJ2.LIZ();
                    }
                    LJI3.LJFF(Integer.valueOf(i3), str);
                    break;
                }
                break;
        }
        return LJI().LIZJ(str);
    }
}
