package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager;

import X.AbstractC59475NVv;
import X.AbstractC61062Nxq;
import X.AbstractC61066Nxu;
import X.C16880lQ;
import X.C188727au;
import X.C2NU;
import X.C42193GhB;
import X.C60213Nk9;
import X.C61058Nxm;
import X.C61060Nxo;
import X.C61061Nxp;
import X.C61067Nxv;
import X.C61068Nxw;
import X.C61069Nxx;
import X.C61878OQg;
import X.C73318Sq2;
import X.C73775SxP;
import X.C73849Syb;
import X.C73878Sz4;
import X.C73969T1h;
import X.C78920UyC;
import X.C78999UzT;
import X.FMX;
import X.InterfaceC40516FvE;
import X.InterfaceC60172NjU;
import X.InterfaceC60761Nsz;
import X.NHG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T16;
import Y.AfS19S1200000_10;
import Y.AfS62S0100000_10;
import android.net.Uri;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.api.WishListBulletApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WishListManager implements InterfaceC60172NjU {
    public final WishListBulletApi LJLIL;
    public final IAdLandPagePreloadService LJLILLLLZI;
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public final C73849Syb<AbstractC61062Nxq> LJLJJI = new C73849Syb<>();
    public final C73849Syb<AbstractC61066Nxu> LJLJJL = new C73849Syb<>();
    public boolean LJLJJLL;
    public String LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
    }

    static {
        C16880lQ.LJLLJ(WishListManager.class);
    }

    public final void LIZIZ() {
        C78999UzT.LJFF(this.LJLIL.getWishListGeckoChannel().LJJL(T16.LIZ()).LJIL(new AfS62S0100000_10(this, 3)).LJJJLIIL(new AfS62S0100000_10(this, 4), new AfS62S0100000_10(this, 5)), this.LJLJI);
    }

    public final C188727au LIZ(boolean z) {
        String queryParameter;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.LJLJLJ)) / 1000.0f;
        C188727au LIZJ = C78920UyC.LIZJ(z ? 1 : 0, "success");
        LIZJ.LJIIIZ("load_time", String.valueOf(currentTimeMillis));
        String str = this.LJLJL;
        if (str == null) {
            str = "";
        }
        LIZJ.LJIIIZ("schema_url", str);
        Uri parse = UriProtector.parse(this.LJLJL);
        String str2 = null;
        if (parse != null) {
            str2 = UriProtector.getQueryParameter(parse, "channel");
        }
        if (str2 != null && str2.length() != 0) {
            LIZJ.LJI("channel", str2);
        }
        Uri parse2 = UriProtector.parse(this.LJLJL);
        if (parse2 != null && (queryParameter = UriProtector.getQueryParameter(parse2, "bundle")) != null && queryParameter.length() != 0 && queryParameter != null) {
            LIZJ.LJI("bundle", queryParameter);
        }
        return LIZJ;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(Uri uri) {
        o.LJIIIZ(uri, "uri");
        this.LJLJJL.onNext(C61068Nxw.LIZ);
        this.LJLJLJ = System.currentTimeMillis();
    }

    public WishListManager(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        this.LJLIL = wishListBulletApi;
        this.LJLILLLLZI = iAdLandPagePreloadService;
    }

    public final void LIZJ(SparkFragment sparkFragment, String str) {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIJ("favoritePageShow", C61878OQg.INSTANCE);
        }
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        this.LJLILLLLZI.LJI();
        C73775SxP LJFF = NHG.LIZ.LJFF();
        C73849Syb<AbstractC61062Nxq> c73849Syb = this.LJLJJI;
        C78999UzT.LJFF(new C73878Sz4(LJFF, C42193GhB.LIZJ(c73849Syb, c73849Syb)).LJJIFFI(C61058Nxm.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS19S1200000_10(this, sparkFragment, str, 0), C61061Nxp.LJLIL), this.LJLJI);
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        this.LJLJJL.onNext(C61067Nxv.LIZ);
        FMX.LJIIL("ads_wishlist_tab_load", LIZ(false).LIZ);
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, Uri uri, InterfaceC40516FvE instance) {
        boolean z;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        instance.onEvent(new C61060Nxo());
        this.LJLJJL.onNext(C61069Nxx.LIZ);
        view.getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        FMX.LJIIL("ads_wishlist_tab_load", LIZ(z).LIZ);
    }
}
