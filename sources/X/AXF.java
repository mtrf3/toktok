package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXF implements AXH {
    public final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, AXG.LJLIL);

    public final String LIZ() {
        String LJIIJJI;
        try {
            Object value = this.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-mPreferences>(...)");
            LJIIJJI = ((InterfaceC26386AXe) value).LJIIJJI();
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
        if (LJIIJJI == null) {
            return "";
        }
        return LJIIJJI;
    }
}
