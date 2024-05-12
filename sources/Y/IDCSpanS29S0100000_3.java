package Y;

import X.AGJ;
import X.ActivityC45651qj;
import X.C188487aW;
import X.C188517aZ;
import X.C188727au;
import X.C210268Na;
import X.C47261Igj;
import X.C74R;
import X.EF7;
import X.FMX;
import X.InterfaceC65784Pro;
import X.NOE;
import X.NPC;
import X.NU0;
import X.O0X;
import X.O0Z;
import X.T5S;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomDefaultCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public class IDCSpanS29S0100000_3 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
            case 3:
            default:
                super.updateDrawState(textPaint);
                return;
            case 4:
                updateDrawState$2(this, textPaint);
                return;
            case 5:
                updateDrawState$3(this, textPaint);
                return;
            case 6:
                updateDrawState$4(this, textPaint);
                return;
            case 7:
                textPaint.setUnderlineText(false);
                return;
            case 8:
                updateDrawState$6(this, textPaint);
                return;
        }
    }

    public IDCSpanS29S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        o.LJIIIZ(widget, "widget");
        UrlModel urlModel = (UrlModel) iDCSpanS29S0100000_3.l0;
        if (urlModel != null) {
            ArrayList LJII = C47261Igj.LJII(urlModel);
            SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//comment/photo_detail");
            buildRoute.withParam("image_uri", LJII);
            buildRoute.withParam("enter_from", "notification_page");
            buildRoute.withParam("source", "inbox_notice");
            buildRoute.open();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("source", "inbox_notice");
        FMX.LJIIL("full_screen_view_photo", c188727au.LIZ);
    }

    public static final void onClick$1(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        o.LJIIIZ(widget, "widget");
        a.LJ().jumpToAgsStatusPage((Context) iDCSpanS29S0100000_3.l0, "float_comment");
    }

    public static final void onClick$2(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        o.LJIIIZ(widget, "widget");
        ((InterfaceC65784Pro) iDCSpanS29S0100000_3.l0).invoke();
    }

    public static final void onClick$3(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        o.LJIIIZ(widget, "widget");
        Aweme aweme = ((AdFakeUserProfileVideoNewDescWidget) iDCSpanS29S0100000_3.l0).LJLJLJ;
        ActivityC45651qj activityC45651qj = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd2.getOpenUrl();
        } else {
            str = null;
        }
        if (!NPC.LJI(str)) {
            Aweme aweme2 = ((AdFakeUserProfileVideoNewDescWidget) iDCSpanS29S0100000_3.l0).LJLJLJ;
            if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                str2 = awemeRawAd.getType();
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, "app")) {
                Fragment fragment = ((AdFakeUserProfileVideoNewDescWidget) iDCSpanS29S0100000_3.l0).LJLJLLL;
                if (fragment != null) {
                    activityC45651qj = fragment.mo49getActivity();
                }
                NU0.LIZ(activityC45651qj);
                return;
            }
        }
        AdFakeUserProfileVideoNewDescWidget adFakeUserProfileVideoNewDescWidget = (AdFakeUserProfileVideoNewDescWidget) iDCSpanS29S0100000_3.l0;
        NOE.LJJIIJ(adFakeUserProfileVideoNewDescWidget.LJLIL, adFakeUserProfileVideoNewDescWidget.LJLJLJ, 37, new C74R() { // from class: X.7xT
        });
    }

    public static final void onClick$4(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View view) {
        o.LJIIIZ(view, "view");
        SmartRoute buildRoute = SmartRouter.buildRoute(((C210268Na) iDCSpanS29S0100000_3.l0).getContext(), "//privacy/suggest_account");
        buildRoute.withParam("enter_from", "homepage_friends");
        buildRoute.withParam("previous_page", "homepage_friends");
        buildRoute.withParam("is_rec", 1);
        buildRoute.open();
    }

    public static final void onClick$5(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = ((BottomDefaultCommentAssem) iDCSpanS29S0100000_3.l0).getContext();
        if (context != null) {
            a.LJ().jumpToAgsStatusPage(context, "float_comment");
        }
    }

    public static final void onClick$6(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = ((BottomMusicShootCommentAssem) iDCSpanS29S0100000_3.l0).getContext();
        if (context != null) {
            a.LJ().jumpToAgsStatusPage(context, "float_comment");
        }
    }

    public static final void onClick$7(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View view) {
        a.LJ().jumpToAgsStatusPage(((CommentInputFragment) iDCSpanS29S0100000_3.l0).getContext(), "float_comment");
    }

    public static final void onClick$8(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, View view) {
        o.LJIIIZ(view, "view");
        ((C188487aW) iDCSpanS29S0100000_3.l0).getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "recharge_panel");
        FMX.LJIIL("click_recharge_learn_more", c188727au.LIZ);
        if (C188517aZ.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.GIFT_RECHARGE_PAGE.getValue(), "virtual-items", true, false, 20), new O0Z() { // from class: X.7aY
                    @Override // X.O0Z
                    public final void onComplete() {
                    }
                });
                return;
            }
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(((C188487aW) iDCSpanS29S0100000_3.l0).LIZIZ, "aweme://webview");
        buildRoute.withParam(UriProtector.parse("https://www.tiktok.com/legal/virtual-items"));
        buildRoute.open();
    }

    public static final void updateDrawState$0(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$3(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$4(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$6(IDCSpanS29S0100000_3 iDCSpanS29S0100000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }
}
