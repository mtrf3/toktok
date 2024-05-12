package com.ss.android.ugc.aweme.cell;

import X.AEY;
import X.C25847ACl;
import X.C25991AHz;
import android.content.Context;
import android.widget.CompoundButton;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RadioCell extends TuxCell<C25847ACl, C25991AHz> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C25991AHz N(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C25991AHz c25991AHz = new C25991AHz(context);
        C25847ACl c25847ACl = (C25847ACl) getItem();
        if (c25847ACl != null) {
            onCheckedChangeListener = c25847ACl.LJZL;
        } else {
            onCheckedChangeListener = null;
        }
        c25991AHz.LJIILL(onCheckedChangeListener);
        c25991AHz.LJIILJJIL(new AqS154S0100000_4(this, 1273));
        return c25991AHz;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C25847ACl t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AEY aey = (AEY) this.LJLIL;
        if (aey == null) {
            return;
        }
        aey.LJIILIIL(t.LJZI);
    }
}
