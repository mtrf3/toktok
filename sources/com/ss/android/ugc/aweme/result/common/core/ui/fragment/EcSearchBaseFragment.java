package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C17N;
import X.C221108m2;
import X.C50438Jqs;
import X.C50581JtB;
import X.C50583JtD;
import X.C50585JtF;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51100K3s;
import X.C62822Ol8;
import X.InterfaceC49765Jg1;
import X.InterfaceC51505KJh;
import X.KAK;
import X.KEA;
import X.KEP;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class EcSearchBaseFragment extends SearchVisibilityDetectFragmentNew implements InterfaceC51505KJh {
    public static final /* synthetic */ int LLFFF = 0;
    public SearchResultParam LJLL;
    public KEP LJLLI;
    public SearchResultParam LJLLILLLL;
    public SearchResultParam LJLLJ;
    public int LJLLLLLL;
    public int LJZL;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public String LJLLL = "";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 110));
    public String LJLZ = "";
    public String LJZ = "";
    public String LJZI = "";
    public int LL = 1;
    public final boolean LLD = true;
    public boolean LLF = true;

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object Al(View view) {
        o.LJIIIZ(view, "view");
        return null;
    }

    public abstract String Il();

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object vl() {
        return null;
    }

    public final String Jl() {
        return ((InterfaceC49765Jg1) this.LJLLLL.getValue()).getKeyword().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public boolean wl() {
        return this.LLD;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int xl() {
        return this.LJZL;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Dl(int i) {
        this.LJZL = i;
        this.LJLJJI.setTabIndex(i);
        this.LJLJJI.setSearchPosition(Kl(i));
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
                    C51100K3s.LIZ();
                }
            }
        }
        this.LJLL = searchResultParam;
    }

    public final String Kl(int i) {
        KEA LIZIZ;
        KEP kep = this.LJLLI;
        if (kep == null || (LIZIZ = kep.LIZIZ()) == null) {
            return "";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.TOP)) {
            return "general";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.VIDEO)) {
            return "video";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.USER)) {
            return "user";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.SOUND)) {
            return "music";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.HASHTAG)) {
            return "challenge";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.LIVE)) {
            return "live";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.SHOP)) {
            return "shop";
        }
        if (i == LIZIZ.LJIIIIZZ(KAK.STORE)) {
            return "store";
        }
        if (i != LIZIZ.LJIIIIZZ(KAK.PLACE)) {
            return "";
        }
        return "place";
    }

    public void Ll(boolean z) {
        this.LJLJJI.setFragmentVisible(z);
        C17N.LJJJJJL(this).j4(new C50583JtD(z));
    }

    public final void Ml(String value) {
        o.LJIIIZ(value, "value");
        this.LJZ = value;
        this.LJLJJI.setEnterMethod(value);
        C17N.LJJJJJL(this).j4(new C50581JtB(value));
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
        int i = this.LJZL;
        LJJJJJL.j4(new C50585JtF(i, Kl(i)));
    }
}
