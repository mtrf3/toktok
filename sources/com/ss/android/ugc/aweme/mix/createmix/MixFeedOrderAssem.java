package com.ss.android.ugc.aweme.mix.createmix;

import X.C16880lQ;
import X.C1C8;
import X.C214298b3;
import X.C228348xi;
import X.C228378xl;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.InterfaceC228208xU;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixFeedOrderAssem extends UIContentAssem implements InterfaceC228208xU {
    public static final int LJLJJI = 8;
    public C1C8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public Map<Integer, View> LJLJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC228208xU, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public MixFeedOrderAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixCreateViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 492), C228348xi.INSTANCE, null);
    }

    private final MixCreateViewModel v3() {
        return (MixCreateViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC228208xU
    public void LJLI(PowerCell<?> powerCell) {
        if (powerCell != null) {
            C1C8 c1c8 = this.LJLIL;
            if (c1c8 != null) {
                c1c8.LJIJI(powerCell);
            } else {
                o.LJIJI("mItemTouchHelper");
                throw null;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL syl = (SYL) view.findViewById(R.id.gkp);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.8xj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228798yR) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(syl, 55), 6);
        syl.LLLF.LJZL(MixFeedOrderCell.class);
        syl.setLifecycleOwner(this);
        syl.setHasFixedSize(true);
        syl.LJLJL(0, C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bt0, null, false));
        C1C8 c1c8 = new C1C8(new C228378xl(syl, v3(), true));
        this.LJLIL = c1c8;
        c1c8.LJII(syl);
    }
}
