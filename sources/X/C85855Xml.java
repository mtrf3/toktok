package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.Xml, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85855Xml {
    public static C85858Xmo LIZIZ;
    public static final ReentrantLock LIZ = new ReentrantLock();
    public static final ConcurrentHashMap<Integer, C85858Xmo> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C85858Xmo, CopyOnWriteArrayList<InterfaceC55260LmS<?>>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<InterfaceC55260LmS<?>, InterfaceC55251LmJ<?>> LJ = new ConcurrentHashMap<>();

    public static C85858Xmo LIZ(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        ReentrantLock reentrantLock = LIZ;
        reentrantLock.lock();
        try {
            int hashCode = lifecycleOwner.hashCode();
            ConcurrentHashMap<Integer, C85858Xmo> concurrentHashMap = LIZJ;
            C85858Xmo c85858Xmo = concurrentHashMap.get(Integer.valueOf(hashCode));
            if (c85858Xmo == null) {
                InterfaceC55235Lm3 interfaceC55235Lm3 = null;
                if (lifecycleOwner instanceof ActivityC45651qj) {
                    interfaceC55235Lm3 = C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null);
                } else if (lifecycleOwner instanceof Fragment) {
                    interfaceC55235Lm3 = C55230Lly.LIZJ((Fragment) lifecycleOwner, null);
                }
                if (interfaceC55235Lm3 == null) {
                    interfaceC55235Lm3 = new C55238Lm6("tracker_key");
                }
                c85858Xmo = new C85858Xmo(interfaceC55235Lm3);
                concurrentHashMap.put(Integer.valueOf(hashCode), c85858Xmo);
                C85858Xmo c85858Xmo2 = LIZIZ;
                if (c85858Xmo2 == null) {
                    c85858Xmo2 = C85857Xmn.LIZLLL;
                }
                C55247LmF.LIZ(c85858Xmo.LIZ, c85858Xmo2.LIZ);
                c85858Xmo2.LIZJ = c85858Xmo;
                c85858Xmo.LIZIZ = c85858Xmo2;
                LIZIZ = c85858Xmo;
                L9U.LIZIZ(new C85856Xmm(lifecycleOwner, c85858Xmo, hashCode));
            }
            return c85858Xmo;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static InterfaceC55260LmS LIZIZ(Class cls) {
        C85858Xmo c85858Xmo;
        InterfaceC55260LmS<?> interfaceC55260LmS;
        C50655JuN c50655JuN = C50655JuN.LJLIL;
        if (o.LJ(c50655JuN, c50655JuN)) {
            c85858Xmo = LIZIZ;
        } else {
            c85858Xmo = LIZJ.get(Integer.valueOf(c50655JuN.hashCode()));
        }
        if (c85858Xmo == null) {
            c85858Xmo = C85857Xmn.LIZLLL;
        }
        InterfaceC55251LmJ<?> LIZLLL2 = C55247LmF.LIZLLL(c85858Xmo.LIZ, cls, null);
        if (LIZLLL2 == null || (interfaceC55260LmS = (InterfaceC55260LmS) LIZLLL2.getSource()) == null) {
            return null;
        }
        ConcurrentHashMap<C85858Xmo, CopyOnWriteArrayList<InterfaceC55260LmS<?>>> concurrentHashMap = LIZLLL;
        CopyOnWriteArrayList<InterfaceC55260LmS<?>> copyOnWriteArrayList = concurrentHashMap.get(c85858Xmo);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put(c85858Xmo, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(interfaceC55260LmS);
        LJ.put(interfaceC55260LmS, LIZLLL2);
        return interfaceC55260LmS;
    }

    public static void LIZJ(LifecycleOwner lifecycleOwner, Class cls, InterfaceC88472Yns interfaceC88472Yns) {
        C85858Xmo c85858Xmo;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (o.LJ(lifecycleOwner, C50655JuN.LJLIL)) {
            c85858Xmo = LIZIZ;
        } else {
            c85858Xmo = LIZJ.get(Integer.valueOf(lifecycleOwner.hashCode()));
        }
        if (c85858Xmo == null) {
            c85858Xmo = C85857Xmn.LIZLLL;
        }
        InterfaceC55251LmJ LIZLLL2 = C55247LmF.LIZLLL(c85858Xmo.LIZ, cls, null);
        if (LIZLLL2 != null && LIZLLL2.getSource() != null) {
            LIZLLL2.LIZ(new AqS168S0100000_2(interfaceC88472Yns, 517));
        }
    }
}
