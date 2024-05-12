package com.ss.android.ugc.aweme.topicfeed.vm;

import X.AbstractC57774Mlu;
import X.C188727au;
import X.C214188as;
import X.C2M9;
import X.C33Q;
import X.C47261Igj;
import X.C47957Irx;
import X.C54667Lct;
import X.C54897Lgb;
import X.C54898Lgc;
import X.C54899Lgd;
import X.C54900Lge;
import X.C55671Lt5;
import X.C57775Mlv;
import X.C58655N0h;
import X.C58704N2e;
import X.C63081OpJ;
import X.C65777Prh;
import X.C78404Ups;
import X.C78996UzQ;
import X.C8HZ;
import X.FMX;
import X.InterfaceC54903Lgh;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import android.text.TextUtils;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.topicfeed.settings.TopicFeedConfig;
import com.ss.android.ugc.aweme.topicfeed.settings.UrlStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedListViewModel extends AssemSingleListViewModel<Aweme, C54667Lct, Long> {
    public boolean LJLIL = true;
    public int LJLILLLLZI = -1;
    public String LJLJI = "";
    public final C214188as LJLJJI = C78404Ups.LIZJ(this, C54900Lge.LJLIL);
    public final List<Aweme> LJLJJL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C54667Lct(new C8HZ(null, null, 15), true);
    }

    public final Aweme gv0() {
        String[] strArr;
        Video video = new Video();
        Aweme aweme = new Aweme();
        aweme.setAid(UUID.randomUUID().toString());
        aweme.setAwemeType(328);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TopicFeedConfig topicFeedConfig = C54897Lgb.LIZ;
        TopicFeedConfig topicFeedConfig2 = (TopicFeedConfig) LIZLLL.LJIIIIZZ("topic_feed", TopicFeedConfig.class, topicFeedConfig);
        if (topicFeedConfig2 != null) {
            topicFeedConfig = topicFeedConfig2;
        }
        UrlStruct urlStruct = topicFeedConfig.bkgdVideo;
        if (urlStruct != null) {
            video.setRatio("720p");
            video.setHeight(1280);
            video.setWidth(720);
            aweme.setVideo(video);
            String[] strArr2 = urlStruct.urlList;
            if (strArr2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUri(urlStruct.uri);
                videoUrlModel.setHeight(1280);
                videoUrlModel.setWidth(720);
                aweme.getVideo().setPlayAddr(videoUrlModel);
                aweme.getVideo().setDownloadAddr(videoUrlModel);
            }
        }
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        TopicFeedConfig topicFeedConfig3 = C54897Lgb.LIZ;
        TopicFeedConfig topicFeedConfig4 = (TopicFeedConfig) LIZLLL2.LJIIIIZZ("topic_feed", TopicFeedConfig.class, topicFeedConfig3);
        if (topicFeedConfig4 != null) {
            topicFeedConfig3 = topicFeedConfig4;
        }
        UrlStruct urlStruct2 = topicFeedConfig3.bkgdVideoCover;
        if (urlStruct2 != null && (strArr = urlStruct2.urlList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                arrayList2.add(str2);
            }
            VideoUrlModel videoUrlModel2 = new VideoUrlModel();
            videoUrlModel2.setUrlList(arrayList2);
            videoUrlModel2.setUri(urlStruct2.uri);
            videoUrlModel2.setHeight(1280);
            videoUrlModel2.setWidth(720);
            video.setCover(videoUrlModel2);
            video.setOriginCover(videoUrlModel2);
        }
        return aweme;
    }

    public final List<Aweme> hv0(FeedItemList feedItemList) {
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        int i;
        String str;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            if (((ArrayList) this.LJLJJL).isEmpty() || C78996UzQ.LJJI(aweme, this.LJLJJL) < 0) {
                List<Aweme> list = this.LJLJJL;
                o.LJIIIIZZ(aweme, "aweme");
                ((ArrayList) list).add(aweme);
                arrayList.add(aweme);
            } else if (C78996UzQ.LJJI(aweme, this.LJLJJL) >= 0) {
                o.LJIIIIZZ(aweme, "aweme");
                int i2 = 1;
                if (!aweme.isAd() || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || awemeRawAd3.isEnableFilterSameVideo()) {
                    List<Aweme> list2 = this.LJLJJL;
                    Aweme aweme2 = (Aweme) ListProtector.get(list2, C78996UzQ.LJJI(aweme, list2));
                    if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                        String str2 = "";
                        if (aweme.isAd()) {
                            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                            if (aweme2.isAd()) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            LIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                            if (!aweme2.isAd() || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (str = awemeRawAd2.getCreativeIdStr()) == null) {
                                str = "";
                            }
                            LIZLLL.LIZIZ(str, "repeat_cid");
                            LIZLLL.LIZIZ(1, "repeat_type");
                            LIZLLL.LJI();
                        }
                        if (C63081OpJ.LLJJIJI(aweme)) {
                            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                            LIZLLL2.LIZIZ("8", "ad_show_fail_type");
                            if (aweme2.isAd() && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                                str2 = creativeIdStr;
                            }
                            LIZLLL2.LIZIZ(str2, "repeat_cid");
                            LIZLLL2.LJI();
                        }
                        C188727au c188727au = new C188727au();
                        if (!aweme2.isAd()) {
                            i2 = 2;
                        }
                        c188727au.LIZLLL(i2, "failed_reason");
                        c188727au.LJIIIZ("group_id", aweme2.getAid());
                        FMX.LJIIL("vv_failed", c188727au.LIZ);
                    }
                } else {
                    ((ArrayList) this.LJLJJL).add(aweme);
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    public final void jv0(FeedItemList feedItemList) {
        Iterator<Aweme> it = feedItemList.getItems().iterator();
        while (it.hasNext()) {
            if (it.next().isAd()) {
                Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                while (it2.hasNext()) {
                    it2.next().setHasAd(1);
                }
                return;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<Aweme> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 302));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenRefresh(InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        int i;
        List<Aweme> list;
        try {
            if (this.LJLIL) {
                i = 0;
            } else {
                i = 1;
            }
            FeedItemList LJJIIZ = ((InterfaceC54903Lgh) this.LJLJJI.getValue().getOperator()).LJJIIZ(new C55671Lt5(null, null, null, new Integer(6), null, null, new Integer(i), null, null, null, false), this.LJLILLLLZI);
            this.LJLIL = false;
            if (LJJIIZ.size() == 0 && !LJJIIZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJJIIZ, 303));
                return C57775Mlv.LIZ(C47261Igj.LJJIJIL(gv0()));
            }
            jv0(LJJIIZ);
            ((ArrayList) this.LJLJJL).clear();
            List<Aweme> hv0 = hv0(LJJIIZ);
            if (C65777Prh.LJI(hv0)) {
                list = hv0;
            } else {
                list = null;
            }
            iv0(LJJIIZ.getRequestId(), list);
            if (LJJIIZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJJIIZ, 304));
                return C57775Mlv.LIZLLL(null, null, hv0);
            }
            setState(new AqS175S0100000_9(LJJIIZ, 305));
            return C57775Mlv.LIZ(hv0);
        } catch (Exception e) {
            setState(C54898Lgc.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }

    public final void iv0(String str, List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(list, i);
                Aweme aweme = (Aweme) obj;
                aweme.setRequestId(str);
                LogPbBean logPbBean = new LogPbBean();
                logPbBean.setImprId(str);
                aweme.setLogPbBean(logPbBean);
                IAwemeService LIZ = AwemeService.LIZ();
                if (LIZ != null) {
                    obj = LIZ.R1(aweme);
                    o.LJI(obj);
                }
                IRequestIdService LJ = RequestIdService.LJ();
                if (LJ != null) {
                    LJ.LIZJ(i, ((Aweme) obj).getAid() + "33", str);
                }
                ListProtector.set(list, i, obj);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        boolean z;
        List<Aweme> list;
        l.longValue();
        try {
            InterfaceC54903Lgh interfaceC54903Lgh = (InterfaceC54903Lgh) this.LJLJJI.getValue().getOperator();
            Integer num = new Integer(6);
            Integer num2 = new Integer(2);
            if (C2M9.LIZ() && C47957Irx.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            FeedItemList LJJIIZ = interfaceC54903Lgh.LJJIIZ(new C55671Lt5(null, null, null, num, null, null, num2, null, null, null, z), this.LJLILLLLZI);
            if (LJJIIZ.size() == 0) {
                setState(new AqS175S0100000_9(LJJIIZ, 565));
                return C57775Mlv.LIZIZ();
            }
            jv0(LJJIIZ);
            List<Aweme> hv0 = hv0(LJJIIZ);
            if (C65777Prh.LJI(hv0)) {
                list = hv0;
            } else {
                list = null;
            }
            iv0(LJJIIZ.getRequestId(), list);
            if (LJJIIZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJJIIZ, 566));
                return C57775Mlv.LIZLLL(null, null, hv0);
            }
            setState(new AqS175S0100000_9(LJJIIZ, 567));
            return C57775Mlv.LIZ(hv0);
        } catch (Exception e) {
            setState(C54899Lgd.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }
}
