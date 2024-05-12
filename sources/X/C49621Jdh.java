package X;

import a04.IDfS2S0000000_8;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Jdh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49621Jdh {
    public static final IDfS2S0000000_8 LIZ = new IDfS2S0000000_8(15);
    public static final IDfS2S0000000_8 LIZIZ = new IDfS2S0000000_8(16);
    public static final IDfS2S0000000_8 LIZJ = new IDfS2S0000000_8(18);
    public static final IDfS2S0000000_8 LIZLLL = new IDfS2S0000000_8(8);
    public static final IDfS2S0000000_8 LJ = new IDfS2S0000000_8(2);
    public static final IDfS2S0000000_8 LJFF = new IDfS2S0000000_8(17);
    public static final IDfS2S0000000_8 LJI = new IDfS2S0000000_8(9);
    public static final IDfS2S0000000_8 LJII = new IDfS2S0000000_8(10);
    public static final IDfS2S0000000_8 LJIIIIZZ = new IDfS2S0000000_8(1);
    public static final IDfS2S0000000_8 LJIIIZ = new IDfS2S0000000_8(3);
    public static final IDfS2S0000000_8 LJIIJ = new IDfS2S0000000_8(7);
    public static final IDfS2S0000000_8 LJIIJJI = new IDfS2S0000000_8(6);
    public static final IDfS2S0000000_8 LJIIL = new IDfS2S0000000_8(5);
    public static final IDfS2S0000000_8 LJIILIIL = new IDfS2S0000000_8(11);
    public static final IDfS2S0000000_8 LJIILJJIL = new IDfS2S0000000_8(13);
    public static final IDfS2S0000000_8 LJIILL = new IDfS2S0000000_8(14);
    public static final IDfS2S0000000_8 LJIILLIIL = new IDfS2S0000000_8(4);
    public static final IDfS2S0000000_8 LJIIZILJ = new IDfS2S0000000_8(12);
    public static final ConcurrentHashMap<String, WeakReference<JQA>> LJIJ = new ConcurrentHashMap<>();

    public static void LIZ(JQA jqa) {
        java.util.Map<String, Object> map;
        InterfaceC50157JmL LIZ2 = K0M.LIZ();
        if (LIZ2 != null) {
            map = LIZ2.LIZLLL();
        } else {
            map = null;
        }
        if (jqa != null) {
            if (map != null) {
                map.put(C16880lQ.LJLLJ(JQE.class), new WeakReference(jqa));
            }
        } else {
            if (map == null) {
                return;
            }
            map.remove(C16880lQ.LJLLJ(JQE.class));
        }
    }
}
