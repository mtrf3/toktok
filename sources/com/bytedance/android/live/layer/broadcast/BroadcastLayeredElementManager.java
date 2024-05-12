package com.bytedance.android.live.layer.broadcast;

import X.C42311lL;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BroadcastLayeredElementManager extends BaseLayeredElementManager {
    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public C42311lL onCreateLayeredElementContext(Context context, ViewGroup container, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C42311lL(context, container, dataChannel, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastLayeredElementManager(Context context, Fragment fragment, LayeredConstraintLayout layeredConstraintLayout, DataChannel dataChannel) {
        super(context, fragment, layeredConstraintLayout, dataChannel);
        o.LJIIIZ(fragment, "fragment");
    }
}
