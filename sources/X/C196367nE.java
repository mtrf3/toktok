package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowForcedVisibility;
import com.ss.android.ugc.aweme.now.NowPostConsumptionInfo;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196367nE {
    public static final C196367nE LIZ = new C196367nE();
    public static C1M5 LIZIZ;

    public static Bitmap.Config LIZIZ() {
        if (C19N.LJ("now_enable_argb_8888", true) && Build.VERSION.SDK_INT >= 24) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGB_565;
    }

    public static RotateAnimation LIZLLL() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1000L);
        return rotateAnimation;
    }

    public static boolean LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (C7O9.LIZ() == 2 && C54218LPq.LJLIL.LIZ() && !C78966Uyw.LJJIJ().LIZIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        if (!LJI(authorUid) && aweme.getAuthor() != null && ((aweme.getAuthor().getFollowStatus() == 0 || aweme.getAuthor().getFollowStatus() == 4) && aweme.getAuthor().getFollowerStatus() == 1)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        String recType;
        o.LJIIIZ(aweme, "aweme");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        if (LJI(authorUid) || (author = aweme.getAuthor()) == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || (recType = matchedFriendStruct.getRecType()) == null || recType.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJI(String uid) {
        o.LJIIIZ(uid, "uid");
        return o.LJ(uid, ((RBX) HG3.LJIILL()).getCurUserId());
    }

    public static boolean LJII(Aweme aweme) {
        NowPostInfo nowPostInfo;
        NowPostConsumptionInfo nowPostConsumptionInfo;
        NowForcedVisibility nowForcedVisibility;
        if (MWW.LIZIZ() || aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (nowPostConsumptionInfo = nowPostInfo.getNowPostConsumptionInfo()) == null || (nowForcedVisibility = nowPostConsumptionInfo.getNowForcedVisibility()) == null || nowForcedVisibility.getState() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(C7ML c7ml) {
        Aweme aweme;
        if (c7ml != null) {
            aweme = c7ml.getAweme();
        } else {
            aweme = null;
        }
        return LJII(aweme);
    }

    public static boolean LJIIIZ(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        String authorUid = item.getAweme().getAuthorUid();
        o.LJIIIIZZ(authorUid, "item.aweme.authorUid");
        if (!LJI(authorUid) || C78966Uyw.LJJIJ().LIZIZ() || C7O9.LIZ() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        if (LJI(authorUid) || aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 1 || aweme.getAuthor().getFollowerStatus() != 0) {
            String authorUid2 = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid2, "aweme.authorUid");
            if (LJI(authorUid2) || aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 4 || aweme.getAuthor().getFollowerStatus() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        if (!LJI(authorUid) && aweme.getAuthor() != null && aweme.getAuthor().getFollowStatus() == 0) {
            return true;
        }
        return false;
    }

    public static Drawable LIZJ(Context context, float f) {
        C1M5 c1m5 = LIZIZ;
        if (c1m5 == null) {
            C1M5 c1m52 = new C1M5(context.getResources(), BitmapFactory.decodeResource(context.getResources(), R.drawable.btr));
            LIZIZ = c1m52;
            c1m52.LIZJ(f);
            return c1m52;
        }
        return c1m5;
    }
}
