package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public abstract class DataChannelSceneObserver<O, T extends com.bytedance.ies.sdk.datachannel.NextLiveData<O>> extends SceneObserver {
    public final boolean isSticky;

    public DataChannelSceneObserver() {
        this(false, 1, null);
    }

    public abstract Class<T> getType();

    public abstract void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, O o);

    public final boolean isSticky() {
        return this.isSticky;
    }

    public DataChannelSceneObserver(boolean z) {
        this.isSticky = z;
    }

    public /* synthetic */ DataChannelSceneObserver(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
