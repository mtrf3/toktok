package com.ss.android.ugc.aweme.search.pages.core.ui.activity;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC86117Xqz;
import X.C10K;
import X.C157166Eu;
import X.C16880lQ;
import X.C16970lZ;
import X.C221108m2;
import X.C252019un;
import X.C25903AEp;
import X.C32044Chs;
import X.C34X;
import X.C36519EUx;
import X.C38354F3m;
import X.C38995FSd;
import X.C39774FjG;
import X.C42625Go9;
import X.C44037HQb;
import X.C45804HyK;
import X.C47261Igj;
import X.C49314JXa;
import X.C49500Jbk;
import X.C49503Jbn;
import X.C49921JiX;
import X.C49922JiY;
import X.C49924Jia;
import X.C49995Jjj;
import X.C50156JmK;
import X.C50373Jpp;
import X.C50433Jqn;
import X.C50558Jso;
import X.C50600JtU;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50734Jve;
import X.C50768JwC;
import X.C50789JwX;
import X.C50948Jz6;
import X.C50964JzM;
import X.C50967JzP;
import X.C50971JzT;
import X.C50979Jzb;
import X.C50989Jzl;
import X.C51107K3z;
import X.C51305KBp;
import X.C53765L8f;
import X.C53789L9d;
import X.C62822Ol8;
import X.C65777Prh;
import X.C65803Ps7;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78685UuP;
import X.C78840Uwu;
import X.C79077V1t;
import X.DZW;
import X.DZY;
import X.EnumC50363Jpf;
import X.EnumC50812Jwu;
import X.EnumC50927Jyl;
import X.FFL;
import X.FKM;
import X.FOD;
import X.GHC;
import X.IQS;
import X.IQT;
import X.InterfaceC151715xP;
import X.InterfaceC18010nF;
import X.InterfaceC27853AwT;
import X.InterfaceC36571c5;
import X.InterfaceC45601Hv3;
import X.InterfaceC46330IGg;
import X.InterfaceC50992Jzo;
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
import X.JGX;
import X.JGY;
import X.JHH;
import X.JTO;
import X.JXA;
import X.JY2;
import X.K01;
import X.K02;
import X.K03;
import X.K05;
import X.K0D;
import X.K0G;
import X.K0K;
import X.K0M;
import X.K0Y;
import X.K5P;
import X.K5R;
import X.K64;
import X.K7D;
import X.KAK;
import X.KB1;
import X.KK8;
import X.L9Y;
import X.ORZ;
import X.TBW;
import X.TMG;
import X.W1T;
import X.X1D;
import Y.ACallableS43S0000000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import Y.AgS47S0000000_8;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.viewmodel.SearchMusicPlayerLifecycleObserver;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchResultActivity extends ActivityC86117Xqz implements K01, InterfaceC151715xP, InterfaceC45601Hv3, InterfaceC27853AwT, AMD<C25903AEp>, InterfaceC18010nF, C34X {
    public static boolean LJLLLL;
    public K5R LJLILLLLZI;
    public boolean LJLJI;
    public K0D LJLJJI;
    public SearchResultParam LJLJJL;
    public View LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final ArrayList<GHC> LJLIL = new ArrayList<>();
    public String LJLJJLL = "";
    public final C25903AEp LJLJL = new C25903AEp();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 205));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 207));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 204));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 206));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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
        return "b6880";
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

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public SearchResultActivity() {
        Iterator it = C47261Igj.LJJIJ(new SearchMusicPlayerLifecycleObserver(this)).iterator();
        while (it.hasNext()) {
            getLifecycle().addObserver((SearchMusicPlayerLifecycleObserver) it.next());
        }
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 203));
    }

    public final SearchStateViewModel LLFZ() {
        return (SearchStateViewModel) this.LJLJLLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x028c, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x028d, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0295, code lost:
    
        X.C50471JrP.LIZIZ(r4, r3, r10, r33);
        r6 = X.C50768JwC.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x029a, code lost:
    
        if (r6 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a0, code lost:
    
        if (r6.LIZJ <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a6, code lost:
    
        if (r6.LJ <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a8, code lost:
    
        r6.LJJIJIIJI = java.lang.System.currentTimeMillis() - r6.LJJIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b1, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b3, code lost:
    
        X.JTO.LIZ(r33).jv0(r33, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ba, code lost:
    
        r3 = r33.LJLJJL;
        kotlin.jvm.internal.o.LJI(r3);
        r3.setOpenNewSearchContainer(true);
        r3 = r33.LJLJJL;
        kotlin.jvm.internal.o.LJI(r3);
        r2 = new android.os.Bundle();
        r2.putSerializable("searchParam", r3);
        r2.putSerializable("search_enter_param", r0);
        r3 = new com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew();
        r3.setArguments(r2);
        r1 = getSupportFragmentManager();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "supportFragmentManager");
        r2 = new X.C1B3(r1);
        r2.LJIIJ(r3, "container", com.zhiliaoapp.musically.R.id.dm7);
        r2.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028f, code lost:
    
        r2 = r0.getAuthorId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
    
        if (r2 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f7, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0284, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028a, code lost:
    
        if (r3 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.JuI, X.Jqs, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.Jqs, X.Jpp, X.K4c, X.K5P] */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.Jqs, X.Jdw, X.Jpp, X.K4c, X.K5P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII() {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity.LLII():void");
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        return (InterfaceC51123K4p) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        Boolean bool;
        C50948Jz6 c50948Jz6 = JTO.LIZ(this).LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("finish: param: ");
        LIZ.append(c50948Jz6);
        LIZ.append(", ");
        if (c50948Jz6 != null) {
            bool = Boolean.valueOf(c50948Jz6.getLeftIcon());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(' ');
        X1D.LIZIZ(LIZ);
        if (c50948Jz6 == null || !c50948Jz6.getLeftIcon() || !C53765L8f.LIZ()) {
            activityConfiguration(C51305KBp.LJLIL);
        }
        C50734Jve LIZ2 = C252019un.LIZ();
        EnumC50927Jyl stopReason = EnumC50927Jyl.OTHERS;
        LIZ2.getClass();
        o.LJIIIZ(stopReason, "stopReason");
        SearchCoinTaskManager searchCoinTaskManager = LIZ2.LJLJJL;
        if (searchCoinTaskManager != null) {
            searchCoinTaskManager.cancelTimer(stopReason);
        }
        super.finish();
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("container");
        if (LJJJIL instanceof SearchResultFragmentNew) {
            int Vm = ((SearchResultFragmentNew) LJJJIL).Vm();
            if (Vm == C50605JtZ.LJIIJJI()) {
                return "general_search";
            }
            if (Vm == C50605JtZ.LJIILIIL()) {
                return "search_result";
            }
        }
        return "";
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (K0Y.LIZ(this)) {
            return;
        }
        InterfaceC36571c5 LJJJIL = getSupportFragmentManager().LJJJIL("container");
        if (LJJJIL instanceof InterfaceC50992Jzo) {
            LLFZ().setBackToMiddle(true);
            if (((InterfaceC50992Jzo) LJJJIL).LLLZZIL(K7D.SYSTEM_BACK_METHOD)) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        String str;
        L9Y l9y;
        ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap;
        View decorView;
        C65803Ps7.LIZIZ(this);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            JY2.LIZJ(decorView);
        }
        C50948Jz6 c50948Jz6 = (C50948Jz6) getIntent().getSerializableExtra("search_enter_param");
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        boolean LJFF = C50989Jzl.LJFF(this);
        if ((o.LJ(str, "homepage_follow") || o.LJ(str, "homepage_hot") || o.LJ(str, "homepage_friends")) && !LJFF) {
            C50979Jzb c50979Jzb = new C50979Jzb();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            Gson gson = new Gson();
            Set<String> set = C50156JmK.LIZ;
            LIZ.append(GsonProtectorUtils.toJson(gson, set));
            LIZ.append(']');
            c50979Jzb.LJIIZILJ("search_id_list", X1D.LIZIZ(LIZ));
            c50979Jzb.LJIIZILJ("group_id", C50156JmK.LIZLLL);
            c50979Jzb.LJIIZILJ("enter_from", str);
            c50979Jzb.LJIILIIL();
            C50156JmK.LIZLLL = "";
            set.clear();
            C50156JmK.LIZIZ.clear();
        }
        JGY jgy = JGX.LIZ;
        jgy.getClass();
        if (TextUtils.isEmpty(null)) {
            ((HashMap) jgy.LIZ).clear();
        }
        Iterator it = ((HashMap) jgy.LIZ).keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && str2.startsWith(null)) {
                it.remove();
            }
        }
        int i = C49924Jia.LJ - 1;
        C49924Jia.LJ = i;
        int i2 = C49924Jia.LIZLLL;
        if (i2 > 0) {
            C49924Jia.LIZLLL = i2 - 1;
        }
        if (i <= 0) {
            ((HashMap) C49924Jia.LIZ).clear();
        }
        ((LinkedHashMap) C49921JiX.LIZJ).clear();
        ((LinkedHashMap) C49922JiY.LIZJ).clear();
        int i3 = 0;
        C49503Jbn.LIZIZ = false;
        C49503Jbn.LIZJ = false;
        C49503Jbn.LIZLLL = false;
        JTO.LIZ(this);
        SearchEnterViewModel.LJLILLLLZI.remove(Integer.valueOf(hashCode()));
        int hashCode = hashCode();
        Map<String, Set<K03>> map = K02.LIZ;
        o.LJI(map);
        for (Set set2 : ((HashMap) map).values()) {
            o.LJI(set2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                if (((K03) it2.next()).LIZJ == hashCode) {
                    it2.remove();
                }
            }
        }
        C49314JXa c49314JXa = C49314JXa.LIZJ;
        int i4 = c49314JXa.LIZIZ - 1;
        c49314JXa.LIZIZ = i4;
        if (i4 <= 0) {
            EventBus.LIZJ().LJIJ(c49314JXa);
            c49314JXa.LIZJ().clear();
            c49314JXa.LIZIZ = 0;
        }
        SearchApiNew.LIZJ.clear();
        C50964JzM c50964JzM = C50964JzM.LJLIL;
        C50964JzM.LJ(this);
        if (C50964JzM.LJLILLLLZI.size() == 0) {
            FKM.LIZ().unregisterActivityLifecycleCallbacks(c50964JzM);
            if (C42625Go9.LIZ(c50964JzM)) {
                C42625Go9.LIZJ(c50964JzM);
            }
            C50964JzM.LJLJI = false;
        }
        K0M.LIZJ(hashCode());
        CopyOnWriteArrayList<CopyOnWriteArrayList<SearchResultActivity>> copyOnWriteArrayList = C50989Jzl.LIZIZ;
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator<CopyOnWriteArrayList<SearchResultActivity>> it3 = copyOnWriteArrayList.iterator();
            o.LJIIIIZZ(it3, "groupActivityQueue.iterator()");
            while (it3.hasNext()) {
                CopyOnWriteArrayList<SearchResultActivity> next = it3.next();
                Iterator<SearchResultActivity> it4 = next.iterator();
                o.LJIIIIZZ(it4, "it.iterator()");
                while (it4.hasNext()) {
                    if (o.LJ(it4.next(), this)) {
                        next.remove(this);
                    }
                }
                if (next.size() == 0) {
                    C50989Jzl.LIZIZ.remove(next);
                }
            }
            Iterator<CopyOnWriteArrayList<SearchResultActivity>> it5 = C50989Jzl.LIZIZ.iterator();
            int i5 = 0;
            while (it5.hasNext()) {
                i5 += it5.next().size();
            }
            if (i5 == 0) {
                if (((Number) K0G.LIZ.getValue()).intValue() != 0) {
                    IQS iqs = IQT.LIZ;
                    Iterator<InterfaceC46330IGg> it6 = iqs.LIZ.iterator();
                    while (it6.hasNext()) {
                        it6.next().release();
                    }
                    ((LinkedList) iqs.LIZ).clear();
                }
                if (((Number) K0K.LIZ.getValue()).intValue() == 1) {
                    C49995Jjj.LIZLLL.clear();
                    C49995Jjj.LIZJ.clear();
                    C49995Jjj.LIZIZ = 0;
                }
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(this);
        if (LJIJJ != null) {
            i3 = LJIJJ.hashCode();
        }
        C51107K3z.LIZJ.remove(Integer.valueOf(i3));
        InterfaceC51123K4p interfaceC51123K4p = (InterfaceC51123K4p) this.LJLLJ.getValue();
        if ((interfaceC51123K4p instanceof C53789L9d) && (l9y = (L9Y) interfaceC51123K4p) != null && (concurrentHashMap = l9y.LIZIZ) != null) {
            concurrentHashMap.clear();
        }
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) this.LJLLI.getValue();
        if (searchContainerHeaderVM != null) {
            searchContainerHeaderVM.iv0();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        K5P searchEcommerceModel;
        String singleTabType;
        SearchResultParam searchResultParam;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onResume", true);
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJI = System.currentTimeMillis();
        }
        super.onResume();
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null && (singleTabType = searchEcommerceModel.getSingleTabType()) != null && (searchResultParam = this.LJLJJL) != null) {
            searchResultParam.setSingleTabType(singleTabType);
        }
        C50605JtZ.LJIILJJIL(this.LJLJJL);
        C50971JzT.LIZ();
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c50654JuM.getClass();
        C50654JuM.LIZJ(linkedHashMap, false);
        K02.LIZIZ = hashCode();
        JXA.LIZJ = hashCode();
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJI > 0) {
            c50789JwX2.LJIJ = System.currentTimeMillis() - c50789JwX2.LJI;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onStart", true);
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJFF = System.currentTimeMillis();
        }
        super.onStart();
        LLFZ().setSearchPageVisible(true);
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJFF > 0) {
            c50789JwX2.LJIIZILJ = System.currentTimeMillis() - c50789JwX2.LJFF;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (!C50600JtU.LIZIZ) {
            C79077V1t.LJIJ = 300;
        }
        C50600JtU.LIZIZ = false;
        LLFZ().setSearchPageVisible(false);
        LLFZ().setIsLeavingSearch(false);
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
        return this.LJLJL;
    }

    public final void LLFII(SearchResultActivity searchResultActivity) {
        C50652JuK LJIIJ;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ2 = C50651JuJ.LJIIJ(searchResultActivity);
        if (LJIIJ2 == null || (LJIIJ = C50651JuJ.LJIIJ(this)) == null) {
            return;
        }
        if (searchResultActivity != null && searchResultActivity.isFinishing()) {
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
        if (z != LJLLLL) {
            Fragment LJJJIL = getSupportFragmentManager().LJJJIL("container");
            if (LJJJIL instanceof SearchResultFragmentNew) {
                LJJJIL.getClass();
            }
        }
        LJLLLL = z;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        K5P searchEcommerceModel;
        String singleTabType;
        SearchResultParam searchResultParam;
        C50650JuI immutableData;
        K5P searchEcommerceModel2;
        Bundle LLJJIJI;
        C50650JuI immutableData2;
        C50373Jpp searchEventModel;
        String str;
        String str2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onCreate", true);
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            c50789JwX.LJ = currentTimeMillis;
            c50789JwX.LJIILL = currentTimeMillis - c50789JwX.LIZJ;
        }
        Boolean bool = null;
        C50558Jso.LIZIZ(this, null);
        activityConfiguration(new AqS174S0100000_8(this, 77));
        if (DZW.LJLILLLLZI.LJJII()) {
            if (K64.LIZ()) {
                str2 = "search_result_fragment_layout_new";
            } else {
                str2 = "search_legacy_fragment_integrated_search_old";
            }
            C16970lZ.LJFF(this, str2);
        }
        super.onCreate(bundle);
        if (C39774FjG.LIZ()) {
            this.LJLJJI = new K0D(0);
            if (bundle != null) {
                str = bundle.getString("shouldRecreate");
            } else {
                str = null;
            }
            if (o.LJ(str, "1")) {
                this.LJLILLLLZI = new K5R(0);
            }
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            if (LJJJJZI != null) {
                LJJJJZI.LJJII(bundle, this.LJLILLLLZI);
            }
        }
        try {
            EnumC50363Jpf enumC50363Jpf = EnumC50363Jpf.INSTANCE;
            setContentView(enumC50363Jpf.getView(this, R.layout.cen, null));
            LLII();
            if (DZY.LJLILLLLZI.LJJII() && !C78840Uwu.LJJI(this.LJLJJL)) {
                EnumC50812Jwu scene = EnumC50812Jwu.SEARCH_MIDDLE;
                o.LJIIIZ(scene, "scene");
                if (!C50967JzP.LIZ) {
                    C50967JzP.LIZ = true;
                    C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(this, scene, 51));
                }
            }
            if (!C38354F3m.LJ(this.LJLJJLL) && C49500Jbk.LIZ() && !this.LJLJI) {
                this.LJLJI = true;
                C38995FSd.LIZJ().execute(new ARunnableS22S0200000_3(KK8.LIZIZ, this, 52));
                KK8.LIZ(this);
            }
            C50971JzT.LIZ();
            if (!MSAdaptionService.LJIIL().LIZLLL(this) && !TextUtils.isEmpty(this.LJLJJLL)) {
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
            C50964JzM c50964JzM = C50964JzM.LJLIL;
            if (!C50964JzM.LJLJI) {
                FKM.LIZ().registerActivityLifecycleCallbacks(c50964JzM);
                C42625Go9.LIZIZ(c50964JzM);
                C50964JzM.LJLJI = true;
            }
            C50964JzM.LIZ(this);
            if (!C36519EUx.LIZ) {
                synchronized (C36519EUx.class) {
                    if (!C36519EUx.LIZ) {
                        C10K.LIZJ(new ACallableS43S0000000_8(2)).LIZLLL(new AgS47S0000000_8(3));
                        C36519EUx.LIZ = true;
                    }
                }
            }
            enumC50363Jpf.async(new ARunnableS44S0100000_8(this, 36));
            C49314JXa c49314JXa = C49314JXa.LIZJ;
            c49314JXa.LIZIZ++;
            EventBus.LIZJ().LJIILJJIL(c49314JXa);
            this.LJLLILLLL = findViewById(R.id.dx4);
            ((SearchGlobalViewModel) this.LJLL.getValue()).LJLJJI.observe(this, new AObserverS76S0100000_8(this, 5));
            Iterator<CopyOnWriteArrayList<SearchResultActivity>> it = C50989Jzl.LIZIZ.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().size();
            }
            if (i >= C50989Jzl.LIZ) {
                CopyOnWriteArrayList<CopyOnWriteArrayList<SearchResultActivity>> copyOnWriteArrayList = C50989Jzl.LIZIZ;
                List list = (CopyOnWriteArrayList) ORZ.LJLLLL(copyOnWriteArrayList);
                if (list == null) {
                    list = new ArrayList();
                }
                if (list.isEmpty()) {
                    C65777Prh.LIZ(copyOnWriteArrayList).remove(list);
                } else {
                    Activity activity = (Activity) ListProtector.remove(list, 0);
                    if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                        activity.finish();
                    }
                }
            }
            CopyOnWriteArrayList<CopyOnWriteArrayList<SearchResultActivity>> copyOnWriteArrayList2 = C50989Jzl.LIZIZ;
            if (copyOnWriteArrayList2.isEmpty() || ((LLJJIJI = C16880lQ.LLJJIJI(getIntent())) != null && LLJJIJI.getBoolean("in_single_stack"))) {
                CopyOnWriteArrayList<SearchResultActivity> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList3.add(this);
                copyOnWriteArrayList2.add(copyOnWriteArrayList3);
            } else {
                try {
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "search_traffic_source_optimize", true, false)) {
                        SearchResultActivity LIZIZ = C50989Jzl.LIZIZ();
                        if (LIZIZ == null || !LIZIZ.isFinishing()) {
                            LLFII(LIZIZ);
                            C50989Jzl.LIZLLL().add(this);
                        }
                    }
                } catch (Throwable unused) {
                }
                LLFII(C50989Jzl.LIZIZ());
                C50989Jzl.LIZLLL().add(this);
            }
            C50652JuK.Companion.getClass();
            C50652JuK LJIIJ2 = C50651JuJ.LJIIJ(this);
            if (LJIIJ2 != null && (immutableData = LJIIJ2.getImmutableData()) != null && (searchEcommerceModel2 = immutableData.getSearchEcommerceModel()) != null) {
                bool = Boolean.valueOf(searchEcommerceModel2.isFromMallUGDeepLink());
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).setIsDeeplinkOpenECMallSearchFlag(true);
            }
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null && (singleTabType = searchEcommerceModel.getSingleTabType()) != null && (searchResultParam = this.LJLJJL) != null) {
                searchResultParam.setSingleTabType(singleTabType);
            }
            C50605JtZ.LJIILJJIL(this.LJLJJL);
            C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
            if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJ > 0) {
                c50789JwX2.LJIILLIIL = System.currentTimeMillis() - c50789JwX2.LJ;
            }
            ((Number) FOD.LIZ.getValue()).intValue();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onCreate", false);
        } catch (RuntimeException e) {
            ALog.e("search", e);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onCreate", false);
        }
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C50971JzT.LIZ();
        setIntent(intent);
        LLII();
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
        String LJFF;
        C50650JuI immutableData;
        C50433Jqn searchCommonModel;
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchCommonModel = immutableData.getSearchCommonModel()) != null) {
            searchCommonModel.getEnterFrom();
        }
        if (KB1.LJII(KB1.LIZ(JTO.LIZIZ(this))) && C39774FjG.LIZ()) {
            Integer value = ((SearchStartViewModel) this.LJLJLJ.getValue()).iv0().getValue();
            if (value == null) {
                value = -1;
            }
            int intValue = value.intValue();
            K05 k05 = null;
            if (intValue == -1) {
                LJFF = KAK.SHOP.getTabName();
            } else {
                LJFF = C50605JtZ.LJFF(intValue);
                if (!C78685UuP.LJJJZ(LJFF) || LJFF == null) {
                    LJFF = "";
                }
            }
            Integer value2 = ((SearchStartViewModel) this.LJLJLJ.getValue()).hv0().getValue();
            if (value2 != null) {
                if (value2.intValue() == 0) {
                    k05 = K05.RECREATE_SEARCH_RESULT;
                } else if (value2.intValue() == 2) {
                    k05 = K05.RECREATE_SEARCH_SUG;
                } else if (value2.intValue() == 1) {
                    k05 = K05.RECREATE_SEARCH_SQUARE;
                }
            }
            if (o.LJ(LJFF, KAK.SHOP.getTabName()) && k05 != null) {
                EcomSearchServiceImpl.LJJJJZI().LJJIZ(outState, k05, this.LJLJJI, LJFF);
            }
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        LLFZ().setIsHavingFocus(z);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        if (!this.LJLIL.contains(listener)) {
            Iterator<GHC> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                GHC next = it.next();
                if (o.LJ(next.getClass(), listener.getClass())) {
                    ArrayList<GHC> arrayList = this.LJLIL;
                    ListProtector.add(arrayList, arrayList.indexOf(next), listener);
                    return;
                }
            }
            this.LJLIL.add(listener);
        }
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.remove(listener);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<GHC> arrayList = this.LJLIL;
        if (arrayList != null) {
            Iterator<GHC> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
            JHH.LJLIL.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
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
