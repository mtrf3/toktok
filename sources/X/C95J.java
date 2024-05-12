package X;

import java.util.HashMap;

/* renamed from: X.95J, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C95J {
    public static InterfaceC247459nR LIZ;
    public static final HashMap<Integer, InterfaceC245219jp> LIZIZ = new HashMap<>();
    public static HashMap<Integer, C250209rs> LIZJ = new HashMap<>();

    public static C250209rs LIZ(int i) {
        C250209rs c250209rs = LIZJ.get(Integer.valueOf(i));
        if (!(c250209rs instanceof C250209rs)) {
            c250209rs = null;
        }
        return c250209rs;
    }
}
