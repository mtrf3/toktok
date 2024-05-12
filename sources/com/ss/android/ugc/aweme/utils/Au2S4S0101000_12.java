package com.ss.android.ugc.aweme.utils;

import X.C70287RiF;
import X.C70647Ro3;
import X.InterfaceC70273Ri1;
import X.TAT;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecItemAdapterV2;

/* loaded from: classes13.dex */
public class Au2S4S0101000_12 extends TAT {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final void LIZ$0(Au2S4S0101000_12 au2S4S0101000_12, View view) {
        InterfaceC70273Ri1 listener;
        if (view != null && (listener = ((SpecItemAdapterV2) au2S4S0101000_12.l0).getListener()) != null) {
            int i = au2S4S0101000_12.i1;
            listener.LJJIJLIJ(i, ((SpecItemAdapterV2) au2S4S0101000_12.l0).getItem(i));
        }
    }

    public static final void LIZ$1(Au2S4S0101000_12 au2S4S0101000_12, View view) {
        C70647Ro3 c70647Ro3;
        C70287RiF c70287RiF;
        if (view != null && (c70287RiF = (c70647Ro3 = (C70647Ro3) au2S4S0101000_12.l0).LJLJL) != null) {
            int i = au2S4S0101000_12.i1;
            c70287RiF.LJJIJLIJ(i, c70647Ro3.LJZL(i, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S4S0101000_12(Object obj, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
