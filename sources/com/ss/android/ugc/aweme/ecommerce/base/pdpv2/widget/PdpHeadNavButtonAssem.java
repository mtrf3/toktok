package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget;

import X.C214298b3;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70464Rl6;
import X.C70465Rl7;
import X.C70540RmK;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BE;
import X.O6R;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpHeadViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpHeadNavButtonAssem extends UIContentAssem {
    public static final int LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(38));
    public static final int LJLJL = C7MY.LIZIZ(9);
    public C70540RmK LJLIL;
    public LinearLayout LJLILLLLZI;
    public boolean LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;

    public PdpHeadNavButtonAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpMainViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 401), C70464Rl6.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpHeadViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 402), C70465Rl7.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(view instanceof C70540RmK)) {
            return;
        }
        this.LJLIL = (C70540RmK) view;
        View findViewById = view.findViewById(R.id.g3x);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ll_icon_container)");
        this.LJLILLLLZI = (LinearLayout) findViewById;
        C70540RmK c70540RmK = this.LJLIL;
        if (c70540RmK != null) {
            this.LJLJI = c70540RmK.LJLIL;
            C8YN.LJII(this, this.LJLJJL.getValue(), new TBT() { // from class: X.Rl3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((RXD) obj).LJLIL;
                }
            }, null, new AqS194S0100000_12(this, 73), 6);
        } else {
            o.LJIJI("pdpHeadNavView");
            throw null;
        }
    }
}
