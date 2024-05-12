package com.ss.android.ugc.aweme.ecommerce.mall.ui.skylight;

import X.C0AC;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class CallBackLinearLayoutManager extends LinearLayoutManager {
    public final InterfaceC65784Pro<C76800UCe> LLIIIJ;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        this.LLIIIJ.invoke();
    }

    public CallBackLinearLayoutManager(Context context, AqS159S0100000_9 aqS159S0100000_9) {
        super(0, false);
        this.LLIIIJ = aqS159S0100000_9;
    }
}
