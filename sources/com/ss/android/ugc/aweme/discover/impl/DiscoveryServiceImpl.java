package com.ss.android.ugc.aweme.discover.impl;

import X.InterfaceC55284Lmq;
import X.JXA;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.IDiscoveryService;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;

/* loaded from: classes10.dex */
public final class DiscoveryServiceImpl implements IDiscoveryService {
    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Class<? extends Fragment> LJJJJZI() {
        return DiscoverAndSearchFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment LJJJLL() {
        return new DiscoverAndSearchFragment();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final InterfaceC55284Lmq LJJJLIIL() {
        return JXA.LIZ;
    }
}
