package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C214348b8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8R2;
import X.C8R4;
import X.C8R5;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TAT;
import X.TBT;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;
import com.ss.android.ugc.aweme.utils.Au2S0S1200000_3;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractAuthorSurveyBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractAuthorSurveyBottomBarAssem extends BaseCellSlotComponent<InteractAuthorSurveyBottomBarAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public VideoItemParams LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(InteractAuthorSurveyBottomBarAssem.class, "surveyVM", "getSurveyVM()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/AuthorSurveyViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aag;
    }

    public InteractAuthorSurveyBottomBarAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AuthorSurveyViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1264), null, C8R5.INSTANCE, null, null);
    }

    public final void q4() {
        Aweme aweme;
        String aid;
        VideoItemParams videoItemParams = this.LLFII;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (aid = aweme.getAid()) != null) {
            ((AuthorSurveyViewModel) this.LLFZ.LIZ(this, LLI[0])).LJLIL.put(aid, Boolean.TRUE);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        AuthorSurveyBottomBarAssemTrigger.LLIIII.getClass();
        if (C8R2.LIZ(item)) {
            Y3().setVisibility(0);
            final String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            View Y3 = Y3();
            C16880lQ.LJIIJ(new Au2S0S1200000_3(Y3, currentUserID, this, 2), Y3);
            TextView textView = (TextView) Y3().findViewById(R.id.bzo);
            C8R4 surveyAfterPostService = AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService();
            o.LJIIIIZZ(surveyAfterPostService, "get().getService(IExtern…().surveyAfterPostService");
            DistributeAuthorSurveyInfoModel surveyConfiguration = surveyAfterPostService.getSurveyConfiguration();
            if (surveyConfiguration == null) {
                return;
            }
            if (surveyAfterPostService.isPositiveQuestionSet()) {
                str = surveyConfiguration.mostWantedSetBannerTitle;
            } else {
                str = surveyConfiguration.mostDisappointedSetBannerTitle;
            }
            textView.setText(str);
            View initUI$lambda$5 = Y3().findViewById(R.id.bzn);
            o.LJIIIIZZ(initUI$lambda$5, "initUI$lambda$5");
            C16880lQ.LJIIJ(new TAT() { // from class: X.8R3
                @Override // X.TAT
                public final void LIZ(View view) {
                    String str2;
                    Aweme aweme;
                    String groupId;
                    Aweme aweme2;
                    if (view != null) {
                        InteractAuthorSurveyBottomBarAssem.this.Y3().setVisibility(8);
                        InteractAuthorSurveyBottomBarAssem.this.q4();
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "video_detail");
                        c188727au.LJIIIZ("author_id", currentUserID);
                        VideoItemParams videoItemParams2 = InteractAuthorSurveyBottomBarAssem.this.LLFII;
                        String str3 = null;
                        if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null) {
                            str3 = aweme2.getGroupId();
                        }
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        c188727au.LJIIIZ("group_id", str3);
                        InteractAuthorSurveyBottomBarAssem.this.getClass();
                        if (AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isPositiveQuestionSet()) {
                            str2 = "most_wanted_set";
                        } else {
                            str2 = "most_disappointed_set";
                        }
                        c188727au.LJIIIZ("survey_type", str2);
                        InteractAuthorSurveyBottomBarAssem.this.getClass();
                        c188727au.LIZLLL(AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown() ? 1 : 0, "if_hit_quit");
                        FMX.LJIIL("click_close_author_survey_banner", c188727au.LIZ);
                        C8R4 surveyAfterPostService2 = AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService();
                        VideoItemParams videoItemParams3 = InteractAuthorSurveyBottomBarAssem.this.LLFII;
                        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null && (groupId = aweme.getGroupId()) != null) {
                            str4 = groupId;
                        }
                        surveyAfterPostService2.onSurveyBannerClosedManually(str4);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                }
            }, initUI$lambda$5);
            return;
        }
        Y3().setVisibility(8);
        q4();
    }
}
