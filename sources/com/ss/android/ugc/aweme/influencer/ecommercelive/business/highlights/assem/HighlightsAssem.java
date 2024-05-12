package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.assem;

import X.A90;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C214298b3;
import X.C221108m2;
import X.C242799fv;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79045V0n;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.powerlist.HighlightCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.powerlist.NewUserGuideCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightsAssem extends UIListContentAssem<HighlightsListViewModel> {
    public A90 LJLIL;
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 375));

    public static void C3(A90 a90) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "-342589117584674283")).LIZ) {
            return;
        }
        a90.show();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public HighlightsAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightsListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 376), C242799fv.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final HighlightsListViewModel A3() {
        return (AssemListViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 1;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LJII = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context2 = view.getContext();
        if (context2 != null && AnonymousClass636.LJIILJJIL(context2) && (context = view.getContext()) != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            view.setBackgroundColor(LJI.intValue());
        }
        v3().LLLF.LJZL(HighlightCell.class, NewUserGuideCell.class);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.9fh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242649fg) obj).LJLIL;
            }
        }, null, null, new AqS154S0100000_4(this, 1198), new AqS169S0100000_3(this, 868), 6, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.9fi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242649fg) obj).LJLJI;
            }
        }, null, new AqS186S0100000_4(this, 299), 6);
    }
}
