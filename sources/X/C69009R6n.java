package X;

/* renamed from: X.R6n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69009R6n {
    public static void LIZLLL(C69008R6m c69008R6m) {
        LIZ(c69008R6m, EnumC69010R6o.SUCCESS, null, 0, null);
    }

    public static void LIZIZ(C69008R6m c69008R6m, String str, int i, String str2) {
        LIZ(c69008R6m, EnumC69010R6o.CANCEL, str, i, str2);
    }

    public static void LIZJ(C69008R6m c69008R6m, String str, int i, String str2) {
        LIZ(c69008R6m, EnumC69010R6o.FAILURE, str, i, str2);
    }

    public static void LIZ(C69008R6m c69008R6m, EnumC69010R6o enumC69010R6o, String str, int i, String str2) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", c69008R6m.LIZIZ);
        c35936E8m.LIZLLL("enter_from", c69008R6m.LIZ);
        c35936E8m.LIZLLL("login_panel_type", c69008R6m.LJ);
        c35936E8m.LIZLLL("source", c69008R6m.LIZJ);
        c35936E8m.LIZLLL("platform", c69008R6m.LIZLLL);
        c35936E8m.LIZ(enumC69010R6o.value, "status");
        c35936E8m.LIZLLL("fail_info", str);
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZLLL("error_desc", str2);
        c35936E8m.LIZ(1, "_perf_monitor");
        FMX.LJIIL("token_response", c35936E8m.LIZ);
    }
}
