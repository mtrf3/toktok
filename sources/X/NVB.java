package X;

import Y.ACListenerS30S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NVB extends FrameLayout {
    public static final /* synthetic */ int LLI = 0;
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final boolean LJLJLLL;
    public Bundle LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public NU4 LJLLJ;
    public NVJ LJLLL;
    public int LJLLLL;
    public final C59142NJa LJLLLLLL;
    public final C59150NJi LJLZ;
    public NVF LJZ;
    public NVE LJZI;
    public CommercializeWebViewHelper LJZL;
    public String LL;
    public long LLD;
    public boolean LLF;
    public final NVA LLFF;
    public final NVD LLFFF;
    public String LLFII;
    public final java.util.Map<Integer, View> LLFZ = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final ImageView getMCloseView() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mCloseView>(...)");
        return (ImageView) value;
    }

    private final FrameLayout getMLightWebPage() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mLightWebPage>(...)");
        return (FrameLayout) value;
    }

    private final TextView getMRetryView() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mRetryView>(...)");
        return (TextView) value;
    }

    private final boolean getNeedPreload() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        NU4 nu4 = this.LJLLJ;
        if (nu4 == null || (aweme = nu4.LIZJ) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPreloadExtraWeb()) {
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        if (this.LLF) {
            this.LLF = false;
            C9UE.LIZIZ(getContext());
        } else {
            C60469NoH mBottomSheet = getMBottomSheet();
            if (mBottomSheet.LLFZ.getState() == 3) {
                mBottomSheet.LLFZ.setState(4);
            }
        }
    }

    public final void LJ() {
        if (this.LJLJLLL) {
            C59614NaU webView = getMBulletWebView().getWebView();
            if (webView != null) {
                webView.loadUrl("about:blank");
                return;
            }
            return;
        }
        NZQ.LJIJI(getMWebView(), "about:blank", false, null, 14);
    }

    public final C60469NoH getMBottomSheet() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mBottomSheet>(...)");
        return (C60469NoH) value;
    }

    public final NWH getMBulletWebView() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mBulletWebView>(...)");
        return (NWH) value;
    }

    public final FrameLayout getMErrorView() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mErrorView>(...)");
        return (FrameLayout) value;
    }

    public final C2314696o getMFlTitleBar() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-mFlTitleBar>(...)");
        return (C2314696o) value;
    }

    public final NZQ getMWebView() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mWebView>(...)");
        return (NZQ) value;
    }

    public final void LIZJ() {
        LIZ(R.id.dha).setVisibility(8);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.nie).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = 0;
        LIZ(R.id.nie).setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        String str;
        String str2;
        NU4 nu4;
        Aweme aweme;
        Bundle bundle;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Bundle bundle2;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme3;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        Aweme aweme4;
        AwemeCommerceStruct commerceVideoAuthInfo3;
        Aweme aweme5;
        AwemeCommerceStruct commerceVideoAuthInfo4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load url=");
        NU4 nu42 = this.LJLLJ;
        String str8 = null;
        if (nu42 != null) {
            str = nu42.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        getMFlTitleBar().LIZJ();
        NU4 nu43 = this.LJLLJ;
        if (nu43 != null && (str2 = nu43.LIZ) != null && str2.length() > 0) {
            if ((getContext() instanceof Activity) && (nu4 = this.LJLLJ) != null && nu4.LIZIZ != null) {
                C59288NOq c59288NOq = new C59288NOq();
                NU4 nu44 = this.LJLLJ;
                if (nu44 != null) {
                    aweme = nu44.LIZJ;
                } else {
                    aweme = null;
                }
                new AqS176S0100000_10(aweme, 37).invoke(c59288NOq.LIZ);
                C59284NOm c59284NOm = (C59284NOm) c59288NOq.LIZ;
                if (c59284NOm == null) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putLong("ad_id", c59284NOm.LIZ);
                    bundle.putLong("aweme_creative_id", c59284NOm.LIZ);
                    bundle.putString("bundle_download_app_log_extra", c59284NOm.LIZIZ);
                    bundle.putString("group_id", String.valueOf(c59284NOm.LIZJ));
                    bundle.putString("ad_type", c59284NOm.LJIIIZ);
                    bundle.putInt("ad_system_origin", c59284NOm.LJIIJ);
                    if (!TextUtils.isEmpty(c59284NOm.LJI)) {
                        bundle.putString("bundle_download_url", c59284NOm.LJI);
                        bundle.putBoolean("bundle_is_from_app_ad", true);
                        bundle.putString("aweme_package_name", c59284NOm.LJII);
                        bundle.putString("bundle_download_app_name", c59284NOm.LJIIIIZZ);
                    }
                    bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().LIZ());
                    Aweme aweme6 = c59284NOm.LJIIL;
                    if (aweme6 != null) {
                        bundle.putString("aweme_id", aweme6.getAid());
                    }
                }
                NU4 nu45 = this.LJLLJ;
                if (nu45 != null) {
                    str3 = nu45.LIZ;
                } else {
                    str3 = null;
                }
                bundle.putString("url", str3);
                bundle.putInt("preload_web_status", 7);
                NU4 nu46 = this.LJLLJ;
                if (nu46 != null && (aweme5 = nu46.LIZJ) != null && (commerceVideoAuthInfo4 = aweme5.getCommerceVideoAuthInfo()) != null) {
                    str4 = commerceVideoAuthInfo4.getAdId();
                } else {
                    str4 = null;
                }
                bundle.putString("bundle_ad_id_from_aweme", str4);
                NU4 nu47 = this.LJLLJ;
                if (nu47 != null && (aweme4 = nu47.LIZJ) != null && (commerceVideoAuthInfo3 = aweme4.getCommerceVideoAuthInfo()) != null) {
                    str5 = commerceVideoAuthInfo3.getCreativeId();
                } else {
                    str5 = null;
                }
                bundle.putString("bundle_creative_id_from_aweme", str5);
                NU4 nu48 = this.LJLLJ;
                if (nu48 != null && (aweme3 = nu48.LIZJ) != null && (commerceVideoAuthInfo2 = aweme3.getCommerceVideoAuthInfo()) != null) {
                    str6 = commerceVideoAuthInfo2.getAdvId();
                } else {
                    str6 = null;
                }
                bundle.putString("bundle_advertiser_id_from_aweme", str6);
                NU4 nu49 = this.LJLLJ;
                if (nu49 != null && (aweme2 = nu49.LIZJ) != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null) {
                    str7 = commerceVideoAuthInfo.getItemId();
                } else {
                    str7 = null;
                }
                bundle.putString("bundle_item_id_from_aweme", str7);
                NU4 nu410 = this.LJLLJ;
                if (nu410 != null) {
                    bundle2 = nu410.LJ;
                } else {
                    bundle2 = null;
                }
                bundle.putAll(bundle2);
                if (this.LJLJLLL) {
                    this.LJLL = bundle;
                    NWH mBulletWebView = getMBulletWebView();
                    C60263Nkx LJIILIIL = C57415Mg7.LIZ().LJIILIIL();
                    C59150NJi c59150NJi = this.LJLZ;
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    o.LJI(LJIJJ);
                    BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper(LJIJJ);
                    NU4 nu411 = this.LJLLJ;
                    o.LJI(nu411);
                    LifecycleOwner lifecycleOwner = nu411.LIZIZ;
                    o.LJI(lifecycleOwner);
                    mBulletWebView.LJIILLIIL(LJIILIIL, c59150NJi, bulletActivityWrapper, lifecycleOwner);
                } else {
                    NZQ mWebView = getMWebView();
                    C59142NJa c59142NJa = this.LJLLLLLL;
                    NU4 nu412 = this.LJLLJ;
                    o.LJI(nu412);
                    LifecycleOwner lifecycleOwner2 = nu412.LIZIZ;
                    o.LJI(lifecycleOwner2);
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    Activity LJIJJ2 = C45804HyK.LJIJJ(context2);
                    o.LJI(LJIJJ2);
                    this.LJZL = new CommercializeWebViewHelper(LJIJJ2, mWebView, c59142NJa, C59307NPj.LIZ(bundle), lifecycleOwner2);
                }
            }
            ShareH5Service.LIZ.getClass();
            ShareH5Service LIZ2 = C58149Mrx.LIZ();
            NTL crossPlatformBusiness = getMWebView().getCrossPlatformBusiness();
            NZR LIZ3 = ((NXI) getMWebView().LJI(NXI.class)).LIZ();
            o.LJIIIIZZ(LIZ3, "mWebView.getViewWrap(Web…Wrap::class.java).webView");
            LIZ2.LJIJJLI(crossPlatformBusiness, LIZ3, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap LIZ4 = C0JU.LIZ("source", "light_landing_page");
            LIZ4.put("preload", Integer.valueOf(getNeedPreload() ? 1 : 0));
            String jSONObject = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(LIZ4)).toString();
            o.LJIIIIZZ(jSONObject, "JSONObject(mutableMapOf<…    }.toMap()).toString()");
            linkedHashMap.put("X-Extra-Data", jSONObject);
            if (this.LJLJLLL) {
                NWH mBulletWebView2 = getMBulletWebView();
                NU4 nu413 = this.LJLLJ;
                o.LJI(nu413);
                android.net.Uri LIZJ = C38956FQq.LIZJ(nu413.LIZ, C47261Igj.LJJIJ("ad_commerce"), this.LJLL, new C59306NPi(EF7.LIZIZ()));
                Bundle bundle3 = this.LJLL;
                mBulletWebView2.getClass();
                mBulletWebView2.LLII = linkedHashMap;
                mBulletWebView2.t(LIZJ, bundle3, null);
                return;
            }
            NZQ mWebView2 = getMWebView();
            NU4 nu414 = this.LJLLJ;
            o.LJI(nu414);
            NZQ.LJIJI(mWebView2, nu414.LIZ, false, linkedHashMap, 10);
            ShareH5Service LIZ5 = C58149Mrx.LIZ();
            NTL crossPlatformBusiness2 = getMWebView().getCrossPlatformBusiness();
            NU4 nu415 = this.LJLLJ;
            if (nu415 != null) {
                str8 = nu415.LIZ;
            }
            LIZ5.LJJ(crossPlatformBusiness2, str8, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Aweme aweme;
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this.LLFF);
        C60469NoH mBottomSheet = getMBottomSheet();
        FrameLayout view = getMLightWebPage();
        mBottomSheet.getClass();
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C06F) layoutParams).LIZIZ(mBottomSheet.LLFZ);
        NU4 nu4 = this.LJLLJ;
        if (nu4 != null && (aweme = nu4.LIZJ) != null && C63081OpJ.LLIFFJFJJ(aweme)) {
            LIZJ();
        }
        getMBottomSheet().setCallback(new NVC(this));
        C16880lQ.LJIILJJIL(getMLightWebPage(), new ACListenerS30S0100000_10(this, 29));
        getMFlTitleBar().LJ();
        getMFlTitleBar().setOnClickListener(new ViewOnClickListenerC13880ga(null));
        C16880lQ.LJIILLIIL((ImageView) getMFlTitleBar().findViewById(R.id.hx8), new ACListenerS30S0100000_10(this, 30));
        C16880lQ.LJIILLIIL((ImageView) getMFlTitleBar().findViewById(R.id.hxn), new ACListenerS30S0100000_10(this, 31));
        getMLightWebPage().setPadding(getPaddingLeft(), (int) (C60996Nwm.LJ(getContext()) * 0.26836581709145424d), getPaddingRight(), getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.LJLJLLL) {
                C59614NaU webView = getMBulletWebView().getWebView();
                if (webView != null) {
                    webView.setOnScrollChangeListener(new NVH(this));
                }
            } else {
                ((NXI) getMWebView().LJI(NXI.class)).LIZ().getView().setOnScrollChangeListener(new NVI(this));
            }
        }
        C16880lQ.LJIJI(getMRetryView(), new ACListenerS30S0100000_10(this, 32));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            NVF nvf = new NVF(LJIJJ);
            nvf.LJFF = new NVL(this);
            this.LJZ = nvf;
            this.LJZI = new NVE(LJIJJ, this);
            NZR LIZ = ((NXI) getMWebView().LJI(NXI.class)).LIZ();
            if (LIZ != null) {
                LIZ.onReceivedTitle(new AqS176S0100000_10(this, 38));
            }
        }
        if (getNeedPreload()) {
            LIZLLL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C59136NIu c59136NIu;
        C59135NIt c59135NIt;
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this.LLFF);
        NVF nvf = this.LJZ;
        if (nvf != null) {
            ((View) nvf.LIZIZ.getValue()).getViewTreeObserver().removeOnGlobalLayoutListener(nvf.LJ);
        }
        this.LJZ = null;
        NVE nve = this.LJZI;
        if (nve != null) {
            nve.enable(false);
        }
        this.LJZI = null;
        if (this.LJLJLLL) {
            C59150NJi c59150NJi = this.LJLZ;
            c59150NJi.LIZLLL = true;
            if (!c59150NJi.LIZIZ && (c59135NIt = c59150NJi.LJFF) != null) {
                c59135NIt.LIZ(null, "preload_break");
            }
            getMBulletWebView().release();
            return;
        }
        C59142NJa c59142NJa = this.LJLLLLLL;
        c59142NJa.LJLJI = true;
        if (!c59142NJa.LJLIL && (c59136NIu = c59142NJa.LJLJJL) != null) {
            c59136NIu.LIZIZ(null, "preload_break");
        }
        CommercializeWebViewHelper commercializeWebViewHelper = this.LJZL;
        if (commercializeWebViewHelper != null) {
            commercializeWebViewHelper.onPause();
            commercializeWebViewHelper.onDestroy();
        }
        this.LJZL = null;
    }

    public final NVJ getCallback() {
        return this.LJLLL;
    }

    public final NU4 getParams() {
        return this.LJLLJ;
    }

    public final int getTitleBarState() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NVB(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        boolean z = false;
        View inflate = View.inflate(activityC45651qj, R.layout.bax, this);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…_ad_light_web_page, this)");
        this.LJLIL = inflate;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 129));
        this.LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 134));
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 136));
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 130));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 131));
        this.LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 132));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 135));
        CommerceAdLandpageBulletConfig LIZ = C59287NOp.LIZ();
        if (LIZ != null && LIZ.getTotalEnable()) {
            z = LIZ.getAdLandpageNonFullScreenEnable();
        }
        this.LJLJLLL = z;
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 133));
        this.LJLLLL = 4;
        C59142NJa c59142NJa = new C59142NJa();
        c59142NJa.LJLJJL = new C59136NIu(this);
        this.LJLLLLLL = c59142NJa;
        C59150NJi c59150NJi = new C59150NJi();
        c59150NJi.LJFF = new C59135NIt(this);
        this.LJLZ = c59150NJi;
        this.LLFF = new NVA(this);
        this.LLFFF = new NVD(this);
    }

    public final void LJI(int i) {
        if (i != 1) {
            if (i != 7) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJLLLL = 4;
                    return;
                }
                this.LJLLLL = 3;
                return;
            }
            int i2 = this.LJLLLL;
            if (i2 == 7 || i2 == 4) {
                return;
            }
            this.LJLLLL = 7;
            return;
        }
        this.LJLLLL = 1;
    }

    public final void setCallback(NVJ nvj) {
        this.LJLLL = nvj;
    }

    public final void setParams(NU4 nu4) {
        this.LJLLJ = nu4;
    }

    public final void setTitleBarState(int i) {
        this.LJLLLL = i;
    }

    public final void LJFF(Boolean bool, String str) {
        NVJ nvj;
        getMBottomSheet().LLFZ.setState(3);
        getMFlTitleBar().LIZIZ("");
        if (!getNeedPreload()) {
            LIZLLL();
        }
        this.LLFII = str;
        if (o.LJ(bool, Boolean.TRUE)) {
            getMBottomSheet().setHideable(false);
        }
        if (o.LJ(NV9.LIZIZ(3), str) && (nvj = this.LJLLL) != null) {
            nvj.LIZ();
        }
    }
}
