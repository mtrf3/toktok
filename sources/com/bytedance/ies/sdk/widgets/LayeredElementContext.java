package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class LayeredElementContext {
    public final long animationDuration;
    public final ViewGroup container;
    public final Context context;
    public final DataChannel dataChannel;
    public final LayeredElementManager<? extends LayeredElementContext> layeredElementManager;

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DataChannel getDataChannel() {
        return this.dataChannel;
    }

    public final void animateHide$live_widget_release(int i) {
        this.layeredElementManager.animateHide(i);
    }

    public final void animateShow$live_widget_release(int i) {
        this.layeredElementManager.animateShow(i);
    }

    public final void cancelHideAnimation$live_widget_release(int i) {
        this.layeredElementManager.cancelHideAnimation(i);
    }

    public final void cancelShowAnimation$live_widget_release(int i) {
        this.layeredElementManager.cancelShowAnimation(i);
    }

    public final void downElement(int i) {
        this.layeredElementManager.downElement(i);
    }

    public final ConstraintProperty getConstraintPropertyById(int i) {
        return this.layeredElementManager.getConstraintPropertyById(i);
    }

    public final void notifyHideAnimationEnd$live_widget_release(int i) {
        this.layeredElementManager.notifyHideAnimationEnd(i);
    }

    public final void notifyHideAnimationStart$live_widget_release(int i) {
        this.layeredElementManager.notifyHideAnimationStart(i);
    }

    public final void notifyShowAnimationEnd$live_widget_release(int i) {
        this.layeredElementManager.notifyShowAnimationEnd(i);
    }

    public final void notifyShowAnimationStart$live_widget_release(int i) {
        this.layeredElementManager.notifyShowAnimationStart(i);
    }

    public final void upElement(int i) {
        this.layeredElementManager.upElement(i);
    }

    public LayeredElementContext(Context context, ViewGroup container, DataChannel dataChannel, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
        this.context = context;
        this.container = container;
        this.dataChannel = dataChannel;
        this.layeredElementManager = layeredElementManager;
        this.animationDuration = LayeredElementConfiguration.INSTANCE.getAnimationDuration();
    }
}
