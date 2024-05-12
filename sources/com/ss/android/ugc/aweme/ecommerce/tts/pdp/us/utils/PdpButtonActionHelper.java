package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpButtonActionHelper implements GenericLifecycleObserver {
    public final PdpViewModel LJLIL;
    public final Set<String> LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public PdpButtonActionHelper(PdpViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = new LinkedHashSet();
    }
}
