package com.ss.android.ugc.aweme.feed.adapter;

import X.A9B;
import X.A9D;
import X.C10I;
import X.C10K;
import X.C2067689o;
import X.C209108Io;
import X.C212748Wo;
import X.C222588oQ;
import X.C2U8;
import X.C30581Hy;
import X.C79004UzY;
import X.HG3;
import X.IT4;
import X.LEJ;
import X.LO7;
import X.LXU;
import X.RBX;
import X.RBY;
import Y.AgS73S0300000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class FullFeedVideoViewHolder extends VideoViewCell {
    public static final /* synthetic */ int LLZZLLIL = 0;
    public long LLZZ;
    public final A9D LLZZJLIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public int LJLJJLL() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLJJLIIIJLLLLLLLZ() {
        if (this.LLZZJLIL.LIZ()) {
            this.LLZZJLIL.LIZJ();
        } else {
            super.LLJJLIIIJLLLLLLLZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final C2067689o X8() {
        return new C2067689o();
    }

    public static boolean LLLLILI() {
        boolean z;
        if (HG3.LJIILL() == null) {
            return false;
        }
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        boolean isChildrenMode = ((RBY) HG3.LJIILL()).isChildrenMode();
        if ((System.currentTimeMillis() / 1000) - ((RBX) HG3.LJIILL()).getCurUser().getRegisterTime() < 604800) {
            z = true;
        } else {
            z = false;
        }
        if (isLogin && !isChildrenMode && !z) {
            return true;
        }
        return false;
    }

    public final SuperEntranceEvent LLLLIIL() {
        boolean z;
        boolean z2;
        ISpecialPlusService specialPlusService = AVExternalServiceImpl.LIZ().specialPlusService();
        AnchorCommonStruct LLLLIL = LLLLIL(this.LJLLL.getAnchors());
        if (LLLLIL != null) {
            String id = LLLLIL.getId();
            ISpecialPlusService specialPlusService2 = AVExternalServiceImpl.LIZ().specialPlusService();
            AnchorCommonStruct LLLLIL2 = LLLLIL(this.LJLLL.getAnchors());
            if (LLLLIL2 != null) {
                boolean isTransformationLimitHit = specialPlusService2.isTransformationLimitHit(LLLLIL2.getId(), getEventType());
                boolean isEffectVideoPlusEnabled = specialPlusService2.isEffectVideoPlusEnabled();
                if (LLLLIL2.getThumbnail() != null && LLLLIL2.getThumbnail().getUrlList() != null && !LLLLIL2.getThumbnail().getUrlList().isEmpty() && !TextUtils.isEmpty((CharSequence) ListProtector.get(LLLLIL2.getThumbnail().getUrlList(), 0))) {
                    z = true;
                } else {
                    z = false;
                }
                if (TextUtils.equals(getEventType(), "homepage_follow") || TextUtils.equals(getEventType(), "homepage_hot")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (isEffectVideoPlusEnabled && z && LLLLILI() && z2 && !isTransformationLimitHit) {
                    SuperEntranceEvent superEntranceEvent = new SuperEntranceEvent(5, true);
                    superEntranceEvent.setEffectId(id);
                    superEntranceEvent.setTab(getEventType());
                    superEntranceEvent.setIconUrl((String) ListProtector.get(LLLLIL.getThumbnail().getUrlList(), 0));
                    String eventType = getEventType();
                    HashMap<String, Integer> transformationsCountMap = specialPlusService.getTransformationsCountMap(eventType);
                    Integer num = transformationsCountMap.get(id);
                    if (num == null) {
                        num = 0;
                    }
                    transformationsCountMap.put(id, Integer.valueOf(num.intValue() + 1));
                    specialPlusService.setTransformationsCountMap(transformationsCountMap, eventType);
                    specialPlusService.setLastTransformationDate(System.currentTimeMillis());
                    return superEntranceEvent;
                }
            }
            return new SuperEntranceEvent(0, false);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public void unBind() {
        super.unBind();
        this.LLZZJLIL.LIZIZ();
    }

    public FullFeedVideoViewHolder(C222588oQ c222588oQ) {
        super(c222588oQ);
        this.LLZZJLIL = new A9D(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLIL(Aweme aweme) {
        ISuperEntranceService superEntranceService;
        Aweme aweme2;
        if (this.LJLLLL == 0 || HG3.LJIILL() == null) {
            return;
        }
        if ((((RBX) HG3.LJIILL()).isLogin() && (aweme2 = this.LJLLL) != null && TextUtils.equals(aweme2.getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId())) || (superEntranceService = AVExternalServiceImpl.LIZ().superEntranceService()) == null || !superEntranceService.shouldShowSuperEntranceRecord(this.LLJJJIL)) {
            return;
        }
        List<String> superEntranceEffectList = superEntranceService.getSuperEntranceEffectList();
        NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
        if (stickerEntranceInfo != null && !C79004UzY.LJJIFFI(superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.id)) {
            C2U8.LIZ(new SuperEntranceEvent(1, true));
            superEntranceService.setShowedSuperEntranceTab();
        }
    }

    public final AnchorCommonStruct LLLLIL(List<AnchorCommonStruct> list) {
        if (list != null && !list.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == 28) {
                    return anchorCommonStruct;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void Z6(C209108Io c209108Io) {
        super.Z6(c209108Io);
        if (c209108Io.LJLIL == "HOME" && c209108Io.LJLILLLLZI != "HOME") {
            C2U8.LIZ(new SuperEntranceEvent(0, false));
        }
        if (c209108Io.LJLILLLLZI == "HOME" && c209108Io.LJLIL != "HOME") {
            SuperEntranceEvent LLLLIIL = LLLLIIL();
            LLLLIIL.getClass();
            C2U8.LIZ(LLLLIIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void b2(boolean z) {
        if (TextUtils.equals(getEventType(), "homepage_follow")) {
            MainPageExperimentServiceImpl.LJ().LIZ();
        }
        if (C30581Hy.LJIJI(getEventType()) && LXU.LIZ().LIZJ) {
            z = LXU.LIZ().LIZJ;
        }
        if (C30581Hy.LJIL(getEventType()) && LXU.LIZ().LIZLLL) {
            z = LXU.LIZ().LIZLLL;
        }
        if (C30581Hy.LJIJJLI(getEventType()) && LXU.LIZ().LJ) {
            z = LXU.LIZ().LJ;
        }
        if (LO7.LIZIZ.J1(getEventType()) && LXU.LIZ().LIZIZ(this.LJLLILLLL.LJIIJ)) {
            z = LXU.LIZ().LIZIZ(this.LJLLILLLL.LJIIJ);
        }
        if (C30581Hy.LJJ(getEventType()) && LXU.LIZ().LJI) {
            z = LXU.LIZ().LJI;
        }
        if (TextUtils.equals(getEventType(), "homepage_topic_stem") && LXU.LIZ().LJII) {
            z = LXU.LIZ().LJII;
        }
        super.b2(z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void c2(long j) {
        super.c2(j);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public void l8(int i) {
        super.l8(i);
        Context context = this.LLJJJIL;
        Aweme aweme = this.LJLLL;
        if (aweme != null && aweme.isAd() && aweme.getAwemeRawAd() != null) {
            A9B.LIZIZ(context, "commerce old");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        int i;
        super.onRenderFirstFrame(it4);
        if (TextUtils.equals(getEventType(), "homepage_hot")) {
            this.LLZZ = System.currentTimeMillis();
        }
        final Aweme aweme = this.LJLLL;
        if (this.LJLLLL == 0) {
            i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        } else {
            i = 0;
        }
        C10K.LJII(i).LJ(new AgS73S0300000_3(this, AVExternalServiceImpl.LIZ().specialPlusService(), aweme, 1), C10K.LJI, null).LJI(new C10I() { // from class: X.A99
            @Override // X.C10I
            public final Object then(C10K c10k) {
                SuperEntranceEvent superEntranceEvent;
                FullFeedVideoViewHolder fullFeedVideoViewHolder = FullFeedVideoViewHolder.this;
                Aweme aweme2 = aweme;
                fullFeedVideoViewHolder.getClass();
                try {
                    String str = (String) c10k.LJIIJJI();
                    new SuperEntranceEvent(0, false);
                    if (TextUtils.equals(str, "show")) {
                        superEntranceEvent = new SuperEntranceEvent(3, true);
                    } else if (fullFeedVideoViewHolder.LLLLIL(aweme2.getAnchors()) != null) {
                        superEntranceEvent = fullFeedVideoViewHolder.LLLLIIL();
                    } else if (TextUtils.equals(str, "hide")) {
                        superEntranceEvent = new SuperEntranceEvent(3, false);
                    } else if (TextUtils.equals(str, "normal")) {
                        superEntranceEvent = new SuperEntranceEvent(0, false);
                    } else {
                        superEntranceEvent = new SuperEntranceEvent(0, false);
                    }
                    superEntranceEvent.getClass();
                    C2U8.LIZ(superEntranceEvent);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, C10K.LJIIIIZZ, null);
        C212748Wo.LIZ(this.LJLLL, this.LJLLLL, getEventType(), this.LJLLLLLL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public void t7(boolean z) {
        if (AVExternalServiceImpl.LIZ().specialPlusService().isEffectVideoPlusShowed()) {
            C2U8.LIZ(new SuperEntranceEvent(0, false));
        }
        super.t7(z);
        if (TextUtils.equals(getEventType(), "homepage_hot")) {
            LEJ.LIZ().maybeMonitorTimeSpend(this.LJLLL, Long.valueOf(this.LLZZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLILLL(View view, boolean z) {
        if (TextUtils.equals(getEventType(), "homepage_follow")) {
            MainPageExperimentServiceImpl.LJ().LIZ();
        }
        if (C30581Hy.LJIJI(getEventType()) && LXU.LIZ().LIZJ) {
            z = LXU.LIZ().LIZJ;
        }
        if (C30581Hy.LJIL(getEventType()) && LXU.LIZ().LIZLLL) {
            z = LXU.LIZ().LIZLLL;
        }
        if (C30581Hy.LJIJJLI(getEventType()) && LXU.LIZ().LJ) {
            z = LXU.LIZ().LJ;
        }
        if (LO7.LIZIZ.J1(getEventType()) && LXU.LIZ().LIZIZ(this.LJLLILLLL.LJIIJ)) {
            z = LXU.LIZ().LIZIZ(this.LJLLILLLL.LJIIJ);
        }
        if (C30581Hy.LJJ(getEventType()) && LXU.LIZ().LJI) {
            z = LXU.LIZ().LJI;
        }
        if (TextUtils.equals(getEventType(), "homepage_topic_stem") && LXU.LIZ().LJII) {
            z = LXU.LIZ().LJII;
        }
        super.LLILLL(view, z);
    }
}
