package X;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.ui.CommentListFragment;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.75h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801775h {
    public static void LIZ(ActivityC45651qj activityC45651qj, Aweme aweme, String str, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str2, boolean z2, Long l) {
        AbsFragment absFragment;
        long j;
        Fragment LJJJIL;
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String tag = C1801875i.LIZIZ(activityC45651qj, aid);
        InteractionFragment interactionFragment = (InteractionFragment) supportFragmentManager.LJJJIL(tag);
        if (interactionFragment == null) {
            if (C1801875i.LIZ().size() == 5 && (LJJJIL = supportFragmentManager.LJJJIL((String) C1801875i.LIZ().poll())) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
            InteractionFragment interactionFragment2 = new InteractionFragment();
            interactionFragment2.LJLILLLLZI = aweme;
            interactionFragment2.LJLLLL = str;
            interactionFragment2.LJLLJ = nowFeedMobHierarchyData;
            interactionFragment2.LJLLLLLL = z;
            interactionFragment2.LJLZ = comment;
            interactionFragment2.LJLLL = num;
            interactionFragment2.LJZ = str2;
            interactionFragment2.LJZI = z2;
            String aid2 = aweme.getAid();
            o.LJIIIIZZ(aid2, "aweme.aid");
            C1795572x LIZ = C1795672y.LIZ(aid2);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            LIZ.LIZ = j;
            LIZ.LIZIZ = System.currentTimeMillis();
            LIZ.LJFF = str2;
            o.LJIIIZ(tag, "tag");
            C1801875i.LIZ().add(tag);
            if (C1801875i.LIZ().size() == 0) {
                Keva repo = Keva.getRepo("interaction_like_count");
                o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_LIKE_COUNT)");
                C1802675q.LIZ(repo);
                Keva repo2 = Keva.getRepo("interaction_comment_count");
                o.LJIIIIZZ(repo2, "getRepo(KEVA_REPO_COMMENT_COUNT)");
                C1802675q.LIZ(repo2);
            }
            C1B3 c1b32 = new C1B3(supportFragmentManager);
            c1b32.LJIIIIZZ(R.id.content, 1, interactionFragment2, tag);
            c1b32.LJI();
            return;
        }
        interactionFragment.LJLILLLLZI = aweme;
        interactionFragment.LJLLJ = nowFeedMobHierarchyData;
        interactionFragment.LJLLL = num;
        interactionFragment.LJZ = str2;
        interactionFragment.show();
        if (!z) {
            return;
        }
        List<AbsFragment> list = interactionFragment.LJLJLLL;
        if (list != null) {
            absFragment = (AbsFragment) ListProtector.get(list, 0);
        } else {
            absFragment = null;
        }
        o.LJII(absFragment, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.ui.CommentListFragment");
        CommentListFragment commentListFragment = (CommentListFragment) absFragment;
        commentListFragment.wl().jv0(comment, commentListFragment.LJZ);
    }
}
