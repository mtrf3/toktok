package X;

/* loaded from: classes9.dex */
public final class JII {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, JQA jqa, java.util.Map map) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", jqa.LJFF);
        c188727au.LJIIIZ("search_type", jqa.LIZJ);
        c188727au.LJIIIZ("search_id", jqa.LJII);
        c188727au.LJIIIZ("search_result_id", jqa.LJIILJJIL);
        c188727au.LJIIIZ("search_keyword", jqa.LJ);
        c188727au.LIZLLL(0, "is_fullscreen");
        if (z) {
            str = "off";
        } else {
            str = "on";
        }
        c188727au.LJIIIZ("switch_status", str);
        if (C78857UxB.LJJJIL(jqa.LJIJJLI)) {
            c188727au.LJI("token_type", jqa.LJIJJLI);
        }
        if (C78857UxB.LJJJIL(jqa.LJIILL)) {
            c188727au.LJI("list_item_id", jqa.LJIILL);
        }
        if (map != null && (!map.isEmpty())) {
            c188727au.LJIIIIZZ(map);
        }
        FMX.LJIIL("sounds_switch_click", c188727au.LIZ);
    }
}
