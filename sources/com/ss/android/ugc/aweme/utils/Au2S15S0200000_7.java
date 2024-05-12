package com.ss.android.ugc.aweme.utils;

import X.AKH;
import X.GHQ;
import X.TAT;
import android.view.View;

/* loaded from: classes8.dex */
public class Au2S15S0200000_7 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S15S0200000_7 au2S15S0200000_7, View view) {
        ((GHQ) au2S15S0200000_7.l0).LJIIJ((AKH) au2S15S0200000_7.l1);
    }

    public static final void LIZ$1(Au2S15S0200000_7 au2S15S0200000_7, View view) {
        ((GHQ) au2S15S0200000_7.l0).LJIIJ((AKH) au2S15S0200000_7.l1);
    }

    public Au2S15S0200000_7(GHQ ghq, AKH akh, int i) {
        this.$t = i;
        this.l0 = ghq;
        this.l1 = akh;
    }
}
