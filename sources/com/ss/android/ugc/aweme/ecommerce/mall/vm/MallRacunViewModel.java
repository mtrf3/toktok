package com.ss.android.ugc.aweme.ecommerce.mall.vm;

import X.C35638Dyk;
import X.E2N;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* loaded from: classes7.dex */
public final class MallRacunViewModel extends AssemViewModel<C35638Dyk> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35638Dyk defaultState() {
        return new C35638Dyk(0);
    }

    public static void gv0(MallRacunViewModel mallRacunViewModel, Integer num, List list, int i) {
        Integer num2 = num;
        List list2 = list;
        if ((i & 1) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        mallRacunViewModel.getClass();
        mallRacunViewModel.withState(new E2N(num2, mallRacunViewModel, false, null, null, list2));
    }
}
