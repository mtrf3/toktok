package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.6ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178046ym {
    public static final C35979EAd<String, C174476t1> LIZ = new C35979EAd<>(200);

    static {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.6yp
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    C178046ym.LIZ.LIZ();
                    C71Y.LIZLLL("QuickCommentLikeHelper", "login or logout success, clear the cache");
                }
            }
        });
    }

    public static void LIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("position", str);
        c188727au.LJIIIZ("status", str2);
        FMX.LJIIL("show_reply_comment_button", c188727au.LIZ);
    }

    public static void LIZIZ(int i, String str, String repliedCid) {
        o.LJIIIZ(repliedCid, "repliedCid");
        if (str == null) {
            return;
        }
        LIZ.LIZLLL(str, new C174476t1(repliedCid, i));
    }
}
