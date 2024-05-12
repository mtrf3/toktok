package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class NLH implements InterfaceC59347NQx, Observer<C207668Da> {
    public final ViewStub LJLIL;
    public Aweme LJLILLLLZI;
    public FrameLayout LJLJI;
    public FrameLayout LJLJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final NLJ LJLLL = new NLJ(this);

    @Override // X.InterfaceC59347NQx
    public void LIZ() {
        if (this.LJLLILLLL) {
            return;
        }
        this.LJLJLLL = false;
        FrameLayout frameLayout = this.LJLJI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setVisibility(8);
    }

    @Override // X.InterfaceC59347NQx
    public final void LIZIZ() {
        String str;
        if (!NHM.LIZIZ.LIZJ(this.LJLILLLLZI) || this.LJLLILLLL || this.LJLJLLL) {
            return;
        }
        if (!this.LJLJL) {
            LJFF(NLL.SHOW);
            this.LJLJL = true;
        }
        AwemeRawAd awemeRawAd = null;
        if (!this.LJLL) {
            str = "data_load_fail";
        } else if (!this.LJLLI) {
            str = "load_timeout";
        } else {
            FrameLayout frameLayout = this.LJLJI;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setVisibility(0);
            }
            this.LJLJLLL = true;
            if (!this.LJLJJLL) {
                this.LJLJJLL = true;
                ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
                NMA.LIZ.getClass();
                C58653N0f c58653N0f = NMA.LJJIII;
                Aweme aweme = this.LJLILLLLZI;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                LJJIJ.LJI(c58653N0f, awemeRawAd);
                return;
            }
            return;
        }
        ITopViewAdEventLogger LJJIJ2 = TopViewAdEventLogger.LJJIJ();
        NMA.LIZ.getClass();
        C58653N0f c58653N0f2 = NMA.LJJII;
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        }
        LJJIJ2.LJIIIZ(c58653N0f2, awemeRawAd, new AqS33S1000000_10(str, 8));
    }

    public final void LIZJ() {
        FrameLayout frameLayout;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        if ((parent instanceof FrameLayout) && (frameLayout = (FrameLayout) parent) != null) {
            frameLayout.setVisibility(8);
            C16880lQ.LJLLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        this.LJLJJL = null;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
    }

    public final void LJ() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if ((this.LJLLILLLL || (frameLayout2 = this.LJLJJI) == null || frameLayout2.getVisibility() != 8) && (frameLayout = this.LJLJJI) != null) {
            frameLayout.setVisibility(8);
            frameLayout.setClickable(false);
            frameLayout.setEnabled(false);
            frameLayout.removeAllViews();
            LIZJ();
            this.LJLLILLLL = false;
            this.LJLJLLL = false;
        }
    }

    public void LJI() {
        C42625Go9.LIZJ(this);
        this.LJLJLJ = false;
        LIZ();
    }

    public NLH(ViewStub viewStub) {
        this.LJLIL = viewStub;
    }

    @Override // X.InterfaceC59347NQx
    public final void LIZLLL(Aweme aweme) {
        Context context;
        AdFeInteractionModel LIZ;
        String str;
        NativeSiteConfig nativeSiteConfig;
        String lynxScheme;
        String str2;
        FrameLayout frameLayout;
        if (this.LJLJLJ) {
            LJI();
        }
        NHM nhm = NHM.LIZIZ;
        String str3 = null;
        if (!nhm.LIZJ(aweme)) {
            this.LJLILLLLZI = null;
            LIZJ();
            return;
        }
        if (aweme == null) {
            return;
        }
        this.LJLILLLLZI = aweme;
        if (this.LJLIL.getParent() != null) {
            this.LJLIL.setLayoutResource(R.layout.bkf);
            View inflate = this.LJLIL.inflate();
            if (inflate instanceof FrameLayout) {
                frameLayout = (FrameLayout) inflate;
            } else {
                frameLayout = null;
            }
            this.LJLJI = frameLayout;
        }
        FrameLayout frameLayout2 = this.LJLJI;
        if (frameLayout2 == null || (context = frameLayout2.getContext()) == null) {
            return;
        }
        C42625Go9.LIZIZ(this);
        if (this.LJLJJL == null && this.LJLJI != null) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            c40342FsQ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
            LIZ2.setLayoutParams(new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, C60996Nwm.LIZJ(context) - C61410O8g.LIZIZ(context)));
            FrameLayout frameLayout3 = this.LJLJI;
            if (frameLayout3 != null) {
                frameLayout3.addView(LIZ2);
            }
            LIZ2.setVisibility(8);
            this.LJLJJL = LIZ2;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && (LIZ = nhm.LIZ(aweme2)) != null) {
            this.LJLL = false;
            this.LJLLI = false;
            this.LJLLILLLL = false;
            this.LJLLJ = false;
            LJFF(NLL.CHECK_GECKO_START);
            List<String> geckoChannel = LIZ.getGeckoChannel();
            if (geckoChannel != null) {
                Iterator<String> it = geckoChannel.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        C58909NAb.LIZ.getClass();
                        if (NH3.LIZIZ() != null) {
                            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                            if (LJJI != null) {
                                str2 = LJJI.LJIIL("lynx_feed");
                            } else {
                                str2 = null;
                            }
                            if (!O3U.LIZ(str2, next)) {
                                break;
                            }
                        }
                    } else if (C76800UCe.LIZ != null) {
                        LJFF(NLL.CHECK_GECKO_SUCCESS);
                        String lynxUrl = LIZ.getLynxUrl();
                        if (lynxUrl != null) {
                            Uri.Builder buildUpon = UriProtector.parse(lynxUrl).buildUpon();
                            m LIZ3 = NG2.LIZ(context, aweme2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("width", Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels));
                            jSONObject.putOpt("height", Integer.valueOf(C60996Nwm.LIZJ(context) - C61410O8g.LIZIZ(context)));
                            jSONObject.putOpt("scale", Float.valueOf(context.getResources().getDisplayMetrics().density));
                            List<String> geckoChannel2 = LIZ.getGeckoChannel();
                            if (geckoChannel2 != null) {
                                jSONObject.putOpt("gecko_channel", GsonProtectorUtils.toJson(C69432nz.LIZ(), geckoChannel2));
                            }
                            Object frontendData = LIZ.getFrontendData();
                            if (frontendData != null) {
                                jSONObject.putOpt("data", GsonProtectorUtils.toJson(C69432nz.LIZ(), frontendData));
                            }
                            LIZ3.LJJIIZ("interaction_data", jSONObject.toString());
                            LIZ3.LJJIIJ("interaction_type", Integer.valueOf(LIZ.getInteractionType()));
                            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                            if (awemeRawAd != null && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null && (lynxScheme = nativeSiteConfig.getLynxScheme()) != null) {
                                LIZ3.LJJIIZ("lynxSchema", lynxScheme);
                            }
                            String jVar = LIZ3.toString();
                            o.LJIIIIZZ(jVar, "baseObject.toString()");
                            buildUpon.appendQueryParameter("initialData", jVar);
                            NLW LIZ4 = NGL.LIZ();
                            if (LIZ4 != null) {
                                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
                                IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
                                if (LJJI2 != null) {
                                    str = LJJI2.LJIIL("lynx_feed");
                                } else {
                                    str = null;
                                }
                                C59190NKw LIZLLL = LIZ4.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, this.LJLLL);
                                if (LIZLLL != null) {
                                    String builder = buildUpon.toString();
                                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                                    Bundle bundle = new Bundle();
                                    NLW LIZ5 = NGL.LIZ();
                                    if (LIZ5 != null) {
                                        LIZ5.LJIIIIZZ(context, bundle, aweme2);
                                    }
                                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                    if (awemeRawAd2 != null) {
                                        str3 = awemeRawAd2.getNativeSiteCustomData();
                                    }
                                    bundle.putString("bundle_native_site_custom_data", str3);
                                    LIZLLL.LIZ(bundle, builder, C59209NLp.LIZ().enableInteraction);
                                }
                            }
                        }
                    }
                }
            }
        }
        LIZ();
    }

    public final void LJFF(NLL nll) {
        AwemeRawAd awemeRawAd;
        ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
        NMA.LIZ.getClass();
        C58653N0f c58653N0f = NMA.LJJIIJ;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        LJJIJ.LJIIIZ(c58653N0f, awemeRawAd, new AqS176S0100000_10(nll, 234));
    }

    @Override // X.InterfaceC59347NQx
    public final void LJJIFFI(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void changeContainerToTopEvent(C61212aj event) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        AdFeInteractionModel LIZ;
        FrameLayout frameLayout;
        Context context;
        Activity LJIJJ;
        FrameLayout frameLayout2;
        ViewGroup viewGroup;
        o.LJIIIZ(event, "event");
        if (!this.LJLJLJ) {
            return;
        }
        NHM nhm = NHM.LIZIZ;
        if (!nhm.LIZJ(this.LJLILLLLZI)) {
            return;
        }
        long j = event.LJLIL;
        if (j <= 0 || this.LJLLILLLL || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL) == null || (LIZ = nhm.LIZ(this.LJLILLLLZI)) == null || (frameLayout = this.LJLJI) == null || (context = frameLayout.getContext()) == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
            return;
        }
        ViewStub viewStub = (ViewStub) LJIJJ.findViewById(R.id.rk);
        if (viewStub == null) {
            View findViewById = LJIJJ.findViewById(R.id.interaction_fe_full_container);
            o.LJIIIIZZ(findViewById, "{\n            activity.f…full_container)\n        }");
            frameLayout2 = (FrameLayout) findViewById;
        } else {
            viewStub.setLayoutResource(R.layout.bkg);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            frameLayout2 = (FrameLayout) inflate;
        }
        frameLayout2.setVisibility(8);
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
            viewGroup.setVisibility(8);
        }
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.LJLJI;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(8);
        }
        frameLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(0);
        frameLayout2.setClickable(true);
        frameLayout2.setEnabled(true);
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setVisibility(0);
        this.LJLLILLLL = true;
        this.LJLJLLL = true;
        LIZ.setInteractivity(true);
        this.LJLJJI = frameLayout2;
        LJFF(NLL.CONTAINER_ON_TOP);
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10(this, 192), j + 1000);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void interactionAdEggStatusEvent(IP5 event) {
        o.LJIIIZ(event, "event");
        if (!TextUtils.equals(event.LJLIL, "egg_ready") && !this.LJLJLJ) {
            return;
        }
        String str = event.LJLIL;
        if (o.LJ(str, "egg_ready")) {
            this.LJLLI = true;
            LJFF(NLL.LYNX_READY);
        } else {
            if (!o.LJ(str, "egg_finish")) {
                return;
            }
            LJ();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (!NHM.LIZIZ.LIZJ(this.LJLILLLLZI) || c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            if (hashCode != -1132409520 || !str.equals("ad_feed_on_page_selected")) {
                return;
            }
            C42625Go9.LIZIZ(this);
            this.LJLJLJ = true;
            this.LJLJJLL = false;
            this.LJLJL = false;
            LJFF(NLL.SELECT);
            return;
        }
        if (!str.equals("ad_feed_on_page_unselected")) {
            return;
        }
        LJI();
    }
}
