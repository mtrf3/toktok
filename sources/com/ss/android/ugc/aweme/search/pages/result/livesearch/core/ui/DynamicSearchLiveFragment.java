package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.AbstractC50008Jjw;
import X.AbstractC50059Jkl;
import X.AbstractC50814Jww;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C17N;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C34480Dg4;
import X.C49489JbZ;
import X.C49589JdB;
import X.C49995Jjj;
import X.C49996Jjk;
import X.C49997Jjl;
import X.C49998Jjm;
import X.C49999Jjn;
import X.C50002Jjq;
import X.C50005Jjt;
import X.C50006Jju;
import X.C50018Jk6;
import X.C50031JkJ;
import X.C50032JkK;
import X.C50044JkW;
import X.C50068Jku;
import X.C50139Jm3;
import X.C50236Jnc;
import X.C50287JoR;
import X.C50427Jqh;
import X.C50589JtJ;
import X.C50605JtZ;
import X.C50799Jwh;
import X.C62822Ol8;
import X.C65232Piu;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C84763XOl;
import X.IKT;
import X.InterfaceC48907JHj;
import X.InterfaceC50036JkO;
import X.InterfaceC50067Jkt;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.JLU;
import X.JSE;
import X.JUK;
import X.JUT;
import X.JXZ;
import X.KH5;
import X.KH6;
import X.ORS;
import X.QD3;
import X.TBT;
import X.X1D;
import X.XKX;
import Y.AObserverS76S0100000_8;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public final class DynamicSearchLiveFragment extends DynamicSearchFragment implements InterfaceC50036JkO {
    public final C214298b3 LLILLJJLI;
    public final Gson LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC48907JHj LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C62822Ol8 LLJILLL;
    public final Map<Integer, View> LLJJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "live";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Ol() {
        this.LJLIL = true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJ).clear();
    }

    @Override // X.InterfaceC50036JkO
    public final boolean ab(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void fm() {
    }

    public DynamicSearchLiveFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(SearchLiveViewModel.class);
        this.LLILLJJLI = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 283), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C49999Jjn.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLILLL = new Gson();
        this.LLILZ = -1;
        this.LLILZLL = "";
        this.LLIZLLLIL = true;
        this.LJLLLLLL = C50605JtZ.LJ();
        this.LLJILJIL = true;
        this.LLJILLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 282));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Nl() {
        if (this.LLIIJI != null) {
            Yl().queryWordChangeInProcess.add(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void initView() {
        SearchBaseSparkView searchBaseSparkView;
        super.initView();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            InterfaceC50067Jkt Tl = Tl();
            if ((Tl instanceof C50799Jwh) && (searchBaseSparkView = (SearchBaseSparkView) Tl) != null) {
                ORS.LJJLIIIJJIZ(searchBaseSparkView.LJI, new AbstractC50814Jww[]{new JXZ(mo49getActivity)});
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C34480Dg4.LIZ()) {
            JUT.LIZ = null;
            C49995Jjj.LIZ.LIZJ(this.LLILZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LLJILJILJ && !Yl().queryWordChangeInProcess.contains(2) && C34480Dg4.LIZ() && this.LLIZLLLIL && !this.LLJ && !this.LLJI) {
            if (getUserVisibleHint()) {
                JLU.LIZIZ();
            }
        } else {
            this.LLJIJIL = null;
        }
        this.LLJILJILJ = false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC50036JkO
    public final void LJLLJ(String str) {
        JSONObject LIZJ = C65232Piu.LIZJ("roomId", str);
        this.LLJILJILJ = true;
        Tl().LIZ("verticalLiveBack", LIZJ);
    }

    @Override // X.InterfaceC50173Jmb
    public final void T2(InterfaceC50067Jkt interfaceC50067Jkt) {
        String str;
        m mVar;
        j LJJIJ;
        C50799Jwh c50799Jwh = (C50799Jwh) interfaceC50067Jkt;
        ORS.LJJLIIIJJIZ(c50799Jwh.LJII, new AbstractC50008Jjw[]{new C50005Jjt()});
        c50799Jwh.LJIIIIZZ(C17N.LJJJJJL(this));
        if (C34480Dg4.LIZ()) {
            ORS.LJJLIIIJJIZ(c50799Jwh.LJII, new AbstractC50008Jjw[]{new C50006Jju()});
        }
        try {
            SearchResultConfig searchResultConfig = (SearchResultConfig) SettingsManager.LIZLLL().LJIIIIZZ("search_result_config", SearchResultConfig.class, C50002Jjq.LIZIZ);
            C50002Jjq.LIZIZ = searchResultConfig;
            if (searchResultConfig == null || (mVar = searchResultConfig.verticalLive) == null || (LJJIJ = mVar.LJJIJ("schema")) == null || (str = LJJIJ.LJJIFFI()) == null) {
                str = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-live/template.js&prefix=online/lynx/search-card&use_bdx=1";
            }
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = buildUpon.toString();
            C50068Jku.LIZIZ(interfaceC50067Jkt, dynamicPatch, null, false, false, 62);
        } catch (Throwable unused) {
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void enterLiveRoom(C49996Jjk event) {
        EnterRoomConfig.LogData logData;
        String str;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        o.LJIIIZ(event, "event");
        C49489JbZ c49489JbZ = C49489JbZ.LIZ;
        LiveRoomStruct liveRoomStruct3 = event.LJLIL;
        ArrayList<LiveRoomStruct> arrayList = event.LJLILLLLZI;
        EnterRoomConfig enterRoomConfig = event.LJLJJI;
        long j = event.LJLJI;
        Boolean bool = event.LJLJJL;
        C49997Jjl c49997Jjl = new C49997Jjl();
        c49489JbZ.getClass();
        if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null && (str = logData.search_keyword) != null && str.length() > 0) {
            Long l6 = null;
            if (1 != 0) {
                c49997Jjl.LIZIZ(liveRoomStruct3, enterRoomConfig);
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (arrayList != null) {
                    liveRoomStruct = (LiveRoomStruct) ListProtector.get(arrayList, 0);
                    liveRoomStruct2 = (LiveRoomStruct) ListProtector.get(arrayList, arrayList.size() - 1);
                } else {
                    liveRoomStruct = null;
                    liveRoomStruct2 = null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Start (aid: ");
                if (liveRoomStruct3 != null) {
                    l = Long.valueOf(liveRoomStruct3.id);
                } else {
                    l = null;
                }
                LIZ.append(l);
                LIZ.append(", author: ");
                if (liveRoomStruct3 != null) {
                    l2 = Long.valueOf(liveRoomStruct3.getAnchorId());
                } else {
                    l2 = null;
                }
                LIZ.append(l2);
                LIZ.append("), \nstart: (");
                if (liveRoomStruct != null) {
                    l3 = Long.valueOf(liveRoomStruct.id);
                } else {
                    l3 = null;
                }
                LIZ.append(l3);
                LIZ.append(", ");
                if (liveRoomStruct != null) {
                    l4 = Long.valueOf(liveRoomStruct.getAnchorId());
                } else {
                    l4 = null;
                }
                LIZ.append(l4);
                LIZ.append("), \nend: (");
                if (liveRoomStruct2 != null) {
                    l5 = Long.valueOf(liveRoomStruct2.id);
                } else {
                    l5 = null;
                }
                LIZ.append(l5);
                LIZ.append(", ");
                if (liveRoomStruct2 != null) {
                    l6 = Long.valueOf(liveRoomStruct2.getAnchorId());
                }
                LIZ.append(l6);
                LIZ.append(')');
                X1D.LIZIZ(LIZ);
                EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                String str2 = logData2.search_keyword;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = logData2.enterLiveModule;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = logData2.search_id;
                if (str5 != null) {
                    str3 = str5;
                }
                LiveOuterService.LJJJLL().LJIILL().LIZLLL(LJIIIIZZ, enterRoomConfig, liveRoomStruct3, arrayList, new C50032JkK(str2, j, "", str4, str3, this, bool, c49997Jjl), c49997Jjl);
            }
        }
    }

    public final String qm(SearchLiveList searchLiveList) {
        long j;
        String str;
        ISearchContextAbility LJJJJJL;
        AbstractC50059Jkl<C50427Jqh> cs;
        C50427Jqh LIZJ;
        ISearchContextAbility LJJJJJL2;
        AbstractC50059Jkl<C49589JdB> IO;
        C49589JdB LIZJ2;
        Gson gson = this.LLILLL;
        RequestInfo requestInfo = new RequestInfo(C50139Jm3.LIZIZ(this.LJLLLLLL));
        int i = this.LLILZ;
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
        String json = GsonProtectorUtils.toJson(gson, new SearchLiveData(searchLiveList, requestInfo, i, j, str, a.LJFF().LJJJJI() ? 1 : 0));
        o.LJIIIIZZ(json, "gson.toJson(\n           …\n            ),\n        )");
        return json;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void searchLiveLoadMore(IKT event) {
        Integer num;
        String str;
        o.LJIIIZ(event, "event");
        if (!this.LLIZ) {
            SearchLiveViewModel searchLiveViewModel = (SearchLiveViewModel) this.LLILLJJLI.getValue();
            String Kl = Kl();
            long j = this.LLILZIL;
            int i = ((OptimizeConfig) C50018Jk6.LIZIZ.getValue()).verticalLive;
            String str2 = this.LLILZLL;
            String str3 = this.LJLZ;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.LJZ;
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
            XKX.LIZLLL(searchLiveViewModel.getAssemVMScope(), null, null, new KH6(searchLiveViewModel, new C50031JkJ(Kl, str4, "live", 0, 0, str2, "", j, i, str3, null, null, null, null, null, null, LIZ, num, str, null, null, 805304354, 3), null), 3);
            this.LLIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        InterfaceC48907JHj interfaceC48907JHj;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-7548497085591285628");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/livesearch/core/ui/DynamicSearchLiveFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/livesearch/core/ui/DynamicSearchLiveFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (C34480Dg4.LIZ()) {
            if (!z) {
                if ((JLU.LIZLLL() instanceof JUK) && this.LLJIJIL == null) {
                    this.LLJIJIL = JLU.LIZLLL();
                    JLU.LIZ();
                }
            } else {
                if (!Yl().queryWordChangeInProcess.contains(2) && (interfaceC48907JHj = this.LLJIJIL) != null) {
                    interfaceC48907JHj.LLLJIL();
                }
                this.LLJIJIL = null;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/livesearch/core/ui/DynamicSearchLiveFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void sm(SearchLiveList searchLiveList) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchLiveData", GsonProtectorUtils.toJson(this.LLILLL, searchLiveList));
        Tl().LIZ("verticalLiveLoadMore", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void nm(int i, C50287JoR c50287JoR) {
        Integer num;
        super.nm(i, c50287JoR);
        em();
        this.LLILZ = -1;
        this.LLILZIL = 0L;
        String str = "";
        this.LLILZLL = "";
        if (!this.LLIZ) {
            SearchLiveViewModel searchLiveViewModel = (SearchLiveViewModel) this.LLILLJJLI.getValue();
            String Kl = Kl();
            int i2 = ((OptimizeConfig) C50018Jk6.LIZIZ.getValue()).verticalLive;
            String str2 = this.LJLZ;
            if (str2 != null) {
                str = str2;
            }
            String str3 = this.LJZ;
            String searchId = this.LJLJJI.getSearchId();
            String LIZIZ = C50236Jnc.LIZ().LIZIZ();
            String LIZ = C50589JtJ.LIZ(il().get(), this.LJLLILLLL);
            String str4 = null;
            if (a.LJFF().LJJJJI()) {
                num = 1;
            } else {
                num = null;
            }
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam != null) {
                str4 = searchResultParam.getSugGenerateType();
            }
            XKX.LIZLLL(searchLiveViewModel.getAssemVMScope(), null, null, new KH5(searchLiveViewModel, new C50031JkJ(Kl, str3, "live", 0, 0, "", searchId, 0L, i2, str, null, null, null, null, null, LIZIZ, LIZ, num, str4, Long.valueOf(C17N.LJJJJLL().IO().LIZJ().LJLIL), null, 804780066, 2), null), 3);
            this.LLIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILLJJLI.getValue(), new TBT() { // from class: X.KCG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KCI) obj).LJLIL;
            }
        }, null, new AqS174S0100000_8(this, 273), null, new AqS174S0100000_8(this, 274), 10, null);
        if (C34480Dg4.LIZ()) {
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILLJJLI.getValue(), new TBT() { // from class: X.KCH
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((KCI) obj).LJLILLLLZI;
                }
            }, null, new AqS174S0100000_8(this, 275), null, new AqS174S0100000_8(this, 276), 10, null);
        }
        MutableLiveData<Boolean> mutableLiveData = Yl().isShowingFilters;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this, new AObserverS76S0100000_8(this, 54));
        }
        MutableLiveData<Boolean> mutableLiveData2 = Yl().shouldBlockMediaPlay;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 55));
        }
        MutableLiveData<Integer> mutableLiveData3 = Yl().searchState;
        if (mutableLiveData3 != null) {
            C50044JkW c50044JkW = new C50044JkW();
            c50044JkW.LJLIL = new C49998Jjm(this);
            mutableLiveData3.observe(this, c50044JkW);
        }
        this.LLJILJILJ = true;
        this.LLJ = false;
    }

    @Override // X.InterfaceC50036JkO
    public final void hb(SearchLiveList searchLiveList, List<? extends Aweme> awemeList, boolean z) {
        List<SearchLiveStruct> list;
        o.LJIIIZ(awemeList, "awemeList");
        JSE LIZ = C49995Jjj.LIZ.LIZ(this.LLILZ);
        if (LIZ != null && (list = LIZ.LJ) != null) {
            List<SearchLiveStruct> LJI = searchLiveList.LJI();
            o.LJIIIIZZ(LJI, "liveList.liveList");
            ((ArrayList) list).addAll(LJI);
        }
        this.LLILZIL = searchLiveList.cursor;
        sm(searchLiveList);
    }
}
