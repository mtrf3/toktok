package com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui;

import X.AbstractC029409q;
import X.AbstractC49793JgT;
import X.ActivityC45651qj;
import X.C0A2;
import X.C17N;
import X.C1IZ;
import X.C49444Jaq;
import X.C49722JfK;
import X.C49820Jgu;
import X.C49917JiT;
import X.C78934UyQ;
import X.C8HS;
import X.InterfaceC50036JkO;
import X.JZD;
import X.JZO;
import X.ORZ;
import X.QD3;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.viewmodel.SearchLiveListEnterParamViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class SearchLiveFragment extends SearchOriginalFragment<SearchLiveStruct> implements InterfaceC50036JkO {
    public C49444Jaq LLJJL;
    public final Map<Integer, View> LLJJLIIIJLLLLLLLZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "live";
    }

    @Override // X.InterfaceC50036JkO
    public final void LJLLJ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ).clear();
    }

    @Override // X.InterfaceC50036JkO
    public final boolean ab(String str) {
        return false;
    }

    public SearchLiveFragment() {
        this.LJLLLLLL = 7;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final C0A2 mO() {
        getContext();
        return new GridLayoutManager(2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
        String str;
        String str2;
        String str3;
        String preSearchId;
        if (this.LJLLILLLL == null) {
            SearchResultParam searchResultParam = new SearchResultParam();
            C49444Jaq c49444Jaq = this.LLJJL;
            String str4 = "";
            if (c49444Jaq == null || (str = c49444Jaq.getSearchKeyword()) == null) {
                str = "";
            }
            searchResultParam.setKeyword(str);
            C49444Jaq c49444Jaq2 = this.LLJJL;
            if (c49444Jaq2 != null) {
                str2 = c49444Jaq2.getEnterMethod();
            } else {
                str2 = null;
            }
            searchResultParam.setEnterMethod(str2);
            C49444Jaq c49444Jaq3 = this.LLJJL;
            if (c49444Jaq3 == null || (str3 = c49444Jaq3.getFromSearchSubtag()) == null) {
                str3 = "";
            }
            searchResultParam.setFromSearchSubtag(str3);
            C49444Jaq c49444Jaq4 = this.LLJJL;
            if (c49444Jaq4 != null && (preSearchId = c49444Jaq4.getPreSearchId()) != null) {
                str4 = preSearchId;
            }
            searchResultParam.setPreSearchId(str4);
            this.LJLLILLLL = searchResultParam;
        }
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        o.LJI(searchResultParam2);
        JZD jzd = new JZD(searchResultParam2, Ll(), this, this);
        String searchFrom = this.LJLZ;
        o.LJIIIZ(searchFrom, "searchFrom");
        this.LLILL = jzd;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void zm() {
        String str;
        JZD jzd;
        this.LLJJJJJIL = new C49722JfK();
        C49917JiT<?> tn = tn();
        C49820Jgu c49820Jgu = new C49820Jgu();
        C49444Jaq c49444Jaq = this.LLJJL;
        String str2 = null;
        if (c49444Jaq != null) {
            str = c49444Jaq.getRoomIdList();
        } else {
            str = null;
        }
        c49820Jgu.LJLLLL = str;
        C49444Jaq c49444Jaq2 = this.LLJJL;
        if (c49444Jaq2 != null) {
            str2 = c49444Jaq2.getEnterFrom();
        }
        c49820Jgu.LJLLLLLL = str2;
        tn.LJJ(c49820Jgu);
        tn().LJJI(this);
        C49917JiT<?> tn2 = tn();
        tn2.LJLJJL = this;
        T t = tn2.LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJLJL = sa();
        }
        C8HS<SearchLiveStruct> nm = nm();
        if ((nm instanceof JZD) && (jzd = (JZD) nm) != null) {
            T t2 = tn().LJLIL;
            o.LJII(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.livelist.core.viewmodel.SearchLiveModel");
            jzd.LJLJJLL = (C49820Jgu) t2;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel;
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C49444Jaq c49444Jaq = null;
        if (mo49getActivity != null && (searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) ViewModelProviders.of(mo49getActivity).get(SearchLiveListEnterParamViewModel.class)) != null) {
            c49444Jaq = searchLiveListEnterParamViewModel.LJLIL;
        }
        this.LLJJL = c49444Jaq;
    }

    @QD3
    public final void onRoomStatusEvent(C1IZ event) {
        Integer num;
        int i;
        User author;
        o.LJIIIZ(event, "event");
        long j = event.LJLIL;
        C8HS<SearchLiveStruct> nm = nm();
        Integer num2 = null;
        if (!(nm instanceof JZD)) {
            nm = null;
        }
        if (nm != null) {
            List<SearchLiveStruct> list = nm.mmItems;
            if (list != null) {
                i = 0;
                for (SearchLiveStruct searchLiveStruct : list) {
                    if (searchLiveStruct.getLiveAweme() != null && (author = searchLiveStruct.getLiveAweme().getAuthor()) != null && j == C78934UyQ.LJIILJJIL(author)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Exit Live room, item #");
        LIZ.append(num);
        LIZ.append('/');
        AbstractC029409q adapter = Zl().getAdapter();
        if (adapter != null) {
            num2 = Integer.valueOf(adapter.getItemCount());
        }
        LIZ.append(num2);
        LIZ.append(", AID: ");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        if (num != null && num.intValue() != -1) {
            Zl().LJLIL(num.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Cm(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.Cm(view, bundle);
        Zl().LJII(new JZO(C17N.LJIILL(8.0d)), -1);
    }

    @Override // X.InterfaceC50036JkO
    public final void hb(SearchLiveList searchLiveList, List<? extends Aweme> awemeList, boolean z) {
        C49820Jgu c49820Jgu;
        o.LJIIIZ(awemeList, "awemeList");
        T t = tn().LJLIL;
        List list = null;
        if ((t instanceof C49820Jgu) && (c49820Jgu = (C49820Jgu) t) != null) {
            c49820Jgu.LJIL(searchLiveList);
        }
        List<SearchLiveStruct> data = nm().getData();
        if (data != null) {
            List<SearchLiveStruct> LJI = searchLiveList.LJI();
            o.LJIIIIZZ(LJI, "liveList.liveList");
            list = ORZ.LLIIIZ(LJI, data);
        }
        j0(list, z);
    }
}
