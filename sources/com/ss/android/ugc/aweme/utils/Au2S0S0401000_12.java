package com.ss.android.ugc.aweme.utils;

import X.C27941Axt;
import X.C27959AyB;
import X.InterfaceC88475Ynv;
import X.S48;
import X.S49;
import X.TAT;
import android.view.View;

/* loaded from: classes13.dex */
public class Au2S0S0401000_12 extends TAT {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S0401000_12 au2S0S0401000_12, View view) {
        if (view != null) {
            ((InterfaceC88475Ynv) au2S0S0401000_12.l0).invoke(Boolean.valueOf(((S48) au2S0S0401000_12.l1).LJLJJLL.isChecked()), (C27941Axt) au2S0S0401000_12.l2, (C27959AyB) au2S0S0401000_12.l3, "title", Integer.valueOf(au2S0S0401000_12.i4));
        }
    }

    public static final void LIZ$1(Au2S0S0401000_12 au2S0S0401000_12, View view) {
        if (view != null) {
            ((InterfaceC88475Ynv) au2S0S0401000_12.l0).invoke(Boolean.valueOf(((S49) au2S0S0401000_12.l1).LJLJJL.isChecked()), (C27941Axt) au2S0S0401000_12.l2, (C27959AyB) au2S0S0401000_12.l3, "other", Integer.valueOf(au2S0S0401000_12.i4));
        }
    }

    public static final void LIZ$2(Au2S0S0401000_12 au2S0S0401000_12, View view) {
        if (view != null) {
            ((InterfaceC88475Ynv) au2S0S0401000_12.l0).invoke(Boolean.valueOf(((S49) au2S0S0401000_12.l1).LJLJJL.isChecked()), (C27941Axt) au2S0S0401000_12.l2, (C27959AyB) au2S0S0401000_12.l3, "pic", Integer.valueOf(au2S0S0401000_12.i4));
        }
    }

    public static final void LIZ$3(Au2S0S0401000_12 au2S0S0401000_12, View view) {
        if (view != null) {
            ((InterfaceC88475Ynv) au2S0S0401000_12.l0).invoke(Boolean.valueOf(((S49) au2S0S0401000_12.l1).LJLJJL.isChecked()), (C27941Axt) au2S0S0401000_12.l2, (C27959AyB) au2S0S0401000_12.l3, "title", Integer.valueOf(au2S0S0401000_12.i4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S0401000_12(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.i4 = i;
    }
}
