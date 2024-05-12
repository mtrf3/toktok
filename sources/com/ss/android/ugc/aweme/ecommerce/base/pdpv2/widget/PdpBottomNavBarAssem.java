package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70462Rl4;
import X.C70463Rl5;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC70180RgW;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpBottomNavBarAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.xv;
    }

    public PdpBottomNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpMainViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 395), C70462Rl4.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpBottomViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 396), C70463Rl5.INSTANCE, null);
    }

    public static final boolean H3(NavButton navButton) {
        if (navButton != null && navButton.style != null) {
            Integer num = navButton.style;
            int value = EnumC70180RgW.ICON_WITH_TEXT.getValue();
            if (num == null || num.intValue() != value) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Rgg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C69947Rcl) obj).LJLJI);
            }
        }, null, new AqS194S0100000_12(this, 224), 6);
        C8YN.LJII(this, this.LJLL.getValue(), new TBT() { // from class: X.Rau
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((RXG) obj).LJLIL;
            }
        }, null, new AqS194S0100000_12(this, 225), 6);
    }
}
