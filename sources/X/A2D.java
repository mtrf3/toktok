package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A2D {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str2, "entryPoint");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LIZLLL(i, "collection_cnt");
        LIZ2.LJIIIZ("entry_point", str2);
        FMX.LJIIL("show_series_selection_page", LIZ2.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str4, "entryPoint");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("collection_id", str2);
        LIZ2.LJIIIZ("button_name", str3);
        LIZ2.LJIIIZ("entry_point", str4);
        FMX.LJIIL("create_new_series_title", LIZ2.LIZ);
    }

    public static void LIZJ(String str, String enterFrom, String entryPoint, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(entryPoint, "entryPoint");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", enterFrom);
        c145995oB.LJI("collection_id", str2);
        c145995oB.LJI("item_id", "");
        c145995oB.LJI("entry_point", entryPoint);
        FMX.LJIIL(str, c145995oB.LIZ);
    }
}
