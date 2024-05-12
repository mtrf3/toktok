package com.ss.android.ugc.aweme.profile;

import X.AW4;
import X.AWU;
import X.AbstractC51620KNs;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C03880Dg;
import X.C04330Ez;
import X.C10A;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C158056If;
import X.C16880lQ;
import X.C16970lZ;
import X.C19N;
import X.C1B3;
import X.C1B6;
import X.C221018lt;
import X.C227768wm;
import X.C25644A4q;
import X.C25645A4r;
import X.C29S;
import X.C2U8;
import X.C2YJ;
import X.C34084DZg;
import X.C35172DrE;
import X.C35810E3q;
import X.C36922EeM;
import X.C37179EiV;
import X.C38816FLg;
import X.C38987FRv;
import X.C3C5;
import X.C3SZ;
import X.C40471FuV;
import X.C46141I8z;
import X.C48027It5;
import X.C52285KfZ;
import X.C52348Kga;
import X.C52471KiZ;
import X.C53765L8f;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55695LtT;
import X.C56682Ki;
import X.C56722Km;
import X.C59082NGs;
import X.C59222NMc;
import X.C59273NOb;
import X.C59314NPq;
import X.C59601NaH;
import X.C59602NaI;
import X.C59603NaJ;
import X.C59604NaK;
import X.C59606NaM;
import X.C59607NaN;
import X.C61447O9r;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C66415Q4t;
import X.C76800UCe;
import X.C78866UxK;
import X.C78939UyV;
import X.C78977Uz7;
import X.C78983UzD;
import X.C79004UzY;
import X.C84193Sd;
import X.C87277YNd;
import X.C88545Yp3;
import X.C88547Yp5;
import X.C90903hW;
import X.C92J;
import X.C96H;
import X.C96I;
import X.C96J;
import X.C9T4;
import X.C9T8;
import X.C9TA;
import X.C9UE;
import X.DIX;
import X.HG3;
import X.InterfaceC18010nF;
import X.InterfaceC224908sA;
import X.InterfaceC45601Hv3;
import X.InterfaceC53896LDg;
import X.InterfaceC55058LjC;
import X.InterfaceC55235Lm3;
import X.InterfaceC59605NaL;
import X.InterfaceC59608NaO;
import X.InterfaceC59609NaP;
import X.InterfaceC65784Pro;
import X.JBR;
import X.JHI;
import X.KL2;
import X.LKQ;
import X.LKT;
import X.LKW;
import X.LNH;
import X.LNI;
import X.LPQ;
import X.LPS;
import X.LSC;
import X.LTT;
import X.MF8;
import X.NHG;
import X.NN8;
import X.NNA;
import X.NNT;
import X.NOX;
import X.NW9;
import X.RBX;
import X.RunnableC31370CSw;
import X.V16;
import X.X1D;
import X.YFM;
import X.YG5;
import X.Z8A;
import Y.AObjectS49S0101000_4;
import Y.AObjectS50S0101000_5;
import Y.AObserverS58S0101000_2;
import Y.AObserverS60S0101000_5;
import Y.AObserverS73S0200000_9;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS13S0101000_9;
import Y.ARunnableS13S0201000_10;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS8S0201000_5;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.slide.ProfileAdWebModel;
import com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ProfilePageFragment extends CommonPageFragment implements InterfaceC53896LDg, LNI, InterfaceC18010nF, LKT {
    public static final /* synthetic */ int LLIILZL = 0;
    public I18nUserProfileFragmentV2 LJLILLLLZI;
    public InterfaceC59608NaO LJLJI;
    public Object LJLJJI;
    public Fragment LJLJJL;
    public int LJLJJLL;
    public Fragment LJLJLLL;
    public Aweme LJLLI;
    public Aweme LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public AObserverS73S0200000_9 LJZI;
    public C59604NaK LJZL;
    public Bundle LLFFF;
    public C59222NMc LLFII;
    public View LLIIIL;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLL = "";
    public String LJLLL = "other_places";
    public boolean LJLLLL = true;
    public List<Pair<Aweme, Integer>> LL = new ArrayList(2);
    public String LLD = "";
    public String LLF = "";
    public final Object LLFF = new Object();
    public boolean LLFZ = false;
    public boolean LLI = false;
    public boolean LLIFFJFJJ = false;
    public LKQ LLII = null;
    public ARunnableS14S0101000_10 LLIIII = null;
    public InterfaceC65784Pro LLIIIILZ = null;
    public final HashSet<String> LLIIIJ = new HashSet<>(Arrays.asList("page_my_fragment", "page_user_fragment", "page_ad_fragment", "page_fake_user_fragment"));
    public boolean LLIIIZ = true;
    public String LLIIJI = "";
    public boolean LLIIJLIL = false;
    public boolean LLIIL = false;
    public final String LLIILII = "page_profile";

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "page_profile";
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b5836";
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public static boolean mm() {
        try {
            return C2YJ.LIZIZ.LIZ.getProfilePageSkipRemove().booleanValue();
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011b, code lost:
    
        if (r1.equals("click_title") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        return r6.LJLLI.getAwemeRawAd().getAuthorUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        if (r1.equals("click_avatar") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        if (r1.equals("scroll_to_slide") == false) goto L36;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0107. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Nl() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfilePageFragment.Nl():java.lang.String");
    }

    public final void Sl() {
        if (this.LJLJLLL == null && this.LJLJJL == null) {
            return;
        }
        if (this.LJLJJL != null && this.LJLLI.getAwemeRawAd() != null) {
            this.LJLJJLL = 0;
            YFM.LIZIZ.getBulletABHelper().LJFF(this.LJLJJL);
        }
        if (this.LJLJLLL != null) {
            YG5.LIZIZ.getAdFlutterLandPageUtil().LIZIZ(this.LJLJLLL);
        }
    }

    public final boolean dm() {
        if (TextUtils.equals(this.LLD, "click_ad_jsb") && C52285KfZ.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.LKT
    public final boolean hj() {
        return this.LLIIIJ.contains("page_slide_custom_fragment");
    }

    @Override // X.LKT
    public final void p9() {
        C221018lt.LJFF("CustomSlideManager", "hideReplaceableFragment");
        if (this.LJLJJI instanceof Fragment) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIZ((Fragment) this.LJLJJI);
            LIZ.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final boolean vl() {
        MixActivityContainer mixActivityContainer;
        Fragment fragment = this.LJLJJL;
        if (fragment == null) {
            return false;
        }
        if ((fragment instanceof CrossPlatformFragment) && (mixActivityContainer = ((CrossPlatformFragment) fragment).LJLIL) != null) {
            return mixActivityContainer.LJIJI(new ARunnableS12S0101000_8(3, this, 9), false);
        }
        return YFM.LIZIZ.getBulletABHelper().LIZLLL(this.LJLJJL);
    }

    public final void xl() {
        this.LJLL = "page_ad_fragment";
        if (Zl(this.LJLLI)) {
            hm(this.LJLLI);
        }
    }

    @Override // X.LKT
    public final boolean zc() {
        Aweme aweme;
        if (TextUtils.equals(this.LLF, "page_ad_fragment") || TextUtils.equals(this.LLF, "page_fake_user_fragment") || ((aweme = this.LJLLILLLL) != null && (aweme.isAd() || C63081OpJ.LJJLIIIJLLLLLLLZ(this.LJLLILLLL)))) {
            return true;
        }
        return false;
    }

    public final InterfaceC59608NaO Jl() {
        InterfaceC59608NaO interfaceC59608NaO = (InterfaceC59608NaO) getChildFragmentManager().LJJJIL("page_my_fragment");
        if (interfaceC59608NaO == null) {
            interfaceC59608NaO = (InterfaceC59608NaO) YFM.LIZIZ.createMyProfileFragment();
        }
        interfaceC59608NaO.z1(new LPS(this));
        if (!TextUtils.isEmpty(this.LLD)) {
            Fragment fragment = (Fragment) interfaceC59608NaO;
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("enter_from", this.LLD);
            fragment.setArguments(arguments);
        }
        return interfaceC59608NaO;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    public final I18nUserProfileFragmentV2 Ml() {
        getChildFragmentManager().LJJJIL("page_user_fragment");
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = new I18nUserProfileFragmentV2();
        Bundle LIZJ = AnonymousClass036.LIZJ("profile_from", "feed_detail", "previous_page", "homepage_hot");
        LIZJ.putString("is_first_time", "true");
        Bundle arguments = getArguments();
        if (arguments != null) {
            LIZJ.putInt("from_recommend_card", arguments.getInt("from_recommend_card", 0));
        }
        i18nUserProfileFragmentV2.setArguments(LIZJ);
        i18nUserProfileFragmentV2.Hi(new AWU() { // from class: X.LPT
            @Override // X.AWU
            public final void LJI() {
                ProfilePageFragment profilePageFragment = ProfilePageFragment.this;
                profilePageFragment.getClass();
                C54154LNe.LJ("profile_2_feed", "click_back");
                profilePageFragment.nm();
            }
        });
        i18nUserProfileFragmentV2.LLII(this.LJLLJ);
        i18nUserProfileFragmentV2.setPreviousPage(this.LJLLJ);
        i18nUserProfileFragmentV2.W0("other_places");
        return i18nUserProfileFragmentV2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.NaK] */
    public final void Rl() {
        Aweme aweme;
        final int i;
        MainActivityScope LJJLIIIJJI;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        SlideAdWebPreloadAbility slideAdWebPreloadAbility;
        if (mo49getActivity() == null || (aweme = this.LJLLI) == null || !NNA.LIZ(getContext(), aweme)) {
            return;
        }
        if (NNA.LIZIZ(this.LJLLI.getAwemeRawAd())) {
            i = ((ProfileAdWebModel) NN8.LIZIZ.getValue()).preloadLynxProcess;
        } else {
            i = ((ProfileAdWebModel) NN8.LIZIZ.getValue()).preloadWebProcess;
        }
        this.LJZL = new NW9() { // from class: X.NaK
            @Override // X.NW9
            public final void LLILLIZIL(float f) {
                ProfilePageFragment profilePageFragment = ProfilePageFragment.this;
                int i2 = i;
                profilePageFragment.getClass();
                if (profilePageFragment.mo49getActivity() != null && NNA.LIZIZ && Math.ceil(f * 100.0f) >= i2) {
                    profilePageFragment.hm(profilePageFragment.LJLLI);
                    NNA.LIZJ = true;
                    NNA.LIZIZ = false;
                }
            }
        };
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C59604NaK listener = this.LJZL;
        o.LJIIIZ(listener, "listener");
        if (mo49getActivity != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) != null && (interfaceC55235Lm3 = LJJLIIIJJI.LJLIL) != null && (slideAdWebPreloadAbility = (SlideAdWebPreloadAbility) C55096Ljo.LIZ(interfaceC55235Lm3, SlideAdWebPreloadAbility.class, null)) != null) {
            slideAdWebPreloadAbility.G10(listener);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Vl() {
        LKQ lkq;
        LKQ lkq2;
        if (!isViewValid()) {
            return;
        }
        if (mo49getActivity() != null) {
            LTT.LJ(mo49getActivity());
        }
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = this.LJLILLLLZI;
        if (i18nUserProfileFragmentV2 != null) {
            i18nUserProfileFragmentV2.x6(true);
        }
        if (this.LL.size() > 0) {
            List<Pair<Aweme, Integer>> list = this.LL;
            Pair pair = (Pair) DIX.LIZJ(list, 1, list);
            List<Pair<Aweme, Integer>> list2 = this.LL;
            ListProtector.set(list2, list2.size() - 1, Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 16)));
        }
        Aweme aweme = this.LJLLI;
        if (aweme != null && aweme.isAd() && (((C52285KfZ.LIZ() && C63081OpJ.LJL(this.LJLLI)) || dm() || ((C34084DZg.LIZ || CommerceWebCrossToSparkExt.LIZ() || C52471KiZ.LIZ()) && ((this.LJLLI.getAwemeRawAd().getAdWebUrlDataFromJsb() != null && !TextUtils.isEmpty(this.LJLLI.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl())) || (!TextUtils.isEmpty(this.LJLLI.getAwemeRawAd().getWebUrl()))))) && ((lkq = this.LLII) == null || !lkq.LIZIZ(mo49getActivity())))) {
            List<Pair<Aweme, Integer>> list3 = this.LL;
            Aweme aweme2 = (Aweme) ((Pair) DIX.LIZJ(list3, 1, list3)).first;
            if (!C35172DrE.LIZ() ? !TextUtils.equals(this.LJLL, Kl(aweme2)) || dm() : !TextUtils.equals(this.LJLL, Kl(aweme2)) || TextUtils.equals(Kl(aweme2), "page_ad_fragment")) {
                String Kl = Kl(aweme2);
                switch (Kl.hashCode()) {
                    case 187588924:
                        if (Kl.equals("page_ad_fragment")) {
                            om(aweme2, true, false);
                            xl();
                            break;
                        }
                        Dl(aweme2);
                        break;
                    case 267192787:
                        if (Kl.equals("page_my_fragment")) {
                            Dl(aweme2);
                            InterfaceC59608NaO interfaceC59608NaO = this.LJLJI;
                            if (interfaceC59608NaO != null) {
                                interfaceC59608NaO.LLIFFJFJJ(this.LJLLI);
                                break;
                            }
                        }
                        Dl(aweme2);
                        break;
                    case 929385108:
                        if (Kl.equals("page_user_fragment")) {
                            Dl(aweme2);
                            Gl(aweme2);
                            break;
                        }
                        Dl(aweme2);
                        break;
                    case 1157058698:
                        if (Kl.equals("page_fake_user_fragment")) {
                        }
                        Dl(aweme2);
                        break;
                    case 1497212704:
                        if (Kl.equals("page_slide_custom_fragment")) {
                        }
                        Dl(aweme2);
                        break;
                    default:
                        Dl(aweme2);
                        break;
                }
            }
        }
        if (!TextUtils.equals(this.LLD, "click_top_icon") && ((lkq2 = this.LLII) == null || !lkq2.LIZIZ(mo49getActivity()))) {
            List<Pair<Aweme, Integer>> list4 = this.LL;
            pm(1, list4);
            this.LL = list4;
        }
        if (NNA.LIZ(getContext(), this.LJLLI) && this.LJLJJL != null) {
            YFM.LIZIZ.getBulletABHelper().LJ(this.LJLJJL);
        }
        View view = getView();
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null && c88545Yp3.isConnected() && (view instanceof ViewGroup)) {
            c88545Yp3.LIZ().addPlayBackControls((ViewGroup) view);
        }
    }

    public final void nm() {
        C84193Sd.LIZ(mo49getActivity()).E50("page_feed", true);
    }

    @Override // X.LKT
    public final void o9() {
        Fragment fragment;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showReplaceableFragment:");
        LIZ.append(this.LLF);
        LIZ.append(" ");
        LIZ.append(this.LJLJJI);
        C221018lt.LJFF("CustomSlideManager", X1D.LIZIZ(LIZ));
        if (!(this.LJLJJI instanceof Fragment)) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ2.LJIIL((Fragment) this.LJLJJI);
        LKQ lkq = this.LLII;
        if (lkq != null && (fragment = lkq.LJFF) != null) {
            C221018lt.LJFF("CustomSlideManager", "hideCustomSlidePage");
            lkq.LJII = false;
            LIZ2.LJIIIZ(fragment);
        }
        this.LJLL = this.LLF;
        LIZ2.LJI();
        if (mo49getActivity() != null) {
            Hox.kv0(mo49getActivity()).Av0("profile_fake_child");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LKQ lkq = this.LLII;
        if (lkq != null) {
            lkq.getClass();
            EventBus.LIZJ().LJIJ(lkq);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ARunnableS14S0101000_10 aRunnableS14S0101000_10 = this.LLIIII;
        if (aRunnableS14S0101000_10 != null) {
            C38816FLg.LIZ(aRunnableS14S0101000_10);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C48027It5.LIZLLL("profile", "");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Hox.kv0(mo49getActivity()).uv0(this)) {
            C12460eI.LJIIIIZZ(this, mo49getActivity());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin;
        super.onStart();
        if (this.LLI && (createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false)) != null) {
            createIBenchmarkServicebyMonsterPlugin.startBenchmark(2);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin;
        super.onStop();
        if (this.LLI && (createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false)) != null) {
            createIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
    }

    @Override // X.LKT
    public final String k9() {
        return this.LJLL;
    }

    public static boolean Pl(Aweme aweme) {
        if (aweme != null && TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthorUid())) {
            return true;
        }
        return false;
    }

    public static boolean Zl(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getPreloadWeb() == 7) {
            return true;
        }
        return false;
    }

    public final Fragment Al(Aweme aweme) {
        Bundle Ll;
        C59222NMc Hl;
        if (e1.LIZ(31744, "profile_params_async_open", true, false)) {
            synchronized (this.LLFF) {
                Bundle bundle = this.LLFFF;
                if (bundle != null && C16880lQ.LLJJIII(bundle, "aweme_id") == aweme.getAid()) {
                    Ll = this.LLFFF;
                } else {
                    Ll = Ll(aweme);
                }
                C59222NMc c59222NMc = this.LLFII;
                if (c59222NMc != null && TextUtils.equals(c59222NMc.LJFF, aweme.getAid())) {
                    Hl = this.LLFII;
                } else {
                    Hl = Hl(aweme);
                }
            }
        } else {
            Ll = Ll(aweme);
            Hl = Hl(aweme);
        }
        if (TextUtils.equals(this.LLD, "click_ad_jsb") && C52285KfZ.LIZ()) {
            this.LLIIJI = "";
        } else if (C63081OpJ.LJL(aweme)) {
            this.LLIIJI = "";
        } else if (em(aweme)) {
            this.LLIIJI = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl();
        } else {
            this.LLIIJI = aweme.getAwemeRawAd().getWebUrl();
        }
        InterfaceC59605NaL bulletABHelper = YFM.LIZIZ.getBulletABHelper();
        Fragment LJII = bulletABHelper.LJII(mo49getActivity(), Ll, Hl, Nl());
        bulletABHelper.LJIIIZ(LJII, new ARunnableS12S0101000_8(3, this, 33));
        bulletABHelper.LJIIIIZZ(LJII, new ARunnableS13S0101000_9(4, this, 6));
        if (!TextUtils.equals(C16880lQ.LJLLJ(LJII.getClass()), "AdWebSparkFragment")) {
            LJII.setArguments(Ll);
        }
        return LJII;
    }

    public final void Dl(Aweme aweme) {
        boolean z;
        InterfaceC59608NaO interfaceC59608NaO;
        AW4 createFakeUserProfileFragment;
        if (!isViewValid()) {
            return;
        }
        this.LJLZ = true;
        if (!TextUtils.equals(C227768wm.LIZIZ(this.LJLLI), C227768wm.LIZIZ(aweme)) || aweme.getAwemeType() == 4003 || aweme.getAwemeType() == 4004) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LJI = JBR.LJI("doAwemeChange(), isAwemeChange is ", z, ", old aid is ");
        LJI.append(C227768wm.LIZIZ(this.LJLLI));
        LJI.append(", new aiddoAweme is ");
        LJI.append(C227768wm.LIZIZ(aweme));
        C87277YNd.LIZLLL(X1D.LIZIZ(LJI));
        this.LJLLI = aweme;
        if ((C52285KfZ.LIZ() && fm(aweme)) || em(aweme) || cm(aweme)) {
            Rl();
            if (C35172DrE.LIZ() || (true ^ TextUtils.equals(this.LLD, "click_ad_jsb"))) {
                om(aweme, z, z);
                xl();
                this.LLIIIZ = false;
                return;
            }
            return;
        }
        YG5 yg5 = YG5.LIZIZ;
        if (yg5.shouldShowFakeUserProfile(aweme)) {
            Bundle bundle = new Bundle();
            if (aweme != null && C78977Uz7.LJJLIIIJJIZ(aweme.getAwemeRawAd())) {
                createFakeUserProfileFragment = yg5.createNewFakeUserProfileFragment();
                bundle.putAll(Ll(aweme));
            } else {
                createFakeUserProfileFragment = yg5.createFakeUserProfileFragment();
            }
            if (createFakeUserProfileFragment != null) {
                bundle.putString("aweme_id", aweme.getAid());
                bundle.putString("enter_from", this.LJLLJ);
                createFakeUserProfileFragment.qd().setArguments(bundle);
            }
            if (createFakeUserProfileFragment != null) {
                Xl(createFakeUserProfileFragment.qd(), "page_fake_user_fragment");
                this.LJLJJI = createFakeUserProfileFragment;
            }
            this.LJLL = "page_fake_user_fragment";
            return;
        }
        if (yg5.shouldShowAdBrowser(aweme)) {
            Rl();
            InterfaceC59609NaP adFlutterLandPageUtil = yg5.getAdFlutterLandPageUtil();
            aweme.getAwemeRawAd();
            adFlutterLandPageUtil.LIZJ();
            om(aweme, z, z);
            this.LLIIIZ = false;
            xl();
            return;
        }
        if (mm()) {
            this.LJLJJL = null;
            this.LJLJLLL = null;
        } else {
            if (this.LJLJJL != null && !Ol("page_ad_fragment")) {
                Wl(this.LJLJJL);
                this.LJLJJL = null;
            }
            if (this.LJLJLLL != null && !Ol("page_ad_fragment")) {
                Wl(this.LJLJLLL);
                this.LJLJLLL = null;
            }
        }
        LKQ lkq = this.LLII;
        if (lkq != null && lkq.LIZIZ(mo49getActivity())) {
            this.LLII.LJ(false);
            this.LJLL = "page_slide_custom_fragment";
            return;
        }
        if (Pl(aweme)) {
            if (!Ol("page_my_fragment")) {
                if (this.LJLJI == null) {
                    this.LJLJI = Jl();
                }
                if (!C54838Lfe.LJJI(aweme)) {
                    Xl((Fragment) this.LJLJI, "page_my_fragment");
                    this.LJLJJI = this.LJLJI;
                }
                this.LJLL = "page_my_fragment";
            } else if (!C54838Lfe.LJJI(aweme) && !(this.LJLJJI instanceof InterfaceC59608NaO)) {
                if (this.LJLJI == null) {
                    this.LJLJI = Jl();
                }
                Xl((Fragment) this.LJLJI, "page_my_fragment");
                this.LJLJJI = this.LJLJI;
                this.LJLL = "page_my_fragment";
            }
            if (!z || (interfaceC59608NaO = this.LJLJI) == null) {
                return;
            }
            interfaceC59608NaO.LLIFFJFJJ(this.LJLLI);
            return;
        }
        if (!Ol("page_user_fragment")) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = Ml();
            }
            I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = this.LJLILLLLZI;
            Xl(i18nUserProfileFragmentV2, "page_user_fragment");
            this.LJLJJI = i18nUserProfileFragmentV2;
            this.LJLL = "page_user_fragment";
        }
        if (!z) {
            return;
        }
        Gl(aweme);
    }

    public final void Gl(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            if (C9T4.LIZIZ(aweme)) {
                this.LJLILLLLZI.clearData();
                this.LJLILLLLZI.ye("", "");
                this.LJLILLLLZI.D4();
                return;
            }
            return;
        }
        if (mo49getActivity() != null && !mo49getActivity().isFinishing() && this.LJLILLLLZI != null) {
            aweme.getAid();
            TextUtils.equals(this.LJLLJ, "homepage_hot");
            this.LJLILLLLZI.clearData();
            this.LJLILLLLZI.ye(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            this.LJLILLLLZI.ol(aweme);
            Yl(2, aweme);
            MF8.LIZIZ(0, aweme.getAuthorUid());
        }
    }

    public final C59222NMc Hl(Aweme aweme) {
        String LIZ;
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        C59222NMc c59222NMc = new C59222NMc();
        c59222NMc.LIZ = aweme.getAwemeRawAd();
        c59222NMc.LIZIZ = aweme.getAwemeRawAd().getWebTitle();
        c59222NMc.LIZJ = aweme.getAwemeRawAd().getWebUrl();
        c59222NMc.LIZLLL = "feedad";
        int i = JHI.LIZ().LJIIIIZZ;
        if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(i)))) {
            LIZ = JHI.LIZ().LJIIIZ;
        } else {
            LIZ = NNT.LIZ(Integer.valueOf(i));
        }
        this.LJLJLJ = LIZ;
        c59222NMc.LJ = LIZ;
        c59222NMc.LJFF = aweme.getAid();
        c59222NMc.LJI = aweme.getAuthorUid();
        c59222NMc.LJII = true;
        c59222NMc.LJIIIIZZ = 1;
        c59222NMc.LJIIIZ = aweme.getRequestId();
        String uuid = UUID.randomUUID().toString();
        this.LJLJL = uuid;
        o.LJIIIZ(uuid, "<set-?>");
        c59222NMc.LJIIJ = uuid;
        if (em(aweme)) {
            c59222NMc.LIZJ = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl();
            c59222NMc.LIZIZ = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebTitle();
            c59222NMc.LJIIL = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().isFromJsb();
            c59222NMc.LJ = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getRefer();
            c59222NMc.LJIIIIZZ = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getUseWebUrl();
        }
        try {
            Uri parse = UriProtector.parse(c59222NMc.LIZJ);
            c59222NMc.LJIJJLI = parse.getBooleanQueryParameter("hide_nav_bar", false);
            c59222NMc.LJIL = parse.getBooleanQueryParameter("hide_title_bar", false);
            String queryParameter = UriProtector.getQueryParameter(parse, "has_adinfojson");
            o.LJIIIZ(queryParameter, "<set-?>");
            c59222NMc.LJIJ = queryParameter;
            String queryParameter2 = UriProtector.getQueryParameter(parse, "adinfojson");
            o.LJIIIZ(queryParameter2, "<set-?>");
            c59222NMc.LJIJI = queryParameter2;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        return c59222NMc;
    }

    public final String Kl(Aweme aweme) {
        if ((C52285KfZ.LIZ() && fm(aweme)) || em(aweme) || cm(aweme)) {
            return "page_ad_fragment";
        }
        YG5 yg5 = YG5.LIZIZ;
        if (yg5.shouldShowFakeUserProfile(aweme)) {
            return "page_fake_user_fragment";
        }
        if (yg5.shouldShowAdBrowser(aweme)) {
            return "page_ad_fragment";
        }
        if (Pl(aweme)) {
            return "page_my_fragment";
        }
        return "page_user_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    @Override // X.LNI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfilePageFragment.LJJLIIIJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin;
        List<Pair<Aweme, Integer>> list = this.LL;
        pm(2, list);
        this.LL = list;
        View view = getView();
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null && c88545Yp3.isConnected() && (view instanceof ViewGroup)) {
            c88545Yp3.LIZ().removePlayBackControls((ViewGroup) view);
        }
        LKQ lkq = this.LLII;
        if (lkq != null) {
            lkq.LIZLLL("");
            lkq.LJIIIIZZ = false;
            lkq.LIZJ(false, bundle);
            lkq.LJIIJ = false;
            lkq.LIZJ = false;
        }
        if (this.LLI && (createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false)) != null) {
            createIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
        this.LLI = false;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && C40471FuV.LIZ()) {
            if ((C53765L8f.LJIJ() || C53765L8f.LJIJJLI()) && "HOME".equals(C116694i1.LIZ(mo49getActivity).nv0())) {
                LTT.LIZJ(mo49getActivity);
            }
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle bundle) {
        String str;
        String sv0 = Hox.kv0(mo49getActivity()).sv0(this.LLIILII);
        String str2 = "";
        if (bundle.getString("fromStart", "").equals("RootNode") || bundle.getBoolean(sv0)) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            C9T8.LIZ.getClass();
            if (((Number) C9T8.LIZIZ.getValue()).intValue() != 2) {
                C9TA.LIZ.getClass();
                if (((Number) C9TA.LIZIZ.getValue()).intValue() != 2) {
                    Z8A.LIZIZ.preloadProfile(mo49getActivity, this.LLIILII);
                }
            }
            int i = C92J.LIZ.LIZJ;
            if (i == 1) {
                if (C96J.LJ) {
                    C35810E3q.LJIIIZ(5000, C25645A4r.LIZ);
                }
            } else if (i == 2) {
                if (C96I.LJ) {
                    C35810E3q.LJIIIZ(5000, C25644A4q.LIZ);
                }
            } else if (i == 3 && C96H.LJ) {
                C35810E3q.LJIIIZ(5000, null);
            }
            C2U8.LIZ(new C56682Ki(false));
            C2U8.LIZ(new C56722Km());
            TextUtils.isEmpty(V16.LIZJ);
            HomePageDataViewModel LIZ = C3SZ.LIZ(mo49getActivity);
            Aweme aweme = LIZ.LJLJJL;
            String str3 = LIZ.LJLJJI;
            if (aweme == null) {
                str = "";
            } else {
                str = aweme.getAid();
            }
            LPQ.LIZIZ = str3;
            if (str != null) {
                str2 = str;
            }
            LPQ.LIZJ = str2;
            LPQ.LIZ = SystemClock.uptimeMillis();
            C2U8.LIZ(new C46141I8z());
            ((MainAnimViewModel) ViewModelProviders.of(mo49getActivity).get(MainAnimViewModel.class)).LJLJI.setValue(this.LLIILII);
            C38987FRv.LJI(LSC.PROFILE);
            LIZ.LJLL = false;
        }
        Vl();
        LKQ lkq = this.LLII;
        if (lkq != null) {
            lkq.LIZJ(true, bundle);
        }
        YFM.LIZIZ.onFeedStop();
        this.LLI = true;
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (createIBenchmarkServicebyMonsterPlugin != null) {
            createIBenchmarkServicebyMonsterPlugin.startBenchmark(2);
        }
        C12460eI.LJIIIIZZ(this, mo49getActivity());
    }

    public final Bundle Ll(Aweme aweme) {
        String webTitle;
        String jSONObject;
        LandingPageSurveyModel landingPageSurveyModel;
        String LIZ;
        boolean z;
        String str;
        Bundle LJJIJIL;
        if (dm() && (LJJIJIL = FeedAdServiceImpl.LJJIJLIJ().LJJIJIL()) != null) {
            return LJJIJIL;
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putBoolean("control_request_url", true);
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            webTitle = aweme.getAwemeRawAd().getSource();
        } else {
            webTitle = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString("bundle_download_app_name", webTitle);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().LIZ());
        bundle.putBoolean("use_ordinary_web", C78939UyV.LJJIZ(aweme.getAwemeRawAd()));
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putBoolean("web_apply_camera", aweme.getAwemeRawAd().getWebApplyCamera());
        if (aweme.getAwemeRawAd().getAutofillModel() != null) {
            bundle.putBoolean("autofill_enable", aweme.getAwemeRawAd().getAutofillModel().getEnable());
        }
        if (aweme.getAwemeRawAd().getLandingPageNetworkOptimization() != null) {
            bundle.putInt("network_optimization_type", aweme.getAwemeRawAd().getLandingPageNetworkOptimization().getNetworkOptimization());
        }
        bundle.putString("aweme_id", aweme.getAid());
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        String webTitle2 = aweme.getAwemeRawAd().getWebTitle();
        if (TextUtils.isEmpty(webTitle2)) {
            webTitle2 = " ";
        }
        bundle.putString("bundle_web_title", webTitle2);
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        YG5 yg5 = YG5.LIZIZ;
        String str2 = "";
        JSONObject extJson = yg5.getExtJson(getContext(), aweme, "");
        if (extJson == null) {
            jSONObject = "";
        } else {
            jSONObject = extJson.toString();
        }
        bundle.putString("aweme_json_extra", jSONObject);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (groupId != null && groupId.longValue() != 0) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        if (aweme.getAwemeRawAd().getSplashInfo() != null) {
            bundle.putString("preload_scene", "splash");
        } else {
            bundle.putString("preload_scene", "feed");
        }
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putString("commerce_enter_from", "feedad");
        bundle.putInt("charge_type", aweme.getAwemeRawAd().getChargeType());
        if (aweme.getAwemeRawAd() != null) {
            landingPageSurveyModel = aweme.getAwemeRawAd().getLandingPageSurvey();
            bundle.putLong("raw_ad_data_ad_id", aweme.getAwemeRawAd().getAdId().longValue());
        } else {
            landingPageSurveyModel = null;
        }
        this.LJLJL = UUID.randomUUID().toString();
        int i = JHI.LIZ().LJIIIIZZ;
        if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(i)))) {
            LIZ = JHI.LIZ().LJIIIZ;
        } else {
            LIZ = NNT.LIZ(Integer.valueOf(i));
        }
        this.LJLJLJ = LIZ;
        bundle.putString("session_id", this.LJLJL);
        bundle.putInt("preload_h5_type", aweme.getAwemeRawAd().getPreloadH5Type());
        bundle.putString("refer", this.LJLJLJ);
        bundle.putString("req_id", aweme.getRequestId());
        if (landingPageSurveyModel != null) {
            bundle.putBoolean("ad_landing_enable_landing_page_survey", landingPageSurveyModel.getEnableLandingPageSurvey());
            bundle.putLong("ad_landing_show_survey_time_interval", landingPageSurveyModel.getShowSurveyTimeInterval());
            bundle.putLong("ad_landing_page_dwell_time", landingPageSurveyModel.getPageDwellTime());
            bundle.putString("ad_landing_page_schema_url", landingPageSurveyModel.getSchemaUrl());
        }
        Context context = getContext();
        if (context != null && aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", C04330Ez.LIZIZ(context, R.color.ar));
        } else {
            bundle.putInt("bundle_webview_background", -1);
        }
        if (aweme.getAwemeRawAd().getWebviewProgressBar() == 1) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
        yg5.getAdLynxLandPageUtil();
        if (NOX.LIZJ(aweme.getAwemeRawAd()) && !cm(aweme) && !em(aweme)) {
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("should_full_screen", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            if (aweme.getAwemeRawAd().getNativeSiteConfig().getLynxLandingStyle() == 1) {
                if (aweme.getVideo() != null && aweme.getVideo().getOriginCover() != null && !C79004UzY.LJJIFFI(aweme.getVideo().getOriginCover().getUrlList())) {
                    bundle.putString("bundle_full_screen_bg_image", (String) ListProtector.get(aweme.getVideo().getOriginCover().getUrlList(), 0));
                }
                bundle.putInt("bundle_webview_background", 0);
            }
            List<String> geckoChannel = aweme.getAwemeRawAd().getNativeSiteConfig().getGeckoChannel();
            if (C79004UzY.LJJIFFI(geckoChannel)) {
                str = "";
            } else {
                str = (String) ListProtector.get(geckoChannel, 0);
            }
            bundle.putString("lynx_channel_name", str);
            bundle.putString("page_id", aweme.getAwemeRawAd().getPageId());
            bundle.putString("bundle_native_site_custom_data", aweme.getAwemeRawAd().getNativeSiteCustomData());
            if (!C79004UzY.LJJIFFI(aweme.getAwemeRawAd().getNativeSiteConfig().getSecondPageGeckoChannel())) {
                if (LJJI != null) {
                    str2 = LJJI.LIZLLL(aweme.getAwemeRawAd().getAdId());
                }
                bundle.putString("second_page_preload_channel_prefix", str2);
            }
            bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(context), 1073741824));
            bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(context) - C63081OpJ.LJJJJLI(requireContext()), 1073741824));
            Uri parse = UriProtector.parse(aweme.getAwemeRawAd().getNativeSiteConfig().getLynxScheme());
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", UriProtector.getQueryParameter(parse, "fallback_url"));
                if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", 2);
                }
            }
        }
        bundle.putBoolean("hide_web_button", aweme.getAwemeRawAd().isHideWebButton());
        bundle.putBoolean("bundle_show_lynx_bottom_label", aweme.getAwemeRawAd().isShowWebViewBottomLynxButton());
        bundle.putString("bundle_lynx_bottom_label_template_url", aweme.getAwemeRawAd().getLynxButtonUrl());
        bundle.putString("bundle_lynx_bottom_label_data", aweme.getAwemeRawAd().getLynxRawData());
        if (em(aweme)) {
            bundle.putString("url", aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl());
            bundle.putBoolean("is_lynx_landing_page", false);
            bundle.putString("bundle_web_title", aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebTitle());
            bundle.putBoolean("is_from_jsb", aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().isFromJsb());
            bundle.putBoolean("is_from_lynx_land_page", aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().isFromLynxLandPage());
            bundle.putString("refer", aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getRefer());
        }
        return bundle;
    }

    @Override // X.LKT
    public final void Mf(final Bundle bundle) {
        InterfaceC65784Pro interfaceC65784Pro = new InterfaceC65784Pro() { // from class: X.LKV
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                ProfilePageFragment profilePageFragment = ProfilePageFragment.this;
                Bundle args = bundle;
                if (profilePageFragment.LLII == null) {
                    return null;
                }
                if (args != null) {
                    String string = args.getString("enter_from", "");
                    if (!TextUtils.isEmpty(string)) {
                        profilePageFragment.LLD = string;
                        profilePageFragment.LLII.LIZLLL(string);
                    }
                }
                LKQ lkq = profilePageFragment.LLII;
                lkq.LIZJ = true;
                lkq.LJIIIIZZ = true;
                o.LJIIIZ(args, "args");
                lkq.LJIIIZ = args;
                profilePageFragment.LLII.LJ(true);
                return null;
            }
        };
        if (isAdded()) {
            interfaceC65784Pro.invoke();
        } else {
            this.LLIIIILZ = interfaceC65784Pro;
        }
    }

    public final boolean Ol(String str) {
        return TextUtils.equals(this.LJLL, str);
    }

    public final void Ql(C59314NPq c59314NPq) {
        C59273NOb c59273NOb;
        if (c59314NPq == null || (c59273NOb = c59314NPq.LIZIZ) == null || c59314NPq.LIZ == null || c59273NOb.LIZ <= 0) {
            return;
        }
        if (TextUtils.equals(this.LLD, "scroll_to_slide")) {
            this.LJLJLJ = NNT.LIZ(40);
        } else {
            String LIZ = NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ));
            this.LJLJLJ = LIZ;
            if (TextUtils.isEmpty(LIZ)) {
                this.LJLJLJ = JHI.LIZ().LJIIIZ;
            }
        }
        C59273NOb c59273NOb2 = c59314NPq.LIZIZ;
        c59273NOb2.LJIIIZ = this.LJLJLJ;
        String uuid = UUID.randomUUID().toString();
        o.LJIIIZ(uuid, "<set-?>");
        c59273NOb2.LJJL = uuid;
        c59314NPq.LIZIZ.LJJLI = System.currentTimeMillis();
        C59273NOb c59273NOb3 = c59314NPq.LIZIZ;
        AdWebLogService.LJFF().LJ(c59273NOb3.LJJIFFI, String.valueOf(c59273NOb3.LIZ), c59273NOb3.LJJIII, c59273NOb3.LJIIIIZZ, c59273NOb3.LJJJLL, c59273NOb3.LJJL, c59273NOb3.LJIIIZ, c59314NPq.LIZ.LIZJ);
    }

    public final void Tl(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String LIZ;
        String LIZ2;
        if (this.LJLJLLL == null && this.LJLJJL == null) {
            return;
        }
        if (aweme != null) {
            YG5.LIZIZ.getAdLynxLandPageUtil();
            if (NOX.LIZJ(aweme.getAwemeRawAd()) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !TextUtils.equals(this.LLD, "click_ad_web_jsb") && !TextUtils.equals(this.LLD, "click_ad_jsb")) {
                if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ)))) {
                    LIZ = JHI.LIZ().LJIIIZ;
                } else {
                    LIZ = NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ));
                }
                AdWebLogService.LJFF().LIZIZ(awemeRawAd.getCreativeIdStr(), awemeRawAd.getLogExtra(), "draw_ad", this.LJLJL, LIZ);
            }
        }
        YG5 yg5 = YG5.LIZIZ;
        yg5.onProfileWebPageShow(getContext(), aweme, this.LLD);
        if (this.LJLJJL != null) {
            if (TextUtils.equals(this.LLD, "scroll_to_slide")) {
                this.LJLJLJ = NNT.LIZ(40);
            } else {
                int i = JHI.LIZ().LJIIIIZZ;
                if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(i)))) {
                    LIZ2 = JHI.LIZ().LJIIIZ;
                } else {
                    LIZ2 = NNT.LIZ(Integer.valueOf(i));
                }
                this.LJLJLJ = LIZ2;
            }
            YFM.LIZIZ.getBulletABHelper().LIZ(this.LJLJJL, this.LJLJLJ);
        }
        if (this.LJLJLLL != null) {
            yg5.getAdFlutterLandPageUtil().LIZ(this.LJLJLLL);
        }
    }

    public final void Wl(Fragment fragment) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeFragment:");
        LIZ.append(fragment);
        C221018lt.LJFF("CustomSlideManager", X1D.LIZIZ(LIZ));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJJI(fragment);
        c1b3.LJI();
    }

    @Override // X.LKT
    public final void X2(String str) {
        this.LJLL = "page_slide_custom_fragment";
    }

    public final boolean cm(Aweme aweme) {
        if ((!C52471KiZ.LIZ() && !C34084DZg.LIZ && !CommerceWebCrossToSparkExt.LIZ()) || aweme == null || !aweme.isAd() || TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        if (!TextUtils.equals(this.LLD, "click_ad_web") && (!TextUtils.equals(this.LLD, "scroll_to_slide") || this.LJLJJLL != 1)) {
            return false;
        }
        return true;
    }

    public final boolean em(Aweme aweme) {
        if ((!C52471KiZ.LIZ() && !C34084DZg.LIZ && !CommerceWebCrossToSparkExt.LIZ()) || aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdWebUrlDataFromJsb() == null || TextUtils.isEmpty(aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl())) {
            return false;
        }
        if (!TextUtils.equals(this.LLD, "click_ad_web_jsb") && (!TextUtils.equals(this.LLD, "scroll_to_slide") || this.LJLJJLL != 2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r4.equals("click_ad_text") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        if (r4.equals("click_ad_mask") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        if (r4.equals("click_ad_web") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r4.equals("click_ad_jsb") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        if (r4.equals("click_ad_web_jsb") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
    
        if (r4.equals("click_ad_button") == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0035. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fm(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            boolean r0 = X.C63081OpJ.LJL(r7)
            java.lang.String r5 = "click_ad_jsb"
            if (r0 != 0) goto Lf
            java.lang.String r0 = r6.LLD
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            return r0
        Lf:
            java.lang.String r4 = r6.LLD
            r3 = 1
            r2 = 0
            if (r4 != 0) goto L30
            X.YG5 r0 = X.YG5.LIZIZ
            boolean r0 = r0.shouldShowFakeUserProfile(r7)
            if (r0 != 0) goto L2e
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            boolean r0 = r0.isAdFake()
            if (r0 == 0) goto L2e
        L2d:
            return r3
        L2e:
            r3 = 0
            goto L2d
        L30:
            int r0 = r4.hashCode()
            r1 = 3
            switch(r0) {
                case -890687273: goto L7a;
                case -859113527: goto L71;
                case 176585908: goto L6a;
                case 176597967: goto L61;
                case 1179268561: goto L58;
                case 1179481106: goto L4f;
                default: goto L38;
            }
        L38:
            boolean r0 = X.C52285KfZ.LIZ()
            if (r0 == 0) goto L83
            java.lang.String r2 = r6.LLD
            java.lang.String r0 = "scroll_to_slide"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L83
            int r0 = r6.LJLJJLL
            if (r0 != r1) goto L4d
        L4c:
            return r3
        L4d:
            r3 = 0
            goto L4c
        L4f:
            java.lang.String r0 = "click_ad_text"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9f
            goto L38
        L58:
            java.lang.String r0 = "click_ad_mask"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9f
            goto L38
        L61:
            java.lang.String r0 = "click_ad_web"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9e
            goto L38
        L6a:
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L9f
            goto L38
        L71:
            java.lang.String r0 = "click_ad_web_jsb"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9e
            goto L38
        L7a:
            java.lang.String r0 = "click_ad_button"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L9f
            goto L38
        L83:
            X.YG5 r0 = X.YG5.LIZIZ
            boolean r0 = r0.shouldShowFakeUserProfile(r7)
            if (r0 != 0) goto L9c
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            boolean r0 = r0.isAdFake()
            if (r0 == 0) goto L9c
        L9b:
            return r3
        L9c:
            r3 = 0
            goto L9b
        L9e:
            return r2
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfilePageFragment.fm(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final void hm(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (this.LJLJLLL == null && this.LJLJJL == null) {
            return;
        }
        if (!C35172DrE.LIZ() && NNA.LIZ(getContext(), aweme) && NNA.LIZJ) {
            return;
        }
        Fragment fragment = this.LJLJJL;
        if (fragment != null) {
            if (fragment instanceof CrossPlatformFragment) {
                CrossPlatformFragment crossPlatformFragment = (CrossPlatformFragment) fragment;
                MixActivityContainer mixActivityContainer = crossPlatformFragment.LJLIL;
                if (mixActivityContainer != null) {
                    Ql(crossPlatformFragment.LJLILLLLZI);
                    km(aweme, mixActivityContainer.LJLILLLLZI.LIZJ.LJJ);
                } else {
                    getChildFragmentManager().LJJLIL(new C59601NaH(this, aweme), false);
                }
            } else if (fragment instanceof SparkFragment) {
                if (((SparkFragment) fragment).LJLJI != null) {
                    km(aweme, new C59607NaN(this.LJLJJL.getArguments()).LIZ());
                } else {
                    getChildFragmentManager().LJJLIL(new C59602NaI(this, aweme), false);
                }
            } else {
                InterfaceC59605NaL bulletABHelper = YFM.LIZIZ.getBulletABHelper();
                boolean LIZJ = bulletABHelper.LIZJ(this.LJLJJL);
                if (bulletABHelper.LJI(this.LJLJJL)) {
                    km(aweme, LIZJ);
                } else {
                    getChildFragmentManager().LJJLIL(new C59603NaJ(this, bulletABHelper, aweme, LIZJ), false);
                }
            }
        }
        if (this.LJLJLLL != null && !Zl(aweme)) {
            Tl(aweme);
        }
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C59082NGs.LIZ = awemeRawAd;
        mo49getActivity();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void lm(Aweme aweme) {
        char c;
        IAdLandPagePreloadService LJJI;
        boolean z;
        boolean z2;
        String secUid;
        this.LJLZ = true;
        String Kl = Kl(aweme);
        int i = 2;
        switch (Kl.hashCode()) {
            case 187588924:
                if (Kl.equals("page_ad_fragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 267192787:
                if (Kl.equals("page_my_fragment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 929385108:
                if (Kl.equals("page_user_fragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1157058698:
                if (Kl.equals("page_fake_user_fragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return;
                    }
                    try {
                        SettingsManager.LIZLLL().getClass();
                        if (!SettingsManager.LIZ("enable_ad_fake_user_profile_bugfix", true)) {
                            Object Il = Il(AW4.class, "page_fake_user_fragment");
                            if (Il == null) {
                                return;
                            }
                            AW4 aw4 = (AW4) Il;
                            aw4.setVisible(true);
                            aw4.X4(new AObjectS50S0101000_5(1, this, 0));
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                    AObjectS49S0101000_4 aObjectS49S0101000_4 = new AObjectS49S0101000_4(2, this, 1);
                    if (Il(AW4.class, "page_fake_user_fragment") != null) {
                        aObjectS49S0101000_4.invoke();
                        return;
                    } else {
                        getChildFragmentManager().LJJLIL(new C59606NaM(this, aObjectS49S0101000_4), false);
                        return;
                    }
                }
                if (this.LJLILLLLZI == null) {
                    this.LJLILLLLZI = Ml();
                    if (aweme != null) {
                        Yl(1, aweme);
                    }
                }
                this.LJLILLLLZI.Z5(this.LJZ);
                this.LJLILLLLZI.ol(aweme);
                this.LJLILLLLZI.LLII(this.LJLLJ);
                this.LJLILLLLZI.setPreviousPage(this.LJLLJ);
                this.LJLILLLLZI.W0(this.LJLLL);
                if ((aweme.getRoomFeedCellStruct() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData().hasCommerceGoods) || ECommerceAnchorService.LJJJJI().LJJJ(aweme)) {
                    this.LJLILLLLZI.ok(10);
                }
                String authorUid = aweme.getAuthorUid();
                if (aweme.getAuthor() == null) {
                    secUid = "";
                } else {
                    secUid = aweme.getAuthor().getSecUid();
                }
                if (!TextUtils.isEmpty(authorUid)) {
                    this.LJLILLLLZI.ye(authorUid, secUid);
                }
                TextUtils.equals(this.LJLLJ, "homepage_hot");
                this.LJLILLLLZI.LLJI(aweme.getAid());
                if (!C55695LtT.LIZLLL) {
                    this.LJLILLLLZI.LJJJJ();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("showUserProfile(), aid is ");
                LIZ.append(C227768wm.LIZIZ(aweme));
                C87277YNd.LIZLLL(X1D.LIZIZ(LIZ));
                this.LJLILLLLZI.sf(Boolean.FALSE);
                this.LJLLL = "other_places";
                if (getChildFragmentManager().LJJJIL("page_user_fragment") == null) {
                    Xl(this.LJLILLLLZI, "page_user_fragment");
                    this.LJLJJI = this.LJLILLLLZI;
                }
                C59082NGs.LIZ = null;
                I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = this.LJLILLLLZI;
                if (i18nUserProfileFragmentV2 == null) {
                    return;
                }
                if (!i18nUserProfileFragmentV2.isViewValid() && C19N.LJ("profile_set_visible_fix", true)) {
                    C87277YNd.LIZLLL("need post userProfileFragment.setVisible");
                    new Handler(C16880lQ.LLJJJJ()).post(new RunnableC31370CSw(i, this, aweme));
                    return;
                } else {
                    this.LJLILLLLZI.setVisible(true);
                    return;
                }
            }
            if (this.LJLJI != null) {
                if (C54838Lfe.LJJI(aweme)) {
                    Xl((Fragment) this.LJLJI, "page_my_fragment");
                    this.LJLJJI = this.LJLJI;
                }
                if (!this.LJLJI.isViewValid() && ((Boolean) C52348Kga.LIZ.getValue()).booleanValue()) {
                    C87277YNd.LIZLLL("need post userProfileFragment.setVisible");
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS8S0201000_5(2, this, aweme, 15));
                } else {
                    this.LJLJI.LLIFFJFJJ(this.LJLLI);
                    this.LJLJI.V1(true);
                }
            }
            C59082NGs.LIZ = null;
            return;
        }
        if (em(aweme)) {
            this.LJLJJLL = 2;
        }
        if (cm(aweme)) {
            this.LJLJJLL = 1;
        }
        if (fm(aweme)) {
            this.LJLJJLL = 3;
        }
        if (!C35172DrE.LIZ()) {
            if (em(aweme) || cm(aweme)) {
                if (CommerceWebCrossToSparkExt.LIZ()) {
                    z = TextUtils.equals(C16880lQ.LJLLJ(this.LJLJJL.getClass()), "AdWebSparkFragment");
                } else {
                    z = this.LJLJJL instanceof CrossPlatformFragment;
                }
                if (!z) {
                    Wl(this.LJLJJL);
                    this.LJLJJL = null;
                }
            }
            if (fm(aweme)) {
                if (CommerceWebCrossToSparkExt.LIZ()) {
                    z2 = TextUtils.equals(C16880lQ.LJLLJ(this.LJLJJL.getClass()), "AdWebSparkFragment");
                } else {
                    z2 = this.LJLJJL instanceof CrossPlatformFragment;
                }
                if (z2) {
                    Wl(this.LJLJJL);
                    this.LJLJJL = null;
                }
            }
            if (this.LJLJJL == null) {
                Fragment Al = Al(aweme);
                this.LJLJJL = Al;
                Xl(Al, "page_ad_fragment");
                this.LJLJJI = this.LJLJJL;
            }
        }
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            YG5.LIZIZ.getAdLynxLandPageUtil();
            if (NOX.LIZJ(aweme.getAwemeRawAd())) {
                List<String> secondPageGeckoChannel = aweme.getAwemeRawAd().getNativeSiteConfig().getSecondPageGeckoChannel();
                if (!C79004UzY.LJJIFFI(secondPageGeckoChannel) && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null) {
                    LJJI.LJI();
                    NHG.LJIILLIIL(secondPageGeckoChannel);
                }
            }
        }
        if (Zl(aweme)) {
            Tl(aweme);
        } else {
            hm(aweme);
            NNA.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (C53765L8f.LJIJJLI() && (mo49getActivity() instanceof InterfaceC55058LjC)) {
            LKQ lkq = new LKQ(this);
            this.LLII = lkq;
            EventBus.LIZJ().LJIILJJIL(lkq);
        }
        InterfaceC65784Pro interfaceC65784Pro = this.LLIIIILZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            this.LLIIIILZ = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1890654203456307899");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/ProfilePageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ProfilePageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (mo49getActivity() instanceof InterfaceC224908sA) {
            if (z) {
                Vl();
                YFM.LIZIZ.onFeedStop();
            } else {
                List<Pair<Aweme, Integer>> list = this.LL;
                pm(2, list);
                this.LL = list;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ProfilePageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wl(Aweme aweme) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (!(mo49getActivity instanceof InterfaceC45601Hv3) || !(((InterfaceC45601Hv3) mo49getActivity).getInflater() instanceof AbstractC51620KNs)) {
            return;
        }
        if (Pl(aweme)) {
            if (this.LLIIL) {
                return;
            }
            this.LLIIL = true;
            C66415Q4t.LIZ(mo49getActivity);
            return;
        }
        if (Ol("page_user_fragment") || this.LJLILLLLZI != null || this.LLIIJLIL) {
            return;
        }
        this.LLIIJLIL = true;
        C66415Q4t.LIZ(mo49getActivity);
    }

    public final Object Il(Class cls, String str) {
        Fragment LJJJIL;
        if (TextUtils.isEmpty(str) || (LJJJIL = getChildFragmentManager().LJJJIL(str)) == null || !cls.isInstance(LJJJIL)) {
            return null;
        }
        return cls.cast(LJJJIL);
    }

    public final void Xl(Fragment fragment, String str) {
        Fragment fragment2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replaceFragment: ");
        LIZ.append(fragment);
        C221018lt.LJFF("CustomSlideManager", X1D.LIZIZ(LIZ));
        if (!this.LLIIIJ.contains(str) || fragment == null) {
            return;
        }
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            Object obj = this.LJLJJI;
            if (obj != fragment) {
                if (obj instanceof Fragment) {
                    c1b3.LJJI((Fragment) obj);
                }
                c1b3.LJIIIIZZ(R.id.bs8, 1, fragment, str);
                c1b3.LJIIL(fragment);
            } else {
                Fragment LJJJIL = getChildFragmentManager().LJJJIL(str);
                if (LJJJIL != null) {
                    c1b3.LJIIL(LJJJIL);
                }
            }
            LKQ lkq = this.LLII;
            if (lkq != null && (fragment2 = lkq.LJFF) != null) {
                C221018lt.LJFF("CustomSlideManager", "hideCustomSlidePage");
                lkq.LJII = false;
                c1b3.LJIIIZ(fragment2);
            }
            c1b3.LJI();
            this.LJLJJI = fragment;
            this.LJLL = str;
            C87277YNd.LIZLLL("replaceFragment(), tag is ".concat(str));
            if (mo49getActivity() != null) {
                Hox.kv0(mo49getActivity()).Av0("profile_fake_child");
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("replace fragment exception: ");
            LIZ2.append(e.getMessage());
            C221018lt.LIZIZ("CustomSlideManager", X1D.LIZIZ(LIZ2));
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void Yl(int i, Aweme aweme) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUserProfileSimpleUserData(), aid is ");
        LIZ.append(aweme.getAid());
        LIZ.append(", period is ");
        LIZ.append(i);
        C87277YNd.LIZLLL(X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI == null) {
            return;
        }
        if (i == 2 && TextUtils.equals(this.LJLLJ, "homepage_hot") && C88547Yp5.LIZIZ.LJIIZILJ()) {
            C37179EiV.LJFF.postAtFrontOfQueue(new ARunnableS13S0201000_10(i, this, aweme, 7));
        } else {
            this.LJLILLLLZI.bg(aweme.getAuthor(), i);
        }
    }

    public final void km(Aweme aweme, boolean z) {
        String LIZ;
        ActivityC45651qj mo49getActivity;
        if (aweme.getAwemeRawAd() != null) {
            String Nl = Nl();
            if (TextUtils.equals(this.LLD, "scroll_to_slide")) {
                this.LJLJLJ = NNT.LIZ(40);
            } else {
                int i = JHI.LIZ().LJIIIIZZ;
                if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(i)))) {
                    LIZ = JHI.LIZ().LJIIIZ;
                } else {
                    LIZ = NNT.LIZ(Integer.valueOf(i));
                }
                this.LJLJLJ = LIZ;
            }
            if (!Zl(aweme)) {
                Tl(aweme);
            }
            YFM.LIZIZ.getBulletABHelper().LIZIZ(this.LJLJJL, Nl, this, this.LJLJLJ);
            if ((!z && (!aweme.isAd() || !aweme.getAwemeRawAd().isDisableLeftSlideFollow())) || (mo49getActivity = mo49getActivity()) == null) {
                return;
            }
            C84193Sd.LIZ(mo49getActivity).tv0(false);
        }
    }

    @Override // X.LKT
    public final void l9(Class cls, AqS156S0200000_9 aqS156S0200000_9) {
        if (Il(cls, "page_slide_custom_fragment") != null) {
            aqS156S0200000_9.invoke();
        } else {
            getChildFragmentManager().LJJLIL(new LKW(this, aqS156S0200000_9), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLIFFJFJJ) {
            this.LLIIIL = view.findViewById(R.id.bsp);
            C61447O9r.LJIILLIIL.observe(this, new AObserverS60S0101000_5(6, this, 0));
        }
        LNH.LIZ(mo49getActivity(), this, this);
        HomePageDataViewModel LIZ = C3SZ.LIZ(mo49getActivity());
        AObserverS58S0101000_2 aObserverS58S0101000_2 = new AObserverS58S0101000_2(4, this, 15);
        LIZ.getClass();
        LIZ.LJLJJLL.observe(this, aObserverS58S0101000_2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJZ = arguments.getString("related_gid", "");
        }
        ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(mo49getActivity());
        if (mo49getActivity() != null && this.LJLLLLLL) {
            AObserverS73S0200000_9 aObserverS73S0200000_9 = new AObserverS73S0200000_9(this, LIZ2, 7);
            this.LJZI = aObserverS73S0200000_9;
            LIZ2.qv0(this, aObserverS73S0200000_9);
        }
        LIZ2.qv0(this, new AObserverS73S0200000_9(this, LIZ2, 8));
    }

    public final List pm(int i, List list) {
        boolean z;
        InterfaceC59608NaO interfaceC59608NaO;
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2;
        Object Il;
        if (list != null && !list.isEmpty()) {
            ListIterator listIterator = list.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                Pair pair = (Pair) listIterator.next();
                if (i == 0) {
                    this.LLFZ = false;
                    if (((Integer) pair.second).intValue() == 1) {
                        if (listIterator.hasNext()) {
                            listIterator.remove();
                        } else {
                            Dl((Aweme) pair.first);
                            listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                            break;
                        }
                    } else if (((Integer) pair.second).intValue() == 4097) {
                        if (listIterator.hasNext()) {
                            listIterator.remove();
                        }
                    } else {
                        if (((Integer) pair.second).intValue() == 17) {
                            Dl((Aweme) pair.first);
                            listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 4096)));
                            break;
                        }
                        if (((Integer) pair.second).intValue() == 273) {
                            if (getHost() == null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("getHost() is null, isAdded:");
                                LIZ.append(isAdded());
                                LIZ.append(" isRemoving:");
                                LIZ.append(isRemoving());
                                LIZ.append(" isResumed:");
                                LIZ.append(isResumed());
                                LIZ.append(" isDetached:");
                                LIZ.append(isDetached());
                                LIZ.append(" isVisible:");
                                LIZ.append(isVisible());
                                C36922EeM.LJ(X1D.LIZIZ(LIZ));
                            } else {
                                Dl((Aweme) pair.first);
                                lm((Aweme) pair.first);
                            }
                            listIterator.set(Pair.create(pair.first, 69649));
                            if (listIterator.hasNext()) {
                                listIterator.remove();
                            }
                        }
                    }
                } else if (i == 1) {
                    if (((Integer) pair.second).intValue() == 4113) {
                        lm((Aweme) pair.first);
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 65536)));
                        if (listIterator.hasNext()) {
                            listIterator.remove();
                        }
                    } else if (((Integer) pair.second).intValue() == 17) {
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 256)));
                        break;
                    }
                } else if (i != 2) {
                    continue;
                } else if ((((Integer) pair.second).intValue() & 65536) == 65536) {
                    Aweme aweme = (Aweme) pair.first;
                    if (mo49getActivity() != null) {
                        LTT.LIZJ(mo49getActivity());
                    }
                    I18nUserProfileFragmentV2 i18nUserProfileFragmentV22 = this.LJLILLLLZI;
                    if (i18nUserProfileFragmentV22 != null) {
                        i18nUserProfileFragmentV22.x6(false);
                    }
                    String Kl = Kl(aweme);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onInvisibleToUser");
                    if (this.LJLJJL != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ2.append(z);
                    X1D.LIZIZ(LIZ2);
                    switch (Kl.hashCode()) {
                        case 187588924:
                            if (Kl.equals("page_ad_fragment")) {
                                if (Zl(aweme)) {
                                    Sl();
                                    break;
                                } else if (this.LJLJLLL != null || this.LJLJJL != null) {
                                    Sl();
                                    C59082NGs.LIZ = null;
                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                    if (mo49getActivity != null) {
                                        ScrollSwitchStateManager LIZ3 = C84193Sd.LIZ(mo49getActivity);
                                        Boolean value = LIZ3.LJLJJI.getValue();
                                        o.LJI(value);
                                        if (!value.booleanValue()) {
                                            LIZ3.tv0(true);
                                        }
                                    }
                                    mo49getActivity();
                                    C9UE.LIZIZ(getContext());
                                    break;
                                }
                            }
                            break;
                        case 267192787:
                            if (Kl.equals("page_my_fragment") && (interfaceC59608NaO = this.LJLJI) != null) {
                                interfaceC59608NaO.V1(false);
                                break;
                            }
                            break;
                        case 929385108:
                            if (Kl.equals("page_user_fragment") && (i18nUserProfileFragmentV2 = this.LJLILLLLZI) != null) {
                                i18nUserProfileFragmentV2.setVisible(false);
                                break;
                            }
                            break;
                        case 1157058698:
                            if (Kl.equals("page_fake_user_fragment") && (Il = Il(AW4.class, "page_fake_user_fragment")) != null) {
                                ((AW4) Il).setVisible(false);
                                break;
                            }
                            break;
                    }
                    listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & (-17) & (-65537))));
                } else {
                    if ((((Integer) pair.second).intValue() & 256) == 256) {
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & (-17) & (-257))));
                        break;
                    }
                    if ((((Integer) pair.second).intValue() & 16) == 16) {
                        listIterator.set(Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() & (-17))));
                        break;
                    }
                }
            }
            return list;
        }
        return list;
    }

    public final void om(Aweme aweme, boolean z, boolean z2) {
        boolean z3;
        String webUrl;
        if (this.LJLJJL == null || z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C35172DrE.LIZ()) {
            if (!z2 && this.LJLJJL != null) {
                if (this.LLIIIZ) {
                    if (aweme.getAwemeRawAd() != null && ((!TextUtils.equals(this.LLD, "click_ad_jsb") || !C52285KfZ.LIZ()) && (!C63081OpJ.LJL(aweme)))) {
                        String str = this.LLIIJI;
                        if (aweme.getAwemeRawAd() != null && ((!TextUtils.equals(this.LLD, "click_ad_jsb") || !C52285KfZ.LIZ()) && !C63081OpJ.LJL(aweme))) {
                            if (em(aweme)) {
                                if (aweme.getAwemeRawAd().getAdWebUrlDataFromJsb() != null) {
                                    webUrl = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb().getWebUrl();
                                }
                            } else {
                                webUrl = aweme.getAwemeRawAd().getWebUrl();
                            }
                            if (TextUtils.equals(str, webUrl) && Ol("page_ad_fragment")) {
                                this.LLIIIZ = true;
                                return;
                            }
                        }
                        webUrl = "";
                        if (TextUtils.equals(str, webUrl)) {
                            this.LLIIIZ = true;
                            return;
                        }
                    }
                } else {
                    this.LLIIIZ = true;
                    return;
                }
            }
        } else if (!z3) {
            return;
        }
        if (mm()) {
            this.LJLJJL = null;
            this.LJLJLLL = null;
        }
        if (this.LJLJJL != null && !Ol("page_ad_fragment")) {
            Wl(this.LJLJJL);
            this.LJLJJL = null;
        }
        if (this.LJLJLLL != null && !Ol("page_ad_fragment")) {
            Wl(this.LJLJLLL);
            this.LJLJLLL = null;
        }
        Fragment Al = Al(aweme);
        this.LJLJJL = Al;
        Xl(Al, "page_ad_fragment");
        this.LJLJJI = this.LJLJJL;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        o.LJIIIZ(inflater, "inflater");
        if ((mo49getActivity() instanceof InterfaceC55058LjC) && HomepageExperimentServiceImpl.LIZIZ().LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIFFJFJJ = z;
        this.LJLLLLLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserProfileInitMethodExperiment lazyLoad is ");
        LIZ.append(this.LJLLLLLL);
        C87277YNd.LIZLLL(X1D.LIZIZ(LIZ));
        if (this.LLIFFJFJJ) {
            i = R.layout.c7s;
        } else {
            i = R.layout.bom;
        }
        View LIZLLL = C16970lZ.LIZLLL(mo49getActivity(), i);
        C29S c29s = null;
        if (!(LIZLLL instanceof View)) {
            LIZLLL = null;
        }
        if (LIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZLLL, this);
                C10A.LIZIZ(LIZLLL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZLLL;
    }
}
