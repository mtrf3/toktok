package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf;

import X.C0AC;
import X.C1BU;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class OffsetGridLayoutManager extends GridLayoutManager {
    public final InterfaceC65784Pro<C76800UCe> LLIIZ;
    public final HashMap<Integer, Integer> LLIL;

    public OffsetGridLayoutManager(InterfaceC65784Pro interfaceC65784Pro) {
        super(4, 1, false);
        this.LLIIZ = interfaceC65784Pro;
        this.LLIL = new HashMap<>();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJJIJ(C0AC state) {
        o.LJIIIZ(state, "state");
        int i = 0;
        if (LJJJI() == 0) {
            return 0;
        }
        try {
            int LLILL = LLILL();
            View LJJIJIL = LJJIJIL(LLILL);
            int i2 = 0;
            for (int i3 = 0; i3 < LLILL; i3++) {
                Integer num = this.LLIL.get(Integer.valueOf(i3));
                if (num == null) {
                    num = 0;
                }
                i2 += num.intValue();
            }
            if (LJJIJIL != null) {
                i = LJJIJIL.getTop();
            }
            return i2 - i;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        int LLILL = LLILL();
        int LLILLJJLI = LLILLJJLI();
        if (LLILL >= 0 && LLILLJJLI >= 0 && LLILLJJLI >= LLILL) {
            while (LLILL < LLILLJJLI) {
                View LJJJ = LJJJ(LLILL);
                if (LJJJ != null) {
                    ViewGroup.LayoutParams layoutParams = LJJJ.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                    if (((C1BU) layoutParams).LJLIL == 0) {
                        this.LLIL.put(Integer.valueOf(LLILL), Integer.valueOf(LJJJ.getHeight()));
                    } else {
                        this.LLIL.put(Integer.valueOf(LLILL), 0);
                    }
                }
                LLILL++;
            }
            this.LLIIZ.invoke();
        }
    }
}
