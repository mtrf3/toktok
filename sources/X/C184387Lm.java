package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184387Lm {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(Context context) {
        String quantityString = context.getResources().getQuantityString(R.plurals.cb, 0, C77123UOp.LJJIIJ(0L));
        o.LJIIIIZZ(quantityString, "context.resources\n      …ayCount(0),\n            )");
        return quantityString;
    }

    public static int LJ(ActivityC45651qj activityContext) {
        o.LJIIIZ(activityContext, "activityContext");
        Rect rect = new Rect();
        Window window = activityContext.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        View findViewById = window.findViewById(android.R.id.content);
        if (findViewById != null) {
            int top = i - findViewById.getTop();
            if (top == 0 || top < 0) {
                return C63081OpJ.LJJJJLI(activityContext);
            }
            return top;
        }
        return C63081OpJ.LJJJJLI(activityContext);
    }

    public static TuxTextView LJFF(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextSize(14.0f);
        tuxTextView.setGravity(17);
        tuxTextView.setAlpha(0.5f);
        return tuxTextView;
    }

    public static boolean LJI(Aweme aweme) {
        CommentService.LIZ.getClass();
        if (CommentServiceImpl.LJJL().LJIILLIIL(aweme)) {
            return true;
        }
        if (aweme != null && aweme.isCmtSwt()) {
            return true;
        }
        return false;
    }

    public static CharSequence LIZLLL(Context ctx, Aweme aweme) {
        o.LJIIIZ(ctx, "ctx");
        if (aweme == null) {
            return "";
        }
        C174366sq c174366sq = new C174366sq(aweme.getAid());
        c174366sq.setCommentClose(true);
        return C178406zM.LIZLLL(ctx, aweme, c174366sq);
    }

    public static void LJII(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (!o.LJ(view.getParent(), viewGroup)) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(view, viewGroup2);
            }
            viewGroup.addView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(RelationButton relationButton, User user, C200847uS c200847uS) {
        PostModeDetailParams postModeDetailParams;
        Aweme aweme = null;
        if (c200847uS != null) {
            aweme = c200847uS.LIZJ;
            postModeDetailParams = c200847uS.LJI;
        } else {
            postModeDetailParams = null;
        }
        LIZIZ(relationButton, user, new FullPageParam(aweme, postModeDetailParams, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0));
    }

    public static void LIZIZ(RelationButton relationButton, User user, FullPageParam param) {
        PostModeDetailParams postModeDetailParams;
        o.LJIIIZ(param, "param");
        Aweme aweme = param.getAweme();
        if (aweme == null || (postModeDetailParams = param.getPostModeDetailParams()) == null) {
            return;
        }
        String uid = user.getUid();
        HG3.LJIIL();
        if (TextUtils.equals(uid, HG3.LJLJL.LJFF().getCurUserId())) {
            relationButton.setVisibility(8);
            return;
        }
        relationButton.setVisibility(0);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = user;
        Context context = relationButton.getContext();
        o.LJIIIIZZ(context, "context");
        c226668v0.LJIIIZ = C57434MgQ.LIZIZ(context);
        Context context2 = relationButton.getContext();
        o.LJIIIIZZ(context2, "context");
        c226668v0.LJIIJ = C57434MgQ.LIZJ(context2);
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        relationButton.setTracker(new AqS150S0200000_3(aweme, postModeDetailParams, 57));
    }
}
