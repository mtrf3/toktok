package X;

/* renamed from: X.HtJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45493HtJ {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;

    public static C145995oB LIZ(boolean z) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", LIZIZ);
        c145995oB.LJI("creation_id", LIZ);
        c145995oB.LJI("content_source", "upload");
        String str2 = LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        c145995oB.LJI("mv_id", str2);
        c145995oB.LJI("enter_from", "album_panel");
        if (z) {
            str = "video";
        } else {
            str = "photo";
        }
        c145995oB.LJI("content_type", str);
        return c145995oB;
    }
}
