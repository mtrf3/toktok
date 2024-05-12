package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C227278vz;
import X.C227308w2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.SYL;
import X.TBT;
import Y.IDrS43S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchFriendsV2Fragment extends FFPBaseFragment {
    public C73305Spp LJLJJI;
    public SYL LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final int LJLJI = R.layout.ay1;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.8w1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227438wF) obj).LJLJI;
            }
        }, C213688a4.LIZJ(), new AqS185S0100000_3(this, 73), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJJLL.getValue(), new TBT() { // from class: X.8w0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227218vt) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 74), 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public SearchFriendsV2Fragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchFriendListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 851);
        C227308w2 c227308w2 = C227308w2.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c227308w2, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c227308w2, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJLL = c214298b3;
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 850));
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Al() {
        ((AssemViewModel) this.LJLJJLL.getValue()).setState(C227278vz.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        this.LJLJJI = (C73305Spp) C7MY.LIZLLL(view, "view", R.id.kf_, "view.findViewById(R.id.status_view)");
        View findViewById = view.findViewById(R.id.i04);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.power_list)");
        SYL syl = (SYL) findViewById;
        this.LJLJJL = syl;
        syl.LLLF.LJZL(SearchTitleCell.class, SearchFriendCell.class);
        SYL syl2 = this.LJLJJL;
        if (syl2 != null) {
            syl2.LJIIJJI(new IDrS43S0100000_3(this, 7));
        } else {
            o.LJIJI("listView");
            throw null;
        }
    }
}
