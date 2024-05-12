package com.bytedance.android.live.wallet.viewmodel.exchange.base;

import X.C1EW;
import X.C221108m2;
import X.C53739L7f;
import X.C53740L7g;
import X.C62822Ol8;
import X.C77537Ubt;
import X.C77538Ubu;
import X.InterfaceC77539Ubv;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class ExchangeFirstStageVM extends ExchangeDialogVM {
    public final Context LJLJJLL;
    public final InterfaceC77539Ubv LJLJL;
    public final C62822Ol8 LJLJLJ;

    public abstract int ov0();

    public abstract void pv0();

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void nv0() {
        this.LJLJL.LJII();
        C77537Ubt c77537Ubt = (C77537Ubt) this.LJLJLJ.getValue();
        if (c77537Ubt != null) {
            this.LJLIL.LIZ(C1EW.LIZ(c77537Ubt.LIZ()).LJIJJLI(new AfS62S0200000_13(c77537Ubt, this.LJLJJLL, 65)).LJJJLIIL(new AfS65S0100000_13(this, 66), new AfS65S0100000_13(this, 67)));
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public void onShow() {
        C77537Ubt c77537Ubt = (C77537Ubt) this.LJLJLJ.getValue();
        if (c77537Ubt != null) {
            int ov0 = ov0();
            c77537Ubt.LIZIZ = 0;
            c77537Ubt.LIZJ = ov0;
            C1EW.LIZ(c77537Ubt.LIZ()).LJJJLIIL(C53739L7f.LJLIL, C53740L7g.LJLIL);
        }
    }

    public ExchangeFirstStageVM(Context context, InterfaceC77539Ubv exchangeDialog) {
        o.LJIIIZ(exchangeDialog, "exchangeDialog");
        this.LJLJJLL = context;
        this.LJLJL = exchangeDialog;
        this.LJLJLJ = C221108m2.LIZIZ(C77538Ubu.LJLIL);
    }
}
