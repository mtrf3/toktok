package com.bytedance.android.livesdk.chatroom.interaction;

import X.BWS;
import X.C19U;
import X.C73943T0h;
import X.InterfaceC40159FpT;
import Y.AfS57S0100000_5;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PopHalfWebDialogHelper implements GenericLifecycleObserver {
    public final BaseFragment LJLIL;
    public final DataChannel LJLILLLLZI;
    public final boolean LJLJI;
    public HybridDialogFragment LJLJJI;
    public SparkContext LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dismissDialog();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dismissDialog() {
        InterfaceC40159FpT LJIILL;
        HybridDialogFragment hybridDialogFragment = this.LJLJJI;
        if (hybridDialogFragment != null) {
            hybridDialogFragment.dismissAllowingStateLoss();
        }
        SparkContext sparkContext = this.LJLJJL;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
    }

    public PopHalfWebDialogHelper(BaseFragment fragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = fragment;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = z;
        lifecycleOwner.getLifecycle().addObserver(this);
        C73943T0h LIZ = C73943T0h.LIZ();
        LIZ.getClass();
        LIZ.LIZLLL(fragment, BWS.class, new C19U()).LIZIZ(new AfS57S0100000_5(this, 59));
    }
}
