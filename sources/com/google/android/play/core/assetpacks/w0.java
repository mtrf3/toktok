package com.google.android.play.core.assetpacks;

import X.C16880lQ;
import X.C3QD;
import X.C40651FxP;
import X.C65864Pt6;
import X.C772831o;
import X.C85323Wm;
import X.EnumC40671Fxj;

/* loaded from: classes7.dex */
public final /* synthetic */ class w0 implements b1 {
    public final int LIZ;
    public final Object LIZIZ;

    public final void LIZ() {
        C40651FxP c40651FxP = (C40651FxP) this.LIZIZ;
        if (c40651FxP != null) {
            c40651FxP.LJLILLLLZI++;
            int i = this.LIZ;
            if (i != 0) {
                if (i != 1) {
                    c40651FxP.LJLJJL++;
                    return;
                } else {
                    c40651FxP.LJLJJI++;
                    return;
                }
            }
            c40651FxP.LJLJI++;
        }
    }

    public final void LIZIZ() {
        String position;
        if (this.LIZIZ != null) {
            int i = this.LIZ;
            if (i != 0) {
                if (i != 1) {
                    position = EnumC40671Fxj.RESULT.getValue();
                } else {
                    position = EnumC40671Fxj.SUGGESTED.getValue();
                }
            } else {
                position = EnumC40671Fxj.RECENT.getValue();
            }
            C40651FxP c40651FxP = (C40651FxP) this.LIZIZ;
            String enterMethod = c40651FxP.LJLIL;
            int i2 = c40651FxP.LJLILLLLZI;
            int i3 = c40651FxP.LJLJI;
            int i4 = c40651FxP.LJLJJI;
            int i5 = c40651FxP.LJLJJL;
            C85323Wm onEventV3 = C772831o.LIZ();
            kotlin.jvm.internal.o.LJIIIZ(enterMethod, "enterMethod");
            kotlin.jvm.internal.o.LJIIIZ(position, "position");
            kotlin.jvm.internal.o.LJIIIZ(onEventV3, "onEventV3");
            C65864Pt6 c65864Pt6 = new C65864Pt6();
            C3QD.LIZJ("enter_method", enterMethod, c65864Pt6);
            C3QD.LIZJ("position", position, c65864Pt6);
            C3QD.LIZIZ(Integer.valueOf(i2), "counter", c65864Pt6);
            C3QD.LIZIZ(Integer.valueOf(i3), "recent_counter", c65864Pt6);
            C3QD.LIZIZ(Integer.valueOf(i4), "suggested_counter", c65864Pt6);
            C3QD.LIZIZ(Integer.valueOf(i5), "result_counter", c65864Pt6);
            onEventV3.LIZIZ("dm_search_valid_consume_performance", c65864Pt6);
            c65864Pt6.build();
        }
        C40651FxP c40651FxP2 = (C40651FxP) this.LIZIZ;
        if (c40651FxP2 != null) {
            c40651FxP2.LJLILLLLZI = 0;
            c40651FxP2.LJLJI = 0;
            c40651FxP2.LJLJJI = 0;
            c40651FxP2.LJLJJL = 0;
        }
    }

    @Override // com.google.android.play.core.assetpacks.b1
    public final Object a() {
        c1 c1Var = (c1) this.LIZIZ;
        int i = this.LIZ;
        z0 LIZJ = c1Var.LIZJ(i);
        y0 y0Var = LIZJ.LIZJ;
        int i2 = y0Var.LIZJ;
        if (i2 == 5 || i2 == 6 || i2 == 4) {
            y yVar = c1Var.LIZ;
            String str = y0Var.LIZ;
            int i3 = LIZJ.LIZIZ;
            long j = y0Var.LIZIZ;
            if (yVar.LIZLLL(i3, j, str).exists()) {
                y.LJFF(yVar.LIZLLL(i3, j, str));
            }
            y0 y0Var2 = LIZJ.LIZJ;
            int i4 = y0Var2.LIZJ;
            if (i4 == 5 || i4 == 6) {
                y yVar2 = c1Var.LIZ;
                String str2 = y0Var2.LIZ;
                int i5 = LIZJ.LIZIZ;
                long j2 = y0Var2.LIZIZ;
                if (!yVar2.LJII(i5, j2, str2).exists()) {
                    return null;
                }
                y.LJFF(yVar2.LJII(i5, j2, str2));
                return null;
            }
            return null;
        }
        throw new m0(C16880lQ.LLLZ("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    public /* synthetic */ w0(int i, Object obj) {
        this.LIZIZ = obj;
        this.LIZ = i;
    }
}
