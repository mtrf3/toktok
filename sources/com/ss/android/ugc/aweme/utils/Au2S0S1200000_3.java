package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C0H1;
import X.C188727au;
import X.C1DG;
import X.C217918gt;
import X.C218048h6;
import X.C218088hA;
import X.C26045AKb;
import X.C76800UCe;
import X.C7DS;
import X.FMX;
import X.InterfaceC88472Yns;
import X.TAT;
import X.Y9G;
import X.Y9H;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerRecommendCell;
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerSearchCell;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractAuthorSurveyBottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class Au2S0S1200000_3 extends TAT {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S1200000_3 au2S0S1200000_3, View view) {
        MentionStickerRecommendCell mentionStickerRecommendCell = (MentionStickerRecommendCell) au2S0S1200000_3.l1;
        Y9G y9g = ((C218048h6) au2S0S1200000_3.l2).LJLIL;
        String str = au2S0S1200000_3.s0;
        mentionStickerRecommendCell.getClass();
        C7DS.LIZIZ("tag_mention_head_click", new AqS57S1100000_3(y9g, str, 28));
        Y9G y9g2 = ((C218048h6) au2S0S1200000_3.l2).LJLIL;
        if (!y9g2.LJIJI.LIZ) {
            View itemView = ((MentionStickerRecommendCell) au2S0S1200000_3.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.i2p);
            c26045AKb.LJIIJ();
            return;
        }
        ((MentionStickerRecommendCell) au2S0S1200000_3.l1).getClass();
        C7DS.LIZIZ("add_video_at", new AqS169S0100000_3(y9g2, 831));
        User LIZJ = Y9H.LIZJ(((C218048h6) au2S0S1200000_3.l2).LJLIL);
        InterfaceC88472Yns<? super User, C76800UCe> interfaceC88472Yns = C218088hA.LIZJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZJ);
        } else {
            o.LJIJI("selectUserCallback");
            throw null;
        }
    }

    public static final void LIZ$1(Au2S0S1200000_3 au2S0S1200000_3, View view) {
        C7DS.LIZIZ("tag_mention_head_click", new AqS13S2100000_3(((C217918gt) au2S0S1200000_3.l2).LJLIL, au2S0S1200000_3.s0, ((MentionStickerSearchCell) au2S0S1200000_3.l1).L(), 9));
        Y9G y9g = ((C217918gt) au2S0S1200000_3.l2).LJLIL;
        if (!y9g.LJIJI.LIZ) {
            View itemView = ((MentionStickerSearchCell) au2S0S1200000_3.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.i2p);
            c26045AKb.LJIIJ();
            return;
        }
        C7DS.LIZIZ("add_video_at", new AqS57S1100000_3(y9g, ((MentionStickerSearchCell) au2S0S1200000_3.l1).L(), 30));
        User LIZJ = Y9H.LIZJ(((C217918gt) au2S0S1200000_3.l2).LJLIL);
        InterfaceC88472Yns<? super User, C76800UCe> interfaceC88472Yns = C218088hA.LIZJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZJ);
        } else {
            o.LJIJI("selectUserCallback");
            throw null;
        }
    }

    public static final void LIZ$2(Au2S0S1200000_3 au2S0S1200000_3, View view) {
        ActivityC45651qj LJ;
        String str;
        Aweme aweme;
        String groupId;
        Aweme aweme2;
        if (view == null || (LJ = C1DG.LJ((View) au2S0S1200000_3.l1, "context")) == null) {
            return;
        }
        Bundle LIZ = C0H1.LIZ("enterFrom", "video_detail");
        VideoItemParams videoItemParams = ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).LLFII;
        String str2 = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            str2 = aweme2.getGroupId();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        LIZ.putString("groupId", str2);
        AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().showAuthorSurvey(LIZ, LJ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_detail");
        c188727au.LJIIIZ("author_id", au2S0S1200000_3.s0);
        VideoItemParams videoItemParams2 = ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).LLFII;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (groupId = aweme.getGroupId()) != null) {
            str3 = groupId;
        }
        c188727au.LJIIIZ("group_id", str3);
        ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).getClass();
        if (AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isPositiveQuestionSet()) {
            str = "most_wanted_set";
        } else {
            str = "most_disappointed_set";
        }
        c188727au.LJIIIZ("survey_type", str);
        ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).getClass();
        c188727au.LIZLLL(AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown() ? 1 : 0, "if_hit_quit");
        FMX.LJIIL("click_answer_author_survey_banner", c188727au.LIZ);
        ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).Y3().setVisibility(8);
        ((InteractAuthorSurveyBottomBarAssem) au2S0S1200000_3.l2).q4();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1200000_3(View view, String str, InteractAuthorSurveyBottomBarAssem interactAuthorSurveyBottomBarAssem, int i) {
        super(700L);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
        this.l2 = interactAuthorSurveyBottomBarAssem;
    }

    public Au2S0S1200000_3(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
