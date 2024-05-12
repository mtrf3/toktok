package com.bytedance.ies.sdk.widgets;

/* loaded from: classes14.dex */
public abstract class RxBusSceneObserver<T> extends SceneObserver {
    public abstract Class<T> getType();

    public abstract void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, T t);
}
