package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget;

import X.C214298b3;
import X.C221108m2;
import X.C27162AlK;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70300RiS;
import X.C70540RmK;
import X.C70541RmL;
import X.C70542RmM;
import X.C70543RmN;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpHeadViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpHeadNavBarAssem extends UISlotAssem {
    public static final int LJLZ = C27162AlK.LIZ;
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final C55749LuL LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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
        return R.layout.a2o;
    }

    public PdpHeadNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpHeadViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 398), C70542RmM.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpMainViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 399), C70543RmN.INSTANCE, null);
        this.LJLLI = new C55749LuL(C47704Ins.LIZJ(this, C70300RiS.class, null), checkSupervisorPrepared());
        this.LJLLJ = 1.0f;
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        this.LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 397));
    }

    public final PdpMainViewModel H3() {
        return (PdpMainViewModel) this.LJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VV.LIZJ(this, new AqS178S0100000_12(this, 570));
        C70540RmK c70540RmK = (C70540RmK) _$_findCachedViewById(R.id.e3a);
        if (c70540RmK != null) {
            c70540RmK.setOnCloseClick(new AqS159S0200000_12(this, c70540RmK, 83));
            c70540RmK.setOnMoreClick(new AqS159S0200000_12(this, c70540RmK, 84));
            c70540RmK.setAlpha(this.LJLLILLLL);
        }
        C70540RmK c70540RmK2 = (C70540RmK) _$_findCachedViewById(R.id.e3b);
        if (c70540RmK2 != null) {
            c70540RmK2.setOnCloseClick(new AqS159S0200000_12(this, c70540RmK2, 83));
            c70540RmK2.setOnMoreClick(new AqS159S0200000_12(this, c70540RmK2, 84));
            c70540RmK2.setAlpha(this.LJLLJ);
        }
        int intValue = ((Number) this.LJLLLL.getValue()).intValue();
        _$_findCachedViewById(R.id.e3b).setPadding(0, intValue, 0, 0);
        _$_findCachedViewById(R.id.e3a).setPadding(0, intValue, 0, 0);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.RmJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C69947Rcl) obj).LJLILLLLZI);
            }
        }, null, new AqS194S0100000_12(this, 226), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.Rcm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C69947Rcl) obj).LJLJJLL);
            }
        }, null, new AqS194S0100000_12(this, 218), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Rl8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((RXD) obj).LJLIL;
            }
        }, null, new AqS194S0100000_12(this, 219), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.Rge
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C69947Rcl) obj).LJLJI);
            }
        }, null, C70541RmL.LJLIL, 6);
    }
}
