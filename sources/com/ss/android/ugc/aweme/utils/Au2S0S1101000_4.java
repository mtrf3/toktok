package com.ss.android.ugc.aweme.utils;

import X.C238729Ym;
import X.C26059AKp;
import X.C27739Aud;
import X.C27740Aue;
import X.C70414RkI;
import X.C70656RoC;
import X.C70968RtE;
import X.C78946Uyc;
import X.TAT;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.events.ZipCodeSelectedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S0S1101000_4 extends TAT {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final void LIZ$0(Au2S0S1101000_4 au2S0S1101000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpBottomNavBarWidget) au2S0S1101000_4.l1).getViewModel();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "im_view.context");
            o.LJIIIZ(viewModel, "<this>");
            Activity LIZ = C27740Aue.LIZ(context);
            o.LJIIIIZZ(LIZ, "getActivity(context)");
            C70656RoC.LIZ(LIZ, new AqS151S0200000_4(viewModel, context, 1));
            C70414RkI c70414RkI = ((PdpBottomNavBarWidget) au2S0S1101000_4.l1).getViewModel().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJIL(c70414RkI, "contact_seller", null, null, au2S0S1101000_4.s0, Integer.valueOf(au2S0S1101000_4.i2), 6);
            }
            if (((PdpBottomNavBarWidget) au2S0S1101000_4.l1).getViewModel().uw0()) {
                C26059AKp.LIZ().LIZ("ec_im_icon_click", "{}");
            }
        }
    }

    public static final void LIZ$1(Au2S0S1101000_4 au2S0S1101000_4, View view) {
        if (view != null) {
            View itemView = ((C238729Ym) au2S0S1101000_4.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70968RtE(), new AqS29S0001000_4(au2S0S1101000_4.i2, 2));
            C26059AKp.LIZ().LIZ("ec_zipcode_selected_event", C27739Aud.LJI(new ZipCodeSelectedEvent(au2S0S1101000_4.s0)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1101000_4(Object obj, String str, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
