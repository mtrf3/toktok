package com.ss.android.ugc.aweme.nows.interaction.viewmodel;

import X.C33Q;
import X.C7ML;
import X.C8YE;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowInteractionBaseViewModel<S extends C33Q> extends AssemViewModelWithItem<S, C7ML> implements C8YE<S, C7ML> {
    public S hv0(S state, C7ML item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return state;
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8YE
    public final C33Q HU(C33Q state, C7ML c7ml, List list) {
        C7ML item = c7ml;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return hv0(state, item);
    }
}
