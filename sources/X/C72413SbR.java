package X;

/* renamed from: X.SbR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72413SbR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        String value = EnumC72412SbQ.AI_AVATAR_SHOOT_CONFIRM_PAGE.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(EnumC72414SbS.ACTION_TYPE.getValue(), str);
        FMX.LJIIL(value, c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterMethod", str2, "enterFrom");
        LIZ2.LJIIIZ("content_type", "photo");
        LIZ2.LJIIIZ("shoot_way", "ai_avatar");
        LIZ2.LJIIIZ("enter_method", str);
        LIZ2.LJIIIZ("enter_from", str2);
        FMX.LJIIL("shoot", LIZ2.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        String value = EnumC72412SbQ.UPLOAD_CONFIRM_POP_UP.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(EnumC72414SbS.ACTION_TYPE.getValue(), str);
        c188727au.LJIIIZ(EnumC72414SbS.AIGC_TYPE.getValue(), str2);
        FMX.LJIIL(value, c188727au.LIZ);
    }
}
