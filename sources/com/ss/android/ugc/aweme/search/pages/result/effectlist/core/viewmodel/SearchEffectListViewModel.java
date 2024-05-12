package com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel;

import X.C10K;
import X.EF7;
import X.InterfaceC88472Yns;
import Y.AgS111S0200000_8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectPropsList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchEffectListViewModel extends ViewModel {
    public final MutableLiveData<SearchEffectPropsList> LJLIL = new MutableLiveData<>();

    public final void gv0(String str, String alaSrc, int i, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        String str3 = str2;
        o.LJIIIZ(alaSrc, "alaSrc");
        SearchApi.RealApi LIZ = SearchApi.LIZ();
        int i2 = EF7.LJIIIZ;
        if (str3 == null) {
            str3 = "";
        }
        LIZ.searchEffectList(str, alaSrc, "search_tab", i, 15, i2, str3, AVExternalServiceImpl.LIZ().abilityService().effectService().getEffectSDKVersion()).LJ(new AgS111S0200000_8(this, interfaceC88472Yns, 2), C10K.LJIIIIZZ, null);
    }
}
