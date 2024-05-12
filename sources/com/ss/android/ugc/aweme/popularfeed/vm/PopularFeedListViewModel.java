package com.ss.android.ugc.aweme.popularfeed.vm;

import X.AbstractC57774Mlu;
import X.C10K;
import X.C188727au;
import X.C214188as;
import X.C2M9;
import X.C33Q;
import X.C47261Igj;
import X.C47957Irx;
import X.C54664Lcq;
import X.C54888LgS;
import X.C54889LgT;
import X.C54890LgU;
import X.C54891LgV;
import X.C54893LgX;
import X.C55671Lt5;
import X.C57775Mlv;
import X.C58655N0h;
import X.C58704N2e;
import X.C59251NNf;
import X.C59252NNg;
import X.C63081OpJ;
import X.C65777Prh;
import X.C73340SqO;
import X.C78404Ups;
import X.C78996UzQ;
import X.C8HZ;
import X.EU3;
import X.FLE;
import X.FMX;
import X.InterfaceC54892LgW;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.popularfeed.settings.UrlStruct;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class PopularFeedListViewModel extends AssemSingleListViewModel<Aweme, C54664Lcq, Long> {
    public boolean LJLIL = true;
    public final C214188as LJLILLLLZI = C78404Ups.LIZJ(this, C54893LgX.LJLIL);
    public final List<Aweme> LJLJI = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C54664Lcq(new C8HZ(null, null, 15), true);
    }

    public final Aweme gv0() {
        String[] strArr;
        Video video = new Video();
        Aweme aweme = new Aweme();
        aweme.setAid(UUID.randomUUID().toString());
        aweme.setAwemeType(326);
        UrlStruct urlStruct = C54890LgU.LIZ().bkgdVideo;
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
        UrlStruct urlStruct2 = C54890LgU.LIZ().bkgdVideoCover;
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
        int i;
        String str;
        AwemeRawAd awemeRawAd;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            if (((ArrayList) this.LJLJI).isEmpty() || C78996UzQ.LJJI(aweme, this.LJLJI) < 0) {
                List<Aweme> list = this.LJLJI;
                o.LJIIIIZZ(aweme, "aweme");
                ((ArrayList) list).add(aweme);
                arrayList.add(aweme);
            } else if (C78996UzQ.LJJI(aweme, this.LJLJI) >= 0) {
                o.LJIIIIZZ(aweme, "aweme");
                int i2 = 1;
                if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.isEnableFilterSameVideo()) {
                    List<Aweme> list2 = this.LJLJI;
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
                            if (!aweme2.isAd()) {
                                str = "";
                            } else {
                                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                o.LJI(awemeRawAd2);
                                str = awemeRawAd2.getCreativeIdStr();
                            }
                            LIZLLL.LIZIZ(str, "repeat_cid");
                            LIZLLL.LIZIZ(1, "repeat_type");
                            LIZLLL.LJI();
                        }
                        if (C63081OpJ.LLJJIJI(aweme)) {
                            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                            LIZLLL2.LIZIZ("8", "ad_show_fail_type");
                            if (aweme2.isAd()) {
                                AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                                o.LJI(awemeRawAd3);
                                str2 = awemeRawAd3.getCreativeIdStr();
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
                    ((ArrayList) this.LJLJI).add(aweme);
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    public final void kv0(FeedItemList feedItemList) {
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
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 196));
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0104: INVOKE (r2 I:com.bytedance.assem.arch.viewModel.AssemViewModel), (r0 I:X.Yns) VIRTUAL call: com.bytedance.assem.arch.viewModel.AssemViewModel.setState(X.Yns):void A[MD:(X.Yns<? super S extends X.33Q, ? extends S extends X.33Q>):void (m)] (LINE:16777476), block:B:28:0x0102 */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenRefresh(InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        AssemViewModel state;
        int i;
        String LIZLLL;
        List<Aweme> list;
        try {
            if (this.LJLIL) {
                i = 0;
            } else {
                i = 1;
            }
            C54888LgS c54888LgS = new C54888LgS(i, new Integer(a.LJIILL().LJIJJLI()).intValue(), false);
            InterfaceC54892LgW interfaceC54892LgW = (InterfaceC54892LgW) this.LJLILLLLZI.getValue().getOperator();
            C55671Lt5 c55671Lt5 = new C55671Lt5(null, null, null, new Integer(c54888LgS.LJLIL), null, null, new Integer(c54888LgS.LJLILLLLZI), null, null, null, c54888LgS.LJLJJI);
            Integer num = new Integer(c54888LgS.LJLJI);
            String LIZ = FLE.LIZ("feed");
            Integer num2 = new Integer(a.LJIIJ().LJIILIIL());
            if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                LIZLLL = "";
            } else {
                LIZLLL = EU3.LIZLLL();
            }
            FeedItemList LJIIIIZZ = interfaceC54892LgW.LJIIIIZZ(c55671Lt5, num, LIZ, num2, LIZLLL, a.LJIIZILJ().LIZJ());
            this.LJLIL = false;
            if (LJIIIIZZ.size() == 0 && !LJIIIIZZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJIIIIZZ, 197));
                return C57775Mlv.LIZ(C47261Igj.LJJIJIL(gv0()));
            }
            kv0(LJIIIIZZ);
            ((ArrayList) this.LJLJI).clear();
            List<Aweme> hv0 = hv0(LJIIIIZZ);
            if (C65777Prh.LJI(hv0)) {
                list = hv0;
            } else {
                list = null;
            }
            jv0(LJIIIIZZ.getRequestId(), list);
            iv0(1, LJIIIIZZ.getItems());
            if (LJIIIIZZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJIIIIZZ, 198));
                return C57775Mlv.LIZLLL(null, null, hv0);
            }
            setState(new AqS175S0100000_9(LJIIIIZZ, 199));
            return C57775Mlv.LIZ(hv0);
        } catch (Exception e) {
            state.setState(C54889LgT.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }

    public static void iv0(int i, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ListIterator listIterator = list.listIterator();
        o.LJIIIIZZ(C73340SqO.LJJIIZI(), "getVastUtilsService()");
        int i2 = 0;
        while (listIterator.hasNext()) {
            Aweme aweme = (Aweme) listIterator.next();
            if (aweme == null) {
                listIterator.remove();
            } else {
                if (C59252NNg.LJI(aweme) || C59252NNg.LJ(aweme)) {
                    if (i == 1 && i2 < 3 && C59251NNf.LIZIZ(3, aweme)) {
                        C59252NNg.LJIIIIZZ(aweme, null, null, true);
                        if (C59251NNf.LIZ(aweme, false)) {
                            listIterator.remove();
                        }
                    } else {
                        C59252NNg.LJIIIIZZ(aweme, C10K.LJI, null, false);
                    }
                }
                i2++;
            }
        }
    }

    public final void jv0(String str, List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(list, i);
                Aweme aweme = (Aweme) obj;
                aweme.setRequestId(str);
                IAwemeService LIZ = AwemeService.LIZ();
                if (LIZ != null) {
                    obj = LIZ.R1(aweme);
                    o.LJI(obj);
                }
                IRequestIdService LJ = RequestIdService.LJ();
                if (LJ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(((Aweme) obj).getAid());
                    LIZ2.append("33");
                    LJ.LIZJ(i, X1D.LIZIZ(LIZ2), str);
                }
                ListProtector.set(list, i, obj);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f3: INVOKE (r2 I:com.bytedance.assem.arch.viewModel.AssemViewModel), (r0 I:X.Yns) VIRTUAL call: com.bytedance.assem.arch.viewModel.AssemViewModel.setState(X.Yns):void A[MD:(X.Yns<? super S extends X.33Q, ? extends S extends X.33Q>):void (m)] (LINE:33554675), block:B:29:0x00f1 */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC67352kd<? super AbstractC57774Mlu<Aweme>> interfaceC67352kd) {
        AssemViewModel state;
        boolean z;
        String LIZLLL;
        List<Aweme> list;
        l.longValue();
        try {
            int intValue = new Integer(a.LJIILL().LJIJJLI()).intValue();
            if (C2M9.LIZ() && C47957Irx.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            C54888LgS c54888LgS = new C54888LgS(2, intValue, z);
            InterfaceC54892LgW interfaceC54892LgW = (InterfaceC54892LgW) this.LJLILLLLZI.getValue().getOperator();
            C55671Lt5 c55671Lt5 = new C55671Lt5(null, null, null, new Integer(c54888LgS.LJLIL), null, null, new Integer(2), null, null, null, c54888LgS.LJLJJI);
            Integer num = new Integer(c54888LgS.LJLJI);
            String LIZ = FLE.LIZ("feed");
            Integer num2 = new Integer(a.LJIIJ().LJIILIIL());
            if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                LIZLLL = "";
            } else {
                LIZLLL = EU3.LIZLLL();
            }
            FeedItemList LJIIIIZZ = interfaceC54892LgW.LJIIIIZZ(c55671Lt5, num, LIZ, num2, LIZLLL, a.LJIIZILJ().LIZJ());
            if (LJIIIIZZ.size() == 0) {
                setState(new AqS175S0100000_9(LJIIIIZZ, 589));
                return C57775Mlv.LIZIZ();
            }
            kv0(LJIIIIZZ);
            List<Aweme> hv0 = hv0(LJIIIIZZ);
            if (C65777Prh.LJI(hv0)) {
                list = hv0;
            } else {
                list = null;
            }
            jv0(LJIIIIZZ.getRequestId(), list);
            iv0(4, LJIIIIZZ.getItems());
            if (LJIIIIZZ.isHasMore()) {
                setState(new AqS175S0100000_9(LJIIIIZZ, 590));
                return C57775Mlv.LIZLLL(null, null, hv0);
            }
            setState(new AqS175S0100000_9(LJIIIIZZ, 591));
            return C57775Mlv.LIZ(hv0);
        } catch (Exception e) {
            state.setState(C54891LgV.LJLIL);
            return C57775Mlv.LIZJ(e);
        }
    }
}
