package X;

import java.lang.reflect.Field;
import java.util.HashSet;

/* renamed from: X.JfQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49728JfQ extends W4T {
    public static final C49728JfQ LJII;
    public static final HashSet<InterfaceC81694W4k> LJIIIIZZ;

    static {
        Object obj;
        C49728JfQ c49728JfQ = new C49728JfQ();
        LJII = c49728JfQ;
        HashSet<InterfaceC81694W4k> hashSet = null;
        try {
            Field LIZ = EWW.LIZ(c49728JfQ, "mPendingReleasables");
            if (LIZ == null || (obj = LIZ.get(c49728JfQ)) == null) {
                obj = null;
            }
            hashSet = (HashSet) obj;
        } catch (Exception unused) {
        }
        LJIIIIZZ = hashSet;
    }

    @Override // X.W4T
    public final void LIZ(InterfaceC81694W4k interfaceC81694W4k) {
        HashSet<InterfaceC81694W4k> hashSet = LJIIIIZZ;
        if (hashSet != null) {
            C65777Prh.LIZ(hashSet).remove(interfaceC81694W4k);
        } else {
            super.LIZ(interfaceC81694W4k);
        }
    }
}
