package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPZ implements InterfaceC82230WPa {
    public static InterfaceC82230WPa LIZ;
    public static final WPZ LIZIZ = new WPZ();

    @Override // X.InterfaceC82230WPa
    public final void LIZ(long j, String str) {
        InterfaceC82230WPa interfaceC82230WPa = LIZ;
        if (interfaceC82230WPa != null) {
            interfaceC82230WPa.LIZ(j, str);
        }
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZLLL(String str, boolean z) {
        InterfaceC82230WPa interfaceC82230WPa = LIZ;
        if (interfaceC82230WPa != null) {
            interfaceC82230WPa.LIZLLL(str, z);
        }
    }

    @Override // X.InterfaceC82230WPa
    public final void LJ(String str, String tab, String enterFrom, boolean z) {
        o.LJIIIZ(tab, "tab");
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC82230WPa interfaceC82230WPa = LIZ;
        if (interfaceC82230WPa != null) {
            interfaceC82230WPa.LJ(str, tab, enterFrom, z);
        }
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZIZ(boolean z, String str, Throwable th, String tab, String enterFrom) {
        o.LJIIIZ(tab, "tab");
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC82230WPa interfaceC82230WPa = LIZ;
        if (interfaceC82230WPa != null) {
            interfaceC82230WPa.LIZIZ(false, "filter", th, tab, enterFrom);
        }
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZJ(String scene, float f, float f2, int i, boolean z) {
        o.LJIIIZ(scene, "scene");
        InterfaceC82230WPa interfaceC82230WPa = LIZ;
        if (interfaceC82230WPa != null) {
            interfaceC82230WPa.LIZJ(scene, f, f2, i, z);
        }
    }
}
