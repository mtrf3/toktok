package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;

/* loaded from: classes6.dex */
public interface IWidgetProvider {
    void clear(LiveWidgetPriorityProvider.Priority priority);

    void clearAll();

    void clearWidgetCache(Class<? extends IRecyclableWidget> cls);

    boolean hasMarked(Class<IRecyclableWidget> cls);

    boolean isEnablePriority();

    boolean isPriority(Class<? extends LiveRecyclableWidget> cls);

    <T extends IRecyclableWidget> T provide(Class<T> cls);

    <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls);

    void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget);

    void resetWidgetsViewContext(Context context);
}
