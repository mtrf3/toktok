package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.OoP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63025OoP {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("comment_filter_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static void LIZ(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        boolean z = settings.commentFilterDislikeDisableAutomaticLevel;
        Keva keva = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("comment_dislike_filter_disable_automatic_level_");
        LIZ2.append(C71945SLl.LIZIZ());
        keva.storeBoolean(X1D.LIZIZ(LIZ2), z);
        int i = settings.commentFilterDislikeOffensive;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("comment_dislike_filter_offensive_");
        LIZ3.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ3), i);
        int i2 = settings.commentFilterDislikeProfanity;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("comment_dislike_filter_profanity_");
        LIZ4.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ4), i2);
        int i3 = settings.commentFilterDislikeSpam;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("comment_dislike_filter_spam_");
        LIZ5.append(C71945SLl.LIZIZ());
        keva.storeInt(X1D.LIZIZ(LIZ5), i3);
    }
}
