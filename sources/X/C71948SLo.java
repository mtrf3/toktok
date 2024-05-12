package X;

/* renamed from: X.SLo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71948SLo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        String str;
        C72028SOq LIZ2 = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "download_permission");
        if (i == 0) {
            str = "on";
        } else {
            str = "off";
        }
        c71969SMj.LIZIZ("to_status", str);
        c71969SMj.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ2, "change_download_permission", map);
    }
}
