package X;

/* renamed from: X.6uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175206uC {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ(int i) {
        FMX.LJIIL("post_comment_result", C78920UyC.LIZJ(i, "is_success").LIZ);
    }

    public static final void LIZIZ(int i, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJI("load_scene", str);
        c188727au.LIZLLL(i, "is_success");
        FMX.LJIIL("comment_list_load", c188727au.LIZ);
    }

    public static final void LIZ(int i, String str, int i2, long j, long j2, String str2, long j3, long j4, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "flag");
        c188727au.LJI("group_id", str);
        c188727au.LIZLLL(i2, "inconformity");
        c188727au.LJ(j, "statistics_count");
        c188727au.LJ(j2, "list_count");
        c188727au.LJI("interaction_type", str2);
        c188727au.LJ(j3, "video_create_time");
        c188727au.LJ(j4, "video_elapsed_time");
        c188727au.LJI("list_logid", str3);
        c188727au.LJI("video_logid", str4);
        c188727au.LJI("inconformity_scene", str5);
        FMX.LJIIL("check_count_inconformity", c188727au.LIZ);
    }
}
