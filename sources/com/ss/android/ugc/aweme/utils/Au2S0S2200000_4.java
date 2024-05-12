package com.ss.android.ugc.aweme.utils;

import X.C26227ARb;
import X.C27343AoF;
import X.C27344AoG;
import X.C3AW;
import X.C70414RkI;
import X.TAT;
import X.UC0;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.staticsellingpoint.StaticSellingPointVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.staticsellingpoint.GlobalStaticSellingPointVH;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S0S2200000_4 extends TAT {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final void LIZ$0(Au2S0S2200000_4 au2S0S2200000_4, View view) {
        if (view != null) {
            C70414RkI c70414RkI = ((PdpViewModel) ((GlobalStaticSellingPointVH) au2S0S2200000_4.l2).LJLIL.getValue()).LLFII;
            if (c70414RkI != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                String str = au2S0S2200000_4.s1;
                if (str != null) {
                    hashMap.put("button_type", str);
                }
                c70414RkI.LJJI("selling_point", hashMap);
            }
            Context context = ((View) au2S0S2200000_4.l3).getContext();
            o.LJIIIIZZ(context, "view.context");
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LIZIZ(au2S0S2200000_4.s0);
            UC0.LIZJ(LIZ, C27343AoF.LJLIL);
            LIZ.LJII = false;
            LIZ.LJI().LIZLLL();
        }
    }

    public static final void LIZ$1(Au2S0S2200000_4 au2S0S2200000_4, View view) {
        if (view != null) {
            C70414RkI c70414RkI = ((PdpViewModel) ((StaticSellingPointVH) au2S0S2200000_4.l2).LJLIL.getValue()).LLFII;
            if (c70414RkI != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                String str = au2S0S2200000_4.s1;
                if (str != null) {
                    hashMap.put("button_type", str);
                }
                c70414RkI.LJJI("selling_point", hashMap);
            }
            Context context = ((View) au2S0S2200000_4.l3).getContext();
            o.LJIIIIZZ(context, "view.context");
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LIZIZ(au2S0S2200000_4.s0);
            UC0.LIZJ(LIZ, C27344AoG.LJLIL);
            LIZ.LJII = false;
            LIZ.LJI().LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S2200000_4(Object obj, Object obj2, String str, String str2, int i) {
        super(700L);
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.s1 = str2;
    }
}
