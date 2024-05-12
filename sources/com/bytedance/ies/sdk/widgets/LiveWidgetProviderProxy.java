package com.bytedance.ies.sdk.widgets;

import X.C30085BrN;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableRecycleWidgetV4;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveWidgetProviderProxy implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile IWidgetProvider sInstance;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final IWidgetProvider getInstance() {
            IWidgetProvider companion;
            if (LiveWidgetProviderProxy.sInstance == null) {
                synchronized (LiveWidgetProviderProxy.class) {
                    if (LiveWidgetProviderProxy.sInstance == null) {
                        if (LiveEnableRecycleWidgetV4.INSTANCE.isEnable()) {
                            companion = LiveWidgetPriorityProvider.Companion.getInstance();
                        } else {
                            companion = LiveWidgetProvider.Companion.getInstance();
                        }
                        LiveWidgetProviderProxy.sInstance = companion;
                    }
                }
            }
            IWidgetProvider iWidgetProvider = LiveWidgetProviderProxy.sInstance;
            if (iWidgetProvider != null) {
                return iWidgetProvider;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }

        public Companion() {
        }
    }

    public static final IWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clear(LiveWidgetPriorityProvider.Priority priority) {
        C30085BrN.LIZ(this, priority);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        Companion.getInstance().clearAll();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return Companion.getInstance().isEnablePriority();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        Companion.getInstance().clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> widget) {
        o.LJIIIZ(widget, "widget");
        return Companion.getInstance().hasMarked(widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
        return Companion.getInstance().isPriority(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        return (T) Companion.getInstance().provide(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        return (T) Companion.getInstance().provide(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        Companion.getInstance().recycleRecyclableWidget(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
        Companion.getInstance().resetWidgetsViewContext(context);
    }
}
