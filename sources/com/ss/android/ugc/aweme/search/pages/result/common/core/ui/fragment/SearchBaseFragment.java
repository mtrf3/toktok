package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C17N;
import X.C221108m2;
import X.C50438Jqs;
import X.C50581JtB;
import X.C50583JtD;
import X.C50585JtF;
import X.C50605JtZ;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51100K3s;
import X.C51105K3x;
import X.C62822Ol8;
import X.InterfaceC49816Jgq;
import X.InterfaceC51505KJh;
import X.V1B;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchBaseFragment extends SearchVisibilityDetectFragment implements InterfaceC51505KJh {
    public static final /* synthetic */ int LLI = 0;
    public SearchResultParam LJLL;
    public SearchContainerHeaderVM LJLLI;
    public SearchResultParam LJLLILLLL;
    public SearchResultParam LJLLJ;
    public int LJLLLLLL;
    public int LLF;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public String LJLLL = "";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 223));
    public String LJLZ = "";
    public String LJZ = "";
    public String LJZI = "";
    public String LJZL = "";
    public String LL = "";
    public String LLD = "";
    public int LLFF = 1;
    public boolean LLFFF = true;
    public boolean LLFII = true;

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public Object Al(View view) {
        o.LJIIIZ(view, "view");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    /* renamed from: Il, reason: merged with bridge method [inline-methods] */
    public C51105K3x vl() {
        return null;
    }

    public abstract String Jl();

    public void Nl() {
    }

    public void Ol() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public boolean wl() {
        return this instanceof SearchJediMixFeedFragment;
    }

    public final InterfaceC49816Jgq Ll() {
        return (InterfaceC49816Jgq) this.LJLLLL.getValue();
    }

    public final String Kl() {
        return Ll().getKeyword().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int xl() {
        return this.LLF;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Dl(int i) {
        this.LLF = i;
        this.LJLJJI.setTabIndex(i);
        this.LJLJJI.setSearchPosition(Ml(i));
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void Gl(SearchResultParam searchResultParam) {
        String str;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        int LIZ = C51100K3s.LIZ();
        if (LIZ != 0 && (LIZ == 1 || LIZ == 2)) {
            SearchResultParam searchResultParam2 = this.LJLL;
            String str2 = null;
            if (searchResultParam2 != null) {
                str = searchResultParam2.getKeyword();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                SearchResultParam searchResultParam3 = this.LJLL;
                if (searchResultParam3 != null) {
                    str2 = searchResultParam3.getKeyword();
                }
                if (!TextUtils.equals(str2, searchResultParam.getKeyword())) {
                    C51100K3s.LIZ();
                    int LIZ2 = C51100K3s.LIZ();
                    if (LIZ2 != 1) {
                        if (LIZ2 == 2) {
                            Nl();
                        }
                    } else {
                        Ol();
                    }
                }
            }
        }
        this.LJLL = searchResultParam;
    }

    public final String Ml(int i) {
        if (i == C50605JtZ.LJIIJJI()) {
            return "general";
        }
        if (i == C50605JtZ.LJIILIIL()) {
            return "video";
        }
        if (i == C50605JtZ.LJIIL()) {
            return "user";
        }
        if (i == C50605JtZ.LJIIIZ()) {
            return "music";
        }
        if (i == C50605JtZ.LIZJ()) {
            return "challenge";
        }
        if (i == C50605JtZ.LJ()) {
            return "live";
        }
        if (i == C50605JtZ.LJIIIIZZ()) {
            return "shop";
        }
        if (i == C50605JtZ.LJI()) {
            return "place";
        }
        return "";
    }

    public void Pl(boolean z) {
        this.LJLJJI.setFragmentVisible(z);
        C17N.LJJJJJL(this).j4(new C50583JtD(z));
    }

    public final void Ql(String value) {
        o.LJIIIZ(value, "value");
        this.LJZ = value;
        this.LJLJJI.setEnterMethod(value);
        C17N.LJJJJJL(this).j4(new C50581JtB(value));
    }

    public final void Rl(View view) {
        SearchContainerHeaderVM searchContainerHeaderVM;
        o.LJIIIZ(view, "view");
        if (!(this instanceof SearchJediMixFeedFragment) && (searchContainerHeaderVM = this.LJLLI) != null) {
            int i = searchContainerHeaderVM.LJLIL;
            View findViewById = view.findViewById(R.id.jfq);
            if (findViewById != null) {
                V1B.LJLLLL(i, findViewById);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj requireActivity = requireActivity();
        c50651JuJ.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(requireActivity);
        if (LJIIJ == null) {
            return;
        }
        C50651JuJ.LIZ(this, C50652JuK.copy$default(LJIIJ, null, C50438Jqs.copy$default(LJIIJ.getMutableData(), this.LJLJJI, null, 2, null), 1, null));
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL(this);
        int i = this.LLF;
        LJJJJJL.j4(new C50585JtF(i, Ml(i)));
    }
}
