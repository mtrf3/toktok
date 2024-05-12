package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.EffectUtilKt;
import java.util.Iterator;
import ujb.o;

/* loaded from: classes16.dex */
public final class XCM {
    public static final XCM LIZJ = new XCM();
    public static final C40601ia<String, Effect> LIZ = new C40601ia<>(true);
    public static final C40601ia<String, C538229i<XCP>> LIZIZ = new C40601ia<>(true);

    public static boolean LIZJ(Effect effect) {
        boolean z = false;
        if (effect != null && !o.LJJJJJL(effect.getId())) {
            if (LIZLLL(C78966Uyw.LJIL(effect))) {
                return false;
            }
            z = C10820be.LJ(effect.getUnzipPath());
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean LIZ2 = EffectUtilKt.LIZ(effect.getUnzipPath());
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("checkEffectChildrenFile effect: ");
                LIZ3.append(effect.getEffect_id());
                LIZ3.append(", name: ");
                LIZ3.append(effect.getName());
                LIZ3.append(", result: ");
                LIZ3.append(LIZ2);
                LIZ3.append(", time cost: ");
                LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                c12310e3.getClass();
                C12310e3.LIZ("checkEffect", LIZIZ2);
                return LIZ2;
            }
        }
        return z;
    }

    public static boolean LIZLLL(String str) {
        if (str != null) {
            return LIZ.containsKey(str);
        }
        return false;
    }

    public static void LIZ(XCO xco, Effect effect) {
        String str;
        String LJIL;
        if (effect != null) {
            str = C78966Uyw.LJIL(effect);
        } else {
            str = null;
        }
        if (!LIZLLL(str)) {
            if (LIZJ(effect)) {
                xco.onSuccess(effect);
            }
        } else if (effect != null && (LJIL = C78966Uyw.LJIL(effect)) != null) {
            C40601ia<String, C538229i<XCP>> c40601ia = LIZIZ;
            C538229i<XCP> c538229i = c40601ia.get(LJIL);
            if (c538229i == null) {
                c538229i = new C538229i<>(true);
                c40601ia.put(LJIL, c538229i);
            }
            c538229i.add(xco);
        }
    }

    public static void LIZIZ(Effect effect, C84418XBe e) {
        String LJIL;
        kotlin.jvm.internal.o.LJIIJ(e, "e");
        if (effect != null && (LJIL = C78966Uyw.LJIL(effect)) != null) {
            C538229i<XCP> c538229i = LIZIZ.get(LJIL);
            if (c538229i != null) {
                Iterator<XCP> it = c538229i.iterator();
                while (it.hasNext()) {
                    it.next().onFail(effect, e);
                }
            }
            LIZIZ.remove(LJIL);
            LIZ.remove(LJIL);
        }
    }
}
