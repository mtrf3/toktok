package com.bytedance.tiktok.homepage.services;

import X.InterfaceC36101EEv;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

/* loaded from: classes7.dex */
public final class MainFragmentCacheExpServiceImpl implements IMainFragmentCacheExpService {
    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC36101EEv LIZ() {
        return new MainFragmentTopRightIconInflate();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC36101EEv LIZIZ() {
        return new MainFragmentTopLeftIconInflate();
    }
}
