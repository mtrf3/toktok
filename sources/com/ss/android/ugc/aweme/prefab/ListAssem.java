package com.ss.android.ugc.aweme.prefab;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C191537fR;
import X.C212428Vi;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C72808Sho;
import X.C73305Spp;
import X.C73306Spq;
import X.C7MY;
import X.InterfaceC191547fS;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.prefab.ListAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ListAssem extends DynamicAssem {
    public SYL LJLJLLL;
    public C73305Spp LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public abstract AssemListViewModel<?, ?, ?> P3();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return 0;
    }

    public ListAssem() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 793));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 794));
    }

    public final C73306Spq L3() {
        return (C73306Spq) this.LJLLI.getValue();
    }

    public final SYL M3() {
        SYL syl = this.LJLJLLL;
        if (syl != null) {
            return syl;
        }
        o.LJIJI("list");
        throw null;
    }

    public C57939MoZ N3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 5;
        return c57939MoZ;
    }

    public final C73305Spp O3() {
        C73305Spp c73305Spp = this.LJLL;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public void Q3() {
        SYL M3 = M3();
        M3.setListConfig(N3());
        AssemListViewModel<?, ?, ?> P3 = P3();
        C72808Sho<InterfaceC57784Mm4> state = M3.getState();
        o.LJIIIIZZ(state, "state");
        P3.setListState(state);
        M3.LJLJLLL(P3().getConfig());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutParams(new ViewGroup.LayoutParams(-1, C7MY.LIZIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT)));
        this.LJLL = c73305Spp;
        SYL syl = new SYL(context, null);
        syl.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLJLLL = syl;
        frameLayout.addView(O3());
        frameLayout.addView(M3());
        E3(frameLayout);
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(view, "view");
        Q3();
        M3().setVisibility(8);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(M3().getContext()), R.layout.c2k, M3(), false);
        LLLLIILL.setVisibility(8);
        M3().LJLJJLL(LLLLIILL);
        C191537fR c191537fR = new C191537fR(M3(), new InterfaceC191547fS() { // from class: X.7Sc
            @Override // X.InterfaceC191547fS
            public final void LJIIJJI() {
                ListAssem.this.P3().manualListRetry(SZP.Next);
            }
        });
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1652);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LLLLIILL, 1653);
        AqS153S0100000_3 aqS153S0100000_33 = new AqS153S0100000_3(LLLLIILL, 1654);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                lifecycleOwner = LIZLLL.getViewLifecycleOwner();
            } else {
                lifecycleOwner = null;
            }
            NetworkHelper networkHelper = new NetworkHelper(aqS153S0100000_3, null, aqS153S0100000_32, aqS153S0100000_33, LIZ, null, 1, lifecycleOwner, 162);
            AssemListViewModel<?, ?, ?> P3 = P3();
            o.LJII(P3, "null cannot be cast to non-null type com.bytedance.assem.arch.viewModel.AssemViewModel<com.bytedance.ext_power_list.IAssemListVMState<*, *>>");
            AssemViewModel.asyncSubscribe$default(P3, new TBT() { // from class: X.7Sa
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((InterfaceC2064888m) obj).getLoadMoreState();
                }
            }, null, new AqS107S0300000_3(networkHelper, this, c191537fR, 36), new AqS153S0100000_3(networkHelper, 1651), new AqS169S0100000_3(networkHelper, 906), 2, null);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
