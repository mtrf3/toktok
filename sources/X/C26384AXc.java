package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AXc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26384AXc {
    public final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C26385AXd.LJLIL);

    public final InterfaceC26386AXe LIZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-mPreferences>(...)");
        return (InterfaceC26386AXe) value;
    }

    public final String LIZIZ() {
        try {
            return String.valueOf(LIZ().LJIIJJI());
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
            return "";
        }
    }

    public final void LIZJ(String str) {
        try {
            LIZ().LJII(str);
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
