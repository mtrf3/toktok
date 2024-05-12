package X;

/* loaded from: classes13.dex */
public final class SMT {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "Everyone";
            }
            if (num.intValue() == 1) {
                return "Friends";
            }
            if (num.intValue() == 3) {
                return "Only_me";
            }
        }
        return null;
    }

    public static void LIZIZ(int i, Integer num, String str) {
        C72028SOq LIZ2 = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        if (str == null) {
            str = "duet_permission";
        }
        c71969SMj.LIZIZ("enter_from", str);
        c71969SMj.LIZIZ("from_status", LIZ(num));
        c71969SMj.LIZIZ("to_status", LIZ(Integer.valueOf(i)));
        c71969SMj.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ2, "change_duet_permission", map);
    }
}
