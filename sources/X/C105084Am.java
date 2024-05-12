package X;

/* renamed from: X.4Am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105084Am {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "toUserId", "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("to_user_id", str);
        LIZJ.LIZIZ("auto_emoji_click", c1hq);
    }

    public static void LIZIZ(String str) {
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "toUserId", "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("to_user_id", str);
        LIZJ.LIZIZ("auto_emoji_show", c1hq);
    }
}
