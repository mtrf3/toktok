package X;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AKZ {
    public static final java.util.Map<Integer, AKX> LIZ = new LinkedHashMap();
    public static final java.util.Set<WeakReference<AKV<?>>> LIZIZ = new LinkedHashSet();

    public static void LIZ() {
        Iterator<WeakReference<AKV<?>>> it = LIZIZ.iterator();
        while (it.hasNext()) {
            AKV<?> akv = it.next().get();
            if (akv != null) {
                akv.LIZIZ.LLLJIL().LJI = false;
                akv.dismiss();
            }
        }
        LIZIZ.clear();
    }

    public static void LIZIZ(Object obj) {
        Iterator it = ((LinkedHashMap) LIZ).entrySet().iterator();
        while (it.hasNext()) {
            AKX akx = (AKX) ((Map.Entry) it.next()).getValue();
            long currentTimeMillis = System.currentTimeMillis();
            AKW LLLJIL = akx.LLLJIL();
            Long l = LLLJIL.LIZ;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0 && currentTimeMillis < longValue) {
                    LLLJIL.LJFF = false;
                    LLLJIL.LJ = longValue - currentTimeMillis;
                    if (obj instanceof Activity) {
                        if (akx instanceof C26046AKc) {
                            C26045AKb c26045AKb = new C26045AKb((Activity) obj);
                            c26045AKb.LIZ = (C26046AKc) akx;
                            c26045AKb.LJIIJ();
                        } else if (akx instanceof C208158Ex) {
                            AKT akt = new AKT((Activity) obj);
                            akt.LIZ = (C208158Ex) akx;
                            akt.LJII();
                        } else if (akx instanceof C26044AKa) {
                            C26048AKe c26048AKe = new C26048AKe((Activity) obj);
                            c26048AKe.LIZ = akx;
                            c26048AKe.LJII();
                        }
                    } else if (obj instanceof Dialog) {
                        if (akx instanceof C26046AKc) {
                            C26045AKb c26045AKb2 = new C26045AKb((Dialog) obj);
                            c26045AKb2.LIZ = (C26046AKc) akx;
                            c26045AKb2.LJIIJ();
                        } else if (akx instanceof C208158Ex) {
                            AKT akt2 = new AKT((Dialog) obj);
                            akt2.LIZ = (C208158Ex) akx;
                            akt2.LJII();
                        } else if (akx instanceof C26044AKa) {
                            C26048AKe c26048AKe2 = new C26048AKe((Dialog) obj);
                            c26048AKe2.LIZ = akx;
                            c26048AKe2.LJII();
                        }
                    }
                }
            }
            it.remove();
        }
    }

    public static void LIZJ(AKV akv) {
        LIZIZ.add(new WeakReference<>(akv));
        AKX akx = akv.LIZIZ;
        LIZ.put(Integer.valueOf(akx.LLLJIL().LJIIIIZZ), akx);
    }
}
