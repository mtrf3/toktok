package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.ui;

import X.C17N;
import X.C184077Kh;
import X.C187127Wa;
import X.C1B8;
import X.C214298b3;
import X.C214528bQ;
import X.C2NU;
import X.C50016Jk4;
import X.C50017Jk5;
import X.C50018Jk6;
import X.C50031JkJ;
import X.C50068Jku;
import X.C50139Jm3;
import X.C50236Jnc;
import X.C50287JoR;
import X.C50469JrN;
import X.C50589JtJ;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50799Jwh;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.InterfaceC50067Jkt;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.KAK;
import X.QD3;
import X.TBT;
import X.XKX;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceData;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceViewModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes9.dex */
public final class DynamicSearchPlaceFragment extends DynamicSearchFragment {
    public static final int LLILZLL = ((OptimizeConfig) C50018Jk6.LIZIZ.getValue()).verticalPlace;
    public final C214298b3 LLILZ;
    public final Map<Integer, View> LLILZIL = new LinkedHashMap();
    public final String LLILLJJLI = KAK.PLACE.getTabName();
    public final Gson LLILLL = GsonHolder.LIZLLL().LIZ();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Ol() {
        this.LJLIL = true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void fm() {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public DynamicSearchPlaceFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchPlaceViewModel.class);
        this.LLILZ = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 285), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C50016Jk4.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLLLLLL = C50605JtZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0004, B:5:0x000e, B:10:0x001a, B:11:0x0022, B:13:0x0028), top: B:2:0x0004 }] */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject Sl(X.C50948Jz6 r5) {
        /*
            r4 = this;
            org.json.JSONObject r3 = super.Sl(r5)
            com.ss.android.ugc.tiktok.location_api.service.ILocationService r0 = com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl.LJIJJ()     // Catch: java.lang.Exception -> L3c
            java.util.Map r1 = r0.getLocationCommonParamsIfHave()     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L17
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 != 0) goto L3c
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Exception -> L3c
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L3c
        L22:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L3c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L3c
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L3c
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L3c
            goto L22
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.placesearch.core.ui.DynamicSearchPlaceFragment.Sl(X.Jz6):org.json.JSONObject");
    }

    @Override // X.InterfaceC50173Jmb
    public final void T2(InterfaceC50067Jkt interfaceC50067Jkt) {
        String str;
        C50469JrN searchVideoModel;
        ((C50799Jwh) interfaceC50067Jkt).LJIIIIZZ(C17N.LJJJJJL(this));
        String Kl = Kl();
        String str2 = this.LJZ;
        String LIZIZ = C50236Jnc.LIZ().LIZIZ();
        try {
            String LJIJJLI = PoiServiceImpl.LIZIZ().LJIJJLI("poi_vertical_search_lynx");
            if (LJIJJLI == null || LJIJJLI.length() <= 0) {
                LJIJJLI = "aweme://lynxview/?channel=fe_search_poi_lynx&bundle=poi_vertical_search/template.js&use_spark=1&ab_params=show_poi_vertical_search,show_poi_vertical_search_collect,vertical_search_single_feedback,show_single_feedback_V2,tt_search_pressed_state&dynamic=1&surl=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_search_poi_lynx%2Fpoi_vertical_search%2Ftemplate.js";
            }
            Uri.Builder buildUpon = UriProtector.parse(LJIJJLI).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("keyword", Kl).appendQueryParameter("search_context", LIZIZ).appendQueryParameter("search_source", str2);
            C50652JuK.Companion.getClass();
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null) {
                str = searchVideoModel.getGroupId();
            } else {
                str = null;
            }
            appendQueryParameter.appendQueryParameter("lastFromGroupId", str);
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = buildUpon.toString();
            C50068Jku.LIZIZ(interfaceC50067Jkt, dynamicPatch, null, false, false, 62);
        } catch (Throwable unused) {
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        o.LJIIIZ(event, "event");
        Tl().LIZ("poiCollectStatusChange", C1B8.LIZIZ("poi_id", event.LJLILLLLZI, "is_collected", event.LJLIL ? 1 : 0));
    }

    public final String qm(m mVar) {
        Gson gson = this.LLILLL;
        if (mVar == null) {
            mVar = new m();
            mVar.LJJIIJ("status_code", -1);
        }
        String json = GsonProtectorUtils.toJson(gson, new DynamicSearchPlaceData(mVar, new RequestInfo(C50139Jm3.LIZIZ(this.LJLLLLLL))));
        o.LJIIIIZZ(json, "gson.toJson(\n           …\n            ),\n        )");
        return json;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void nm(int i, C50287JoR c50287JoR) {
        Integer num;
        String str;
        super.nm(i, c50287JoR);
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                em();
                String Kl = Kl();
                int i2 = LLILZLL;
                String str2 = this.LJZ;
                String searchId = this.LJLJJI.getSearchId();
                String LIZIZ = C50236Jnc.LIZ().LIZIZ();
                String LIZ = C50589JtJ.LIZ(il().get(), this.LJLLILLLL);
                if (a.LJFF().LJJJJI()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam = this.LJLLILLLL;
                if (searchResultParam != null) {
                    str = searchResultParam.getSugGenerateType();
                } else {
                    str = null;
                }
                C50031JkJ c50031JkJ = new C50031JkJ(Kl, str2, null, 0, 0, "", searchId, 0L, i2, null, null, null, null, null, null, LIZIZ, LIZ, num, str, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 804781114, 2);
                DynamicSearchBaseViewModel dynamicSearchBaseViewModel = (DynamicSearchBaseViewModel) this.LLILZ.getValue();
                XKX.LIZLLL(dynamicSearchBaseViewModel.getAssemVMScope(), null, null, new C50017Jk5(dynamicSearchBaseViewModel, c50031JkJ, null), 3);
                return;
            }
        } catch (Exception unused) {
        }
        m mVar = new m();
        mVar.LJJIIJ("status_code", -1);
        Tl().LIZJ(qm(mVar));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILZ.getValue(), new TBT() { // from class: X.Jk2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50015Jk3) obj).LJLIL;
            }
        }, null, new AqS174S0100000_8(this, 7), null, new AqS174S0100000_8(this, 8), 10, null);
    }
}
