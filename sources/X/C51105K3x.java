package X;

import Y.IDDListenerS147S0100000_8;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.SearchBottomSheetFragment;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.K3x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51105K3x {
    public final String LIZ;
    public final ActivityC45651qj LIZIZ;
    public final InterfaceC50133Jlx LIZJ;
    public final C5H3 LIZLLL;

    public C51105K3x() {
        this("", null, null);
    }

    public final OptionConfigParams LIZ() {
        return (OptionConfigParams) this.LIZLLL.getValue();
    }

    public final void LIZJ() {
        FilterOptionStruct filterOptionStruct;
        FilterOptionStruct filterOptionStruct2;
        FilterOptionStruct filterOptionStruct3;
        ActivityOptionStruct activityOptionStruct;
        FilterOptionStruct filterOptionStruct4;
        FilterOptionStruct filterOptionStruct5;
        FilterOptionStruct filterOptionStruct6;
        OptionConfigParams LIZ = LIZ();
        if (LIZ != null && (filterOptionStruct6 = LIZ.filterOptionStruct) != null) {
            filterOptionStruct6.reset();
        }
        OptionConfigParams LIZ2 = LIZ();
        if (LIZ2 != null && (filterOptionStruct5 = LIZ2.categoryOptionStruct) != null) {
            filterOptionStruct5.reset();
        }
        OptionConfigParams LIZ3 = LIZ();
        if (LIZ3 != null && (filterOptionStruct4 = LIZ3.sortTypeOptionStruct) != null) {
            filterOptionStruct4.reset();
        }
        OptionConfigParams LIZ4 = LIZ();
        if (LIZ4 != null && (activityOptionStruct = LIZ4.activityTypeOptionStruct) != null) {
            activityOptionStruct.reset();
        }
        OptionConfigParams LIZ5 = LIZ();
        if (LIZ5 != null && (filterOptionStruct3 = LIZ5.followerNumberOptionStruct) != null) {
            filterOptionStruct3.reset();
        }
        OptionConfigParams LIZ6 = LIZ();
        if (LIZ6 != null && (filterOptionStruct2 = LIZ6.profilesTypesOptionStruct) != null) {
            filterOptionStruct2.reset();
        }
        OptionConfigParams LIZ7 = LIZ();
        if (LIZ7 != null && (filterOptionStruct = LIZ7.otherPreferencesOption) != null) {
            filterOptionStruct.reset();
        }
    }

    public final void LIZLLL(java.util.Map<String, String> map) {
        FragmentManager supportFragmentManager;
        if (this.LIZIZ == null) {
            return;
        }
        SearchBottomSheetFragment searchBottomSheetFragment = new SearchBottomSheetFragment();
        searchBottomSheetFragment.LJLJJLL = this.LIZJ;
        searchBottomSheetFragment.LJLJL = this;
        String str = this.LIZ;
        o.LJIIIZ(str, "<set-?>");
        searchBottomSheetFragment.LJLJJL = str;
        searchBottomSheetFragment.LJLJJI = map;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        o.LJI(activityC45651qj);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStateViewModel.class);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = searchBottomSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS147S0100000_8(searchStateViewModel, 5);
        tuxSheet.LJLIL = new K3F(this, map);
        ActivityC45651qj activityC45651qj2 = this.LIZIZ;
        if (activityC45651qj2 != null && (supportFragmentManager = activityC45651qj2.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "searchBottomSheetFragmentV2");
        }
        searchStateViewModel.setShowingFilters(true);
        LIZIZ("open_filter", map);
    }

    public static void LIZIZ(String str, java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        C51063K2h c51063K2h = new C51063K2h();
        o.LJI(map);
        c51063K2h.LJIILLIIL(map);
        c51063K2h.LJIIZILJ("filter_type", "by_all");
        c51063K2h.LJ("button_type", str, InterfaceC1798974f.LIZ);
        c51063K2h.LJIILIIL();
    }

    public C51105K3x(String mSearchTypeName, ActivityC45651qj activityC45651qj, InterfaceC50133Jlx interfaceC50133Jlx) {
        o.LJIIIZ(mSearchTypeName, "mSearchTypeName");
        this.LIZ = mSearchTypeName;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = interfaceC50133Jlx;
        this.LIZLLL = V16.LJJJJLL(new AqS158S0100000_8(this, 717));
    }
}
