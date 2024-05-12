package X;

import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FFd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38657FFd {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static C38655FFb LIZIZ;
    public static Thread LIZJ;

    public static final void LIZIZ(EnumC38662FFi resType, String str) {
        o.LJIIIZ(resType, "resType");
        int i = C38661FFh.LIZ[resType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C38655FFb c38655FFb = LIZIZ;
            if (c38655FFb != null) {
                AbstractC38658FFe abstractC38658FFe = c38655FFb.LIZIZ.get(str);
                if (abstractC38658FFe == null) {
                    return;
                }
                abstractC38658FFe.LIZ = false;
                return;
            }
            o.LJIJI("preload");
            throw null;
        }
        C38655FFb c38655FFb2 = LIZIZ;
        if (c38655FFb2 != null) {
            AbsABValueOptimizer absABValueOptimizer = c38655FFb2.LIZ.get(str);
            if (absABValueOptimizer == null) {
                return;
            }
            absABValueOptimizer.LIZ = false;
            return;
        }
        o.LJIJI("preload");
        throw null;
    }

    public static final void LIZJ(EnumC38662FFi resType, String str) {
        o.LJIIIZ(resType, "resType");
        int i = C38661FFh.LIZ[resType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C38655FFb c38655FFb = LIZIZ;
            if (c38655FFb != null) {
                AbstractC38658FFe abstractC38658FFe = c38655FFb.LIZIZ.get(str);
                if (abstractC38658FFe == null) {
                    return;
                }
                if (abstractC38658FFe.LIZIZ() && !((Boolean) DOU.LIZ.getValue()).booleanValue()) {
                    return;
                }
                abstractC38658FFe.LIZ = true;
                return;
            }
            o.LJIJI("preload");
            throw null;
        }
        C38655FFb c38655FFb2 = LIZIZ;
        if (c38655FFb2 != null) {
            AbsABValueOptimizer absABValueOptimizer = c38655FFb2.LIZ.get(str);
            if (absABValueOptimizer == null) {
                return;
            }
            if (absABValueOptimizer.LIZJ() && !((Boolean) DOU.LIZ.getValue()).booleanValue()) {
                return;
            }
            absABValueOptimizer.LIZ = true;
            return;
        }
        o.LJIJI("preload");
        throw null;
    }

    public static final void LIZLLL(EnumC38662FFi resType, String str) {
        o.LJIIIZ(resType, "resType");
        int i = C38661FFh.LIZ[resType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C38655FFb c38655FFb = LIZIZ;
            if (c38655FFb != null) {
                AbstractC38658FFe abstractC38658FFe = c38655FFb.LIZIZ.get(str);
                if (abstractC38658FFe == null || !abstractC38658FFe.LIZLLL.compareAndSet(false, true)) {
                    return;
                }
                AbstractC38658FFe.LIZJ(new AqS154S0100000_4(abstractC38658FFe, 1172));
                return;
            }
            o.LJIJI("preload");
            throw null;
        }
        C38655FFb c38655FFb2 = LIZIZ;
        if (c38655FFb2 != null) {
            AbsABValueOptimizer absABValueOptimizer = c38655FFb2.LIZ.get(str);
            if (absABValueOptimizer == null || !absABValueOptimizer.LJ.compareAndSet(false, true)) {
                return;
            }
            AbsABValueOptimizer.LIZLLL(new AqS156S0100000_6(absABValueOptimizer, 17));
            return;
        }
        o.LJIJI("preload");
        throw null;
    }

    public static final void LJ(EnumC38662FFi resType, String str) {
        o.LJIIIZ(resType, "resType");
        int i = C38661FFh.LIZ[resType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C38655FFb c38655FFb = LIZIZ;
            if (c38655FFb != null) {
                AbstractC38658FFe abstractC38658FFe = c38655FFb.LIZIZ.get(str);
                if (abstractC38658FFe == null || !abstractC38658FFe.LIZIZ.compareAndSet(false, true)) {
                    return;
                }
                AbstractC38658FFe.LIZJ(new AqS154S0100000_4(abstractC38658FFe, 1173));
                return;
            }
            o.LJIJI("preload");
            throw null;
        }
        C38655FFb c38655FFb2 = LIZIZ;
        if (c38655FFb2 != null) {
            AbsABValueOptimizer absABValueOptimizer = c38655FFb2.LIZ.get(str);
            if (absABValueOptimizer == null || !absABValueOptimizer.LIZLLL.compareAndSet(false, true)) {
                return;
            }
            AbsABValueOptimizer.LIZLLL(new AqS156S0100000_6(absABValueOptimizer, 18));
            return;
        }
        o.LJIJI("preload");
        throw null;
    }

    public static final void LIZ(Object obj, Object obj2, String key, boolean z) {
        Object LIZ2;
        o.LJIIIZ(key, "key");
        if (!LIZ.get()) {
            return;
        }
        if (((Boolean) C34680DjI.LIZIZ.getValue()).booleanValue()) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            Thread thread = LIZJ;
            if (thread != null) {
                if (!o.LJ(LLLLIIIILLL, thread)) {
                    return;
                }
            } else {
                o.LJIJI("mainThread");
                throw null;
            }
        }
        try {
            C38655FFb c38655FFb = LIZIZ;
            if (c38655FFb != null) {
                java.util.Map<String, AbsABValueOptimizer> map = c38655FFb.LIZ;
                if (!map.isEmpty()) {
                    try {
                        Iterator<Map.Entry<String, AbsABValueOptimizer>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            it.next().getValue().LJFF(obj, obj2, key, z);
                        }
                        LIZ2 = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    C3C5.m6boximpl(LIZ2);
                    return;
                }
                return;
            }
            o.LJIJI("preload");
            throw null;
        } catch (Exception unused) {
        }
    }
}
