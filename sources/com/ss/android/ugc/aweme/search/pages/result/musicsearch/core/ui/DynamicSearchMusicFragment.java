package com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui;

import X.AbstractC50059Jkl;
import X.AbstractC50814Jww;
import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C17N;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C2NU;
import X.C47261Igj;
import X.C49589JdB;
import X.C50002Jjq;
import X.C50010Jjy;
import X.C50011Jjz;
import X.C50013Jk1;
import X.C50017Jk5;
import X.C50018Jk6;
import X.C50031JkJ;
import X.C50044JkW;
import X.C50139Jm3;
import X.C50236Jnc;
import X.C50287JoR;
import X.C50427Jqh;
import X.C50433Jqn;
import X.C50469JrN;
import X.C50589JtJ;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50799Jwh;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.InterfaceC50067Jkt;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.JXU;
import X.ORS;
import X.TBT;
import X.XKX;
import Y.AObserverS76S0100000_8;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.lynx.core.repo.DynamicSearchMusicData;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.DynamicSearchBaseViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchmusic.core.viewmodel.DynamicSearchMusicVM;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class DynamicSearchMusicFragment extends DynamicSearchFragment {
    public static final int LLIZ = ((OptimizeConfig) C50018Jk6.LIZIZ.getValue()).verticalSounds;
    public MusicPlayHelper LLILLJJLI;
    public final C214298b3 LLILLL;
    public final Gson LLILZ;
    public final boolean LLILZIL;
    public final Map<Integer, View> LLILZLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "music";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Ol() {
        this.LJLIL = true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void fm() {
    }

    public DynamicSearchMusicFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchMusicVM.class);
        this.LLILLL = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 284), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C50011Jjz.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLILZ = GsonHolder.LIZLLL().LIZ();
        this.LJLLLLLL = C50605JtZ.LJIIIZ();
        this.LLILZIL = !C50013Jk1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void initView() {
        SearchBaseSparkView searchBaseSparkView;
        super.initView();
        if (C00F.LIZ(31744, 0, "dynamic_search_music_container_type", true) == 1) {
            InterfaceC50067Jkt Tl = Tl();
            if ((Tl instanceof C50799Jwh) && (searchBaseSparkView = (SearchBaseSparkView) Tl) != null) {
                ORS.LJJLIIIJJIZ(searchBaseSparkView.LJI, new AbstractC50814Jww[]{new JXU()});
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC50173Jmb
    public final void T2(InterfaceC50067Jkt interfaceC50067Jkt) {
        String str;
        String str2;
        C50469JrN searchVideoModel;
        m mVar;
        j LJJIJ;
        String Kl = Kl();
        String str3 = this.LJZ;
        String LIZIZ = C50236Jnc.LIZ().LIZIZ();
        try {
            SearchResultConfig searchResultConfig = (SearchResultConfig) SettingsManager.LIZLLL().LJIIIIZZ("search_result_config", SearchResultConfig.class, C50002Jjq.LIZIZ);
            C50002Jjq.LIZIZ = searchResultConfig;
            if (searchResultConfig == null || (mVar = searchResultConfig.verticalSounds) == null || (LJJIJ = mVar.LJJIJ("schema")) == null || (str = LJJIJ.LJJIFFI()) == null) {
                str = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-sounds/template.js&prefix=online/lynx/search-card&use_bdx=1";
            }
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("keyword", Kl).appendQueryParameter("search_context", LIZIZ).appendQueryParameter("search_source", str3);
            C50652JuK.Companion.getClass();
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null) {
                str2 = searchVideoModel.getGroupId();
            } else {
                str2 = null;
            }
            appendQueryParameter.appendQueryParameter("lastFromGroupId", str2);
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = buildUpon.toString();
            C50002Jjq.LIZ = C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
        } catch (Throwable unused) {
        }
        interfaceC50067Jkt.LJ(C50002Jjq.LIZ);
    }

    public final String qm(m mVar) {
        long j;
        String str;
        ISearchContextAbility LJJJJJL;
        AbstractC50059Jkl<C50427Jqh> cs;
        C50427Jqh LIZJ;
        ISearchContextAbility LJJJJJL2;
        AbstractC50059Jkl<C49589JdB> IO;
        C49589JdB LIZJ2;
        Gson gson = this.LLILZ;
        RequestInfo requestInfo = new RequestInfo(C50139Jm3.LIZIZ(this.LJLLLLLL));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LJJJJJL2 = C17N.LJJJJJL(mo49getActivity)) != null && (IO = LJJJJJL2.IO()) != null && (LIZJ2 = IO.LIZJ()) != null) {
            j = LIZJ2.LJLIL;
        } else {
            j = 0;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null || (LJJJJJL = C17N.LJJJJJL(mo49getActivity2)) == null || (cs = LJJJJJL.cs()) == null || (LIZJ = cs.LIZJ()) == null || (str = LIZJ.LJLILLLLZI) == null) {
            str = "";
        }
        String json = GsonProtectorUtils.toJson(gson, new DynamicSearchMusicData(mVar, requestInfo, j, str, a.LJFF().LJJJJI() ? 1 : 0));
        o.LJIIIIZZ(json, "gson.toJson(\n           …0,           ),\n        )");
        return json;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        MusicPlayHelper musicPlayHelper;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6418857636496763006");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/musicsearch/core/ui/DynamicSearchMusicFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/musicsearch/core/ui/DynamicSearchMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && (musicPlayHelper = this.LLILLJJLI) != null) {
            musicPlayHelper.hv0();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/musicsearch/core/ui/DynamicSearchMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void nm(int i, C50287JoR c50287JoR) {
        String str;
        Integer num;
        C50433Jqn searchCommonModel;
        super.nm(i, c50287JoR);
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C50651JuJ c50651JuJ = C50652JuK.Companion;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                c50651JuJ.getClass();
                C50650JuI LJII = C50651JuJ.LJII(mo49getActivity);
                String Kl = Kl();
                int i2 = LLIZ;
                int i3 = this.LLFF;
                if (LJII == null || (searchCommonModel = LJII.getSearchCommonModel()) == null || (str = searchCommonModel.getEnterFrom()) == null) {
                    str = "";
                }
                String str2 = this.LJZ;
                String searchId = this.LJLJJI.getSearchId();
                String LIZIZ = C50236Jnc.LIZ().LIZIZ();
                String LIZ = C50589JtJ.LIZ(il().get(), this.LJLLILLLL);
                String str3 = null;
                if (a.LJFF().LJJJJI()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam = this.LJLLILLLL;
                if (searchResultParam != null) {
                    str3 = searchResultParam.getSugGenerateType();
                }
                C50031JkJ c50031JkJ = new C50031JkJ(Kl, str2, null, 0, i3, "", searchId, 0L, i2, str, c50287JoR, null, null, null, null, LIZIZ, LIZ, num, str3, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 804777994, 2);
                DynamicSearchBaseViewModel dynamicSearchBaseViewModel = (DynamicSearchBaseViewModel) this.LLILLL.getValue();
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
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        this.LLILLJJLI = (MusicPlayHelper) ViewModelProviders.of(mo49getActivity).get(MusicPlayHelper.class);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchStateViewModel.class);
        C50044JkW c50044JkW = new C50044JkW();
        c50044JkW.LJLIL = new C50010Jjy(this);
        searchStateViewModel.searchState.observe(this, c50044JkW);
        MutableLiveData<Boolean> mutableLiveData = Yl().isShowingFilters;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this, new AObserverS76S0100000_8(this, 56));
        }
        MutableLiveData<Boolean> mutableLiveData2 = Yl().shouldBlockMediaPlay;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 57));
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILLL.getValue(), new TBT() { // from class: X.Jk0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50015Jk3) obj).LJLIL;
            }
        }, null, new AqS174S0100000_8(this, 95), null, new AqS174S0100000_8(this, 96), 10, null);
        super.onViewCreated(view, bundle);
    }
}
