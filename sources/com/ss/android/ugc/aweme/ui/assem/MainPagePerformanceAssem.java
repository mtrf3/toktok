package com.ss.android.ugc.aweme.ui.assem;

import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.services.BusinessMainService;

/* loaded from: classes7.dex */
public final class MainPagePerformanceAssem extends BaseMainPageFragmentAssem {
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void M1(ViewGroup viewGroup) {
        BusinessMainService.INSTANCE.updateRootViewAndState(viewGroup);
    }
}
