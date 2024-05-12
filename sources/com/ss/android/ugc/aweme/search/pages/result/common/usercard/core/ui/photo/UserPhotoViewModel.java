package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.C33Q;
import X.C72Z;
import X.C8YE;
import X.JJL;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserPhotoViewModel extends AssemViewModelWithItem<C72Z, JJL> implements C8YE<C72Z, JJL> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C72Z(null);
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // X.C8YE
    public final C72Z HU(C72Z state, JJL item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C72Z(null);
    }
}
