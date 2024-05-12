package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C116414hZ;
import X.C187307Ws;
import X.C189417c1;
import X.C214298b3;
import X.C221108m2;
import X.C43921HLp;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerListStatusAssem extends UISlotAssem {
    public C73305Spp LJLJLLL;
    public C116414hZ LJLL;
    public View LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C214298b3 LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cp7;
    }

    public StoryViewerListStatusAssem() {
        new LinkedHashMap();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1009));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryViewerListViewModel.class);
        this.LJLLJ = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1010), C187307Ws.INSTANCE, null);
    }

    public final StoryViewerListViewModel H3() {
        return (StoryViewerListViewModel) this.LJLLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C43921HLp.LIZ.LIZLLL("StoryViewerListStatusAssem");
    }

    public final void I3(boolean z) {
        if (z) {
            C73305Spp c73305Spp = this.LJLJLLL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(0);
            }
            K3(false);
            return;
        }
        C73305Spp c73305Spp2 = this.LJLJLLL;
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(8);
    }

    public final void K3(boolean z) {
        if (z) {
            View view = this.LJLLI;
            if (view != null) {
                view.setVisibility(0);
            }
            C116414hZ c116414hZ = this.LJLL;
            if (c116414hZ == null) {
                return;
            }
            c116414hZ.setVisibility(0);
            return;
        }
        View view2 = this.LJLLI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        C116414hZ c116414hZ2 = this.LJLL;
        if (c116414hZ2 == null) {
            return;
        }
        c116414hZ2.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (C73305Spp) view.findViewById(R.id.kf_);
        this.LJLLI = view.findViewById(R.id.mut);
        this.LJLL = (C116414hZ) view.findViewById(R.id.muz);
        AssemViewModel.asyncSubscribe$default(H3(), new TBT() { // from class: X.7by
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C189257bl c189257bl = (C189257bl) obj;
                c189257bl.getClass();
                return C208708Ha.LIZLLL(c189257bl);
            }
        }, null, new AqS134S0200000_3(this, view, 153), new AqS153S0100000_3(this, 1008), new AqS134S0200000_3(this, view, 154), 2, null);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.7bt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189257bl) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 87), 6);
        C43921HLp.LIZ.LJIIL("StoryViewerListStatusAssem", (C189417c1) this.LJLLILLLL.getValue());
    }
}
