package com.bytedance.android.live.rank.impl.list.controller.base;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class IBaseController implements GenericLifecycleObserver {
    public final Map LJLIL = new HashMap();

    public abstract RankRootViewModel LIZ();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
