package com.ss.android.ugc.aweme.utils;

import X.InterfaceC50599JtT;
import X.InterfaceC61746OLe;
import X.ONW;
import X.TAT;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class Au2S2S0201000_10 extends TAT {
    public final int $t;
    public int i2;
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

    public static final void LIZ$0(Au2S2S0201000_10 au2S2S0201000_10, View view) {
        InterfaceC50599JtT interfaceC50599JtT;
        if (view != null && (interfaceC50599JtT = ((ONW) au2S2S0201000_10.l0).LJLJJI) != null) {
            View view2 = ((RecyclerView.ViewHolder) au2S2S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(au2S2S0201000_10.i2, view2);
        }
    }

    public static final void LIZ$1(Au2S2S0201000_10 au2S2S0201000_10, View view) {
        InterfaceC61746OLe interfaceC61746OLe;
        if (view != null && (interfaceC61746OLe = (InterfaceC61746OLe) au2S2S0201000_10.l0) != null) {
            interfaceC61746OLe.LIZ(au2S2S0201000_10.i2, (VSAProductCardsResponse.ProductDetail) au2S2S0201000_10.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S2S0201000_10(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
