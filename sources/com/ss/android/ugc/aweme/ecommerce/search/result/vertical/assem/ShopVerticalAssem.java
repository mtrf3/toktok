package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.ActivityC45651qj;
import X.C10H;
import X.C10K;
import X.C16880lQ;
import X.C17N;
import X.C199097rd;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C2K0;
import X.C36033ECf;
import X.C36581c6;
import X.C45804HyK;
import X.C47261Igj;
import X.C50287JoR;
import X.C50865Jxl;
import X.C50948Jz6;
import X.C51363KDv;
import X.C51395KFb;
import X.C51417KFx;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65314PkE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72242sW;
import X.C72818Shy;
import X.C76542zS;
import X.C770830u;
import X.C78926UyI;
import X.EnumC51281KAr;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JI6;
import X.KAK;
import X.KFN;
import X.KFS;
import X.KFW;
import X.KG4;
import X.KGI;
import X.KGK;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import Y.ARunnableS27S0200000_8;
import Y.AgS74S0300000_6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.search.ab.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopData;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopVM;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.RequestInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public final class ShopVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC72822Si2, InterfaceC55102Lju {
    public static final /* synthetic */ int LLD = 0;
    public KFN LJLIL;
    public long LJLJI;
    public long LJLJJI;
    public JSONObject LJLJJLL;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public C10H LJLLLL;
    public C50865Jxl LJLLLLLL;
    public KFW LJZ;
    public final C214298b3 LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final Gson LJLILLLLZI = GsonHolder.LIZLLL().LIZ();
    public boolean LJLJJL = true;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public boolean LJLLL = true;
    public final Map<String, Long> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 65));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LL;
        Integer valueOf = Integer.valueOf(R.id.jif);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jif)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1245798836) {
            return null;
        }
        return this;
    }

    public ShopVerticalAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchShopVM.class);
        this.LJZL = new C214298b3(new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 66), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C51417KFx.INSTANCE, LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(72:67|(1:69)(1:326)|70|(61:72|(1:74)(1:324)|75|(1:77)(1:323)|78|(1:322)(1:82)|(1:84)(1:321)|85|(3:91|92|(3:98|(1:102)|(1:108)))|(10:112|(1:114)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126))|127|(1:129)|130|(1:132)|133|(1:135)(1:320)|136|(1:319)|138|(1:140)|141|(3:143|(1:145)|146)(1:318)|147|(3:151|(4:154|(3:156|157|158)(1:160)|159|152)|161)|(1:169)|170|(2:176|(1:(1:(1:182))(2:183|(1:185)))(2:186|(1:188)))|(1:190)(1:317)|191|(1:193)|194|(1:198)|(4:308|(3:310|(1:312)(1:(1:315))|313)|316|313)|202|(4:204|(1:206)(1:211)|(1:208)(1:210)|209)|212|(1:214)|215|216|(1:306)|220|(1:305)|224|(1:304)(3:228|(1:235)|303)|236|(2:238|(16:240|(1:242)(1:299)|243|(1:245)(1:298)|246|(1:248)(1:297)|249|(1:251)|252|(1:254)|255|256|257|(4:259|(1:261)|262|(10:271|272|273|(1:275)|276|(1:278)|279|(1:281)|282|(2:284|285)(2:286|287))(4:266|(1:268)|269|270))|290|(2:292|293)(1:294)))(1:301)|300|243|(0)(0)|246|(0)(0)|249|(0)|252|(0)|255|256|257|(0)|290|(0)(0))|325|75|(0)(0)|78|(1:80)|322|(0)(0)|85|(5:87|89|91|92|(5:94|96|98|(2:100|102)|(3:104|106|108)))|(0)|127|(0)|130|(0)|133|(0)(0)|136|(0)|138|(0)|141|(0)(0)|147|(4:149|151|(1:152)|161)|(4:163|165|167|169)|170|(4:172|174|176|(0)(0))|(0)(0)|191|(0)|194|(2:196|198)|(1:200)|308|(0)|316|313|202|(0)|212|(0)|215|216|(1:218)|306|220|(1:222)|305|224|(1:226)|304|236|(0)(0)|300|243|(0)(0)|246|(0)(0)|249|(0)|252|(0)|255|256|257|(0)|290|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x01b2, code lost:
    
        if (r9 != null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshData() {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem.refreshData():void");
    }

    public final SearchResultParam A3() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext == null) {
            return null;
        }
        return iSearchVerticalContext.k5();
    }

    public final void C3() {
        int value;
        String str;
        String str2;
        String str3;
        Activity activity;
        int i;
        C51363KDv g8;
        C50948Jz6 searchEnterParam;
        SearchResultParam A3 = A3();
        if (A3 != null && (searchEnterParam = A3.getSearchEnterParam()) != null) {
            value = searchEnterParam.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        SearchResultParam A32 = A3();
        if (A32 != null) {
            str = A32.getKeyword();
        } else {
            str = null;
        }
        SearchResultParam A33 = A3();
        if (A33 != null) {
            str2 = A33.getEnterMethod();
        } else {
            str2 = null;
        }
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null && (g8 = iSearchVerticalContext.g8()) != null) {
            str3 = g8.LJIILIIL;
        } else {
            str3 = null;
        }
        String valueOf = String.valueOf(JI6.LIZ());
        Context context = getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        String LIZJ = KFS.LIZJ(str, str2, str3, valueOf, true, String.valueOf(i), ((Boolean) this.LJZI.getValue()).booleanValue(), value);
        try {
            Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
            buildUpon.appendQueryParameter("hasFilterPanel", "1");
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            LIZJ = builder;
        } catch (Exception unused) {
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = LIZJ;
        List LJJIJIL = C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LJ(KG4.LJLIL, LJJIJIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((ViewGroup) _$_findCachedViewById(R.id.jif)).removeAllViews();
        if (_$_findCachedViewById(R.id.jif).getParent() != null && (_$_findCachedViewById(R.id.jif).getParent() instanceof ViewGroup)) {
            ViewParent parent = _$_findCachedViewById(R.id.jif).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(_$_findCachedViewById(R.id.jif), (ViewGroup) parent);
        }
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c50865Jxl != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onPause();
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 18));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onResume();
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 19));
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        KFW kfw;
        String LJJIJIL;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            str = Integer.valueOf(LIZ.hashCode()).toString();
        } else {
            str = null;
        }
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        String str2 = "";
        if (interfaceC78280Uns != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "container_unique_id", "")) != null) {
            str2 = LJJIJIL;
        }
        if (o.LJ(str, str2) && o.LJ(c199097rd.LJLIL, "ec_search_result_page_scroll_to_top") && (kfw = this.LJZ) != null) {
            kfw.LJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        try {
            AssemViewModel.asyncSubscribe$default((DynamicSearchShopVM) this.LJZL.getValue(), new TBT() { // from class: X.EBv
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C36022EBu) obj).LJLIL;
                }
            }, null, new AqS174S0100000_8(this, 258), null, new AqS174S0100000_8(this, 259), 10, null);
        } catch (Exception unused) {
        }
        super.onViewCreated(view);
        this.LJLLJ = a.LJIIZILJ().LIZJ();
        this.LJLZ.put("start_navigation", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        C50865Jxl c50865Jxl = null;
        if (context != null) {
            c50865Jxl = new C50865Jxl(context, C212428Vi.LIZLLL(this));
            c50865Jxl.LIZLLL = new KGK(this);
            c50865Jxl.LJIIJJI = new AqS158S0100000_8(this, 679);
        }
        this.LJLLLLLL = c50865Jxl;
        if (c50865Jxl != null) {
            ViewGroup search_vertical_page = (ViewGroup) _$_findCachedViewById(R.id.jif);
            o.LJIIIIZZ(search_vertical_page, "search_vertical_page");
            c50865Jxl.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), search_vertical_page);
        }
        _$_findCachedViewById(R.id.jif).setVisibility(0);
        if (!KGI.LIZ()) {
            SearchResultParam A3 = A3();
            if (A3 == null || A3.getCapsuleWords() == null) {
                C3();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void tt(boolean z) {
        this.LJLLI = z;
        JSONObject LIZLLL = C770830u.LIZLLL("active", z ? 1 : 0);
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LIZ("changePageActive", LIZLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x3(KFN kfn) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        C10H c10h = this.LJLLLL;
        if (c10h != null) {
            c10h.LIZ();
        }
        this.LJLLLL = new C10H();
        String obj = ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString();
        String SEARCH_HOST = EcSearchApi.LIZ;
        String searchChannel = kfn.getSearchChannel();
        if (searchChannel == null) {
            searchChannel = "tiktok_ecom";
        }
        long cursor = kfn.getCursor();
        String keyword = kfn.getKeyword();
        String enterFrom = kfn.getEnterFrom();
        int count = kfn.getCount();
        int hotSearch = kfn.getHotSearch();
        String searchId = kfn.getSearchId();
        String lastSearchId = kfn.getLastSearchId();
        String source = kfn.getSource();
        String searchSource = kfn.getSearchSource();
        int correctType = kfn.getCorrectType();
        C50287JoR filterOption = kfn.getFilterOption();
        if (filterOption != null) {
            z = filterOption.isDefaultOption();
        } else {
            z = 1;
        }
        int i3 = !z;
        C50287JoR filterOption2 = kfn.getFilterOption();
        if (filterOption2 != null) {
            i = filterOption2.getFilterBy();
        } else {
            i = 0;
        }
        C50287JoR filterOption3 = kfn.getFilterOption();
        if (filterOption3 != null) {
            i2 = filterOption3.getSortType();
        } else {
            i2 = 0;
        }
        C50287JoR filterOption4 = kfn.getFilterOption();
        if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        String searchContext = kfn.getSearchContext();
        String sugTagText = kfn.getSugTagText();
        String sugType = kfn.getSugType();
        String sugQueryState = kfn.getSugQueryState();
        String sugCreatorId = kfn.getSugCreatorId();
        String attachProducts = kfn.getAttachProducts();
        String trafficSourceList = kfn.getTrafficSourceList();
        String cmplEnc = kfn.getCmplEnc();
        String originIsMallTab = kfn.getOriginIsMallTab();
        String ecSearchSessionId = kfn.getEcSearchSessionId();
        String sugShopId = kfn.getSugShopId();
        String userRtActs = kfn.getUserRtActs();
        String userActions = kfn.getUserActions();
        String searchSessionId = kfn.getSearchSessionId();
        String apiVersion = kfn.getApiVersion();
        o.LJIIIIZZ(SEARCH_HOST, "SEARCH_HOST");
        C10K LJIILIIL = C65314PkE.LJIILIIL(obj, SEARCH_HOST, searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i3, i, i2, linkedHashMap, searchContext, sugTagText, sugType, sugQueryState, sugCreatorId, attachProducts, trafficSourceList, cmplEnc, originIsMallTab, ecSearchSessionId, sugShopId, userRtActs, apiVersion, searchSessionId, userActions);
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        C36581c6 c36581c6 = null;
        F3(0, null);
        if (LJIILIIL != null) {
            AgS74S0300000_6 agS74S0300000_6 = new AgS74S0300000_6(this, c72242sW, kfn, 0);
            C10H c10h2 = this.LJLLLL;
            if (c10h2 != null) {
                c36581c6 = c10h2.LIZIZ();
            }
            LJIILIIL.LJI(agS74S0300000_6, C10K.LJII, c36581c6);
        }
    }

    public final void F3(int i, m mVar) {
        int i2;
        if (mVar != null) {
            try {
                if (mVar.LJJIJ("chunk_meta") != null) {
                    j LJJIJ = mVar.LJJIJ("chunk_meta");
                    o.LJII(LJJIJ, "null cannot be cast to non-null type com.google.gson.JsonObject");
                    m mVar2 = (m) LJJIJ;
                    j LJJIJ2 = mVar2.LJJIJ("cursor");
                    int i3 = 0;
                    if (LJJIJ2 != null) {
                        i2 = LJJIJ2.LJIILJJIL();
                    } else {
                        i2 = 0;
                    }
                    j LJJIJ3 = mVar2.LJJIJ("items_count");
                    if (LJJIJ3 != null) {
                        i3 = LJJIJ3.LJIILJJIL();
                    }
                    L3(i2, i3, i);
                    return;
                }
            } catch (Exception unused) {
                L3(-2, -2, i);
                return;
            }
        }
        L3(-1, -1, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H3(long r7, java.lang.String r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r6.A3()
            r4 = 0
            if (r0 == 0) goto L7b
            X.Jz6 r5 = r0.getSearchEnterParam()
            if (r5 == 0) goto L7c
            int r1 = r5.getEcSearchEntranceValue()
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r5.getEcSearchEntranceData()
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r5.getEcSearchEntranceData()
            if (r0 == 0) goto L79
            java.lang.String r3 = r0.getResultType()
        L21:
            java.lang.String r0 = "phase"
            org.json.JSONObject r2 = X.C65232Piu.LIZJ(r0, r9)
            java.lang.String r1 = "cost"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r2.put(r1, r0)
            if (r5 == 0) goto L77
            java.lang.String r1 = r5.getEnterSearchFrom()
        L36:
            java.lang.String r0 = "enter_search_from"
            r2.put(r0, r1)
            java.lang.String r0 = "search_type"
            r2.put(r0, r3)
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r6.A3()
            if (r0 == 0) goto L4a
            java.lang.String r4 = r0.getEnterMethod()
        L4a:
            java.lang.String r0 = "enter_method"
            r2.put(r0, r4)
            X.Z9N r0 = X.Z9N.LIZIZ
            java.lang.String r1 = r0.LIZ()
            java.lang.String r0 = "search_id"
            r2.put(r0, r1)
            X.KAK r0 = X.KAK.SHOP
            java.lang.String r1 = r0.getTabName()
            java.lang.String r0 = "tab_name"
            r2.put(r0, r1)
            if (r5 == 0) goto L71
            int r1 = r5.getEcSearchEntranceValue()
            java.lang.String r0 = "root_enter_from_type"
            r2.put(r0, r1)
        L71:
            java.lang.String r0 = "rd_ec_search_page_load_detail"
            X.C48658J7u.LIZIZ(r0, r2)
            return
        L77:
            r1 = r4
            goto L36
        L79:
            r3 = r4
            goto L21
        L7b:
            r5 = r4
        L7c:
            X.KAr r0 = X.EnumC51281KAr.DEFAULT
            int r1 = r0.getValue()
        L82:
            X.KB0 r0 = X.KB1.LIZLLL(r1)
            java.lang.String r3 = r0.getValue()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem.H3(long, java.lang.String):void");
    }

    public final void K3(Boolean bool, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        if (bool != null) {
            linkedHashMap.put("is_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("cost", Long.valueOf(j));
        linkedHashMap.put("tab_name", "shop");
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }

    public final void v3(String str, Throwable th) {
        I3(0, 0, false);
        if (str == null) {
            m mVar = new m();
            m mVar2 = new m();
            mVar2.LJJIIJ("cursor", -1);
            mVar2.LJJIII(Boolean.FALSE, "has_more");
            mVar2.LJJIIJ("items_count", 0);
            mVar.LJJII("chunk_meta", mVar2);
            mVar.LJJIIJ("status_code", -1);
            mVar.LJJIIZ("status_msg", "");
            mVar.LJJIIZ("enter_from_sub", C17N.LJJJJJL(this).cs().LIZJ().LJLILLLLZI);
            str = GsonProtectorUtils.toJson(this.LJLILLLLZI, new DynamicSearchShopData(mVar, new RequestInfo(System.currentTimeMillis() - 0)));
            o.LJIIIIZZ(str, "gson.toJson(\n           …\n            ),\n        )");
        }
        C51395KFb.LIZ(new AqS75S1100000_8(this, str, 15));
        String message = th.getMessage();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        if (message != null) {
            linkedHashMap.put("error_msg", message);
        }
        linkedHashMap.put("tab_name", "shop");
        C76542zS.LIZ("rd_tiktokec_chunk_error", linkedHashMap);
    }

    public final void E3(SearchApiResult searchApiResult, String str, KAK searchType) {
        o.LJIIIZ(searchType, "searchType");
        C50865Jxl c50865Jxl = this.LJLLLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LIZJ(str);
        }
        String str2 = null;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            SearchResultParam A3 = A3();
            if (A3 != null) {
                str2 = A3.getKeyword();
            }
            iSearchVerticalContext.Bf(str2, searchApiResult, KAK.SHOP);
        }
    }

    public final void I3(int i, int i2, boolean z) {
        String str;
        String str2;
        int i3;
        String optString;
        String str3;
        C50948Jz6 searchEnterParam;
        if (z) {
            try {
                this.LJLJI = System.currentTimeMillis();
            } catch (Exception unused) {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        if (((Boolean) this.LJZI.getValue()).booleanValue()) {
            str = "/aweme/v1/search/stream/ecom/";
        } else {
            str = "/aweme/v1/search/single/ecom/";
        }
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (z) {
            str2 = "rd_ec_request_send";
        } else {
            str2 = "rd_ec_request_result";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_method", "template");
        jSONObject.put("start_click_to_now", System.currentTimeMillis() - this.LJLJJI);
        int i4 = 1;
        if (this.LJLJJL) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject.put("request_type", i3);
        JSONObject jSONObject2 = this.LJLJJLL;
        if (jSONObject2 == null || (optString = jSONObject2.optString("enter_from")) == null) {
            optString = "";
        }
        jSONObject.put("enter_from", optString);
        SearchResultParam A3 = A3();
        if (A3 != null) {
            str3 = A3.getEnterMethod();
        } else {
            str3 = null;
        }
        jSONObject.put("enter_method", str3);
        if (!z) {
            jSONObject.put("api_duration", currentTimeMillis);
            jSONObject.put("is_success", i);
            jSONObject.put("item_count", i2);
            jSONObject.put("params", 0);
        }
        jSONObject.put("api_path", str);
        jSONObject.put("rd_page_type", "native");
        if (C36033ECf.LIZJ("goods_view_action") == null) {
            i4 = 0;
        }
        jSONObject.put("has_user_action_info", i4);
        SearchResultParam A32 = A3();
        if (A32 != null && (searchEnterParam = A32.getSearchEnterParam()) != null) {
            jSONObject.put("root_enter_from_type", searchEnterParam);
        }
        createIECommerceServicebyMonsterPlugin.reportVerticalSearchApiLog(str2, jSONObject);
        if (!z) {
            this.LJLJJL = false;
        }
    }

    public final void L3(int i, int i2, int i3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        linkedHashMap.put("chunk_cursor", Integer.valueOf(i));
        linkedHashMap.put("chunk_count", Integer.valueOf(i2));
        linkedHashMap.put("step", Integer.valueOf(i3));
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }
}
