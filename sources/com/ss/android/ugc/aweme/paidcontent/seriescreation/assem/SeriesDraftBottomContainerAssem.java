package com.ss.android.ugc.aweme.paidcontent.seriescreation.assem;

import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C248929po;
import X.C248949pq;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7VX;
import X.C8YN;
import X.C9BD;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.IDqS451S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftBottomContainerAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public SY4 LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public LinearLayout LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ai6;
    }

    public SeriesDraftBottomContainerAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 676), C248949pq.INSTANCE, null);
    }

    public final SeriesDraftViewModel H3() {
        return (SeriesDraftViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLLI = (TuxTextView) getContainerView().findViewById(R.id.cz1);
        this.LJLLILLLL = (TuxTextView) getContainerView().findViewById(R.id.cz0);
        this.LJLLJ = (LinearLayout) getContainerView().findViewById(R.id.cyx);
        if (C7VX.LIZ()) {
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            LinearLayout linearLayout2 = this.LJLLJ;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.LJLLJ;
            if (linearLayout3 != null) {
                C16880lQ.LJIIZILJ(linearLayout3, new ACListenerS24S0100000_4(this, 317));
            }
        }
        SY4 sy4 = (SY4) getContainerView().findViewById(R.id.h0y);
        this.LJLL = sy4;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 318));
        }
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9pm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 160), 4);
        AssemViewModel.asyncSubscribe$default(H3(), new TBT() { // from class: X.9pl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLZ;
            }
        }, null, new AqS170S0100000_4(this, 507), new AqS154S0100000_4(this, 608), new C248929po(this), 2, null);
        C8YN.LJIIJJI(this, H3(), new TBT() { // from class: X.9pt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.9pu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJI;
            }
        }, new TBT() { // from class: X.9pn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJJI;
            }
        }, null, new IDqS451S0100000_4(this, 3), 24);
        C8YN.LJIIJJI(this, H3(), new TBT() { // from class: X.9pr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJL;
            }
        }, new TBT() { // from class: X.9pp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C248629pK) obj).LJLJJLL);
            }
        }, new TBT() { // from class: X.9ps
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLJJL;
            }
        }, null, new IDqS451S0100000_4(this, 4), 24);
    }
}
