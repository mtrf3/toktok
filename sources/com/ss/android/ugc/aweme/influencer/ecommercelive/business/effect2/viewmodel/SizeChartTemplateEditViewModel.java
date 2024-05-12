package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel;

import X.C71633S9l;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem;
import java.util.List;

/* loaded from: classes13.dex */
public final class SizeChartTemplateEditViewModel extends AssemViewModel<C71633S9l> {
    public SizeChartTemplateItem LJLIL = new SizeChartTemplateItem((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, (List) null, 1023);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C71633S9l defaultState() {
        return new C71633S9l(0);
    }

    public static boolean gv0(String str, String str2) {
        if (str.length() <= 0 && str2.length() <= 0) {
            return false;
        }
        return true;
    }
}
