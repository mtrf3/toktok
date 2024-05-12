package com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ui;

import X.C110614Vt;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C42251Gi7;
import X.C47261Igj;
import X.C49740Jfc;
import X.C50044JkW;
import X.C50079Jl5;
import X.C50083Jl9;
import X.C50321Joz;
import X.C50352JpU;
import X.C50605JtZ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC50080Jl6;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.AObserverS71S0200000_7;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.viewmodel.SearchSatisfactionSurveyVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel.SearchCreationEntranceViewModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.o;
import q03.IDaS201S0200000_8;

/* loaded from: classes9.dex */
public final class SearchCreationEntranceAssem extends UISlotAssem {
    public ViewGroup LJLJLLL;
    public ViewGroup LJLL;
    public TuxTextView LJLLI;
    public final C214298b3 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.chw;
    }

    public SearchCreationEntranceAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchCreationEntranceViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 307), C50083Jl9.INSTANCE, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 305));
        this.LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 306));
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 304));
    }

    public final void H3() {
        C50352JpU c50352JpU;
        SearchSatisfactionSurveyVM searchSatisfactionSurveyVM = (SearchSatisfactionSurveyVM) this.LJLLLL.getValue();
        if (searchSatisfactionSurveyVM != null && (c50352JpU = searchSatisfactionSurveyVM.LJLJI) != null) {
            ((SearchServiceCenter$AdapterControlAbility) C55096Ljo.LIZIZ(C55230Lly.LJ(getContainerView()), SearchServiceCenter$AdapterControlAbility.class)).c10(c50352JpU);
        }
    }

    public final void K3(String str) {
        SearchCreationEntranceViewModel searchCreationEntranceViewModel = (SearchCreationEntranceViewModel) this.LJLLILLLL.getValue();
        if (!searchCreationEntranceViewModel.LJLIL.containsKey(str)) {
            searchCreationEntranceViewModel.LJLIL.put(str, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NextLiveData<Integer> iv0;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLLILLLL.getValue(), new TBT() { // from class: X.Jfx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C49740Jfc) obj).LJLIL);
            }
        }, null, new AqS171S0200000_8(view, this, 9), 6);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) this.LJLLL.getValue();
        if (searchStateViewModel != null && (mutableLiveData2 = searchStateViewModel.isResultRVScrolling) != null) {
            mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 102));
        }
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        SearchStateViewModel searchStateViewModel2 = (SearchStateViewModel) this.LJLLL.getValue();
        if (searchStateViewModel2 != null && (mutableLiveData = searchStateViewModel2.searchState) != null) {
            C50044JkW c50044JkW = new C50044JkW();
            c50044JkW.LJLIL = new C42251Gi7(publishService, view);
            mutableLiveData.observe(this, c50044JkW);
        }
        SearchStartViewModel searchStartViewModel = (SearchStartViewModel) this.LJLLJ.getValue();
        if (searchStartViewModel != null && (iv0 = searchStartViewModel.iv0()) != null) {
            iv0.observe(this, new AObserverS71S0200000_7(publishService, view, 6));
        }
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.jhf);
        this.LJLL = (ViewGroup) view.findViewById(R.id.je3);
        this.LJLLI = (TuxTextView) view.findViewById(R.id.ji4);
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            C78897Uxp.LJJJJLI(viewGroup, null);
        }
        ViewGroup viewGroup2 = this.LJLL;
        if (viewGroup2 != null) {
            C78897Uxp.LJJJJLI(viewGroup2, null);
        }
        TuxTextView tuxTextView = this.LJLLI;
        if (tuxTextView != null) {
            C78897Uxp.LJJJJJL(tuxTextView, C32151Nz.LJIIZILJ(6));
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = C61328O5c.LIZJ(6);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            tuxTextView2.setBackground(c110614Vt.LIZ(context));
        }
        ViewGroup viewGroup3 = this.LJLJLLL;
        if (viewGroup3 != null) {
            C16880lQ.LJIIJ(new IDaS201S0200000_8(view, this, 2), viewGroup3);
        }
        ViewGroup viewGroup4 = this.LJLL;
        if (viewGroup4 != null) {
            C16880lQ.LJIIJ(new IDaS201S0200000_8(view, this, 3), viewGroup4);
        }
        TuxTextView tuxTextView3 = this.LJLLI;
        if (tuxTextView3 != null) {
            C16880lQ.LJIIJ(new IDaS201S0200000_8(view, this, 4), tuxTextView3);
        }
    }

    public final SearchCreationExtraData I3(EnumC50080Jl6 enumC50080Jl6, C50321Joz c50321Joz) {
        String str;
        int i;
        String searchId;
        String str2 = "";
        if (c50321Joz == null || (str = c50321Joz.getSearchKeyword()) == null) {
            str = "";
        }
        String str3 = ((C49740Jfc) ((AssemViewModel) this.LJLLILLLL.getValue()).getState()).LJLILLLLZI;
        if (c50321Joz != null) {
            i = c50321Joz.getTabIndex();
        } else {
            i = -1;
        }
        String LJII = C50605JtZ.LJII(i);
        HashMap hashMap = new HashMap();
        if (c50321Joz != null && (searchId = c50321Joz.getSearchId()) != null) {
            str2 = searchId;
        }
        hashMap.put("search_id", str2);
        hashMap.put("search_keyword", str);
        hashMap.put("search_type", LJII);
        ArrayList LJII2 = C47261Igj.LJII(str3);
        int i2 = C50079Jl5.LIZ[enumC50080Jl6.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    hashMap.put("search_enter_position", "general_search_text");
                }
            } else {
                hashMap.put("search_enter_position", "general_search_upload");
            }
        } else {
            hashMap.put("search_enter_position", "general_search_shoot");
        }
        return new SearchCreationExtraData(true, LJII2, hashMap);
    }
}
