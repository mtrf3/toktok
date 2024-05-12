package X;

import com.bytedance.keva.Keva;
import defpackage.i0;

/* renamed from: X.7IK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IK {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C7IL.LJLIL);

    public static Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static int LIZIZ() {
        return LIZJ().getInt(LIZ("digg_not_upvote_time_"), 0);
    }

    public static int LIZLLL() {
        return LIZJ().getInt(LIZ("share_or_comment_upvote_time_"), 0);
    }

    public static int LJ() {
        return LIZJ().getInt(LIZ("video_loop_not_upvote_time_"), 0);
    }

    public static String LIZ(String str) {
        return i0.LJFF(str, ((RBX) HG3.LJIILL()).getCurUserId());
    }

    public static void LJFF(int i) {
        LIZJ().storeInt(LIZ("digg_not_upvote_time_"), i);
    }

    public static void LJI(int i) {
        LIZJ().storeInt(LIZ("share_or_comment_upvote_time_"), i);
    }

    public static void LJII(int i) {
        LIZJ().storeInt(LIZ("video_loop_not_upvote_time_"), i);
    }
}
