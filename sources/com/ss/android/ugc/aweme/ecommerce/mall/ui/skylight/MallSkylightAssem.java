package com.ss.android.ugc.aweme.ecommerce.mall.ui.skylight;

import X.C214298b3;
import X.C54703LdT;
import X.C55611Ls7;
import X.C55986LyA;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallSkylightAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C55986LyA LJLILLLLZI;
    public RecyclerView LJLJI;
    public TuxTextView LJLJJI;
    public LinearLayout LJLJJL;
    public LinearLayout LJLJJLL;
    public C54703LdT LJLJL;
    public LinearLayoutManager LJLJLJ;

    public MallSkylightAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MallSkylightViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 146), C55611Ls7.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView recyclerView;
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        C55986LyA c55986LyA = (C55986LyA) getContainerView().findViewById(R.id.gcs);
        this.LJLILLLLZI = c55986LyA;
        if (c55986LyA != null) {
            c55986LyA.setVisibility(0);
        }
        this.LJLJJLL = (LinearLayout) getContainerView().findViewById(R.id.fll);
        C55986LyA c55986LyA2 = this.LJLILLLLZI;
        LinearLayout linearLayout = null;
        if (c55986LyA2 != null) {
            recyclerView = (RecyclerView) c55986LyA2.findViewById(R.id.isq);
        } else {
            recyclerView = null;
        }
        this.LJLJI = recyclerView;
        C55986LyA c55986LyA3 = this.LJLILLLLZI;
        if (c55986LyA3 != null) {
            tuxTextView = (TuxTextView) c55986LyA3.findViewById(R.id.mkm);
        } else {
            tuxTextView = null;
        }
        this.LJLJJI = tuxTextView;
        C55986LyA c55986LyA4 = this.LJLILLLLZI;
        if (c55986LyA4 != null) {
            c55986LyA4.findViewById(R.id.mkh);
        }
        C55986LyA c55986LyA5 = this.LJLILLLLZI;
        if (c55986LyA5 != null) {
            linearLayout = (LinearLayout) c55986LyA5.findViewById(R.id.flm);
        }
        this.LJLJJL = linearLayout;
        C55986LyA c55986LyA6 = this.LJLILLLLZI;
        if (c55986LyA6 != null) {
            c55986LyA6.findViewById(R.id.mkk);
        }
        C55986LyA c55986LyA7 = this.LJLILLLLZI;
        if (c55986LyA7 != null) {
            c55986LyA7.findViewById(R.id.mkj);
        }
        C54703LdT c54703LdT = new C54703LdT();
        this.LJLJL = c54703LdT;
        c54703LdT.setShowFooter(false);
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJL);
        }
        getContainerView().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.LJLJLJ = linearLayoutManager;
        linearLayoutManager.LLJJIII(0);
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(this.LJLJLJ);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.E2q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35645Dyr) obj).LJLILLLLZI;
            }
        }, null, new AqS191S0100000_9(this, LiveTryModeCountDownThresholdSetting.DEFAULT), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.E2r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35645Dyr) obj).LJLIL;
            }
        }, null, new AqS191S0100000_9(this, 121), 6);
    }
}
