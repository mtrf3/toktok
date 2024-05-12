package com.ss.android.ugc.aweme.ecommerce.mall.ui.floating;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9AV;
import X.C9BE;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MallLiveBubbleAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public LinearLayout LJLL;
    public LinearLayout LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.a03;
    }

    public MallLiveBubbleAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MallLiveBubbleViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 322), C9AV.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLL = (LinearLayout) x3().findViewById(R.id.fje);
        this.LJLLILLLL = (TuxTextView) x3().findViewById(R.id.ma2);
        this.LJLLI = (LinearLayout) x3().findViewById(R.id.fnq);
        x3().findViewById(R.id.me7);
        this.LJLLJ = (TuxTextView) x3().findViewById(R.id.mq9);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.9AW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9AX) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 336), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.9AY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9AX) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 337), 6);
    }
}
