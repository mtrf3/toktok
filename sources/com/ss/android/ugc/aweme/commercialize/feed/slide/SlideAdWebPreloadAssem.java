package com.ss.android.ugc.aweme.commercialize.feed.slide;

import X.ActivityC45651qj;
import X.C0C3;
import X.C16880lQ;
import X.C212428Vi;
import X.C2K0;
import X.C54204LPc;
import X.C55096Ljo;
import X.C56662Kg;
import X.C58655N0h;
import X.C58704N2e;
import X.C63081OpJ;
import X.C78688UuS;
import X.C78866UxK;
import X.InterfaceC54203LPb;
import X.InterfaceC55102Lju;
import X.LNH;
import X.NNA;
import X.NQL;
import X.NW7;
import X.NW9;
import X.O1F;
import Y.IDTListenerS119S0100000_10;
import android.view.View;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.feed.photomode.IAdSlidePreloadImpl;
import com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SlideAdWebPreloadAssem extends BaseMainContainerUIAssem implements C0C3, SlideAdWebPreloadAbility, InterfaceC54203LPb, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLLJ = 0;
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public Aweme LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final Map<NW9, Integer> LJLLI;
    public final NW7 LJLLILLLL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        HomePageViewPagerAbility LJJJJ;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(SlideAdWebPreloadAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJJJJ = C78688UuS.LJJJJ(LJJLIIIJJIZ)) != null) {
            LJJJJ.ii(this);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LNH.LIZ(LIZ, LIZ, this.LJLLILLLL);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -641279993) {
            return null;
        }
        return this;
    }

    public SlideAdWebPreloadAssem() {
        new LinkedHashMap();
        this.LJLLI = new LinkedHashMap();
        this.LJLLILLLL = new NW7(this);
    }

    public final void v3() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme aweme = this.LJLJJLL;
        Integer num = null;
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        Aweme aweme2 = this.LJLJJLL;
        if (aweme2 != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (!NNA.LIZIZ(awemeRawAd)) {
            return;
        }
        Aweme aweme3 = this.LJLJJLL;
        if (aweme3 != null) {
            awemeRawAd2 = aweme3.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "slide", awemeRawAd2);
        LIZLLL.LIZIZ(Float.valueOf(this.LJLILLLLZI), "start_x");
        LIZLLL.LIZIZ(Float.valueOf(this.LJLJI), "start_y");
        LIZLLL.LIZIZ(Float.valueOf(this.LJLJJI), "end_x");
        LIZLLL.LIZIZ(Float.valueOf(this.LJLJJL), "end_y");
        LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LJLJL), "absolute_duration");
        LIZLLL.LIZIZ(Long.valueOf(NQL.LJIILL().LJI()), "duration");
        LIZLLL.LIZIZ(Integer.valueOf(NQL.LJIILL().LJIIIZ + 1), "play_order");
        Aweme aweme4 = this.LJLJJLL;
        if (aweme4 != null) {
            num = Integer.valueOf(aweme4.getAwemeType());
        }
        LIZLLL.LIZIZ(num, "video_type");
        Aweme aweme5 = this.LJLJJLL;
        if (aweme5 != null && C63081OpJ.LJZL(aweme5)) {
            LIZLLL.LIZIZ(Integer.valueOf(IAdSlidePreloadImpl.LIZJ().LIZ()), "image_location");
            LIZLLL.LIZIZ(Integer.valueOf(IAdSlidePreloadImpl.LIZJ().LIZIZ()), "image_cnt");
        }
        LIZLLL.LJI();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        HomePageViewPagerAbility LJJJJ;
        super.onDestroy();
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJJJJ = C78688UuS.LJJJJ(LJJLIIIJJIZ)) != null) {
            LJJJJ.ku(this);
        }
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility
    public final void G10(NW9 nw9) {
        this.LJLLI.put(nw9, 1);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        AwemeRawAd awemeRawAd;
        String str;
        String str2;
        HomePageViewPagerAbility LJJJJ;
        HomePageViewPagerAbility LJJJJ2;
        Aweme aweme;
        Aweme aweme2;
        AwemeRawAd awemeRawAd2;
        String webUrl;
        HomePageViewPagerAbility LJJJJ3;
        this.LJLJLLL = i;
        Aweme aweme3 = this.LJLJJLL;
        String str3 = null;
        if (aweme3 != null) {
            awemeRawAd = aweme3.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        boolean z = !NNA.LIZIZ(awemeRawAd);
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJJJJ3 = C78688UuS.LJJJJ(LJJLIIIJJIZ)) != null) {
            str = LJJJJ3.zb0(i);
        } else {
            str = null;
        }
        if (z && (aweme = this.LJLJJLL) != null && aweme.isAd() && o.LJ(str, "page_profile") && (aweme2 = this.LJLJJLL) != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (webUrl = awemeRawAd2.getWebUrl()) != null) {
            IAdLandPageRealtimeResourceModule LJFF = AdLandPageRealtimeResourceModule.LJFF();
            AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel resourceOptimizeModel = AdLandPageResourceOptimizeExperiment.LIZIZ;
            if (O1F.LIZLLL(webUrl) && (resourceOptimizeModel.enablePreConnect || resourceOptimizeModel.enablePrefetch)) {
                String channelName = awemeRawAd2.getChannelName();
                String LIZLLL = LJFF.LIZLLL("feed", channelName);
                if (resourceOptimizeModel.enablePreConnect) {
                    LJFF.LIZ(webUrl, LIZLLL, channelName);
                }
                if (resourceOptimizeModel.enablePrefetch) {
                    LJFF.LIZIZ(webUrl, LIZLLL, channelName, awemeRawAd2);
                }
            }
        }
        C212428Vi.LIZ(this);
        if (NNA.LIZ(getContext(), this.LJLJJLL)) {
            MainActivityScope LJJLIIIJJIZ2 = C78866UxK.LJJLIIIJJIZ(this);
            if (LJJLIIIJJIZ2 != null && (LJJJJ2 = C78688UuS.LJJJJ(LJJLIIIJJIZ2)) != null) {
                str2 = LJJJJ2.zb0(this.LJLL);
            } else {
                str2 = null;
            }
            MainActivityScope LJJLIIIJJIZ3 = C78866UxK.LJJLIIIJJIZ(this);
            if (LJJLIIIJJIZ3 != null && (LJJJJ = C78688UuS.LJJJJ(LJJLIIIJJIZ3)) != null) {
                str3 = LJJJJ.zb0(this.LJLJLLL);
            }
            if (o.LJ(str2, "page_feed") && o.LJ(str3, "page_profile")) {
                v3();
            }
            if (!o.LJ(str2, "page_feed") && o.LJ(str3, "page_feed")) {
                this.LJLJLJ = false;
            }
        }
        this.LJLL = i;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof C54204LPc) {
            ((C54204LPc) view).getOnActionDownListeners().add(this);
            view.setOnTouchListener(new IDTListenerS119S0100000_10(this, 2));
        }
    }

    @Override // X.InterfaceC54203LPb
    public final void LLZIL(float f, float f2) {
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJLJ = false;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        String str;
        Aweme LIZIZ;
        HomePageViewPagerAbility LJJJJ;
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJJJJ = C78688UuS.LJJJJ(LJJLIIIJJIZ)) != null) {
            str = LJJJJ.zb0(this.LJLJLLL);
        } else {
            str = null;
        }
        if (!o.LJ(str, "page_feed")) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (NNA.LIZ(getContext(), this.LJLJJLL)) {
            if (this.LJLJLJ) {
                this.LJLJLJ = false;
                v3();
            }
            for (Map.Entry entry : ((LinkedHashMap) this.LJLLI).entrySet()) {
                NW9 nw9 = (NW9) entry.getKey();
                if (((Number) entry.getValue()).intValue() == 1 && f > this.LJLIL) {
                    nw9.LLILLIZIL(f);
                }
            }
            if (LIZ != null && (LIZIZ = LNH.LIZIZ(LIZ)) != null && f == 0.0f) {
                NNA.LIZ.remove(LIZIZ);
                NNA.LIZIZ = true;
                NNA.LIZLLL = true;
                NNA.LIZJ = false;
            }
        }
        this.LJLIL = f;
    }
}
