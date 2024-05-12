package com.bytedance.ies.sdk.widgets;

import X.C65777Prh;
import X.ORZ;
import X.V0N;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveWidgetPriorityProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetPriorityProvider sInstance;
    public final RecycledLiveWidgetPool recycledViewPool;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetPriorityProvider getInstance() {
            if (LiveWidgetPriorityProvider.sInstance == null) {
                synchronized (LiveWidgetPriorityProvider.class) {
                    if (LiveWidgetPriorityProvider.sInstance == null) {
                        LiveWidgetPriorityProvider.sInstance = new LiveWidgetPriorityProvider();
                    }
                }
            }
            LiveWidgetPriorityProvider liveWidgetPriorityProvider = LiveWidgetPriorityProvider.sInstance;
            o.LJI(liveWidgetPriorityProvider);
            return liveWidgetPriorityProvider;
        }

        public Companion() {
        }
    }

    /* loaded from: classes6.dex */
    public enum Priority {
        P0,
        P1,
        P2;

        public static Priority valueOf(String str) {
            return (Priority) V0N.LJJJ(Priority.class, str);
        }
    }

    /* loaded from: classes6.dex */
    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion();
        public int maxSize = 30;
        public final HashMap<Class<IRecyclableWidget>, Priority> priorityMap = new HashMap<>(64);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP0 = new LinkedHashMap<>(16, 0.75f, true);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP1 = new LinkedHashMap<>(32, 0.75f, true);
        public final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapP2 = new LinkedHashMap<>(64, 0.75f, true);

        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Priority.values().length];
                try {
                    iArr[Priority.P0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Priority.P1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Priority.P2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private final void removeLowPriorityWidget() {
            if (this.scrapP2.size() > 0) {
                LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap = this.scrapP2;
                Set<Class<IRecyclableWidget>> keySet = linkedHashMap.keySet();
                o.LJIIIIZZ(keySet, "scrapP2.keys");
                C65777Prh.LIZJ(linkedHashMap).remove(ORZ.LJLJLLL(keySet, 0));
                return;
            }
            if (this.scrapP1.size() > 0) {
                LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap2 = this.scrapP1;
                Set<Class<IRecyclableWidget>> keySet2 = linkedHashMap2.keySet();
                o.LJIIIIZZ(keySet2, "scrapP1.keys");
                C65777Prh.LIZJ(linkedHashMap2).remove(ORZ.LJLJLLL(keySet2, 0));
                return;
            }
            if (this.scrapP0.size() <= 0) {
                return;
            }
            LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap3 = this.scrapP0;
            Set<Class<IRecyclableWidget>> keySet3 = linkedHashMap3.keySet();
            o.LJIIIIZZ(keySet3, "scrapP0.keys");
            C65777Prh.LIZJ(linkedHashMap3).remove(ORZ.LJLJLLL(keySet3, 0));
        }

        private final int size() {
            return this.scrapP2.size() + this.scrapP1.size() + this.scrapP0.size();
        }

        public final void clearAll() {
            Collection<ScrapData> values = this.scrapP0.values();
            o.LJIIIIZZ(values, "scrapP0.values");
            Iterator<ScrapData> it = values.iterator();
            while (it.hasNext()) {
                it.next().getScrapHeap().clear();
            }
            this.scrapP0.clear();
            Collection<ScrapData> values2 = this.scrapP1.values();
            o.LJIIIIZZ(values2, "scrapP1.values");
            Iterator<ScrapData> it2 = values2.iterator();
            while (it2.hasNext()) {
                it2.next().getScrapHeap().clear();
            }
            this.scrapP1.clear();
            Collection<ScrapData> values3 = this.scrapP2.values();
            o.LJIIIIZZ(values3, "scrapP2.values");
            Iterator<ScrapData> it3 = values3.iterator();
            while (it3.hasNext()) {
                it3.next().getScrapHeap().clear();
            }
            this.scrapP2.clear();
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* loaded from: classes6.dex */
        public static final class ScrapData {
            public final ArrayList<IRecyclableWidget> scrapHeap = new ArrayList<>(3);
            public final int maxScrap = 3;

            public final int getMaxScrap() {
                return this.maxScrap;
            }

            public final ArrayList<IRecyclableWidget> getScrapHeap() {
                return this.scrapHeap;
            }
        }

        private final MutableContextWrapper findMutableContextWrapper(Context context) {
            if (context == null) {
                return null;
            }
            if (context instanceof MutableContextWrapper) {
                return (MutableContextWrapper) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            return findMutableContextWrapper(((ContextWrapper) context).getBaseContext());
        }

        private final ScrapData getScrapDataForType(Class<IRecyclableWidget> cls) {
            LinkedHashMap<Class<IRecyclableWidget>, ScrapData> scrapX = getScrapX(cls);
            ScrapData scrapData = scrapX.get(cls);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                scrapX.put(cls, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        private final LinkedHashMap<Class<IRecyclableWidget>, ScrapData> getScrapX(Class<IRecyclableWidget> cls) {
            Priority priority = this.priorityMap.get(cls);
            if (priority != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return this.scrapP1;
                    }
                } else {
                    return this.scrapP0;
                }
            }
            return this.scrapP2;
        }

        private final boolean isActivityContext(Context context) {
            Context context2;
            if (context == null) {
                return false;
            }
            MutableContextWrapper findMutableContextWrapper = findMutableContextWrapper(context);
            if (findMutableContextWrapper != null) {
                context2 = findMutableContextWrapper.getBaseContext();
            } else {
                context2 = null;
            }
            if (!(context2 instanceof ContextThemeWrapper)) {
                return false;
            }
            return true;
        }

        public final void clear(Priority priority) {
            o.LJIIIZ(priority, "priority");
            int i = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.scrapP2.clear();
                    return;
                }
                this.scrapP1.clear();
                return;
            }
            this.scrapP0.clear();
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getScrapHeap().clear();
            }
        }

        public final IRecyclableWidget getRecycledView(Class<IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            ScrapData scrapDataForType = getScrapDataForType(viewType);
            if (scrapDataForType != null && (!scrapDataForType.getScrapHeap().isEmpty())) {
                return (IRecyclableWidget) ListProtector.remove(scrapDataForType.getScrapHeap(), r1.size() - 1);
            }
            return null;
        }

        public final int getRecycledViewCount(Class<IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            return getScrapDataForType(viewType).getScrapHeap().size();
        }

        public final boolean hasMarked(Class<IRecyclableWidget> viewType) {
            o.LJIIIZ(viewType, "viewType");
            if (getScrapX(viewType).get(viewType) != null) {
                return true;
            }
            return false;
        }

        public final boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
            LinkedHashMap<Class<IRecyclableWidget>, ScrapData> linkedHashMap = this.scrapP0;
            if (cls == null) {
                cls = null;
            }
            return linkedHashMap.containsKey(cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget widget) {
            o.LJIIIZ(widget, "widget");
            if (size() >= this.maxSize) {
                removeLowPriorityWidget();
            }
            ScrapData scrapDataForType = getScrapDataForType(widget.getClass());
            ArrayList<IRecyclableWidget> scrapHeap = scrapDataForType.getScrapHeap();
            if (scrapDataForType.getMaxScrap() <= scrapHeap.size()) {
                return;
            }
            widget.resetInternal();
            scrapHeap.add(widget);
        }

        public final void resetWidgetsViewContext(Context context) {
            Context context2;
            if (context == null) {
                return;
            }
            Collection<ScrapData> values = this.scrapP0.values();
            o.LJIIIIZZ(values, "scrapP0.values");
            Iterator<ScrapData> it = values.iterator();
            while (it.hasNext()) {
                Iterator<IRecyclableWidget> it2 = it.next().getScrapHeap().iterator();
                while (it2.hasNext()) {
                    Object obj = (IRecyclableWidget) it2.next();
                    if (obj instanceof LiveRecyclableWidget) {
                        com.bytedance.android.widget.Widget widget = (com.bytedance.android.widget.Widget) obj;
                        View view = widget.contentView;
                        Context context3 = null;
                        if (view != null) {
                            context2 = view.getContext();
                        } else {
                            context2 = null;
                        }
                        if (isActivityContext(context2)) {
                            View view2 = widget.contentView;
                            if (view2 != null) {
                                context3 = view2.getContext();
                            }
                            MutableContextWrapper findMutableContextWrapper = findMutableContextWrapper(context3);
                            if (findMutableContextWrapper != null) {
                                findMutableContextWrapper.setBaseContext(context);
                            }
                        }
                    }
                }
            }
        }

        public final void initPriorityPool(int i, HashMap<Class<IRecyclableWidget>, Priority> priorityMap) {
            o.LJIIIZ(priorityMap, "priorityMap");
            this.maxSize = i;
            this.priorityMap.putAll(priorityMap);
        }
    }

    public /* synthetic */ LiveWidgetPriorityProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final LiveWidgetPriorityProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        this.recycledViewPool.clearAll();
    }

    public LiveWidgetPriorityProvider() {
        this.recycledViewPool = new RecycledLiveWidgetPool();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clear(Priority priority) {
        o.LJIIIZ(priority, "priority");
        this.recycledViewPool.clear(priority);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.recycledViewPool;
        if (cls == null) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> widget) {
        o.LJIIIZ(widget, "widget");
        return this.recycledViewPool.hasMarked(widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
        return this.recycledViewPool.isPriority(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.recycledViewPool;
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
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.recycledViewPool;
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
        this.recycledViewPool.putRecycledView(widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
        this.recycledViewPool.resetWidgetsViewContext(context);
    }

    public final void initPriorityPool(int i, HashMap<Class<IRecyclableWidget>, Priority> priorityMap) {
        o.LJIIIZ(priorityMap, "priorityMap");
        this.recycledViewPool.initPriorityPool(i, priorityMap);
    }
}
