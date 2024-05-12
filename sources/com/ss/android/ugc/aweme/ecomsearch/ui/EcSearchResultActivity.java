package com.ss.android.ugc.aweme.ecomsearch.ui;

import X.AMD;
import X.AML;
import X.AbstractActivityC27434Api;
import X.AbstractC26082ALm;
import X.C157166Eu;
import X.C16880lQ;
import X.C16970lZ;
import X.C221108m2;
import X.C25903AEp;
import X.C32044Chs;
import X.C39468FeK;
import X.C39774FjG;
import X.C44037HQb;
import X.C47261Igj;
import X.C50373Jpp;
import X.C50433Jqn;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50948Jz6;
import X.C50970JzS;
import X.C50972JzU;
import X.C50975JzX;
import X.C50977JzZ;
import X.C50978Jza;
import X.C50988Jzk;
import X.C50990Jzm;
import X.C51001Jzx;
import X.C51214K8c;
import X.C51304KBo;
import X.C53788L9c;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78685UuP;
import X.C79077V1t;
import X.EnumC37184Eia;
import X.EnumC51280KAq;
import X.EnumC72807Shn;
import X.FFL;
import X.FOD;
import X.InterfaceC151715xP;
import X.InterfaceC18010nF;
import X.InterfaceC27853AwT;
import X.InterfaceC36571c5;
import X.InterfaceC45601Hv3;
import X.InterfaceC50991Jzn;
import X.InterfaceC51123K4p;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.JTO;
import X.JXA;
import X.JY6;
import X.K01;
import X.K02;
import X.K05;
import X.K0D;
import X.K0E;
import X.K0M;
import X.K5P;
import X.K5R;
import X.K7D;
import X.KAK;
import X.L9Y;
import X.ORZ;
import X.TBW;
import X.TMG;
import X.W1T;
import X.W5F;
import X.W5U;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecomsearch.config.EcomSearchThemeBackgroundSettings;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcSearchResultActivity extends AbstractActivityC27434Api implements K01, InterfaceC151715xP, InterfaceC45601Hv3, InterfaceC27853AwT, AMD<C25903AEp>, InterfaceC18010nF {
    public static boolean LJLLJ;
    public K5R LJLJJI;
    public K0D LJLJJL;
    public SearchResultParam LJLJJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public String LJLJL = "";
    public final C25903AEp LJLJLJ = new C25903AEp();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 78));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 79));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 77));

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b7349";
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final SearchStateViewModel LLII() {
        return (SearchStateViewModel) this.LJLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fe, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0200, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0201, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0209, code lost:
    
        X.C50471JrP.LIZIZ(r4, r3, r10, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x020c, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020e, code lost:
    
        X.JTO.LIZ(r33).jv0(r33, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0215, code lost:
    
        r3 = r33.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0217, code lost:
    
        if (r3 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0219, code lost:
    
        r3 = r33.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021b, code lost:
    
        if (r3 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021e, code lost:
    
        r2 = new android.os.Bundle();
        r2.putSerializable("searchParam", r3);
        r2.putSerializable("search_enter_param", r0);
        r3 = new com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew();
        r3.setArguments(r2);
        r1 = getSupportFragmentManager();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "supportFragmentManager");
        r2 = new X.C1B3(r1);
        r2.LJIIJ(r3, "container", com.zhiliaoapp.musically.R.id.dm7);
        r2.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024c, code lost:
    
        r3.setOpenNewSearchContainer(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0203, code lost:
    
        r2 = r0.getAuthorId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0207, code lost:
    
        if (r2 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0251, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f8, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.JuI, X.Jqs, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.Jqs, X.Jpp, X.K4c, X.K5P] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIILZ() {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity.LLIIIILZ():void");
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        return (InterfaceC51123K4p) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        String keyword = this.LJLJL;
        o.LJIIIZ(keyword, "keyword");
        C44037HQb.LIZ(this);
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("container");
        if (LJJJIL instanceof EcSearchResultFragmentNew) {
            ((EcSearchResultFragmentNew) LJJJIL).zm();
            return "";
        }
        return "";
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC36571c5 LJJJIL = getSupportFragmentManager().LJJJIL("container");
        if (LJJJIL instanceof InterfaceC50991Jzn) {
            LLII().setBackToMiddle(true);
            if (((InterfaceC50991Jzn) LJJJIL).LLLZZIL(K7D.SYSTEM_BACK_METHOD)) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        L9Y l9y;
        ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap;
        View decorView;
        C65803Ps7.LIZIZ(this);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            JY6.LIZIZ.LIZ.remove(decorView);
            C50975JzX.LIZ.remove(Integer.valueOf(decorView.hashCode()));
        }
        C50948Jz6 c50948Jz6 = (C50948Jz6) getIntent().getSerializableExtra("search_enter_param");
        String str = null;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        }
        boolean LJ = C50988Jzk.LJ(this);
        if ((o.LJ(str, "homepage_follow") || o.LJ(str, "homepage_hot") || o.LJ(str, "homepage_friends")) && !LJ) {
            C50978Jza c50978Jza = new C50978Jza();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
            Set<String> set = C50970JzS.LIZ;
            LIZ.append(GsonProtectorUtils.toJson(LIZ2, set));
            LIZ.append(']');
            c50978Jza.LJIILL("search_id_list", X1D.LIZIZ(LIZ));
            c50978Jza.LJIILL("group_id", C50970JzS.LIZJ);
            c50978Jza.LJIILL("enter_from", str);
            c50978Jza.LJIILIIL();
            C50970JzS.LIZJ = "";
            set.clear();
            C50970JzS.LIZIZ.clear();
        }
        super.onDestroy();
        C50990Jzm.LIZIZ = false;
        C50990Jzm.LIZJ = false;
        C50990Jzm.LIZLLL = false;
        JTO.LIZ(this);
        SearchEnterViewModel.LJLILLLLZI.remove(Integer.valueOf(hashCode()));
        C50972JzU c50972JzU = C50972JzU.LIZJ;
        int i = c50972JzU.LIZIZ - 1;
        c50972JzU.LIZIZ = i;
        if (i <= 0) {
            EventBus.LIZJ().LJIJ(c50972JzU);
            ((List) c50972JzU.LIZ.getValue()).clear();
            c50972JzU.LIZIZ = 0;
        }
        K0M.LIZJ(hashCode());
        Queue<List<EcSearchResultActivity>> queue = C50988Jzk.LIZ;
        if (!queue.isEmpty()) {
            Iterator<List<EcSearchResultActivity>> it = queue.iterator();
            while (it.hasNext()) {
                List<EcSearchResultActivity> next = it.next();
                Iterator<EcSearchResultActivity> it2 = next.iterator();
                while (it2.hasNext()) {
                    if (o.LJ(it2.next(), this)) {
                        it2.remove();
                    }
                }
                if (next.size() == 0) {
                    it.remove();
                }
            }
        }
        if (((Number) K0E.LIZ.getValue()).intValue() != 0) {
            InterfaceC51123K4p interfaceC51123K4p = (InterfaceC51123K4p) this.LJLLI.getValue();
            if ((interfaceC51123K4p instanceof C53788L9c) && (l9y = (L9Y) interfaceC51123K4p) != null && (concurrentHashMap = l9y.LIZIZ) != null) {
                concurrentHashMap.clear();
            }
        }
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        K5P searchEcommerceModel;
        String singleTabType;
        SearchResultParam searchResultParam;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onResume", true);
        super.onResume();
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null && (singleTabType = searchEcommerceModel.getSingleTabType()) != null && (searchResultParam = this.LJLJJLL) != null) {
            searchResultParam.setSingleTabType(singleTabType);
        }
        C51214K8c.LJIIIIZZ(this.LJLJJLL);
        C79077V1t.LJIJ = 0;
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c50654JuM.getClass();
        C50654JuM.LIZJ(linkedHashMap, false);
        K02.LIZIZ = hashCode();
        JXA.LIZJ = hashCode();
        ((Number) FOD.LIZ.getValue()).intValue();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onStart", true);
        super.onStart();
        LLII().setSearchPageVisible(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (!C51001Jzx.LIZIZ) {
            C79077V1t.LJIJ = 300;
        }
        C51001Jzx.LIZIZ = false;
        LLII().setSearchPageVisible(false);
        LLII().setIsLeavingSearch(false);
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLJLJ;
    }

    public final void LLFZ(EcSearchResultActivity ecSearchResultActivity) {
        C50652JuK LJIIJ;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ2 = C50651JuJ.LJIIJ(ecSearchResultActivity);
        if (LJIIJ2 == null || (LJIIJ = C50651JuJ.LJIIJ(this)) == null) {
            return;
        }
        if (ecSearchResultActivity != null && ecSearchResultActivity.isFinishing()) {
            return;
        }
        C50651JuJ.LIZ(this, C50652JuK.copy$default(LJIIJ, C50650JuI.copy$default(LJIIJ.getImmutableData(), LJIIJ2.getImmutableData().getSearchCommonModel(), null, LJIIJ2.getImmutableData().getSearchVideoModel(), null, LJIIJ2.getImmutableData().getSearchSessionModel(), LJIIJ2.getImmutableData().getSearchEcommerceModel(), null, 74, null), null, 2, null));
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        boolean z;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (MSAdaptionService.LJIIL().LIZLLL(this)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = isInMultiWindowMode();
        } else {
            z = false;
        }
        C32044Chs.LJIIJJI(newConfig.screenWidthDp, newConfig.screenHeightDp, z);
        if (z != LJLLJ) {
            Fragment LJJJIL = getSupportFragmentManager().LJJJIL("container");
            if (LJJJIL instanceof EcSearchResultFragmentNew) {
                LJJJIL.getClass();
            }
        }
        LJLLJ = z;
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        ECSearchEntranceData eCSearchEntranceData;
        Boolean bool;
        K5P searchEcommerceModel;
        String singleTabType;
        SearchResultParam searchResultParam;
        C50650JuI immutableData;
        K5P searchEcommerceModel2;
        Bundle LLJJIJI;
        C50650JuI immutableData2;
        C50373Jpp searchEventModel;
        ECSearchEntranceData ecSearchEntranceData;
        String str2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onCreate", true);
        activityConfiguration(new AqS174S0100000_8(this, 38));
        C16970lZ.LJFF(this, "ecommerce_search_result_fragment_layout_new");
        super.onCreate(bundle);
        activityConfiguration(C51304KBo.LJLIL);
        Integer num = null;
        if (C39774FjG.LIZ()) {
            this.LJLJJL = new K0D(0);
            if (bundle != null) {
                str2 = bundle.getString("shouldRecreate");
            } else {
                str2 = null;
            }
            if (o.LJ(str2, "1")) {
                this.LJLJJI = new K5R(0);
            }
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            if (LJJJJZI != null) {
                LJJJJZI.LJJII(bundle, this.LJLJJI);
            }
        }
        try {
            setContentView(EnumC37184Eia.INSTANCE.getView(this, R.layout.aol, null));
            View findViewById = findViewById(R.id.bs_);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.container_bg)");
            SmartImageView smartImageView = (SmartImageView) findViewById;
            C50948Jz6 c50948Jz6 = (C50948Jz6) getIntent().getSerializableExtra("search_enter_param");
            if (c50948Jz6 == null || (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) == null || (str = ecSearchEntranceData.getResultBgUrl()) == null) {
                SettingsManager LIZLLL = SettingsManager.LIZLLL();
                EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel ecomSearchThemeBackgroundModel = EcomSearchThemeBackgroundSettings.LIZ;
                EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel ecomSearchThemeBackgroundModel2 = (EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel) LIZLLL.LJIIIIZZ("ecom_search_theme_background", EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel.class, ecomSearchThemeBackgroundModel);
                if (ecomSearchThemeBackgroundModel2 != null) {
                    ecomSearchThemeBackgroundModel = ecomSearchThemeBackgroundModel2;
                }
                str = (String) ORZ.LJLLJ(ecomSearchThemeBackgroundModel.ecomSearchDefaultBackground);
            }
            IEcomSearchService LJJJJZI2 = EcomSearchServiceImpl.LJJJJZI();
            if (c50948Jz6 != null) {
                eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
            } else {
                eCSearchEntranceData = null;
            }
            if (!LJJJJZI2.LJIIIZ(eCSearchEntranceData)) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_START;
                LJIIIIZZ.LIZIZ("EcSearchResultActivity");
                LJIIIIZZ.LJJIIJ = smartImageView;
                LJIIIIZZ.LJJIZ = new C50977JzZ();
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
            LLIIIILZ();
            C79077V1t.LJIJ = 0;
            if (!MSAdaptionService.LJIIL().LIZLLL(this)) {
                String keyword = this.LJLJL;
                o.LJIIIZ(keyword, "keyword");
                if (!TextUtils.isEmpty(keyword)) {
                    C50652JuK.Companion.getClass();
                    C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
                    if (LJIIJ == null || (immutableData2 = LJIIJ.getImmutableData()) == null || (searchEventModel = immutableData2.getSearchEventModel()) == null || !o.LJ(searchEventModel.isFromOutside(), Boolean.TRUE)) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            C44037HQb.LIZIZ(this, 1);
                        } else {
                            C44037HQb.LIZIZ(this, 0);
                        }
                    }
                }
            }
            C50972JzU c50972JzU = C50972JzU.LIZJ;
            c50972JzU.LIZIZ++;
            EventBus.LIZJ().LJIILJJIL(c50972JzU);
            Iterator<T> it = C50988Jzk.LIZ.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((List) it.next()).size();
            }
            if (i >= 6) {
                Queue<List<EcSearchResultActivity>> queue = C50988Jzk.LIZ;
                List list = (List) ORZ.LJLLL(queue);
                if (list == null) {
                    list = new ArrayList();
                }
                if (list.isEmpty()) {
                    ((LinkedList) queue).poll();
                } else {
                    Activity activity = (Activity) ListProtector.remove(list, 0);
                    if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                        activity.finish();
                    }
                }
            }
            Queue<List<EcSearchResultActivity>> queue2 = C50988Jzk.LIZ;
            if (queue2.isEmpty() || ((LLJJIJI = C16880lQ.LLJJIJI(getIntent())) != null && LLJJIJI.getBoolean("in_single_stack"))) {
                ((LinkedList) queue2).offer(C47261Igj.LJII(this));
            } else {
                try {
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "search_traffic_source_optimize", true, false)) {
                        EcSearchResultActivity LIZIZ = C50988Jzk.LIZIZ();
                        if (LIZIZ == null || !LIZIZ.isFinishing()) {
                            LLFZ(LIZIZ);
                            C50988Jzk.LIZJ().add(this);
                        }
                    }
                } catch (Throwable unused) {
                }
                LLFZ(C50988Jzk.LIZIZ());
                C50988Jzk.LIZJ().add(this);
            }
            C50652JuK.Companion.getClass();
            C50652JuK LJIIJ2 = C50651JuJ.LJIIJ(this);
            if (LJIIJ2 != null && (immutableData = LJIIJ2.getImmutableData()) != null && (searchEcommerceModel2 = immutableData.getSearchEcommerceModel()) != null) {
                bool = Boolean.valueOf(searchEcommerceModel2.isFromMallUGDeepLink());
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).setIsDeeplinkOpenECMallSearchFlag(true);
            }
            if (c50948Jz6 != null) {
                num = Integer.valueOf(c50948Jz6.getEcSearchEntranceValue());
            }
            int value = EnumC51280KAq.FLASH_SALE.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC51280KAq.ORDER.getValue();
                if (num != null && num.intValue() == value2) {
                    C39468FeK.LJI("order");
                }
            } else {
                C39468FeK.LJI("flash_sale");
            }
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null && (singleTabType = searchEcommerceModel.getSingleTabType()) != null && (searchResultParam = this.LJLJJLL) != null) {
                searchResultParam.setSingleTabType(singleTabType);
            }
            C51214K8c.LJIIIIZZ(this.LJLJJLL);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onCreate", false);
        } catch (RuntimeException e) {
            ALog.e("search", e);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onCreate", false);
        }
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C79077V1t.LJIJ = 0;
        setIntent(intent);
        LLIIIILZ();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_recreate", 1);
        AppLogNewUtils.onEventV3("search_recreate_monitor", jSONObject);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        String LJ;
        K05 k05;
        C50650JuI immutableData;
        C50433Jqn searchCommonModel;
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchCommonModel = immutableData.getSearchCommonModel()) != null) {
            searchCommonModel.getEnterFrom();
        }
        Integer value = ((EcSearchStartViewModel) this.LJLJLLL.getValue()).hv0().getValue();
        if (value == null) {
            value = -1;
        }
        int intValue = value.intValue();
        if (intValue == -1) {
            LJ = KAK.SHOP.getTabName();
        } else {
            LJ = C51214K8c.LJ(intValue);
            if (!C78685UuP.LJJJZ(LJ) || LJ == null) {
                LJ = "";
            }
        }
        Integer num = (Integer) ((LiveData) ((EcSearchStartViewModel) this.LJLJLLL.getValue()).LJLLI.getValue()).getValue();
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            k05 = K05.RECREATE_SEARCH_RESULT;
        } else if (num.intValue() == 2) {
            k05 = K05.RECREATE_SEARCH_SUG;
        } else if (num.intValue() != 1) {
            return;
        } else {
            k05 = K05.RECREATE_SEARCH_SQUARE;
        }
        if (k05 == null) {
            return;
        }
        EcomSearchServiceImpl.LJJJJZI().LJJIZ(outState, k05, this.LJLJJL, LJ);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        LLII().setIsHavingFocus(z);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
