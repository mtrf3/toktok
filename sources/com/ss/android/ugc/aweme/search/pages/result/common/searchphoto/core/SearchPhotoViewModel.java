package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C33Q;
import X.C8YE;
import X.C94S;
import X.JKM;
import X.JQA;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchPhotoViewModel extends AssemViewModelWithItem<C94S, JKM> implements C8YE<C94S, JKM> {
    public JQA LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C94S(null, null, null);
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // X.C8YE
    public final C94S HU(C94S state, JKM item, List list) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C94S(null, null, null);
    }
}
