package com.ss.android.ugc.aweme.cell;

import X.AEY;
import X.AI2;
import X.C25848ACm;
import android.content.Context;
import android.widget.CompoundButton;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SwitchCell extends TuxCell<C25848ACm, AI2> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AI2 N(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        AI2 ai2 = new AI2(context);
        C25848ACm c25848ACm = (C25848ACm) getItem();
        if (c25848ACm != null) {
            onCheckedChangeListener = c25848ACm.LLF;
        } else {
            onCheckedChangeListener = null;
        }
        ai2.LJIILL(onCheckedChangeListener);
        ai2.LJIILJJIL(new AqS154S0100000_4(this, 1274));
        return ai2;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C25848ACm t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AEY aey = (AEY) this.LJLIL;
        if (aey == null) {
            return;
        }
        aey.LJIILIIL(t.LJZI);
    }
}
