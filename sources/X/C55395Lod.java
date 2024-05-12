package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.experiment.AnalyticsSDUISetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InsightsEligibilityStatus;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lod, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55395Lod implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_line_chart;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_line_chart_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.hhx;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "insight";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return !this.LJLILLLLZI.getInsightsEligibilityStatus().isIneligible();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!enable()) {
            InsightsEligibilityStatus insightsEligibilityStatus = this.LJLILLLLZI.getInsightsEligibilityStatus();
            if (insightsEligibilityStatus == null) {
                return;
            }
            int i = C55394Loc.LIZ[insightsEligibilityStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                c26045AKb.LJIIIIZZ(R.string.e_6);
                c26045AKb.LJIIJ();
                return;
            }
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLIL);
            c26045AKb2.LJIIIIZZ(R.string.e_5);
            c26045AKb2.LJIIJ();
            return;
        }
        String aid = this.LJLILLLLZI.getAid();
        if (aid == null || aid.length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://inapp.tiktokv.com/web-inapp/analytics/video/");
        LIZ.append(this.LJLILLLLZI.getAid());
        LIZ.append("?hide_nav_bar=1&__status_bar=true&should_full_screen=1&status_bar_height=");
        LIZ.append(C60191Njn.LIZ(44));
        String LIZIZ = X1D.LIZIZ(LIZ);
        AnalyticsSDUISetting.H5AnalyticsInfoStructJsonModel LIZ2 = AnalyticsSDUISetting.LIZ();
        if (AG9.LIZ() && LIZ2 != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2.detailEntryURL);
            LIZ3.append(this.LJLILLLLZI.getAid());
            LIZ3.append(LIZ2.queryParams);
            LIZ3.append("&status_bar_height=");
            LIZ3.append(C60191Njn.LIZ(44));
            LIZIZ = X1D.LIZIZ(LIZ3);
        }
        if (TextUtils.isEmpty(LIZIZ)) {
            return;
        }
        InsightsEligibilityStatus insightsEligibilityStatus2 = this.LJLILLLLZI.getInsightsEligibilityStatus();
        o.LJIIIIZZ(insightsEligibilityStatus2, "aweme.insightsEligibilityStatus");
        String eventParam = insightsEligibilityStatus2.getEventParam();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("panel_source", this.LJLJI);
        c188727au.LJIIIZ("enter_from", "video_more");
        c188727au.LJIIIZ("group_id", this.LJLILLLLZI.getGroupId());
        if (eventParam != null) {
            c188727au.LJI("button_status", eventParam);
        }
        C188727au LIZIZ2 = C44847Hit.LIZIZ("click_insight", c188727au.LIZ, "enter_from", "video_more");
        LIZIZ2.LJIIIZ("group_id", this.LJLILLLLZI.getGroupId());
        FMX.LJIIL("enter_insight_detail", LIZIZ2.LIZ);
        if (AG9.LIZ() && LIZ2 != null) {
            SmartRouter.buildRoute(context, LIZIZ).open();
        } else {
            ShareDependService.LIZ.getClass();
            C44498HdG.LIZ().LJJIJL(context, LIZIZ);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C55395Lod(Activity activity, Aweme aweme, String panelSource) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = panelSource;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
