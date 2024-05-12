package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0200000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("Profile_publish_distribute_survey")
/* loaded from: classes8.dex */
public final class GHQ extends AbstractC56327M8t<View> {
    public final ViewStub LJLIL;
    public final int LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final int LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    public static final String LJIIIIZZ() {
        return AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().getLatestPublishedAwemeId();
    }

    public static final int LJIIIZ() {
        return AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown() ? 1 : 0;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    public final void LJIIJ(AKH akh) {
        String str;
        akh.LIZ.LJIIL = null;
        akh.LIZ();
        Bundle bundle = new Bundle();
        bundle.putString("enterFrom", "personal_homepage");
        bundle.putString("groupId", "");
        GHN.LIZ(bundle, this.LJLJI);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("author_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        c188727au.LJIIIZ("group_id", LJIIIIZZ());
        if (GHP.LIZ()) {
            str = "most_wanted_set";
        } else {
            str = "most_disappointed_set";
        }
        c188727au.LJIIIZ("survey_type", str);
        c188727au.LIZLLL(LJIIIZ(), "if_hit_quit");
        FMX.LJIIL("click_answer_author_survey_banner", c188727au.LIZ);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        String str;
        String str2;
        String str3;
        View findViewById;
        o.LJIIIZ(context, "context");
        ViewStub viewStub = this.LJLIL;
        if (viewStub != null) {
            if (viewStub.getParent() != null) {
                this.LJLIL.inflate();
            } else {
                this.LJLIL.setVisibility(0);
            }
            DistributeAuthorSurveyInfoModel LIZ = GHS.LIZ();
            if (LIZ != null) {
                ViewGroup rootView = (ViewGroup) this.LJLJI.findViewById(this.LJLILLLLZI);
                if (GHP.LIZ()) {
                    str = LIZ.mostWantedSetBannerTitle;
                } else {
                    str = LIZ.mostDisappointedSetBannerTitle;
                }
                if (GHP.LIZ()) {
                    str2 = LIZ.mostWantedSetBannerBtn;
                } else {
                    str2 = LIZ.mostDisappointedSetBannerBtn;
                }
                o.LJIIIIZZ(rootView, "rootView");
                AKH akh = new AKH(rootView);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_pen_on_doc;
                c2068389v.LIZIZ = ((Number) this.LJLJJL.getValue()).intValue();
                c2068389v.LIZJ = ((Number) this.LJLJJL.getValue()).intValue();
                akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
                A21 a21 = akh.LIZ;
                a21.LJFF = str2;
                a21.LIZIZ = LIZ.bannerShowMaxSeconds * 1000;
                akh.LIZ.LJIIIIZZ = C7MY.LIZIZ(-14);
                AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 333);
                A21 a212 = akh.LIZ;
                a212.LJIIL = aqS173S0100000_7;
                a212.LIZLLL = str;
                akh.LIZ.LJIIJJI = new Au2S15S0200000_7(this, akh, 1);
                akh.LIZJ();
                AKJ akj = akh.LJ;
                if (akj != null && (findViewById = akj.findViewById(R.id.btt)) != null) {
                    findViewById.setClickable(true);
                    C16880lQ.LJIIJ(new Au2S15S0200000_7(this, akh, 0), findViewById);
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                c188727au.LJIIIZ("author_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
                c188727au.LJIIIZ("group_id", LJIIIIZZ());
                if (GHP.LIZ()) {
                    str3 = "most_wanted_set";
                } else {
                    str3 = "most_disappointed_set";
                }
                c188727au.LJIIIZ("survey_type", str3);
                c188727au.LIZLLL(LJIIIZ(), "if_hit_quit");
                FMX.LJIIL("author_survey_banner_show", c188727au.LIZ);
                return akj;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GHQ(InterfaceC55643Lsd scene, ViewStub viewStub, int i, ActivityC45651qj activity) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = i;
        this.LJLJI = activity;
        this.LJLJJI = 210;
        this.LJLJJL = C221108m2.LIZIZ(GHR.LJLIL);
    }
}
