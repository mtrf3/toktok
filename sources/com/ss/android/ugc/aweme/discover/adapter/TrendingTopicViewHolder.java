package com.ss.android.ugc.aweme.discover.adapter;

import X.AV1;
import X.AbstractC51036K1g;
import X.AnonymousClass629;
import X.C10K;
import X.C119394mN;
import X.C12460eI;
import X.C16880lQ;
import X.C188727au;
import X.C198517qh;
import X.C201487vU;
import X.C221108m2;
import X.C27740Aue;
import X.C36922EeM;
import X.C38987FRv;
import X.C39061g6;
import X.C50915JyZ;
import X.C55457Lpd;
import X.C56490MFa;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C5H3;
import X.C61200O0e;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73340SqO;
import X.C77123UOp;
import X.C78765Uvh;
import X.EnumC221088m0;
import X.FMX;
import X.FRW;
import X.G3L;
import X.InterfaceC208608Gq;
import X.KL2;
import X.LSC;
import X.MFR;
import X.MID;
import X.MIF;
import X.MJ5;
import X.MJ6;
import X.MJ7;
import X.MJ8;
import X.MJ9;
import X.O8Z;
import X.OJY;
import X.ORZ;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.ACallableS112S0100000_9;
import Y.IDrS14S0000000_9;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment;
import com.ss.android.ugc.aweme.discover.model.AdLabel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingTopicViewHolder extends JediSimpleViewHolder implements InterfaceC208608Gq, MIF, G3L {
    public static final TrendingTopic LLD = new TrendingTopic(0, null, null, null, null, null, null, null, null, 511, null);
    public static final C62822Ol8 LLF = C221108m2.LIZIZ(MJ7.LJLIL);
    public final RecyclerView.RecycledViewPool LJLIL;
    public final InterfaceC208608Gq LJLILLLLZI;
    public final C62846OlW LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;
    public final RecyclerView LJLJLJ;
    public final View LJLJLLL;
    public final ViewStub LJLL;
    public final ImageView LJLLI;
    public TrendingTopic LJLLILLLL;
    public boolean LJLLJ;
    public MID LJLLL;
    public final C56490MFa LJLLLL;
    public final Context LJLLLLLL;
    public View LJLZ;
    public MJ9 LJZ;
    public final C62822Ol8 LJZI;
    public final C5H3 LJZL;
    public final C5H3 LL;

    @Override // X.MIF
    public final void LLILLIZIL() {
        N(true);
        this.LJLILLLLZI.zj();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int M() {
        return ((Number) withState((JediViewModel) this.LJZI.getValue(), new AqS175S0100000_9(this, 32))).intValue();
    }

    public final void Q() {
        RecyclerView recyclerView;
        MFR mfr;
        if (this.LJLLLL == null || (recyclerView = this.LJLJLJ) == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i));
            if ((LJJJJJL instanceof MFR) && (mfr = (MFR) LJJJJJL) != null) {
                mfr.d();
            }
        }
    }

    @Override // X.InterfaceC208608Gq
    public final void zj() {
        this.LJLILLLLZI.zj();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void attachToWindow() {
        super.attachToWindow();
        withState((JediViewModel) this.LJZI.getValue(), new AqS175S0100000_9(this, 31));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void detachFromWindow() {
        super.detachFromWindow();
        Q();
    }

    public static String L(TrendingTopic trendingTopic) {
        if (trendingTopic.getChallenge() != null) {
            Challenge challenge = trendingTopic.getChallenge();
            o.LJI(challenge);
            String cid = challenge.getCid();
            o.LJIIIIZZ(cid, "{\n                topic.…lenge!!.cid\n            }");
            return cid;
        }
        if (trendingTopic.getMusic() != null) {
            Music music = trendingTopic.getMusic();
            o.LJI(music);
            return String.valueOf(music.getId());
        }
        if (trendingTopic.getEffect() != null) {
            NewFaceStickerBean effect = trendingTopic.getEffect();
            o.LJI(effect);
            String str = effect.id;
            o.LJIIIIZZ(str, "{\n                topic.effect!!.id\n            }");
            return str;
        }
        return "";
    }

    public final void N(boolean z) {
        TrendingTopic trendingTopic;
        String str;
        LinkedHashMap linkedHashMap;
        Set<String> keySet;
        if (!AV1.LJIIJJI() && (trendingTopic = this.LJLLILLLL) != null) {
            String str2 = "into";
            String str3 = "cell_click";
            String str4 = "//duo";
            if (trendingTopic.getChallenge() != null) {
                Challenge challenge = trendingTopic.getChallenge();
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('d');
                LIZ.append(getBindingAdapterPosition());
                Map<String, Object> LJIILJJIL = C12460eI.LJIILJJIL(itemView, "c2902", X1D.LIZIZ(LIZ), null, null);
                String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
                if (!z) {
                    o.LJI(challenge);
                    if (challenge.isPgcshow()) {
                        IChallengeDetailService.LIZ.getClass();
                        IChallengeDetailService LIZLLL = ChallengeDetailServiceImpl.LIZLLL();
                        o.LJI(LIZLLL);
                        AbstractC51036K1g<Aweme, ?> LIZJ = LIZLLL.LIZJ();
                        o.LJI(LIZJ);
                        LIZJ.setItems(new ArrayList());
                        C55457Lpd.LJLJJLL = LIZJ;
                        C61200O0e LIZLLL2 = C61200O0e.LIZLLL();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("aweme://aweme/detail/");
                        TrendingTopic trendingTopic2 = this.LJLLILLLL;
                        o.LJI(trendingTopic2);
                        List<Aweme> items = trendingTopic2.getItems();
                        o.LJI(items);
                        LIZ3.append(((Aweme) ListProtector.get(items, 0)).getAid());
                        C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ3));
                        c39061g6.LIZIZ("refer", "discovery");
                        c39061g6.LIZIZ("video_from", "from_challenge");
                        c39061g6.LIZIZ("challenge_id", challenge.getCid());
                        LIZLLL2.LJII(c39061g6.LIZJ());
                        C201487vU c201487vU = new C201487vU();
                        c201487vU.LIZLLL = "discovery";
                        c201487vU.LJJLI = "click_discovery_cover";
                        c201487vU.LJJLIIIJJI = challenge.getCid();
                        c201487vU.LJJLIIIJLJLI = LIZ2;
                        TrendingTopic trendingTopic3 = this.LJLLILLLL;
                        o.LJI(trendingTopic3);
                        c201487vU.LJJLIIIJLLLLLLLZ = trendingTopic3.getDesc();
                        c201487vU.LJIILLIIL = String.valueOf(M());
                        c201487vU.LJIILIIL();
                        C38987FRv.LJI(LSC.CHALLENGE);
                        return;
                    }
                }
                FRW.LIZLLL("cd_start_activity_to_request_net_duration");
                FRW.LIZLLL("cd_start_activity_to_show_header_duration");
                FRW.LIZLLL("cd_start_activity_to_show_list_duration");
                if (!MSAdaptionService.LJIIL().LIZIZ(this.LJLLLLLL)) {
                    str4 = "//challenge/detail";
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), str4);
                o.LJI(challenge);
                buildRoute.withParam("id", challenge.getCid());
                buildRoute.withParam("enter_from", "discovery");
                buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                buildRoute.withParam("process_id", LIZ2);
                if (CommerceChallengeServiceImpl.LIZIZ().LJIJJ(challenge)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                buildRoute.withParam("is_commerce", str);
                buildRoute.withParam("shoot_enter_from", "discovery");
                buildRoute.withParam("is_bundled", !TextUtils.isEmpty(challenge.getStickerId()) ? 1 : 0);
                if (MSAdaptionService.LJIIL().LIZIZ(this.LJLLLLLL)) {
                    buildRoute.withParam("duo_type", "duo_challenge");
                }
                buildRoute.open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "discovery");
                c188727au.LJIIIZ("tag_id", challenge.getCid());
                c188727au.LIZLLL(M(), "client_order");
                FMX.LJIIL("cell_click", c188727au.LIZ);
                MobClick obtain = MobClick.obtain();
                if (z) {
                    str3 = "cell_slide";
                }
                obtain.setEventName(str3);
                if (!z) {
                    str2 = "header_click";
                }
                obtain.setLabelName(str2);
                obtain.setValue(challenge.getCid());
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("cell_type", "challenge");
                obtain.setJsonObject(c198517qh.LJ());
                FMX.onEvent(obtain);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "trending cell");
                c188727au2.LJIIIZ("enter_method", "click_trending_cell");
                c188727au2.LJIIIZ("process_id", UUID.randomUUID().toString());
                c188727au2.LJIIIZ("tag_id", challenge.getCid());
                c188727au2.LJIIIZ("shoot_enter_from", "discovery");
                c188727au2.LIZLLL(!TextUtils.isEmpty(challenge.getStickerId()) ? 1 : 0, "is_bundled");
                if (LJIILJJIL != null && (keySet = (linkedHashMap = (LinkedHashMap) LJIILJJIL).keySet()) != null) {
                    for (String str5 : keySet) {
                        Object obj = linkedHashMap.get(str5);
                        if (obj != null) {
                            c188727au2.LJI(str5, obj.toString());
                        }
                    }
                }
                String stickerId = challenge.getStickerId();
                if (stickerId != null) {
                    c188727au2.LJI("prop_id", stickerId);
                }
                FMX.LJIIL("enter_tag_detail", c188727au2.LIZ);
                TrendingTopic trendingTopic4 = this.LJLLILLLL;
                o.LJI(trendingTopic4);
                if (trendingTopic4.isAd()) {
                    if (z) {
                        Context context = this.LJLLLLLL;
                        TrendingTopic trendingTopic5 = this.LJLLILLLL;
                        OJY LJIL = C73340SqO.LJIL();
                        long creativeId = trendingTopic5.getCreativeId();
                        String logExtra = trendingTopic5.getLogExtra();
                        UrlModel clickTrackUrlList = trendingTopic5.getClickTrackUrlList();
                        LJIL.getClass();
                        C59127NIl LIZ4 = C59128NIm.LIZ();
                        LIZ4.LIZIZ = "video_slide";
                        LIZ4.LJII(logExtra);
                        LIZ4.LIZ = "discovery_ad";
                        LIZ4.LJIIIIZZ("video");
                        LIZ4.LIZLLL(Long.valueOf(creativeId));
                        LIZ4.LJIIIZ(context);
                        C58655N0h LJ = C58704N2e.LJ("discovery_ad", "video_slide", String.valueOf(creativeId), logExtra, CardStruct.IStatusCode.DEFAULT);
                        LJ.LIZJ("video", "refer");
                        LJ.LJII();
                        C59127NIl LIZ5 = C59128NIm.LIZ();
                        LIZ5.LIZIZ = "click";
                        LIZ5.LJII(logExtra);
                        LIZ5.LIZ = "discovery_ad";
                        LIZ5.LJIIIIZZ("video");
                        LIZ5.LIZLLL(Long.valueOf(creativeId));
                        LIZ5.LJIIIZ(context);
                        C58655N0h LJ2 = C58704N2e.LJ("discovery_ad", "click", String.valueOf(creativeId), logExtra, CardStruct.IStatusCode.DEFAULT);
                        LJ2.LIZJ("video", "refer");
                        LJ2.LJII();
                        O8Z.LIZ("click", clickTrackUrlList, Long.valueOf(creativeId), logExtra);
                    } else {
                        Context context2 = this.LJLLLLLL;
                        TrendingTopic trendingTopic6 = this.LJLLILLLL;
                        OJY LJIL2 = C73340SqO.LJIL();
                        long creativeId2 = trendingTopic6.getCreativeId();
                        String logExtra2 = trendingTopic6.getLogExtra();
                        UrlModel clickTrackUrlList2 = trendingTopic6.getClickTrackUrlList();
                        LJIL2.getClass();
                        C59127NIl LIZ6 = C59128NIm.LIZ();
                        LIZ6.LIZIZ = "click";
                        LIZ6.LJII(logExtra2);
                        LIZ6.LIZ = "discovery_ad";
                        LIZ6.LJIIIIZZ("title");
                        LIZ6.LIZLLL(Long.valueOf(creativeId2));
                        LIZ6.LJIIIZ(context2);
                        C58655N0h LJ3 = C58704N2e.LJ("discovery_ad", "click", String.valueOf(creativeId2), logExtra2, CardStruct.IStatusCode.DEFAULT);
                        LJ3.LIZJ("title", "refer");
                        LJ3.LJII();
                        O8Z.LIZ("click", clickTrackUrlList2, Long.valueOf(creativeId2), logExtra2);
                    }
                }
                if (this.LJLLJ) {
                    CommerceChallengeServiceImpl.LIZIZ().LIZJ("discover_hashtag_list", challenge.getChallengeName());
                }
                C201487vU c201487vU2 = new C201487vU();
                c201487vU2.LIZLLL = "discovery";
                c201487vU2.LJJLI = "click_discovery_cover";
                c201487vU2.LJJLIIIJJI = challenge.getCid();
                c201487vU2.LJJLIIIJLJLI = LIZ2;
                TrendingTopic trendingTopic32 = this.LJLLILLLL;
                o.LJI(trendingTopic32);
                c201487vU2.LJJLIIIJLLLLLLLZ = trendingTopic32.getDesc();
                c201487vU2.LJIILLIIL = String.valueOf(M());
                c201487vU2.LJIILIIL();
                C38987FRv.LJI(LSC.CHALLENGE);
                return;
            }
            if (trendingTopic.getMusic() != null) {
                Music music = trendingTopic.getMusic();
                o.LJI(music);
                if (!MusicService.LJJLIIIJJI().LJJIL(music.convertToMusicModel(), this.LJLLLLLL, true)) {
                    C188727au c188727au3 = new C188727au();
                    c188727au3.LJIIIZ("group_id", "");
                    c188727au3.LJIIIZ("author_id", "");
                    c188727au3.LJIIIZ("music_id", music.getMid());
                    c188727au3.LJIIIZ("enter_from", "discovery");
                    FMX.LJIIL("enter_music_detail_failed", c188727au3.LIZ);
                    return;
                }
                String LIZ7 = AnonymousClass629.LIZ("randomUUID().toString()");
                if (MSAdaptionService.LJIIL().LIZIZ(this.LJLLLLLL)) {
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(this.itemView.getContext(), "//duo");
                    buildRoute2.withParam("duo_type", "duo_music_detail");
                    buildRoute2.withParam("id", music.getMid());
                    buildRoute2.withParam("process_id", LIZ7);
                    buildRoute2.withParam("shoot_enter_from", "discovery");
                    buildRoute2.open();
                } else {
                    SmartRoute buildRoute3 = SmartRouter.buildRoute(this.itemView.getContext(), "//music/detail");
                    buildRoute3.withParam("id", music.getMid());
                    buildRoute3.withParam("process_id", LIZ7);
                    buildRoute3.open();
                }
                C188727au c188727au4 = new C188727au();
                c188727au4.LJIIIZ("enter_from", "discovery");
                c188727au4.LJIIIZ("music_id", music.getMid());
                c188727au4.LIZLLL(M(), "client_order");
                FMX.LJIIL("cell_click", c188727au4.LIZ);
                MobClick obtain2 = MobClick.obtain();
                if (z) {
                    str3 = "cell_slide";
                }
                obtain2.setEventName(str3);
                if (!z) {
                    str2 = "header_click";
                }
                obtain2.setLabelName(str2);
                String mid = music.getMid();
                mid.toString();
                obtain2.setValue(mid);
                C198517qh c198517qh2 = new C198517qh();
                c198517qh2.LIZ.put("cell_type", "music");
                obtain2.setJsonObject(c198517qh2.LJ());
                FMX.onEvent(obtain2);
                C50915JyZ c50915JyZ = new C50915JyZ();
                c50915JyZ.LIZLLL = "discovery";
                c50915JyZ.LJJLIIIJJI = music.getMid();
                c50915JyZ.LJJLIIIJL = LIZ7;
                c50915JyZ.LJJLI = "click_discovery_cover";
                c50915JyZ.LJIILIIL();
                C38987FRv.LJI(LSC.MUSICAL);
                return;
            }
            if (trendingTopic.getEffect() == null) {
                return;
            }
            NewFaceStickerBean effect = trendingTopic.getEffect();
            String LIZ8 = AnonymousClass629.LIZ("randomUUID().toString()");
            SmartRoute buildRoute4 = SmartRouter.buildRoute(this.itemView.getContext(), "//stickers/detail");
            o.LJI(effect);
            buildRoute4.withParam("id", effect.effectId);
            buildRoute4.withParam("process_id", LIZ8);
            buildRoute4.withParam("shoot_enter_from", "discovery");
            buildRoute4.open();
            C188727au c188727au5 = new C188727au();
            c188727au5.LJIIIZ("enter_from", "discovery");
            c188727au5.LJIIIZ("enter_method", "click_discovery_cover");
            c188727au5.LJIIIZ("prop_id", effect.id);
            c188727au5.LIZLLL(M(), "client_order");
            FMX.LJIIL("cell_click", c188727au5.LIZ);
            MobClick obtain3 = MobClick.obtain();
            if (z) {
                str3 = "cell_slide";
            }
            obtain3.setEventName(str3);
            if (!z) {
                str2 = "header_click";
            }
            obtain3.setLabelName(str2);
            obtain3.setValue(effect.id);
            C198517qh c198517qh3 = new C198517qh();
            c198517qh3.LIZ.put("cell_type", "effect");
            obtain3.setJsonObject(c198517qh3.LJ());
            FMX.onEvent(obtain3);
            C188727au c188727au6 = new C188727au();
            c188727au6.LJIIIZ("group_id", "");
            c188727au6.LJIIIZ("author_id", "");
            c188727au6.LJIIIZ("impr_type", "");
            c188727au6.LJIIIZ("prop_id", effect.id);
            c188727au6.LJIIIZ("enter_from", "discovery");
            c188727au6.LJIIIZ("enter_method", "click_discovery_cover");
            FMX.LJIIL("enter_prop_detail", c188727au6.LIZ);
            C38987FRv.LJI(LSC.STICKER);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        AdLabel adLabel;
        DiscoverSectionItem item = (DiscoverSectionItem) obj;
        o.LJIIIZ(item, "item");
        TrendingTopic trendingTopic = ((DiscoverSectionItem.TrendingTopicOrAdSection) item).trendingTopicOrAd.topic;
        if (trendingTopic != null) {
            if (trendingTopic == LLD) {
                if (this.LJLZ == null) {
                    this.LJLZ = this.LJLL.inflate();
                }
                C27740Aue.LJIIIZ(0, this.LJLZ);
                C27740Aue.LJIIIZ(8, this.LJLJLLL);
            } else {
                C27740Aue.LJIIIZ(8, this.LJLL);
                C27740Aue.LJIIIZ(0, this.LJLJLLL);
                if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable1) {
                    if (((Boolean) LLF.getValue()).booleanValue()) {
                        C27740Aue.LJIIIZ(8, this.LJLJL);
                    }
                } else if (AV1.LJIIJJI()) {
                    C27740Aue.LJIIIZ(8, this.LJLJL);
                }
                this.LJLLILLLL = trendingTopic;
                Challenge challenge = trendingTopic.getChallenge();
                Music music = trendingTopic.getMusic();
                NewFaceStickerBean effect = trendingTopic.getEffect();
                if (this.LJLLL == null) {
                    MID mid = new MID(this);
                    this.LJLLL = mid;
                    mid.LJLJJL = trendingTopic;
                    View view = new View(this.LJLLLLLL);
                    view.setLayoutParams(new ViewGroup.LayoutParams((int) KL2.LIZJ(this.LJLLLLLL, 14.0f), -1));
                    MID mid2 = this.LJLLL;
                    o.LJI(mid2);
                    mid2.LJLIL = view;
                    mid2.notifyItemInserted(0);
                    this.LJLJLJ.setAdapter(this.LJLLL);
                    if (((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) DiscoveryCommonPoolExperiment.LIZIZ.getValue()).enable) {
                        C36922EeM.LIZLLL(4, "TrendingTopicViewHolder", "should use a common pool");
                        RecyclerView.RecycledViewPool recycledViewPool = this.LJLIL;
                        if (recycledViewPool != null) {
                            this.LJLJLJ.setRecycledViewPool(recycledViewPool);
                            C36922EeM.LIZLLL(4, "TrendingTopicViewHolder", "use a common pool");
                        }
                    }
                    MID mid3 = this.LJLLL;
                    o.LJI(mid3);
                    mid3.LJLJJI = this;
                }
                List list = null;
                if (challenge != null) {
                    this.LJLLI.setVisibility(8);
                    if (challenge.isPgcshow() && !challenge.isCommerce()) {
                        if (challenge.getAuthor() != null && challenge.getAuthor().getAvatarThumb() != null) {
                            C78765Uvh.LJFF(this.LJLJI, challenge.getAuthor().getAvatarThumb());
                        }
                        this.LJLJJL.setText(this.LJLLLLLL.getString(R.string.jj2));
                    } else {
                        this.LJLJI.setImageResource(R.drawable.anp);
                        String desc = trendingTopic.getDesc();
                        TrendingTopicsAdInfo adData = trendingTopic.getAdData();
                        if (adData != null && (adLabel = adData.getAdLabel()) != null) {
                            str = adLabel.text;
                        } else {
                            str = null;
                        }
                        P(desc, str);
                    }
                    this.LJLJL.setText(C77123UOp.LJJIIJ(challenge.getDisplayCount()));
                    if (CommerceChallengeServiceImpl.LIZIZ().LJIJ(challenge.getChallengeName(), challenge.isCommerce(), false) == null) {
                        this.LJLLJ = false;
                        this.LJLJJI.setText(challenge.getChallengeName());
                    } else {
                        this.LJLLJ = true;
                        CommerceChallengeServiceImpl.LIZIZ().LJIJI(this.LJLLLLLL, challenge.getChallengeName(), challenge.isCommerce(), this.LJLJJI, false, "discover_hashtag_list");
                    }
                    MID mid4 = this.LJLLL;
                    o.LJI(mid4);
                    mid4.LJLJL = challenge.getCid();
                    MID mid5 = this.LJLLL;
                    o.LJI(mid5);
                    mid5.LJLJJLL = 0;
                    if (trendingTopic.isAd()) {
                        MID mid6 = this.LJLLL;
                        o.LJI(mid6);
                        mid6.LJLJJL = trendingTopic;
                    }
                } else if (music != null) {
                    this.LJLJI.setImageResource(R.drawable.anm);
                    this.LJLLI.setVisibility(8);
                    this.LJLJL.setText(C77123UOp.LJJIIJ(music.getUserCount()));
                    this.LJLJJI.setText(music.getMusicName());
                    P(trendingTopic.getDesc(), null);
                    MID mid7 = this.LJLLL;
                    o.LJI(mid7);
                    mid7.LJLJL = String.valueOf(music.getId());
                    MID mid8 = this.LJLLL;
                    o.LJI(mid8);
                    mid8.LJLJJLL = 1;
                } else if (effect != null) {
                    this.LJLJI.setImageResource(R.drawable.anl);
                    this.LJLLI.setVisibility(8);
                    this.LJLJL.setText(C77123UOp.LJJIIJ(effect.userCount));
                    this.LJLJJI.setText(effect.name);
                    P(trendingTopic.getDesc(), null);
                    MID mid9 = this.LJLLL;
                    o.LJI(mid9);
                    mid9.LJLJL = effect.id;
                    MID mid10 = this.LJLLL;
                    o.LJI(mid10);
                    mid10.LJLJJLL = 3;
                }
                MID mid11 = this.LJLLL;
                if (mid11 != null) {
                    List<Aweme> items = trendingTopic.getItems();
                    if (items != null) {
                        list = ORZ.LLJILJILJ(items);
                    }
                    mid11.setData(list);
                }
                MID mid12 = this.LJLLL;
                o.LJI(mid12);
                mid12.LJLJLLL = getAdapterPosition();
            }
        }
        if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable2) {
            C10K.LIZJ(new ACallableS112S0100000_9(this, 23));
        } else {
            withState((JediViewModel) this.LJZI.getValue(), new AqS175S0100000_9(this, 458));
        }
    }

    @Override // X.G3L
    public final void LJIJJ(int i, int i2) {
        TrendingTopic trendingTopic;
        if (i != 0 || i2 == 0 || (trendingTopic = this.LJLLILLLL) == null) {
            return;
        }
        Challenge challenge = trendingTopic.getChallenge();
        Music music = trendingTopic.getMusic();
        NewFaceStickerBean effect = trendingTopic.getEffect();
        if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable2 || effect != null) {
            C10K.LIZJ(new MJ5(effect, this, challenge, trendingTopic, music));
            return;
        }
        if (challenge != null) {
            CommerceChallengeServiceImpl.LIZIZ().LJIIIIZZ(challenge.getSchema(), challenge.getCid());
            this.LJLJLJ.getContext();
            FMX.LJII("show_challenge", 0L, "discovery", challenge.getCid());
            MJ6 mj6 = new MJ6();
            mj6.LJIILJJIL = "discovery";
            mj6.LJIILL = challenge.getCid();
            mj6.LJIILIIL();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "discovery");
            c188727au.LJIIIZ("tag_id", challenge.getCid());
            c188727au.LIZLLL(M(), "client_order");
            FMX.LJIIL("cell_show", c188727au.LIZ);
            MJ9 mj9 = this.LJZ;
            if (mj9 != null) {
                mj9.LIZ(M(), L(trendingTopic), trendingTopic.getDesc());
            }
            if (!trendingTopic.isAd()) {
                return;
            }
            C62819Ol5.LJJI(this.LJLLLLLL, trendingTopic);
            return;
        }
        if (music == null) {
            return;
        }
        this.LJLJLJ.getContext();
        FMX.LJII("show_music", 0L, "discovery", music.getMid());
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "discovery");
        c188727au2.LJIIIZ("music_id", music.getMid());
        c188727au2.LIZLLL(M(), "client_order");
        FMX.LJIIL("cell_show", c188727au2.LIZ);
    }

    public final void P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.LJLJJLL.setText(str2);
            this.LJLJJLL.setVisibility(0);
            C16880lQ.LJIJI(this.LJLJJLL, MJ8.LJLIL);
            this.LJLJJL.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.LJLJJL.setText(str);
            this.LJLJJLL.setVisibility(8);
            this.LJLJJL.setVisibility(0);
        } else {
            this.LJLJJLL.setVisibility(8);
            this.LJLJJL.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((Number) this.LL.getValue()).intValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingTopicViewHolder(View view, RecyclerView.RecycledViewPool recycledViewPool, TrendsTabFragment listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = recycledViewPool;
        this.LJLILLLLZI = listener;
        View findViewById = view.findViewById(R.id.fbz);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_type)");
        this.LJLJI = (C62846OlW) findViewById;
        View findViewById2 = view.findViewById(R.id.mo6);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_title)");
        this.LJLJJI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mpo);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_type)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ug);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.ad_tv)");
        this.LJLJJLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.m34);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_count)");
        this.LJLJL = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.j_9);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.rv_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.LJLJLJ = recyclerView;
        View findViewById7 = view.findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.root)");
        this.LJLJLLL = findViewById7;
        View findViewById8 = view.findViewById(R.id.nfi);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.vs_place_holder)");
        this.LJLL = (ViewStub) findViewById8;
        View findViewById9 = view.findViewById(R.id.cau);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.discover_bg_img)");
        this.LJLLI = (ImageView) findViewById9;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendsTabViewModel.class);
        this.LJZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 180));
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        C5H3 LIZ2 = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 949));
        this.LJZL = LIZ2;
        this.LL = C221108m2.LIZ(enumC221088m0, new AqS151S0100000_1(view, 950));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, LiveTryModeCountDownThresholdSetting.DEFAULT), view);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLLLLLL = context;
        C56490MFa c56490MFa = new C56490MFa();
        this.LJLLLL = c56490MFa;
        int color = view.getContext().getResources().getColor(R.color.ar);
        view.getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        wrapLinearLayoutManager.LLF(false);
        recyclerView.LJII(new C119394mN(color, ((Number) LIZ2.getValue()).intValue(), 0), -1);
        recyclerView.LJIIJJI(c56490MFa);
        recyclerView.LJIIJJI(new IDrS14S0000000_9(0));
    }
}
