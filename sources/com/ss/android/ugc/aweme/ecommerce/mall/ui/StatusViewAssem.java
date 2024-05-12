package com.ss.android.ugc.aweme.ecommerce.mall.ui;

import X.C2068389v;
import X.C214298b3;
import X.C36746EbW;
import X.C55626LsM;
import X.C55983Ly7;
import X.C56092Lzs;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC56121M0v;
import X.M1B;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StatusViewAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final void A3() {
        Resources resources;
        C36746EbW.LIZ(3, "ErrorViewDisplay");
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73306Spq c73306Spq = new C73306Spq();
            Context context = c73305Spp.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                String string = resources.getString(R.string.f3g);
                o.LJIIIIZZ(string, "getString(R.string.ec_pdp_error_server_tle)");
                c73306Spq.LJFF = string;
                String string2 = resources.getString(R.string.f3f);
                o.LJIIIIZZ(string2, "getString(R.string.ec_pdp_error_server_desc)");
                c73306Spq.LJI = string2;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_refresh;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                c73306Spq.LIZ(c2068389v);
                c73306Spq.LJII = new AqS140S0200000_9(this, resources, 6);
            }
            c73305Spp.setStatus(c73306Spq);
        }
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        int status = M1B.SHOW.getStatus();
        String errMsg = EnumC56121M0v.NO_DATA.getErrMsg();
        c56092Lzs.getClass();
        C56092Lzs.LJIIL(status, errMsg);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(R.id.keh);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.keh)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public StatusViewAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainLynxViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 134), C55626LsM.INSTANCE, null);
    }

    public final void v3() {
        C36746EbW.LIZ(3, "ShopTabV3 ErrorView errorViewGone");
        C55983Ly7 state = x3().getState();
        if ((state.LJLIL instanceof C72912tb) && (state.LJLJI instanceof C72912tb)) {
            C36746EbW.LIZ(3, "ShopTabV3 ErrorView errorViewGone realGone");
            ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
        }
    }

    public final ShopMainLynxViewModel x3() {
        return (ShopMainLynxViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.M1P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLIL;
            }
        }, null, new AqS175S0100000_9(this, 67), null, new AqS175S0100000_9(this, 68), 10, null);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.M1Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLILLLLZI;
            }
        }, null, new AqS191S0100000_9(this, 7), 6);
        AssemViewModel.asyncSubscribe$default(x3(), new TBT() { // from class: X.M1R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLJI;
            }
        }, null, new AqS175S0100000_9(this, 69), null, new AqS175S0100000_9(this, 70), 10, null);
    }
}
