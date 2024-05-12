package X;

/* renamed from: X.Jdn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49627Jdn {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return C50234Jna.LIZ("search_tikbot").getBoolean("has_enter_chat_success", false);
    }

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("user_enter_time-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }
}
