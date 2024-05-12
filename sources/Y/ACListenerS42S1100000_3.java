package Y;

import X.C188727au;
import X.C55096Ljo;
import X.FMX;
import X.InterfaceC221448ma;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssem;

/* loaded from: classes4.dex */
public class ACListenerS42S1100000_3 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
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
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((CommentManagementTitleAssem) aCListenerS42S1100000_3.l1).H3(aCListenerS42S1100000_3.s0);
    }

    public static final void onClick$1(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(C55096Ljo.LJIIIIZZ((CommentManagementTitleAssem) aCListenerS42S1100000_3.l1), "//filtercomments/dislike");
        buildRoute.withParam("enter_from", aCListenerS42S1100000_3.s0);
        buildRoute.open();
    }

    public static final void onClick$10(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        CommentListFragment.nm((CommentListFragment) aCListenerS42S1100000_3.l1, aCListenerS42S1100000_3.s0);
    }

    public static final void onClick$2(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(((UIAssem) aCListenerS42S1100000_3.l1).getContext(), "//webview");
        buildRoute.withParam(UriProtector.parse(aCListenerS42S1100000_3.s0).buildUpon().appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").build());
        buildRoute.open();
    }

    public static final void onClick$3(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().rv0(aCListenerS42S1100000_3.s0);
        InterfaceC221448ma quickReplyAnalytics = ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().mv0().getQuickReplyAnalytics();
        String str = ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().LJLJI;
        if (str == null) {
            str = "";
        }
        quickReplyAnalytics.LIZ(str, "emoji", ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().ov0());
    }

    public static final void onClick$4(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().rv0(aCListenerS42S1100000_3.s0);
        InterfaceC221448ma quickReplyAnalytics = ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().mv0().getQuickReplyAnalytics();
        String str = ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().LJLJI;
        if (str == null) {
            str = "";
        }
        quickReplyAnalytics.LIZ(str, "emoji", ((VideoExposeSharerInformationAssem) aCListenerS42S1100000_3.l1).q4().ov0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0063, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004d, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e8, code lost:
    
        if (r2 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$5(Y.ACListenerS42S1100000_3 r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS42S1100000_3.onClick$5(Y.ACListenerS42S1100000_3, android.view.View):void");
    }

    public static final void onClick$6(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).z4(aCListenerS42S1100000_3.s0);
        InterfaceC221448ma quickReplyAnalytics = ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).q4().getQuickReplyAnalytics();
        QuickDMEntranceAssem quickDMEntranceAssem = (QuickDMEntranceAssem) aCListenerS42S1100000_3.l1;
        String str = quickDMEntranceAssem.LLIFFJFJJ;
        if (str == null) {
            str = "";
        }
        quickReplyAnalytics.LIZ(str, "emoji", quickDMEntranceAssem.r4().ov0());
    }

    public static final void onClick$7(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).z4(aCListenerS42S1100000_3.s0);
        InterfaceC221448ma quickReplyAnalytics = ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).q4().getQuickReplyAnalytics();
        String str = ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).r4().LJLJI;
        if (str == null) {
            str = "";
        }
        quickReplyAnalytics.LIZ(str, "emoji", ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).r4().ov0());
    }

    public static final void onClick$8(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).z4(aCListenerS42S1100000_3.s0);
        InterfaceC221448ma quickReplyAnalytics = ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).q4().getQuickReplyAnalytics();
        String str = ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).r4().LJLJI;
        if (str == null) {
            str = "";
        }
        quickReplyAnalytics.LIZ(str, "emoji", ((QuickDMEntranceAssem) aCListenerS42S1100000_3.l1).r4().ov0());
    }

    public static final void onClick$9(ACListenerS42S1100000_3 aCListenerS42S1100000_3, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aCListenerS42S1100000_3.l1, "aweme://display/caption/setting");
        buildRoute.withParam("enter_method", "subtitle_bottom_banner");
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", aCListenerS42S1100000_3.s0);
        c188727au.LJIIIZ("enter_method", "subtitle_bottom_banner");
        FMX.LJIIL("enter_language_setting", c188727au.LIZ);
    }

    public ACListenerS42S1100000_3(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
