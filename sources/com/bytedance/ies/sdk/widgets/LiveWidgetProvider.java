package com.bytedance.ies.sdk.widgets;

import X.C06540Nm;
import X.C30085BrN;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveWidgetProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetProvider sInstance;
    public boolean isDestoryReInit;
    public boolean isEnablePriorityPreload;
    public boolean isRecycleWidgetContentView;
    public boolean isValid;
    public final RecycledLiveWidgetPool mRecycledViewPool;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetProvider getInstance() {
            if (LiveWidgetProvider.sInstance == null) {
                synchronized (LiveWidgetProvider.class) {
                    if (LiveWidgetProvider.sInstance == null) {
                        LiveWidgetProvider.sInstance = new LiveWidgetProvider();
                    }
                }
            }
            LiveWidgetProvider liveWidgetProvider = LiveWidgetProvider.sInstance;
            o.LJI(liveWidgetProvider);
            return liveWidgetProvider;
        }

        public Companion() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion();
        public static final int DEFAULT_MAX_SCRAP = 3;
        public final HashMap<Class<? super IRecyclableWidget>, ScrapData> mScrap = new HashMap<>();

        /* loaded from: classes6.dex */
        public static final class ScrapData {
            public final int mMaxScrap;
            public final ArrayList<IRecyclableWidget> mScrapHeap;

            public ScrapData() {
                int i = RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP;
                this.mScrapHeap = new ArrayList<>(i);
                this.mMaxScrap = i;
            }

            public final int getMMaxScrap() {
                return this.mMaxScrap;
            }

            public final ArrayList<IRecyclableWidget> getMScrapHeap() {
                return this.mScrapHeap;
            }
        }

        public final void clear() {
            Iterator LJ = C06540Nm.LJ(this.mScrap, "mScrap.values");
            while (LJ.hasNext()) {
                ((ScrapData) LJ.next()).getMScrapHeap().clear();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getMScrapHeap().clear();
            }
        }

        public final IRecyclableWidget getRecycledView(Class<? super IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            ScrapData scrapData = this.mScrap.get(viewType);
            if (scrapData != null && (!scrapData.getMScrapHeap().isEmpty())) {
                return (IRecyclableWidget) ListProtector.remove(scrapData.getMScrapHeap(), r1.size() - 1);
            }
            return null;
        }

        public final int getRecycledViewCount(Class<? super IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            return getScrapDataForType(viewType).getMScrapHeap().size();
        }

        public final ScrapData getScrapDataForType(Class<? super IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            ScrapData scrapData = this.mScrap.get(viewType);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                this.mScrap.put(viewType, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget scrap) {
            o.LJIIIZ(scrap, "scrap");
            Class<?> cls = scrap.getClass();
            ArrayList<IRecyclableWidget> mScrapHeap = getScrapDataForType(cls).getMScrapHeap();
            ScrapData scrapData = this.mScrap.get(cls);
            o.LJI(scrapData);
            if (scrapData.getMMaxScrap() <= mScrapHeap.size()) {
                return;
            }
            scrap.resetInternal();
            mScrapHeap.add(scrap);
        }
    }

    public /* synthetic */ LiveWidgetProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final LiveWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clear(LiveWidgetPriorityProvider.Priority priority) {
        C30085BrN.LIZ(this, priority);
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
    public void resetWidgetsViewContext(Context context) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        this.mRecycledViewPool.clear();
    }

    public LiveWidgetProvider() {
        this.mRecycledViewPool = new RecycledLiveWidgetPool();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (cls == null) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> widget) {
        o.LJIIIZ(widget, "widget");
        if (this.mRecycledViewPool.getRecycledViewCount(widget) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        o.LJII(cls, "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.sdk.widgets.IRecyclableWidget>");
        T t = (T) recycledLiveWidgetPool.getRecycledView(cls);
        if (t == null) {
            try {
                T newInstance = cls.newInstance();
                o.LJI(newInstance);
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        o.LJII(cls, "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.sdk.widgets.IRecyclableWidget>");
        T t = (T) recycledLiveWidgetPool.getRecycledView(cls);
        if (t instanceof IRecyclableWidget) {
            return t;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget widget) {
        o.LJIIIZ(widget, "widget");
        this.mRecycledViewPool.putRecycledView(widget);
    }
}
