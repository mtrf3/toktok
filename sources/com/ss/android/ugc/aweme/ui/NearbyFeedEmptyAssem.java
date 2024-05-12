package com.ss.android.ugc.aweme.ui;

import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54464LZc;
import X.C54465LZd;
import X.C54467LZf;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZV;
import X.SY4;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyFeedEmptyAssem extends UISlotAssem implements INearbyEmptyAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public NearbyFeedFragmentPanel LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -874997508) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bw6;
    }

    public NearbyFeedEmptyAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 688), C54464LZc.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyEmptyAssemAbility
    public final boolean LLF() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        this.LJLLI = ((LZV) this.LJLL.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.LZb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getRefreshState();
            }
        }, null, C54465LZd.LJLIL, C54467LZf.LJLIL, new AqS175S0100000_9(this, 340), 2, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.LZe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getLoadMoreState();
            }
        }, null, null, null, new AqS140S0200000_9(view, this, 35), 14, null);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c7z);
        if (tuxTextView != null) {
            tuxTextView.LJJJ(30.0f);
        }
        SY4 sy4 = (SY4) view.findViewById(R.id.auw);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 167));
        }
    }
}
