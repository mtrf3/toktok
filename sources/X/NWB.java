package X;

/* loaded from: classes11.dex */
public final class NWB {
    public static final boolean LIZIZ(C59314NPq c59314NPq) {
        Long l;
        C59273NOb c59273NOb;
        if (c59314NPq != null && (c59273NOb = c59314NPq.LIZIZ) != null) {
            l = Long.valueOf(c59273NOb.LIZ);
        } else {
            l = null;
        }
        if (l == null || c59314NPq.LIZIZ.LIZ == 0 || !C52230Keg.LIZ()) {
            return false;
        }
        return true;
    }

    public static final void LIZ(int i, String str, String str2, String str3) {
        if (!C52230Keg.LIZ()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        C58655N0h LJ = C58704N2e.LJ("landing_ad", "three_dots_click", str, str2, null);
        LJ.LIZIZ(str3, "url");
        LJ.LIZIZ(Integer.valueOf(i), "first_page");
        LJ.LJI();
    }
}
