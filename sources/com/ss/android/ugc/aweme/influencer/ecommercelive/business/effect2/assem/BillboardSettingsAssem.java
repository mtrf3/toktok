package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.ARV;
import X.AnonymousClass636;
import X.C200047tA;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79045V0n;
import X.C8YN;
import X.C9BD;
import X.S6S;
import X.TBT;
import Y.IDCListenerS204S0100000_3;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BillboardSettingsAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(R.id.llu);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.llu)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public BillboardSettingsAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 437), C200047tA.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            if (AnonymousClass636.LJIILJJIL(context)) {
                LJI = C79045V0n.LJI(R.attr.cr, context);
            } else {
                LJI = C79045V0n.LJI(R.attr.c9, context);
            }
            if (LJI != null) {
                view.setBackgroundColor(LJI.intValue());
            }
        }
        ((ARV) _$_findCachedViewById(R.id.llu)).setChecked(((S6S) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJJI);
        ((CompoundButton) _$_findCachedViewById(R.id.llu)).setOnCheckedChangeListener(new IDCListenerS204S0100000_3(this, 2));
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.7tB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((S6S) obj).LJLJJI);
            }
        }, null, new AqS194S0100000_12(this, 176), 6);
    }
}
