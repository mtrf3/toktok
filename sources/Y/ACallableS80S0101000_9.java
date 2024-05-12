package Y;

import X.C16880lQ;
import X.C36089EEj;
import X.C36093EEn;
import X.C36922EeM;
import X.C43133GwL;
import X.C55002LiI;
import X.C56574MIg;
import X.C78983UzD;
import X.InterfaceC36571c5;
import X.InterfaceC54054LJi;
import X.InterfaceC55004LiK;
import X.LQ7;
import X.MIZ;
import X.NHG;
import X.RunnableC55000LiG;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS32S1000000_9;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ACallableS80S0101000_9 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS80S0101000_9 aCallableS80S0101000_9) {
        ArrayList<ImportVideoInfo> arrayList;
        switch (aCallableS80S0101000_9.i1) {
            case 0:
                JSONArray jSONArray = (JSONArray) aCallableS80S0101000_9.l0;
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    ArrayList arrayList2 = new ArrayList();
                    Gson LIZ = GsonHolder.LIZLLL().LIZ();
                    if (LIZ != null) {
                        for (int i = 0; i < length; i++) {
                            try {
                                JSONArrayProtectorUtils.getJSONObject(jSONArray, i).putOpt("raw_ad_data", new JSONObject(JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), "raw_ad_data")));
                                Aweme aweme = (Aweme) LIZ.LJI(jSONArray.get(i).toString(), Aweme.class);
                                if (aweme != null) {
                                    arrayList2.add(aweme);
                                }
                            } catch (Exception e) {
                                String message = e.getMessage();
                                Objects.requireNonNull(message);
                                C56574MIg c56574MIg = new C56574MIg(new Object[0]);
                                MIZ.LIZ.getClass();
                                c56574MIg.LJIILJJIL(MIZ.LJ, new AqS32S1000000_9(message, 17));
                                C78983UzD.LJIILJJIL();
                            }
                        }
                        if (arrayList2.size() != 0) {
                            arrayList2.size();
                            C36093EEn.LIZ.getClass();
                            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                            LJIIIZ.LIZIZ(new TopViewPreloadTask(arrayList2), true);
                            LJIIIZ.LIZJ();
                        }
                    }
                }
                return null;
            case 1:
                C36922EeM.LIZLLL(4, "aweme/v1/user", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), aCallableS80S0101000_9.l0));
                return null;
            default:
                VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) aCallableS80S0101000_9.l0).LLILZLL;
                if (videoPublishEditModel != null && (arrayList = videoPublishEditModel.importInfoList) != null) {
                    Iterator<ImportVideoInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ImportVideoInfo next = it.next();
                        if (next.getHypicDescription() == null) {
                            String originImportPath = next.getOriginImportPath();
                            if (originImportPath == null && (originImportPath = next.getRealImportPath()) == null) {
                                originImportPath = "";
                            }
                            next.setHypicDescription(C43133GwL.LIZJ(originImportPath));
                        }
                    }
                }
                return null;
        }
    }

    public static final Object call$1(ACallableS80S0101000_9 aCallableS80S0101000_9) {
        switch (aCallableS80S0101000_9.i1) {
            case 0:
                List<InterfaceC55004LiK> list = (List) aCallableS80S0101000_9.l0;
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    for (InterfaceC55004LiK interfaceC55004LiK : list) {
                        LJJI.LJI();
                        NHG.LJIIZILJ(Integer.valueOf(interfaceC55004LiK.LIZ()), interfaceC55004LiK.getId(), interfaceC55004LiK.LIZJ(), interfaceC55004LiK.getLogExtra(), (NativeSiteConfig) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), interfaceC55004LiK.LIZIZ(), NativeSiteConfig.class));
                    }
                }
                return null;
            case 1:
                FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aCallableS80S0101000_9.l0;
                feedRecommendFragment.LJZL = true;
                LQ7 lq7 = new LQ7("enter_homepage_hot");
                lq7.LIZLLL = "open_app";
                lq7.LJIILLIIL = "open_app";
                InterfaceC36571c5 interfaceC36571c5 = feedRecommendFragment.LJLJJL;
                if (interfaceC36571c5 instanceof InterfaceC54054LJi) {
                    lq7.LJIJI = ((InterfaceC54054LJi) interfaceC36571c5).LLIIJI();
                }
                RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LJLL;
                if (recommendFeedFragmentPanel != null && recommendFeedFragmentPanel.getCurrentAweme() != null) {
                    lq7.LJIILLIIL(feedRecommendFragment.LJLL.getCurrentAweme());
                }
                lq7.LJIILIIL();
                return null;
            default:
                C55002LiI c55002LiI = ((RunnableC55000LiG) aCallableS80S0101000_9.l0).LJLIL;
                c55002LiI.getClass();
                try {
                    c55002LiI.LIZ(1);
                    c55002LiI.LIZLLL.getPreloader().LIZ(c55002LiI.LIZIZ, c55002LiI.LIZJ);
                    c55002LiI.LIZ(4);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    c55002LiI.LIZ(3);
                }
                return null;
        }
    }

    public ACallableS80S0101000_9(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
