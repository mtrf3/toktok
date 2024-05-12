package com.bytedance.ies.sdk.widgets;

import X.C30085BrN;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveWidgetNonOpProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetNonOpProvider sInstance;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetNonOpProvider getInstance() {
            if (LiveWidgetNonOpProvider.sInstance == null) {
                synchronized (LiveWidgetNonOpProvider.class) {
                    if (LiveWidgetNonOpProvider.sInstance == null) {
                        LiveWidgetNonOpProvider.sInstance = new LiveWidgetNonOpProvider();
                    }
                }
            }
            LiveWidgetNonOpProvider liveWidgetNonOpProvider = LiveWidgetNonOpProvider.sInstance;
            o.LJI(liveWidgetNonOpProvider);
            return liveWidgetNonOpProvider;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LiveWidgetNonOpProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final LiveWidgetNonOpProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clear(LiveWidgetPriorityProvider.Priority priority) {
        C30085BrN.LIZ(this, priority);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> widget) {
        o.LJIIIZ(widget, "widget");
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ boolean isPriority(Class cls) {
        return C30085BrN.LIZLLL(this, cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget widget) {
        o.LJIIIZ(widget, "widget");
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
    }

    public LiveWidgetNonOpProvider() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        try {
            T newInstance = clazz.newInstance();
            o.LJI(newInstance);
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }
}
