package Y;

import X.A94;
import X.ACN;
import X.ACR;
import X.AK4;
import X.C188727au;
import X.C25849ACn;
import X.C25860ACy;
import X.C26045AKb;
import X.C2U8;
import X.C86670Xzu;
import X.FMX;
import X.HG3;
import X.RBX;
import X.X1D;
import X.Y2B;
import X.Y2G;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.cla.et.newet.ExpandSubtitleEvent;
import com.ss.android.ugc.aweme.cla.et.newet.HideSubtitleEvent;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.setting.IncentiveSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class ACListenerS21S0210000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS21S0210000_4 aCListenerS21S0210000_4, View view) {
        int i;
        ((C25849ACn) aCListenerS21S0210000_4.l0).LJIIJ(ACN.LJLIL);
        boolean z = ((C25849ACn) aCListenerS21S0210000_4.l0).LJFF().LJZI;
        if (C86670Xzu.LJJIIJZLJL(((CaptionsPanelFragment) aCListenerS21S0210000_4.l1).xl().LIZ.getAweme())) {
            AK4.LIZ().LJIIJJI(z);
        } else {
            AK4.LIZ().LJJJ(z);
            if (AK4.LIZ().LJJIIZI()) {
                ((CaptionsPanelFragment) aCListenerS21S0210000_4.l1).xl().LIZ.V4(Y2B.COMBINE_ENTRANCE_MASTER_TOGGLE);
            }
        }
        if (z) {
            ((CaptionsPanelFragment) aCListenerS21S0210000_4.l1).xl().LIZ.O();
        }
        C2U8.LIZ(new ACR());
        if (z) {
            if (aCListenerS21S0210000_4.z2) {
                i = R.string.gii;
            } else {
                i = R.string.dcl;
            }
            C26045AKb c26045AKb = new C26045AKb((CaptionsPanelFragment) aCListenerS21S0210000_4.l1);
            c26045AKb.LJIIIIZZ(i);
            c26045AKb.LJIIJ();
        } else {
            C26045AKb c26045AKb2 = new C26045AKb((CaptionsPanelFragment) aCListenerS21S0210000_4.l1);
            c26045AKb2.LJIIIIZZ(R.string.gih);
            c26045AKb2.LJIIJ();
        }
        if (z) {
            CaptionsPanelFragment captionsPanelFragment = (CaptionsPanelFragment) aCListenerS21S0210000_4.l1;
            captionsPanelFragment.getClass();
            Y2G.LJ(ExpandSubtitleEvent.class, captionsPanelFragment.xl().LIZ.v2(), null, 12);
        } else {
            CaptionsPanelFragment captionsPanelFragment2 = (CaptionsPanelFragment) aCListenerS21S0210000_4.l1;
            captionsPanelFragment2.getClass();
            Y2G.LJ(HideSubtitleEvent.class, captionsPanelFragment2.xl().LIZ.v2(), null, 12);
        }
    }

    public static final void onClick$1(ACListenerS21S0210000_4 aCListenerS21S0210000_4, View view) {
        CreatorToolsActivity creatorToolsActivity = (CreatorToolsActivity) aCListenerS21S0210000_4.l0;
        boolean z = aCListenerS21S0210000_4.z2;
        creatorToolsActivity.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", creatorToolsActivity.getEnterFrom());
        c188727au.LJIIIZ("enter_entrance", "settings_page");
        c188727au.LJFF(Boolean.valueOf(z), "cf_button_type");
        c188727au.LJIIIZ("process_id", creatorToolsActivity.LJLIL);
        FMX.LJIIL("click_creator_fund", c188727au.LIZ);
        Keva repo = Keva.getRepo("keva_repo_tiktok_incentive");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_tiktok_incentive_red_dot");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        repo.storeBoolean(X1D.LIZIZ(LIZ), false);
        SmartRoute buildRoute = SmartRouter.buildRoute((CreatorToolsActivity) aCListenerS21S0210000_4.l0, ((IncentiveSetting) aCListenerS21S0210000_4.l1).schemaUrl);
        buildRoute.withParam("bundle_video_gift_previous_page", "creator_tools");
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
        C25860ACy c25860ACy = ((CreatorToolsActivity) aCListenerS21S0210000_4.l0).LLIFFJFJJ;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(A94.LJLIL);
        }
    }

    public ACListenerS21S0210000_4(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
