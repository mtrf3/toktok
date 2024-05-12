package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54472LZk;
import X.C54473LZl;
import X.C54474LZm;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZS;
import X.SY4;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.vm.StemFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StemFeedEmptyAssem extends UISlotAssem implements IStemEmptyAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public StemFeedFragmentPanel LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -536348941) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cnp;
    }

    public StemFeedEmptyAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StemFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 630), C54472LZk.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, LZS.class, null), checkSupervisorPrepared());
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemEmptyAssemAbility
    public final boolean LLF() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        this.LJLLI = ((LZS) this.LJLL.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.LZj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54666Lcs) obj).getRefreshState();
            }
        }, null, C54473LZl.LJLIL, C54474LZm.LJLIL, new AqS175S0100000_9(this, 273), 2, null);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c7z);
        if (tuxTextView != null) {
            tuxTextView.LJJJ(30.0f);
        }
        SY4 sy4 = (SY4) view.findViewById(R.id.auw);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 166));
        }
        view.findViewById(R.id.bul);
    }
}
