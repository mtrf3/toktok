package X;

import Y.IDCSpanS29S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178406zM {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LJFF() {
        String LJJIIZI = TranslationServiceImpl.LJJIJ().LJJIIZI();
        if (LJJIIZI != null) {
            return LJJIIZI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean LJIIJJI() {
        if (CommentServiceImpl.LJJL().LJIIIIZZ() && C7GH.LJII()) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            C71Y.LIZ("CommentHelper", "canUseDynamicText aweme is null");
            return false;
        }
        if (aweme.getCommentConfig() == null) {
            C71Y.LIZ("CommentHelper", "canUseDynamicText commentConfig is null");
            return false;
        }
        if (aweme.isProhibited()) {
            C71Y.LIZ("CommentHelper", "canUseDynamicText isProhibited");
            return false;
        }
        if (C45804HyK.LJJJ(aweme)) {
            C71Y.LIZ("CommentHelper", "canUseDynamicText comment is close");
            return false;
        }
        if (!C45804HyK.LJIIIIZZ(aweme)) {
            C71Y.LIZ("CommentHelper", "canUseDynamicText can not comment");
            return false;
        }
        return true;
    }

    public static final SpannableStringBuilder LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(context.getString(R.string.dj2));
        LIZ2.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ2);
        String string = context.getString(R.string.tqv);
        o.LJIIIIZZ(string, "context.getString(R.string.view_details)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LIZIZ, string));
        spannableStringBuilder.setSpan(new IDCSpanS29S0100000_3(context, 1), LIZIZ.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.go, context)), LIZIZ.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), LIZIZ.length(), spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    public static final EnumC178426zO LIZJ(Aweme aweme) {
        if (C63081OpJ.LJLJLLL(aweme)) {
            return EnumC178426zO.FTC;
        }
        if (aweme != null) {
            if (!aweme.isCanPlay()) {
                return EnumC178426zO.UNAVAILABLE;
            }
            if (aweme.isDelete()) {
                return EnumC178426zO.DELETED;
            }
        }
        if (C80S.LJFF(aweme) && !C78996UzQ.LJJIIZI(aweme)) {
            return EnumC178426zO.PRIVATE;
        }
        if (!C78996UzQ.LJJIIZI(aweme) && C80S.LIZJ(aweme) && !C80S.LIZLLL(aweme)) {
            return EnumC178426zO.THIRD_PARTY;
        }
        if (aweme != null && aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
            return EnumC178426zO.UNPUBLISHED;
        }
        if (aweme != null) {
            if (C63081OpJ.LJLJJI(aweme)) {
                return EnumC178426zO.ADVERTISEMENT;
            }
            if (aweme.isProhibited()) {
                return EnumC178426zO.FORBIDDEN;
            }
        }
        if (LFH.LIZIZ.LIZLLL().LJIILJJIL().LLJJL(LJIIJ(aweme))) {
            return EnumC178426zO.DEFAULT;
        }
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if ((status != null && status.isAllowComment()) || C63081OpJ.LJJLIIIJLJLI(aweme)) {
                return EnumC178426zO.ALLOW_COMMENT;
            }
            if (C63081OpJ.LJJLIIIJLJLI(aweme)) {
                return EnumC178426zO.DEFAULT;
            }
        }
        return EnumC178426zO.NOT_ADX_AD;
    }

    public static final String LJIIIZ(Aweme aweme) {
        NowPostInfo nowPostInfo;
        String nowMediaType;
        if (LJIIJ(aweme)) {
            if (aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (nowMediaType = nowPostInfo.getNowMediaType()) == null) {
                return "";
            }
            return nowMediaType;
        }
        return "post";
    }

    public static final boolean LJIIJ(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        if (aweme.nowPostInfo != null) {
            z = true;
        } else {
            z = false;
        }
        if (!C54218LPq.LJLIL.LIZ() || !z) {
            return false;
        }
        return true;
    }

    public static final int LJ(C174386ss c174386ss, Comment comment) {
        List<Comment> list;
        int i = 0;
        if (c174386ss == null || comment == null) {
            return 0;
        }
        if (comment.getCommentType() == 2) {
            CommentReplyListItem LJII = c174386ss.LJII(comment.getReplyId());
            if (LJII != null && (list = LJII.mReplyComments) != null) {
                i = list.indexOf(comment);
            }
        } else {
            CommentReplyListItem LJII2 = c174386ss.LJII(comment.getCid());
            List<CommentReplyListItem> list2 = c174386ss.LIZ;
            if (list2 != null) {
                i = ((ArrayList) list2).indexOf(LJII2);
            }
        }
        return i + 1;
    }

    public static final String LJI(Aweme aweme, String defaultHint) {
        String nonZeroInputBoxText;
        AwemeStatistics statistics;
        o.LJIIIZ(defaultHint, "defaultHint");
        if (!LIZ(aweme)) {
            return defaultHint;
        }
        if (aweme != null) {
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null && statistics2.getCommentCount() == 0) {
                AwemeCommentConfig commentConfig = aweme.getCommentConfig();
                if (commentConfig != null) {
                    nonZeroInputBoxText = commentConfig.getZeroInputBoxText();
                    if (nonZeroInputBoxText != null) {
                        if (aweme != null) {
                            FMX.onEventV3("show_comment_guide_inputbox");
                        }
                        return nonZeroInputBoxText;
                    }
                }
            } else {
                AwemeCommentConfig commentConfig2 = aweme.getCommentConfig();
                if (commentConfig2 != null) {
                    nonZeroInputBoxText = commentConfig2.getNonZeroInputBoxText();
                    if (nonZeroInputBoxText != null && nonZeroInputBoxText.length() != 0) {
                        if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) {
                            FMX.onEventV3("show_comment_guide_inputbox");
                        }
                        return nonZeroInputBoxText;
                    }
                }
            }
        }
        return defaultHint;
    }

    public static final void LJIIL(final long j, final String str) {
        if (str == null) {
            return;
        }
        if (C178446zQ.LIZLLL) {
            C37179EiV.LIZ().postDelayed(new Runnable() { // from class: X.6w1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        AwemeService.LIZ().d6(j, str);
                        C2U8.LIZ(new C50420Jqa(str, Long.valueOf(j)));
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            }, 1000L);
        } else {
            AwemeService.LIZ().d6(j, str);
            C2U8.LIZ(new C50420Jqa(str, Long.valueOf(j)));
        }
    }

    public static final CharSequence LIZLLL(Context context, Aweme aweme, C174366sq params) {
        String string;
        AwemeCommentConfig commentConfig;
        String emptyListText;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(params, "params");
        if (params.isNoPermissionVideo()) {
            return C29822Bn8.LIZ(context, R.string.dkp, "context.resources.getStr…will_appear_comment_body)");
        }
        if (params.isCommentClose()) {
            if (AV1.LJIJI(aweme.getAuthorUid())) {
                string = context.getString(R.string.dks);
            } else {
                string = context.getString(R.string.dm_);
            }
            o.LJIIIIZZ(string, "if (UserUtils.isSelf(awe…d_off_hint)\n            }");
            if (!LIZ(aweme) || (commentConfig = aweme.getCommentConfig()) == null || (emptyListText = commentConfig.getEmptyListText()) == null || emptyListText.length() == 0) {
                return string;
            }
            return emptyListText;
        }
        CommentService.LIZ.getClass();
        if (!CommentServiceImpl.LJJL().LJJIJIIJI(aweme)) {
            return C29822Bn8.LIZ(context, R.string.dkp, "context.resources.getStr…will_appear_comment_body)");
        }
        if (AV1.LJIJI(aweme.getAuthorUid())) {
            return C29822Bn8.LIZ(context, R.string.dkp, "{\n            context.re…r_comment_body)\n        }");
        }
        return C29822Bn8.LIZ(context, R.string.dkm, "{\n            context.re…t_comment_body)\n        }");
    }

    public static final String LJIIIIZZ(String str, String str2, String str3) {
        boolean LJ = o.LJ(str3, "homepage_friends");
        StringBuilder LIZLLL = C00F.LIZLLL("getMainNameInComment isSocial->", LJ, " regionDiff->", true, " eventType->");
        LIZLLL.append(str3);
        C71Y.LIZ("CommentHelper", X1D.LIZIZ(LIZLLL));
        if (str3 == null || str3.length() == 0) {
        }
        return C56331M8x.LIZJ(str, str2, LJ, true);
    }

    public static final SpannableStringBuilder LJII(final ActivityC45651qj activity, Context context, final Aweme aweme, final long j) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.diy);
        o.LJIIIIZZ(string, "context.getString(R.stri…mment_area_reiview_guide)");
        String string2 = context.getString(R.string.diz);
        o.LJIIIIZZ(string2, "context.getString(R.stri…ment_area_reiview_portal)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C00F.LIZIZ(string, '\n', string2));
        int length = string.length() + 1;
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: X.7Ei
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                Aweme aweme2 = Aweme.this;
                if (aweme2 != null) {
                    long j2 = j;
                    Activity activity2 = activity;
                    FMX.LJIIL("filtered_comment_review_byvideo_ck", C169696lJ.LJ(j2, "comments_number").LIZ);
                    SmartRoute buildRoute = SmartRouter.buildRoute(activity2, "//webview");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("https://www.tiktok.com/inapp/filtered_comments/comments?aweme_id=");
                    LIZ2.append(aweme2.getAid());
                    LIZ2.append("&enable_report_optimization=1");
                    C0NY.LIZJ(buildRoute, "url", X1D.LIZIZ(LIZ2), "hide_nav_bar", true);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setUnderlineText(false);
            }
        }, length, length2, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C78886Uxe.LJJIFFI(R.attr.go, R.color.ck, context)), length, length2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 18);
        return spannableStringBuilder;
    }
}
