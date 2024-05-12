package com.ss.android.ugc.aweme.bullet.ab;

import X.AbstractC40201Fq9;
import X.AbstractC59064NGa;
import X.ActivityC45651qj;
import X.C109464Ri;
import X.C117144ik;
import X.C221108m2;
import X.C27740Aue;
import X.C36922EeM;
import X.C38956FQq;
import X.C40179Fpn;
import X.C40203FqB;
import X.C47261Igj;
import X.C52205KeH;
import X.C57415Mg7;
import X.C59055NFr;
import X.C59066NGc;
import X.C59209NLp;
import X.C59222NMc;
import X.C59287NOp;
import X.C59294NOw;
import X.C59306NPi;
import X.C59421NTt;
import X.C59437NUj;
import X.C59448NUu;
import X.C59452NUy;
import X.C59472NVs;
import X.C59473NVt;
import X.C59614NaU;
import X.C60263Nkx;
import X.C60373Nmj;
import X.C61238O1q;
import X.C62822Ol8;
import X.C78857UxB;
import X.EF7;
import X.EnumC59053NFp;
import X.EnumC59241NMv;
import X.EnumC60171NjT;
import X.GG7;
import X.InterfaceC59229NMj;
import X.InterfaceC59605NaL;
import X.InterfaceC60172NjU;
import X.InterfaceC60179Njb;
import X.InterfaceC60761Nsz;
import X.NGQ;
import X.NGY;
import X.NIA;
import X.NLX;
import X.NMS;
import X.NMZ;
import X.NP1;
import X.NPF;
import X.NUT;
import X.NUW;
import X.NVN;
import X.NVO;
import X.NVQ;
import X.NVR;
import X.NVV;
import X.NWL;
import X.NXI;
import X.NZ1;
import X.NZR;
import X.O1F;
import X.O1N;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS13S0101000_9;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerFragment;
import com.bytedance.ies.bullet.ui.common.view.AbsFragment;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.spark.AdSparkFragment;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BulletFragmentABHelper implements InterfaceC59605NaL {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C59448NUu.LJLIL);
    public final LifecycleEventObserver LIZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.bullet.ab.BulletFragmentABHelper$lifecycleEventObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            IResourceLoaderService iResourceLoaderService;
            o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
            o.LJIIIZ(event, "event");
            int i = GG7.LIZ[event.ordinal()];
            if (i != 1) {
                if (i != 2 || (iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class)) == null) {
                    return;
                }
                iResourceLoaderService.unregisterCustomLoader(O1N.class, EnumC60171NjT.HIGH);
                return;
            }
            IResourceLoaderService iResourceLoaderService2 = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class);
            if (iResourceLoaderService2 == null) {
                return;
            }
            iResourceLoaderService2.registerCustomLoader(O1N.class, EnumC60171NjT.HIGH);
        }
    };

    @Override // X.InterfaceC59605NaL
    public final boolean LIZJ(Fragment adBrowserContainerFragment) {
        NP1 np1;
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        NUT nut;
        o.LJIIIZ(adBrowserContainerFragment, "adBrowserContainerFragment");
        if (adBrowserContainerFragment instanceof BulletContainerFragment) {
            BulletContainerFragment bulletContainerFragment = (BulletContainerFragment) adBrowserContainerFragment;
            InterfaceC60179Njb vl = bulletContainerFragment.vl();
            C59472NVs c59472NVs = null;
            if (!(vl instanceof C59437NUj) || vl == null) {
            }
            InterfaceC60179Njb vl2 = bulletContainerFragment.vl();
            if ((vl2 instanceof C59437NUj) && (baseCommonBizRootContainer = (BaseCommonBizRootContainer) vl2) != null && (nut = baseCommonBizRootContainer.LJLILLLLZI) != null) {
                c59472NVs = nut.getParams();
            }
            if ((c59472NVs instanceof NP1) && (np1 = (NP1) c59472NVs) != null && np1.LLI) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59605NaL
    public final boolean LIZLLL(Fragment adBrowserContainerFragment) {
        o.LJIIIZ(adBrowserContainerFragment, "adBrowserContainerFragment");
        if (adBrowserContainerFragment instanceof NMS) {
            return ((NMS) adBrowserContainerFragment).LJIIJ();
        }
        return false;
    }

    @Override // X.InterfaceC59605NaL
    public final void LJ(Fragment fragment) {
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(fragment, "fragment");
        if (fragment instanceof SparkFragment) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((SparkFragment) fragment).LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIIZ("completed_transition", null);
                return;
            }
            return;
        }
        C36922EeM.LJ("fragment notifyFE nothing");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59605NaL
    public final void LJFF(Fragment adBrowserContainerFragment) {
        NVO nvo;
        InterfaceC60761Nsz kitView;
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        o.LJIIIZ(adBrowserContainerFragment, "adBrowserContainerFragment");
        if (adBrowserContainerFragment instanceof NMS) {
            ((NMS) adBrowserContainerFragment).onHide();
            return;
        }
        if (adBrowserContainerFragment instanceof CrossPlatformFragment) {
            MixActivityContainer mixActivityContainer = ((CrossPlatformFragment) adBrowserContainerFragment).LJLIL;
            if (mixActivityContainer == null) {
                return;
            }
            mixActivityContainer.LJJIIZI();
            return;
        }
        if (adBrowserContainerFragment instanceof BulletContainerFragment) {
            BulletContainerFragment bulletContainerFragment = (BulletContainerFragment) adBrowserContainerFragment;
            InterfaceC60179Njb vl = bulletContainerFragment.vl();
            if (!(vl instanceof C59437NUj) || vl == null) {
            }
            InterfaceC60179Njb vl2 = bulletContainerFragment.vl();
            if (!(vl2 instanceof C59437NUj) || (baseCommonBizRootContainer = (BaseCommonBizRootContainer) vl2) == null) {
                return;
            }
            C59614NaU c59614NaU = baseCommonBizRootContainer.LJLJLJ;
            if (c59614NaU != null) {
                c59614NaU.onPause();
            }
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) baseCommonBizRootContainer.LJLILLLLZI.LIZ(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.LJIILJJIL(true);
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) baseCommonBizRootContainer.LJLILLLLZI.LIZ(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                adLynxStatBusiness.LJII(true);
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) baseCommonBizRootContainer.LJLILLLLZI.LIZ(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.LIZIZ = true;
                playableBusiness.LIZ(true, false);
            }
            PreRenderWebViewBusiness LIZ = NUW.LIZ(baseCommonBizRootContainer.LJLILLLLZI);
            if (LIZ != null) {
                LIZ.LIZIZ = 0;
                InterfaceC59229NMj interfaceC59229NMj = LIZ.LIZ.LIZLLL;
                if (interfaceC59229NMj != null) {
                    interfaceC59229NMj.LIZ("webViewDidHide", null);
                }
            }
            Activity activity = baseCommonBizRootContainer.LJLZ;
            if (activity == null || Build.VERSION.SDK_INT < 23) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
            return;
        }
        if (adBrowserContainerFragment instanceof AdSparkFragment) {
            AdSparkFragment adSparkFragment = (AdSparkFragment) adBrowserContainerFragment;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = adSparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.onHide();
            }
            NZ1 xl = adSparkFragment.xl();
            if (!(xl instanceof NVO) || (nvo = (NVO) xl) == null) {
                return;
            }
            nvo.onHide();
            return;
        }
        C36922EeM.LJ("fragment onHide failed");
    }

    @Override // X.InterfaceC59605NaL
    public final boolean LJI(Fragment adBrowserContainerFragment) {
        o.LJIIIZ(adBrowserContainerFragment, "adBrowserContainerFragment");
        if (adBrowserContainerFragment instanceof BulletContainerFragment) {
            return ((AbsFragment) adBrowserContainerFragment).LJLIL;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59605NaL
    public final void LIZ(Fragment fragment, String str) {
        InterfaceC60761Nsz kitView;
        NVO nvo;
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        o.LJIIIZ(fragment, "fragment");
        if (fragment instanceof NMS) {
            NMS nms = (NMS) fragment;
            nms.I1(str);
            nms.onShow();
            return;
        }
        if (fragment instanceof CrossPlatformFragment) {
            MixActivityContainer mixActivityContainer = ((CrossPlatformFragment) fragment).LJLIL;
            if (mixActivityContainer == null) {
                return;
            }
            mixActivityContainer.LJJIJIIJIL();
            return;
        }
        if (fragment instanceof BulletContainerFragment) {
            BulletContainerFragment bulletContainerFragment = (BulletContainerFragment) fragment;
            InterfaceC60179Njb vl = bulletContainerFragment.vl();
            if (!(vl instanceof C59437NUj) || vl == null) {
            }
            InterfaceC60179Njb vl2 = bulletContainerFragment.vl();
            if (!(vl2 instanceof C59437NUj) || (baseCommonBizRootContainer = (BaseCommonBizRootContainer) vl2) == null) {
                return;
            }
            C59614NaU c59614NaU = baseCommonBizRootContainer.LJLJLJ;
            if (c59614NaU != null) {
                c59614NaU.onResume();
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) baseCommonBizRootContainer.LJLILLLLZI.LIZ(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.LIZIZ = false;
                playableBusiness.LIZ(false, true);
            }
            PreRenderWebViewBusiness LIZ = NUW.LIZ(baseCommonBizRootContainer.LJLILLLLZI);
            if (LIZ != null) {
                LIZ.LIZ(null);
            }
            Activity activity = baseCommonBizRootContainer.LJLZ;
            if (activity == null) {
                return;
            }
            C27740Aue.LJII(activity);
            return;
        }
        if (fragment instanceof SparkFragment) {
            if (fragment instanceof AdSparkFragment) {
                NZ1 xl = ((AdSparkFragment) fragment).xl();
                if ((xl instanceof NVO) && (nvo = (NVO) xl) != null) {
                    nvo.LJLLLL = "full_screen_slide";
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((SparkFragment) fragment).LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
                return;
            }
            kitView.onShow();
            return;
        }
        C36922EeM.LJ("fragment onShow failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59605NaL
    public final void LJIIIIZZ(Fragment fragment, ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
        NVO nvo;
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        o.LJIIIZ(fragment, "fragment");
        if (fragment instanceof NMS) {
            ((NMS) fragment).LLLJIL(aRunnableS13S0101000_9);
            return;
        }
        if (fragment instanceof CrossPlatformFragment) {
            CrossPlatformFragment crossPlatformFragment = (CrossPlatformFragment) fragment;
            crossPlatformFragment.LJLJI = aRunnableS13S0101000_9;
            MixActivityContainer mixActivityContainer = crossPlatformFragment.LJLIL;
            if (mixActivityContainer == null) {
                return;
            }
            mixActivityContainer.LJLJLLL = aRunnableS13S0101000_9;
            return;
        }
        if (fragment instanceof BulletContainerFragment) {
            BulletContainerFragment bulletContainerFragment = (BulletContainerFragment) fragment;
            InterfaceC60179Njb vl = bulletContainerFragment.vl();
            if (!(vl instanceof C59437NUj) || vl == null) {
            }
            InterfaceC60179Njb vl2 = bulletContainerFragment.vl();
            if (!(vl2 instanceof C59437NUj) || (baseCommonBizRootContainer = (BaseCommonBizRootContainer) vl2) == null) {
                return;
            }
            baseCommonBizRootContainer.LJLLLLLL = aRunnableS13S0101000_9;
            return;
        }
        if (fragment instanceof AdSparkFragment) {
            NZ1 xl = ((AdSparkFragment) fragment).xl();
            if (!(xl instanceof NVO) || (nvo = (NVO) xl) == null) {
                return;
            }
            nvo.LJLLL = aRunnableS13S0101000_9;
            return;
        }
        C36922EeM.LJ("fragment setBackListener failed");
    }

    @Override // X.InterfaceC59605NaL
    public final void LJIIIZ(Fragment fragment, ARunnableS12S0101000_8 aRunnableS12S0101000_8) {
        C59437NUj c59437NUj;
        o.LJIIIZ(fragment, "fragment");
        if (fragment instanceof BulletContainerFragment) {
            InterfaceC60179Njb vl = ((BulletContainerFragment) fragment).vl();
            if ((vl instanceof C59437NUj) && (c59437NUj = (C59437NUj) vl) != null) {
                c59437NUj.LLI = aRunnableS12S0101000_8;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59605NaL
    public final void LIZIZ(Fragment adBrowserContainerFragment, String str, Fragment upperLayerFragment, String str2) {
        NZ1 nz1;
        NVO nvo;
        AdSparkFragment adSparkFragment;
        SparkContext sparkContext;
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        AdWebStatBusiness adWebStatBusiness;
        String str3;
        IResourceLoaderService iResourceLoaderService;
        NXI nxi;
        NZR LIZ;
        o.LJIIIZ(adBrowserContainerFragment, "adBrowserContainerFragment");
        o.LJIIIZ(upperLayerFragment, "upperLayerFragment");
        if (str == null) {
            return;
        }
        if (adBrowserContainerFragment instanceof NMS) {
            NMS nms = (NMS) adBrowserContainerFragment;
            nms.loadUrl(str);
            nms.LJJLI();
            return;
        }
        if (adBrowserContainerFragment instanceof CrossPlatformFragment) {
            CrossPlatformFragment crossPlatformFragment = (CrossPlatformFragment) adBrowserContainerFragment;
            MixActivityContainer mixActivityContainer = crossPlatformFragment.LJLIL;
            if (mixActivityContainer != null && (nxi = (NXI) mixActivityContainer.LJLJJLL.LJI(NXI.class)) != null && (LIZ = nxi.LIZ()) != null) {
                LIZ.addOnSingleWebViewStatus(new NVN(str, adBrowserContainerFragment, LIZ));
            }
            MixActivityContainer mixActivityContainer2 = crossPlatformFragment.LJLIL;
            if (mixActivityContainer2 != null && !TextUtils.isEmpty(str2)) {
                mixActivityContainer2.LJLJI.putString("refer", str2);
            }
            MixActivityContainer mixActivityContainer3 = crossPlatformFragment.LJLIL;
            if (mixActivityContainer3 == null) {
                return;
            }
            mixActivityContainer3.LJJIIJ(str);
            return;
        }
        if (adBrowserContainerFragment instanceof BulletContainerFragment) {
            BulletContainerFragment bulletContainerFragment = (BulletContainerFragment) adBrowserContainerFragment;
            Bundle arguments = bulletContainerFragment.getArguments();
            if (bulletContainerFragment.mo49getActivity() == null) {
            }
            if (arguments != null && arguments.getBoolean("is_lynx_landing_page", false)) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI == null || (str3 = LJJI.LJIIL("lynx_feed")) == null) {
                    str3 = "";
                }
                if (C78857UxB.LJJJIL(str3) && (iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class)) != null) {
                    GeckoConfig LIZIZ2 = O1F.LIZIZ(C61238O1q.LIZ.LIZ(iResourceLoaderService), str3);
                    if (!o.LJ(LIZIZ2.getAccessKey(), str3)) {
                        iResourceLoaderService.registerConfig(str3, new GeckoConfig(str3, LIZIZ2.getOfflineDir(), LIZIZ2.getLoaderDepender(), false, false, 24, null));
                    }
                    Lifecycle lifecycle = bulletContainerFragment.getLifecycle();
                    iResourceLoaderService.registerCustomLoader(O1N.class, EnumC60171NjT.HIGH);
                    lifecycle.removeObserver(this.LIZ);
                    lifecycle.addObserver(this.LIZ);
                }
            }
            List LJJIJ = C47261Igj.LJJIJ("ad_commerce");
            Context mo49getActivity = bulletContainerFragment.mo49getActivity();
            if (mo49getActivity == null) {
                mo49getActivity = EF7.LIZIZ();
            }
            bulletContainerFragment.t(C38956FQq.LIZJ(str, LJJIJ, arguments, new C59306NPi(mo49getActivity)), arguments, (InterfaceC60172NjU) adBrowserContainerFragment);
            InterfaceC60179Njb vl = bulletContainerFragment.vl();
            if (!(vl instanceof C59437NUj) || (baseCommonBizRootContainer = (BaseCommonBizRootContainer) vl) == null || (adWebStatBusiness = (AdWebStatBusiness) baseCommonBizRootContainer.LJLILLLLZI.LIZ(AdWebStatBusiness.class)) == null) {
                return;
            }
            adWebStatBusiness.LIZJ();
            return;
        }
        if (adBrowserContainerFragment instanceof SparkFragment) {
            SparkFragment sparkFragment = (SparkFragment) adBrowserContainerFragment;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null) {
                sparkContext.LJJIJLIJ(str);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = sparkFragment.LJLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIIJJI(sparkContext);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = sparkFragment.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.LIZIZ();
            }
            if ((adBrowserContainerFragment instanceof AdSparkFragment) && (adSparkFragment = (AdSparkFragment) adBrowserContainerFragment) != null) {
                nz1 = adSparkFragment.xl();
            } else {
                nz1 = null;
            }
            if (!(nz1 instanceof NVO) || (nvo = (NVO) nz1) == null) {
                return;
            }
            nvo.LJJLI();
            return;
        }
        C36922EeM.LJ("fragment loadUrl failed");
    }

    @Override // X.InterfaceC59605NaL
    public final Fragment LJII(ActivityC45651qj activityC45651qj, Bundle bundle, C59222NMc c59222NMc, String str) {
        boolean z;
        boolean adLandpageFakeEnable;
        SparkContext sparkContext;
        Bundle bundle2;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num2;
        Long groupId;
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            z = bundle3.getBoolean("is_lynx_landing_page", false);
        } else {
            z = false;
        }
        CommerceAdLandpageBulletConfig LIZ = C59287NOp.LIZ();
        if (LIZ == null || !LIZ.getTotalEnable()) {
            adLandpageFakeEnable = false;
        } else {
            adLandpageFakeEnable = LIZ.getAdLandpageFakeEnable();
        }
        Integer num3 = null;
        String str9 = str;
        if (adLandpageFakeEnable || z) {
            if (activityC45651qj == null) {
                C36922EeM.LJ("createBulletAdFragment failed caz activity is null");
                return new CrossPlatformFragment();
            }
            if (C59294NOw.LIZ()) {
                IAdSparkUtils LJFF = AdSparkUtils.LJFF();
                if (LJFF == null || (sparkContext = NGQ.LIZ(LJFF, activityC45651qj, (str9 = str9), bundle3, false, 24)) == null) {
                    sparkContext = new SparkContext();
                }
                if (str9 != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("container_bg_color", "FFFFFFFF");
                    sparkContext.LJJIJLIJ(C40179Fpn.LIZ(bundle4, str9));
                }
                sparkContext.LJJIIJ("container_bg_color", "FFFFFFFF");
                if (bundle3 != null && bundle3.getBoolean("is_lynx_landing_page", false)) {
                    IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI == null || (str5 = LJJI.LJIIL("lynx_feed")) == null) {
                        str5 = "";
                    }
                    if (C78857UxB.LJJJIL(str5)) {
                        if (C59209NLp.LIZIZ()) {
                            sparkContext.LJJIIJ("use_forest", "1");
                            sparkContext.LJJIIJ("access_key", str5);
                        } else {
                            sparkContext.LJII(AbstractC40201Fq9.class, new C40203FqB(str5));
                        }
                    }
                }
                if (!C52205KeH.LIZ()) {
                    AdSparkFragment adSparkFragment = new AdSparkFragment(true);
                    if (bundle3 != null) {
                        C109464Ri.LIZ.getClass();
                        C117144ik.LIZIZ.getClass();
                        C117144ik.LIZIZ(sparkContext);
                        bundle3.putString("SparkContextContainerId", sparkContext.containerId);
                    } else {
                        bundle3 = null;
                    }
                    adSparkFragment.setArguments(bundle3);
                    return adSparkFragment;
                }
                NVO nvo = new NVO(0);
                EnumC59053NFp enumC59053NFp = EnumC59053NFp.ONLY_RENDER;
                if (bundle3 == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle3;
                }
                C59421NTt c59421NTt = new C59421NTt(enumC59053NFp, "", 0, false, new NIA("landing_page_1p", str9, bundle2, C59055NFr.LIZ("landing_page_1p"), new NLX(nvo), false, null, false, 960), null, false, 220);
                IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
                EnumC59241NMv enumC59241NMv = EnumC59241NMv.SPARK;
                if (bundle3 != null) {
                    str2 = bundle3.getString("aweme_creative_id");
                    str3 = bundle3.getString("bundle_download_app_log_extra");
                    str4 = bundle3.getString("aweme_group_id");
                    num = Integer.valueOf(bundle3.getInt("charge_type"));
                    num3 = Integer.valueOf(bundle3.getInt("ad_system_origin"));
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    num = null;
                }
                AbstractC59064NGa LIZJ = LIZLLL.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv, activityC45651qj, new NGY(str2, str3, str4, num, num3, 32)), c59421NTt);
                LIZJ.LJIILJJIL(new NVV(nvo));
                LIZJ.LJIIZILJ(new NVR(nvo));
                LIZJ.LJIILL(new NVQ(nvo));
                LIZJ.LJIILLIIL(nvo);
                Object LJI = LIZJ.LJI(c59421NTt, true);
                o.LJII(LJI, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                return (Fragment) LJI;
            }
            BulletContainerFragment bulletContainerFragment = new BulletContainerFragment();
            NWL nwl = new NWL(bulletContainerFragment);
            C60263Nkx coreProvider = C57415Mg7.LIZ().LJIILIIL();
            o.LJIIJ(coreProvider, "coreProvider");
            nwl.LIZ = coreProvider;
            bulletContainerFragment.LJLJJL = coreProvider;
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper(activityC45651qj);
            nwl.LIZIZ = bulletActivityWrapper;
            bulletContainerFragment.LJLJI = bulletActivityWrapper;
            nwl.LIZJ = "ad_commerce";
            nwl.LIZ();
            bulletContainerFragment.n8(BulletService.LIZ().LJIIJJI(activityC45651qj), 17, 0, 0, 0, 0);
            bulletContainerFragment.setArguments(bundle3);
            if (str9 == null) {
                return bulletContainerFragment;
            }
            Uri LIZJ2 = C38956FQq.LIZJ(str9, C47261Igj.LJJIJ("ad_commerce"), bundle3, new C59306NPi(activityC45651qj));
            NP1 np1 = new NP1();
            C59473NVt.LIZ(LIZJ2, bundle3, np1);
            InterfaceC60179Njb interfaceC60179Njb = bulletContainerFragment.LJLJJI;
            if (interfaceC60179Njb == null) {
                return bulletContainerFragment;
            }
            interfaceC60179Njb.Rd(np1);
            return bulletContainerFragment;
        }
        if (CommerceWebCrossToSparkExt.LIZ() && c59222NMc != null && activityC45651qj != null) {
            NPF npf = new NPF(activityC45651qj);
            Integer num4 = null;
            C59421NTt c59421NTt2 = new C59421NTt(EnumC59053NFp.ONLY_RENDER, "", 0, false, null, new C59452NUy(str9, new Bundle(), c59222NMc, C59055NFr.LIZ("landing_page_3p"), new NMZ()), false, 188);
            IAdHybridContainerManager LIZLLL2 = AdHybridContainerManager.LIZLLL();
            EnumC59241NMv enumC59241NMv2 = EnumC59241NMv.WEB;
            AwemeRawAd awemeRawAd = c59222NMc.LIZ;
            if (awemeRawAd != null) {
                str6 = awemeRawAd.getCreativeIdStr();
            } else {
                str6 = null;
            }
            AwemeRawAd awemeRawAd2 = c59222NMc.LIZ;
            if (awemeRawAd2 != null) {
                str7 = awemeRawAd2.getLogExtra();
            } else {
                str7 = null;
            }
            AwemeRawAd awemeRawAd3 = c59222NMc.LIZ;
            if (awemeRawAd3 != null && (groupId = awemeRawAd3.getGroupId()) != null) {
                str8 = String.valueOf(groupId);
            } else {
                str8 = null;
            }
            AwemeRawAd awemeRawAd4 = c59222NMc.LIZ;
            if (awemeRawAd4 != null) {
                num2 = Integer.valueOf(awemeRawAd4.getChargeType());
            } else {
                num2 = null;
            }
            AwemeRawAd awemeRawAd5 = c59222NMc.LIZ;
            if (awemeRawAd5 != null) {
                num4 = Integer.valueOf(awemeRawAd5.getSystemOrigin());
            }
            AbstractC59064NGa LIZJ3 = LIZLLL2.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv2, activityC45651qj, new NGY(str6, str7, str8, num2, num4, 32)), c59421NTt2);
            LIZJ3.LJIILLIIL(npf);
            LIZJ3.LJIILIIL(npf);
            Object LJI2 = LIZJ3.LJI(c59421NTt2, true);
            o.LJII(LJI2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            return (Fragment) LJI2;
        }
        return new CrossPlatformFragment();
    }
}
