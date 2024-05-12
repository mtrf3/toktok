package com.ss.android.ugc.aweme.commercialize.profile;

import X.AbstractC59475NVv;
import X.C025908h;
import X.C16880lQ;
import X.C1B3;
import X.C1BC;
import X.C202757xX;
import X.C221108m2;
import X.C38956FQq;
import X.C45804HyK;
import X.C47261Igj;
import X.C59294NOw;
import X.C59306NPi;
import X.C59473NVt;
import X.C59553NYv;
import X.C59555NYx;
import X.C59556NYy;
import X.C59672NbQ;
import X.C60213Nk9;
import X.C60263Nkx;
import X.C60373Nmj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78977Uz7;
import X.C80648Vky;
import X.EnumC60171NjT;
import X.GG8;
import X.InterfaceC36571c5;
import X.InterfaceC40516FvE;
import X.InterfaceC59554NYw;
import X.InterfaceC60172NjU;
import X.InterfaceC60179Njb;
import X.InterfaceC65784Pro;
import X.LBI;
import X.NOX;
import X.NP1;
import X.NVO;
import X.NWL;
import X.NZ1;
import X.O1N;
import X.OGF;
import X.OGG;
import X.RunnableC59446NUs;
import X.VNS;
import X.ViewOnClickListenerC13880ga;
import X.ViewTreeObserverOnGlobalLayoutListenerC59557NYz;
import X.YG5;
import Y.ACListenerS21S0301000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDiS272S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.experiment.AdNewSparkRefactorData;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spark.AdSparkFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdNewFakeUserProfileDetailFragmentWidget extends AbsAdProfileWidget implements InterfaceC59554NYw, InterfaceC60172NjU {
    public ScrollView LJLLL;
    public WebView LJLLLL;
    public C202757xX<Fragment> LJLZ;
    public BulletContainerFragment LJZ;
    public AdSparkFragment LJZI;
    public AdFakeUserProfileAwemeListFragment LJZL;
    public int LL;
    public boolean LLD;
    public InterfaceC65784Pro<C76800UCe> LLF;
    public AwemeRawAd LLFF;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 98));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 97));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 99));
    public final List<Fragment> LJLLLLLL = new ArrayList();
    public final LifecycleEventObserver LLFFF = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget$lifecycleEventObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            IResourceLoaderService iResourceLoaderService;
            o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
            o.LJIIIZ(event, "event");
            int i = GG8.LIZ[event.ordinal()];
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

    @Override // X.InterfaceC59554NYw
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(Uri uri) {
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LJIIZILJ() {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        NativeSiteConfig nativeSiteConfig;
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) != null) {
            str = nativeSiteConfig.getLynxScheme();
        } else {
            str = null;
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
            YG5.LIZIZ.getAdLynxLandPageUtil();
            buildUpon.appendQueryParameter("lynx_landing_page_data", NOX.LIZ(awemeRawAd, this.LJLIL, Boolean.FALSE));
            buildUpon.appendQueryParameter("lynx_landing_page_title", awemeRawAd.getWebTitle());
        }
        return buildUpon.toString();
    }

    public final C80648Vky LJIJ() {
        return (C80648Vky) this.LJLLI.getValue();
    }

    public final ViewPager LJIJI() {
        return (ViewPager) this.LJLLJ.getValue();
    }

    public final void LJIJJLI() {
        NVO nvo;
        AdSparkFragment adSparkFragment = this.LJZI;
        NZ1 nz1 = null;
        if ((adSparkFragment instanceof AdSparkFragment) && adSparkFragment != null) {
            nz1 = adSparkFragment.xl();
        }
        if ((nz1 instanceof NVO) && (nvo = (NVO) nz1) != null) {
            nvo.LJLLL = new ARunnableS46S0100000_10(this, 43);
        }
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [X.7xX<androidx.fragment.app.Fragment>, X.7xX] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        AwemeRawAd awemeRawAd;
        FragmentManager childFragmentManager;
        String str;
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String str5;
        Bundle bundle;
        ViewPager LJIJI;
        final FragmentManager childFragmentManager2;
        AwemeRawAd awemeRawAd4;
        NativeSiteConfig nativeSiteConfig;
        AwemeRawAd awemeRawAd5;
        User author;
        User author2;
        super.LJIILJJIL(c59672NbQ);
        Aweme aweme = this.LJLJLJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LLFF = awemeRawAd;
        Fragment fragment = this.LJLJLLL;
        if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && (author2 = aweme2.getAuthor()) != null) {
            str = author2.getUid();
        } else {
            str = null;
        }
        bundle2.putString("user_id", str);
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            str2 = author.getSecUid();
        } else {
            str2 = null;
        }
        bundle2.putString("sec_user_id", str2);
        Aweme aweme4 = this.LJLJLJ;
        if (aweme4 != null) {
            str3 = aweme4.getAid();
        } else {
            str3 = null;
        }
        bundle2.putString("aweme_id", str3);
        Aweme aweme5 = this.LJLJLJ;
        if (aweme5 != null && (awemeRawAd5 = aweme5.getAwemeRawAd()) != null) {
            str4 = awemeRawAd5.getAdvId();
        } else {
            str4 = null;
        }
        bundle2.putString("adv_id", str4);
        Aweme aweme6 = this.LJLJLJ;
        if (aweme6 != null) {
            awemeRawAd2 = aweme6.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment = new AdFakeUserProfileAwemeListFragment();
        adFakeUserProfileAwemeListFragment.LJLLI = awemeRawAd2;
        adFakeUserProfileAwemeListFragment.setArguments(bundle2);
        this.LJZL = adFakeUserProfileAwemeListFragment;
        ((ArrayList) this.LJLLLLLL).add(adFakeUserProfileAwemeListFragment);
        Aweme aweme7 = this.LJLJLJ;
        if (aweme7 != null && (awemeRawAd3 = aweme7.getAwemeRawAd()) != null && C78977Uz7.LJJLIIIJJIZ(awemeRawAd3) && C78977Uz7.LJJJJL(awemeRawAd3)) {
            Aweme aweme8 = this.LJLJLJ;
            if (aweme8 != null && (awemeRawAd4 = aweme8.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd4.getNativeSiteConfig()) != null) {
                str5 = nativeSiteConfig.getLynxScheme();
            } else {
                str5 = null;
            }
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            View view = (View) this.LJLLILLLL.getValue();
            if (view != null) {
                view.setVisibility(0);
            }
            ViewPager LJIJI2 = LJIJI();
            if (LJIJI2 != null) {
                LJIJI2.setVisibility(0);
            }
            Fragment fragment2 = this.LJLJLLL;
            if (fragment2 != null) {
                bundle = fragment2.getArguments();
            } else {
                bundle = null;
            }
            BulletContainerFragment bulletContainerFragment = new BulletContainerFragment();
            NWL nwl = new NWL(bulletContainerFragment);
            C60263Nkx coreProvider = BulletService.LIZ().LJIILIIL();
            o.LJIIJ(coreProvider, "coreProvider");
            nwl.LIZ = coreProvider;
            bulletContainerFragment.LJLJJL = coreProvider;
            Context mContext = this.LJLIL;
            o.LJIIIIZZ(mContext, "mContext");
            Activity LJIJJ = C45804HyK.LJIJJ(mContext);
            o.LJI(LJIJJ);
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper(LJIJJ);
            nwl.LIZIZ = bulletActivityWrapper;
            bulletContainerFragment.LJLJI = bulletActivityWrapper;
            nwl.LIZ();
            IBulletService LIZ = BulletService.LIZ();
            Context mContext2 = this.LJLIL;
            o.LJIIIIZZ(mContext2, "mContext");
            bulletContainerFragment.n8(LIZ.LJIIJJI(mContext2), 17, 0, 0, 0, 0);
            bulletContainerFragment.setArguments(bundle);
            String LJIIZILJ = LJIIZILJ();
            List LJJIJ = C47261Igj.LJJIJ("ad_commerce");
            Context mContext3 = this.LJLIL;
            o.LJIIIIZZ(mContext3, "mContext");
            Uri LIZJ = C38956FQq.LIZJ(LJIIZILJ, LJJIJ, bundle, new C59306NPi(mContext3));
            NP1 np1 = new NP1();
            C59473NVt.LIZ(LIZJ, bundle, np1);
            InterfaceC60179Njb interfaceC60179Njb = bulletContainerFragment.LJLJJI;
            if (interfaceC60179Njb != null) {
                interfaceC60179Njb.Rd(np1);
            }
            this.LJZ = bulletContainerFragment;
            this.LJZI = new AdSparkFragment(true);
            LJIJJLI();
            if (((AdNewSparkRefactorData) C59294NOw.LIZIZ.getValue()).enableLynxNewFakeUserFragment) {
                AdSparkFragment adSparkFragment = this.LJZI;
                if (adSparkFragment != null) {
                    ListProtector.add(this.LJLLLLLL, 0, adSparkFragment);
                }
            } else {
                BulletContainerFragment bulletContainerFragment2 = this.LJZ;
                if (bulletContainerFragment2 != null) {
                    ListProtector.add(this.LJLLLLLL, 0, bulletContainerFragment2);
                }
            }
            Fragment fragment3 = this.LJLJLLL;
            if (fragment3 != null && (childFragmentManager2 = fragment3.getChildFragmentManager()) != null) {
                final List<Fragment> list = this.LJLLLLLL;
                this.LJLZ = new C1BC(childFragmentManager2, list) { // from class: X.7xX
                    public final List<? extends T> LJLJJLL;

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int getCount() {
                        return this.LJLJJLL.size();
                    }

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int LJIIL(Object item) {
                        o.LJIIIZ(item, "item");
                        if (ORZ.LJLJJI(item, this.LJLJJLL)) {
                            return ORZ.LJZ(item, this.LJLJJLL);
                        }
                        return -2;
                    }

                    @Override // X.C1BC
                    public final Fragment LJJIII(int i) {
                        return (Fragment) ListProtector.get(this.LJLJJLL, i);
                    }

                    {
                        o.LJIIIZ(list, "fragments");
                        this.LJLJJLL = list;
                    }
                };
            }
            ViewPager LJIJI3 = LJIJI();
            if (LJIJI3 != null) {
                LJIJI3.setAdapter(this.LJLZ);
            }
            C59556NYy c59556NYy = (C59556NYy) this.LJLLILLLL.getValue();
            if (c59556NYy != null && (LJIJI = LJIJI()) != null && LJIJI.getAdapter() != null) {
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(R.drawable.np), Integer.valueOf(R.raw.icon_3pt_video));
                PagerAdapter adapter = LJIJI.getAdapter();
                o.LJII(adapter, "null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
                int count = adapter.getCount();
                if (count > 0) {
                    LinearLayout linearLayout = c59556NYy.LJLIL;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                        int i = 0;
                        do {
                            Context context = c59556NYy.getContext();
                            LinearLayout linearLayout2 = c59556NYy.LJLIL;
                            if (linearLayout2 != null) {
                                int intValue = ((Number) ListProtector.get(LJJIJIIJI, i)).intValue();
                                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c8r, linearLayout2, false);
                                o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView");
                                LBI lbi = (LBI) LLLLIILL;
                                lbi.setImageResource(intValue);
                                lbi.setAnimationEnabled(true);
                                lbi.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0301000_10(c59556NYy, this, i, LJIJI, 0)));
                                LinearLayout linearLayout3 = c59556NYy.LJLIL;
                                if (linearLayout3 != null) {
                                    linearLayout3.addView(lbi);
                                    i++;
                                } else {
                                    o.LJIJI("tabContainer");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("tabContainer");
                                throw null;
                            }
                        } while (i < count);
                        LinearLayout linearLayout4 = c59556NYy.LJLIL;
                        if (linearLayout4 != null) {
                            LBI lbi2 = (LBI) linearLayout4.getChildAt(0);
                            if (lbi2 != null) {
                                c59556NYy.LJLJI = lbi2;
                                lbi2.setSelected(true);
                            }
                            C59555NYx c59555NYx = c59556NYy.LJLJJL;
                            if (c59555NYx != null) {
                                LJIJI.removeOnPageChangeListener(c59555NYx);
                            }
                            C59555NYx c59555NYx2 = new C59555NYx(c59556NYy, this);
                            c59556NYy.LJLJJL = c59555NYx2;
                            LJIJI.addOnPageChangeListener(c59555NYx2);
                            ViewTreeObserver viewTreeObserver = c59556NYy.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC59557NYz(viewTreeObserver, c59556NYy, LJIJI));
                            }
                        } else {
                            o.LJIJI("tabContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tabContainer");
                        throw null;
                    }
                }
            }
            ViewPager LJIJI4 = LJIJI();
            if (LJIJI4 != null) {
                LJIJI4.addOnPageChangeListener(new IDiS272S0100000_10(this, 0));
            }
        } else {
            View view2 = (View) this.LJLLILLLL.getValue();
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ViewPager LJIJI5 = LJIJI();
            if (LJIJI5 != null) {
                LJIJI5.setVisibility(8);
            }
            C1B3 c1b3 = new C1B3(childFragmentManager);
            AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment2 = this.LJZL;
            if (adFakeUserProfileAwemeListFragment2 != null) {
                c1b3.LJIIJ(adFakeUserProfileAwemeListFragment2, null, R.id.d46);
                c1b3.LJIILJJIL();
            }
            View LJIILL = LJIILL(R.id.d46);
            if (LJIILL != null) {
                LJIILL.setVisibility(0);
            }
        }
        C80648Vky LJIJ = LJIJ();
        if (LJIJ == null) {
            return;
        }
        LJIJ.setOnScrollListener(new C59553NYv(this));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILLIIL(boolean z) {
        String str;
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        if (z) {
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null) {
                str = nativeSiteConfig.getLynxScheme();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                this.LJLJI.postDelayed(new RunnableC59446NUs(this), 500L);
            }
            C62822Ol8 c62822Ol8 = C59294NOw.LIZIZ;
            if ((((AdNewSparkRefactorData) c62822Ol8.getValue()).enableLynxNewFakeUserFragment && this.LJZI == null) || (!((AdNewSparkRefactorData) c62822Ol8.getValue()).enableLynxNewFakeUserFragment && this.LJZ == null)) {
                LJIJJ(0);
                AdFakeUserProfileAwemeListFragment adFakeUserProfileAwemeListFragment = this.LJZL;
                if (adFakeUserProfileAwemeListFragment == null) {
                    return;
                }
                adFakeUserProfileAwemeListFragment.setUserVisibleHint(true);
            }
        }
    }

    public final void LJIJJ(int i) {
        C80648Vky LJIJ;
        OGF helper;
        C80648Vky LJIJ2;
        OGF helper2;
        OGF helper3;
        C80648Vky LJIJ3;
        OGF helper4;
        C80648Vky LJIJ4;
        OGF helper5;
        OGF helper6;
        OGF helper7;
        if (i < 0 || i >= ((ArrayList) this.LJLLLLLL).size() || LJIJ() == null) {
            return;
        }
        InterfaceC36571c5 interfaceC36571c5 = (Fragment) ListProtector.get(this.LJLLLLLL, i);
        int i2 = this.LL;
        if (i != i2 && i2 >= 0 && i2 < ((ArrayList) this.LJLLLLLL).size()) {
            ((Fragment) ListProtector.get(this.LJLLLLLL, this.LL)).setUserVisibleHint(false);
        }
        this.LL = i;
        if (interfaceC36571c5 instanceof AdFakeUserProfileAwemeListFragment) {
            C80648Vky LJIJ5 = LJIJ();
            if (LJIJ5 != null && (helper7 = LJIJ5.getHelper()) != null) {
                helper7.LIZIZ = (OGG) interfaceC36571c5;
            }
        } else if (interfaceC36571c5 instanceof BulletContainerFragment) {
            C80648Vky LJIJ6 = LJIJ();
            if (LJIJ6 != null && (helper6 = LJIJ6.getHelper()) != null) {
                helper6.LIZIZ = null;
            }
            ScrollView scrollView = this.LJLLL;
            if (scrollView != null && (LJIJ4 = LJIJ()) != null && (helper5 = LJIJ4.getHelper()) != null) {
                helper5.LIZ = scrollView;
            }
            WebView webView = this.LJLLLL;
            if (webView != null && (LJIJ3 = LJIJ()) != null && (helper4 = LJIJ3.getHelper()) != null) {
                helper4.LIZ = webView;
            }
        } else if (interfaceC36571c5 instanceof SparkFragment) {
            C80648Vky LJIJ7 = LJIJ();
            if (LJIJ7 != null && (helper3 = LJIJ7.getHelper()) != null) {
                helper3.LIZIZ = null;
            }
            ScrollView scrollView2 = this.LJLLL;
            if (scrollView2 != null && (LJIJ2 = LJIJ()) != null && (helper2 = LJIJ2.getHelper()) != null) {
                helper2.LIZ = scrollView2;
            }
            WebView webView2 = this.LJLLLL;
            if (webView2 != null && (LJIJ = LJIJ()) != null && (helper = LJIJ.getHelper()) != null) {
                helper.LIZ = webView2;
            }
        }
        C80648Vky LJIJ8 = LJIJ();
        if (LJIJ8 == null) {
            return;
        }
        LJIJ8.setCanScrollUp(true);
    }

    @Override // X.InterfaceC59554NYw
    public final void onSelect(int i) {
        C025908h.LIZLLL("homepage_ad", "otherclick", this.LLFF, "swipe", "refer");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, Uri uri, InterfaceC40516FvE instance) {
        OGF helper;
        OGF helper2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        if (view instanceof WebView) {
            C80648Vky LJIJ = LJIJ();
            if (LJIJ != null && (helper2 = LJIJ.getHelper()) != null) {
                helper2.LIZ = view;
            }
            this.LJLLLL = (WebView) view;
            return;
        }
        if (!(view instanceof VNS)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof ScrollView) {
                View childAt = viewGroup.getChildAt(i);
                o.LJII(childAt, "null cannot be cast to non-null type android.widget.ScrollView");
                this.LJLLL = (ScrollView) childAt;
                C80648Vky LJIJ2 = LJIJ();
                if (LJIJ2 == null || (helper = LJIJ2.getHelper()) == null) {
                    return;
                }
                helper.LIZ = this.LJLLL;
                return;
            }
        }
    }
}
