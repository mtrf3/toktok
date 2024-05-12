package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.AqS8S2000000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198667qw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(ActivityC45651qj activityC45651qj, EnumC198697qz scene) {
        String str;
        String str2;
        o.LJIIIZ(scene, "scene");
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            C7XD.LJ("InteractionDialogManager", "fragmentActivity is null or isFinishing");
            return;
        }
        if (scene == EnumC198697qz.FFP) {
            str = "now_find_friends_page";
        } else {
            str = "homepage_now";
        }
        int i = C198687qy.LIZ[scene.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                str2 = "";
            } else {
                str2 = "onboarding";
            }
        } else {
            str2 = "top_button";
        }
        C7MK.LJII("click_invite_button", new AqS8S2000000_3(str, str2, 2));
        ShareService shareService = C4LD.LIZ;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        shareService.LJJJJLI(activityC45651qj, new C86K(str, str2, curUser));
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, EnumC198697qz scene, String str) {
        String str2;
        o.LJIIIZ(scene, "scene");
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            C7XD.LJ("InteractionDialogManager", "fragmentActivity is null or isFinishing");
            return;
        }
        if (scene == EnumC198697qz.FFP) {
            str2 = "now_find_friends_page";
        } else {
            str2 = "homepage_now";
        }
        C7MK.LJII("qr_code_icon", new AqS28S1000000_3(str2, 9));
        C7MK.LJII("enter_qr_code_page", new AqS8S2000000_3(str2, str, 1));
        C4LD.LIZ.LJFF(activityC45651qj, "now", str2, str);
    }

    public static void LIZ(Aweme aweme, ActivityC45651qj fragmentActivity, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str, int i) {
        boolean z2;
        boolean z3 = z;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2 = nowFeedMobHierarchyData;
        Comment comment2 = comment;
        Integer num2 = num;
        String str2 = null;
        if ((i & 8) != 0) {
            nowFeedMobHierarchyData2 = null;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            comment2 = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) == 0) {
            str2 = str;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        CommentService.LIZ.getClass();
        CommentService LJJL = CommentServiceImpl.LJJL();
        o.LJIIIIZZ(LJJL, "Companion.get()");
        System.currentTimeMillis();
        LJJL.LJFF(fragmentActivity, aweme, null, nowFeedMobHierarchyData2, z3, comment2, num2, str2, z2);
    }
}
