package com.ss.android.ugc.aweme.ecommerce.mall.ui.floating;

import X.C214298b3;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72433Sbl;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SW1;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MallUserBubbleAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public C72433Sbl LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public C62846OlW LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.a07;
    }

    public MallUserBubbleAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(UserBubbleViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 532), SW1.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLL = (C72433Sbl) x3().findViewById(R.id.bbr);
        this.LJLLI = (TuxTextView) x3().findViewById(R.id.mpz);
        this.LJLLJ = (C62846OlW) x3().findViewById(R.id.eyz);
        this.LJLLILLLL = (TuxTextView) x3().findViewById(R.id.m_w);
        C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.E2p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35678DzO) obj).LJLIL;
            }
        }, null, new AqS194S0100000_12(this, 272), 6);
    }
}
