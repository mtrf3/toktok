package X;

/* loaded from: classes7.dex */
public final class FD1 {
    public static final FD1 LIZIZ = new FD1();
    public static final C60666NrS LIZ = new C60666NrS();

    public final synchronized void LIZ() {
        FD2 fd2;
        C39890Fl8 c39890Fl8 = C39890Fl8.LJ;
        if (!c39890Fl8.LIZIZ()) {
            return;
        }
        C39811Fjr c39811Fjr = C39890Fl8.LIZ;
        if (c39811Fjr == null || (fd2 = c39811Fjr.LIZJ) == null) {
            C39048FUe.LIZIZ.LIZ("LynxConfig cannot be null, Please set value by HybridKit.setLynxConfig", EnumC39866Fkk.E, "HybridLynxKit");
            return;
        }
        if (c39811Fjr == null || c39811Fjr.LIZLLL == null) {
            C39048FUe.LIZIZ.LIZ("ResourceConfig cannot be null, Please set value by HybridKit.setResourceConfig", EnumC39866Fkk.E, "HybridLynxKit");
            return;
        }
        FD5.LIZIZ.add(FD0.LIZ);
        c39890Fl8.LIZ();
        if (fd2 instanceof C39935Flr) {
            C40013Fn7.LIZ((C39935Flr) fd2);
        }
    }
}
