package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176776wj {
    public static ActivityC45651qj LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            return LJJIFFI;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZJ(((ContextWrapper) context).getBaseContext());
    }

    public static CommentListPageFragment LIZLLL(Context context) {
        ActivityC45651qj LIZJ = LIZJ(context);
        if (LIZJ == null) {
            return null;
        }
        Fragment LJJJIL = LIZJ.getSupportFragmentManager().LJJJIL("comment_page");
        if (!(LJJJIL instanceof CommentListPageFragment)) {
            return null;
        }
        return (CommentListPageFragment) LJJJIL;
    }

    public static void LJFF(C174366sq c174366sq, Aweme aweme) {
        User user;
        String str;
        CommentSuggestWordList commentSuggestWordList;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        int LIZ = C176746wg.LIZ();
        int LIZ2 = C177126xI.LIZ();
        int LIZ3 = C176306vy.LIZ();
        if (!C176026vW.LIZ() || aweme == null || (commentSuggestWordList = aweme.getCommentSuggestWordList()) == null || (str = commentSuggestWordList.jsonStringToServer()) == null) {
            str = "";
        }
        CommentApi.LJ(LIZ, 300000, 1000, LIZ2, LIZ3, C76D.LIZ(user, c174366sq.getEventType()), aweme, c174366sq.getInsertCids(), c174366sq.getEventType(), c174366sq.getEventType(), str);
    }

    public static CommentListPageFragment LIZ(ActivityC45651qj activityC45651qj, C174366sq c174366sq, Aweme aweme) {
        CommentListPageFragment commentListPageFragment;
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        Fragment LJJJIL = supportFragmentManager.LJJJIL("comment_page");
        if (LJJJIL instanceof CommentListPageFragment) {
            commentListPageFragment = (CommentListPageFragment) LJJJIL;
        } else {
            commentListPageFragment = null;
        }
        View findViewById = activityC45651qj.findViewById(R.id.bkx);
        if (commentListPageFragment != null && findViewById != null) {
            String eventType = c174366sq.getEventType();
            o.LJIIIIZZ(eventType, "pageParam.eventType");
            C176786wk.LIZ(false, eventType, new C176816wn(c174366sq, aweme));
            commentListPageFragment.LLIFFJFJJ(aweme);
            commentListPageFragment.Sl(c174366sq);
            commentListPageFragment.show();
            return commentListPageFragment;
        }
        String eventType2 = c174366sq.getEventType();
        o.LJIIIIZZ(eventType2, "pageParam.eventType");
        C176786wk.LIZ(true, eventType2, new C176816wn(c174366sq, aweme));
        C174676tL c174676tL = C176096vd.LJFF;
        c174676tL.LIZIZ();
        c174676tL.LIZIZ = System.currentTimeMillis();
        if (commentListPageFragment != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(commentListPageFragment);
            c1b3.LJI();
        }
        if (findViewById == null) {
            FrameLayout frameLayout = new FrameLayout(activityC45651qj);
            frameLayout.setId(R.id.bkx);
            ((ViewGroup) activityC45651qj.findViewById(android.R.id.content)).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        CommentListPageFragment LJ = LJ(c174366sq, aweme, activityC45651qj);
        LJ.LLIFFJFJJ(aweme);
        C1B3 c1b32 = new C1B3(supportFragmentManager);
        c1b32.LJIIIIZZ(R.id.bkx, 1, LJ, "comment_page");
        c1b32.LJI();
        if ((C176826wo.LIZ() & 1) == 1) {
            LJFF(c174366sq, aweme);
        }
        return LJ;
    }

    public static CommentListPageFragment LIZIZ(Fragment fragment, Aweme aweme, C174366sq c174366sq) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return null;
        }
        Fragment LJJJIL = fragmentManager.LJJJIL("comment_page");
        if ((LJJJIL instanceof CommentListPageFragment) && LJJJIL != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(LJJJIL);
            c1b3.LJI();
        }
        String eventType = c174366sq.getEventType();
        o.LJIIIIZZ(eventType, "pageParam.eventType");
        C176786wk.LIZ(true, eventType, new C176816wn(c174366sq, aweme));
        CommentListPageFragment LJ = LJ(c174366sq, aweme, fragment.getContext());
        LJ.LLIFFJFJJ(aweme);
        C1B3 c1b32 = new C1B3(fragmentManager);
        c1b32.LJIIIIZZ(R.id.dd9, 1, LJ, "comment_page");
        c1b32.LJI();
        return LJ;
    }

    public static CommentListPageFragment LJ(C174366sq c174366sq, Aweme aweme, Context context) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("id", c174366sq);
        if ((C175236uF.LIZ() & 1) == 1) {
            C71Y.LIZLLL("CommentViewPreloadV2", "try preload comment");
            C16970lZ.LJ(R.layout.pi, context);
            C176746wg.LIZIZ(c174366sq, aweme, context);
        }
        if (C71K.LIZIZ()) {
            C16970lZ.LJ(R.layout.qf, context);
        }
        if ((C176826wo.LIZ() & 2) == 2) {
            C16970lZ.LJ(R.layout.pj, context);
        }
        if (C176826wo.LIZIZ()) {
            C16970lZ.LJ(R.layout.q4, context);
            C16970lZ.LJ(R.layout.q6, context);
            C16970lZ.LJ(R.layout.q7, context);
        }
        CommentListPageFragment commentListPageFragment = new CommentListPageFragment();
        commentListPageFragment.setArguments(bundle);
        return commentListPageFragment;
    }
}
