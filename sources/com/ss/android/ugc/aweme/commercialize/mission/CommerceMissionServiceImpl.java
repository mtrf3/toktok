package com.ss.android.ugc.aweme.commercialize.mission;

import X.C16880lQ;
import X.C42506GmE;
import X.C42688GpA;
import X.C43687HCp;
import X.C43688HCq;
import X.C58096Mr6;
import X.E3X;
import X.GF4;
import X.H9C;
import X.HJI;
import X.HJJ;
import X.InterfaceC43690HCs;
import X.ORZ;
import X.SY4;
import X.XWG;
import Y.ACListenerS30S0400000_7;
import Y.ARunnableS26S0200000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.commercialize.mission.music.MissionChooseMusicViewModel;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMissionServiceImpl implements ICommerceMissionService {
    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final int LJI() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getFollowerCount();
    }

    public static ICommerceMissionService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceMissionService.class, false);
        if (LIZ != null) {
            return (ICommerceMissionService) LIZ;
        }
        if (C58096Mr6.LLLLLLZ == null) {
            synchronized (ICommerceMissionService.class) {
                if (C58096Mr6.LLLLLLZ == null) {
                    C58096Mr6.LLLLLLZ = new CommerceMissionServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final String LJ() {
        TcmConfig LJIIZILJ = TcmServiceImpl.LJIJI().LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.isTcmCreator()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final int LIZ(HTCMissionModule hTCMissionModule) {
        Integer bannerType;
        Integer missionLabelType;
        if (hTCMissionModule == null || o.LJ(hTCMissionModule.isEligibleUser(), Boolean.FALSE)) {
            return R.layout.a0k;
        }
        Integer missionLabelType2 = hTCMissionModule.getMissionLabelType();
        if (((missionLabelType2 == null || missionLabelType2.intValue() != 1) && ((missionLabelType = hTCMissionModule.getMissionLabelType()) == null || missionLabelType.intValue() != 2)) || (bannerType = hTCMissionModule.getBannerType()) == null || bannerType.intValue() != 1) {
            return R.layout.a0k;
        }
        return R.layout.a0j;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final HJI LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new HJI(new C43688HCq(context));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final HJJ LIZLLL(C42688GpA c42688GpA) {
        return new HJJ(c42688GpA);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final XWG LJFF(ViewModelStoreOwner viewModelStoreOwner) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        return (XWG) new ViewModelProvider(viewModelStoreOwner).get(MissionChooseMusicViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final C42506GmE LJII(GF4 gf4) {
        return new C42506GmE(gf4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final void LIZJ(View view, HTCMissionModule hTCMissionModule, E3X currentPage, InterfaceC43690HCs interfaceC43690HCs) {
        SY4 sy4;
        o.LJIIIZ(currentPage, "currentPage");
        C43687HCp c43687HCp = new C43687HCp(view);
        int i = 0;
        if (hTCMissionModule == null || TextUtils.isEmpty(hTCMissionModule.getMissionId())) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            TextView textView = c43687HCp.LIZIZ;
            if (textView != null) {
                textView.setText(hTCMissionModule.getText());
            }
            TextView textView2 = c43687HCp.LIZJ;
            if (textView2 != null) {
                C43687HCp.LIZ(textView2, hTCMissionModule.getDescription());
            }
            TextView textView3 = c43687HCp.LJ;
            if (textView3 != null) {
                textView3.setText(hTCMissionModule.getProgressBarText());
            }
            TextView textView4 = c43687HCp.LIZLLL;
            if (textView4 != null) {
                C43687HCp.LIZ(textView4, hTCMissionModule.getParticipantsStr());
            }
            FrameLayout frameLayout = c43687HCp.LJI;
            if (frameLayout != null) {
                frameLayout.post(new ARunnableS26S0200000_7(hTCMissionModule, c43687HCp, 0));
            }
            c43687HCp.LJIIIIZZ = ORZ.LJLJJI(hTCMissionModule.getBannerType(), C43687HCp.LJIIIZ);
        }
        if (view.getVisibility() == 0 && hTCMissionModule != null) {
            H9C h9c = new H9C();
            Object[] objArr = {hTCMissionModule, currentPage};
            do {
                h9c.LJIIIIZZ(objArr[i]);
                i++;
            } while (i < 2);
            h9c.LJII("mission_label_show", "mission_id", "eligibility", "status", "current_page", "creator_followers", "creator_type", "label_version");
        }
        ACListenerS30S0400000_7 aCListenerS30S0400000_7 = new ACListenerS30S0400000_7(this, hTCMissionModule, currentPage, interfaceC43690HCs, 0);
        if (c43687HCp.LJIIIIZZ && (sy4 = c43687HCp.LJII) != null) {
            C16880lQ.LJJIZ(sy4, aCListenerS30S0400000_7);
        } else {
            C16880lQ.LJIIJ(aCListenerS30S0400000_7, c43687HCp.LIZ);
        }
    }
}
