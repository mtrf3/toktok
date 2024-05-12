package com.bytedance.ies.sdk.widgets;

import X.ActivityC45651qj;
import X.C08Z;
import X.C16880lQ;
import X.C39557Ffl;
import X.C5H3;
import X.InterfaceC31781Cdd;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.X1D;
import X.XJ8;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WidgetViewModelLazyKt {
    public static final Fragment fragmentFinder(LifecycleOwner current) {
        InterfaceC31781Cdd interfaceC31781Cdd;
        o.LJIIIZ(current, "current");
        if (current instanceof Fragment) {
            return (Fragment) current;
        }
        if ((current instanceof ActivityC45651qj) || !(current instanceof com.bytedance.android.widget.Widget) || (interfaceC31781Cdd = ((com.bytedance.android.widget.Widget) current).widgetCallback) == null) {
            return null;
        }
        return interfaceC31781Cdd.getFragment();
    }

    public static final ViewModelProvider.Factory getDefaultViewModelProviderFactory(LiveRecyclableWidget liveRecyclableWidget) {
        o.LJIIIZ(liveRecyclableWidget, "<this>");
        return new ViewModelProvider.NewInstanceFactory();
    }

    public static final InterfaceC65784Pro<ViewModelProvider.Factory> getDefaultViewModelProviderFactoryProducer(LiveRecyclableWidget liveRecyclableWidget) {
        o.LJIIIZ(liveRecyclableWidget, "<this>");
        return new AqS165S0100000_15(liveRecyclableWidget, 43);
    }

    public static final <VM extends LiveWidgetViewModel, T extends LiveRecyclableWidget> C5H3<VM> provideViewModelDelegate(final T t, final InterfaceC65350Pko<VM> viewModelClass, final XJ8 xj8, final InterfaceC65784Pro<String> keyFactory, final InterfaceC65784Pro<? extends ViewModelProvider.Factory> interfaceC65784Pro, final boolean z) {
        o.LJIIIZ(t, "<this>");
        o.LJIIIZ(viewModelClass, "viewModelClass");
        o.LJIIIZ(keyFactory, "keyFactory");
        return (C5H3<VM>) new C5H3<VM>() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1
            public LiveWidgetViewModel cached;

            /* loaded from: classes16.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[XJ8.values().length];
                    try {
                        iArr[XJ8.ACTIVITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[XJ8.FRAGMENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[XJ8.WIDGET.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            @Override // X.C5H3
            public LiveWidgetViewModel getValue() {
                LiveWidgetViewModel liveWidgetViewModel = this.cached;
                if (liveWidgetViewModel != null) {
                    return liveWidgetViewModel;
                }
                return newViewModel();
            }

            @Override // X.C5H3
            public boolean isInitialized() {
                if (this.cached != null) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TVM; */
            public final LiveWidgetViewModel newViewModel() {
                int i;
                final ViewModelStore viewModelStore;
                ViewModelProvider.Factory newInstanceFactory;
                LiveWidgetViewModel liveWidgetViewModel;
                ViewModelProvider.Factory newInstanceFactory2;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                final ViewModelStore viewModelStore2;
                ViewModelProvider.Factory defaultViewModelProviderFactory2;
                XJ8 xj82 = XJ8.this;
                if (xj82 == null) {
                    i = -1;
                } else {
                    i = WhenMappings.$EnumSwitchMapping$0[xj82.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Don't support this VMScope: ");
                                LIZ.append(XJ8.this);
                                LIZ.append(" there");
                                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                            }
                        } else {
                            InterfaceC31781Cdd interfaceC31781Cdd = t.widgetCallback;
                            if (interfaceC31781Cdd == null) {
                                return null;
                            }
                            Fragment fragment = interfaceC31781Cdd.getFragment();
                            if (fragment != null) {
                                try {
                                    viewModelStore2 = fragment.getViewModelStore();
                                } catch (IllegalStateException unused) {
                                    viewModelStore2 = new ViewModelStore();
                                    FragmentManager fragmentManager = fragment.getFragmentManager();
                                    if (fragmentManager != null) {
                                        fragmentManager.LJJLIL(new C08Z() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1$newViewModel$store$1
                                            @Override // X.C08Z
                                            public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                                                o.LJIIIZ(fm, "fm");
                                                o.LJIIIZ(f, "f");
                                                super.onFragmentDestroyed(fm, f);
                                                ViewModelStore.this.clear();
                                            }
                                        }, false);
                                    }
                                }
                                o.LJIIIIZZ(viewModelStore2, "try {\n                  …ore\n                    }");
                                InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro2 = interfaceC65784Pro;
                                if (interfaceC65784Pro2 == null || (defaultViewModelProviderFactory2 = interfaceC65784Pro2.invoke()) == null) {
                                    defaultViewModelProviderFactory2 = WidgetViewModelLazyKt.getDefaultViewModelProviderFactory(t);
                                }
                                LiveWidgetViewModel liveWidgetViewModel2 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore2, defaultViewModelProviderFactory2, null, 4, null).get(keyFactory.invoke(), C39557Ffl.LIZ(viewModelClass));
                                liveWidgetViewModel2.setDataChannel(t.dataChannel);
                                return liveWidgetViewModel2;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        Context context = t.context;
                        if (context == null) {
                            return null;
                        }
                        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        ViewModelStore viewModelStore3 = ((ComponentActivity) context).getViewModelStore();
                        o.LJIIIIZZ(viewModelStore3, "requireNotNull(context a…tActivity).viewModelStore");
                        InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro3 = interfaceC65784Pro;
                        if (interfaceC65784Pro3 == null || (defaultViewModelProviderFactory = interfaceC65784Pro3.invoke()) == null) {
                            defaultViewModelProviderFactory = WidgetViewModelLazyKt.getDefaultViewModelProviderFactory(t);
                        }
                        LiveWidgetViewModel liveWidgetViewModel3 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore3, defaultViewModelProviderFactory, null, 4, null).get(keyFactory.invoke(), C39557Ffl.LIZ(viewModelClass));
                        liveWidgetViewModel3.setDataChannel(t.dataChannel);
                        return liveWidgetViewModel3;
                    }
                }
                InterfaceC31781Cdd interfaceC31781Cdd2 = t.widgetCallback;
                if (interfaceC31781Cdd2 == null) {
                    return null;
                }
                Fragment fragment2 = interfaceC31781Cdd2.getFragment();
                if (fragment2 != null) {
                    try {
                        viewModelStore = fragment2.getViewModelStore();
                    } catch (IllegalStateException unused2) {
                        viewModelStore = new ViewModelStore();
                        FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                        if (fragmentManager2 != null) {
                            fragmentManager2.LJJLIL(new C08Z() { // from class: com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt$provideViewModelDelegate$1$newViewModel$store$2
                                @Override // X.C08Z
                                public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                                    o.LJIIIZ(fm, "fm");
                                    o.LJIIIZ(f, "f");
                                    super.onFragmentDestroyed(fm, f);
                                    ViewModelStore.this.clear();
                                }
                            }, false);
                        }
                    }
                    o.LJIIIIZZ(viewModelStore, "try {\n                  …ore\n                    }");
                    if (z) {
                        C16880lQ.LLJJJJ().getThread();
                        C16880lQ.LLLLIIIILLL();
                        InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro4 = interfaceC65784Pro;
                        if (interfaceC65784Pro4 == null || (newInstanceFactory2 = interfaceC65784Pro4.invoke()) == null) {
                            newInstanceFactory2 = new ViewModelProvider.NewInstanceFactory();
                        }
                        LiveWidgetViewModel liveWidgetViewModel4 = (LiveWidgetViewModel) new ViewModelProvider(viewModelStore, newInstanceFactory2, null, 4, null).get("widget_" + viewModelClass.LJFF() + '_' + t.widgetCallback.getRootLifeCycleOwner().hashCode(), C39557Ffl.LIZ(viewModelClass));
                        liveWidgetViewModel4.setDataChannel(t.dataChannel);
                        return liveWidgetViewModel4;
                    }
                    InterfaceC65784Pro<ViewModelProvider.Factory> interfaceC65784Pro5 = interfaceC65784Pro;
                    InterfaceC65350Pko<VM> interfaceC65350Pko = viewModelClass;
                    LiveRecyclableWidget liveRecyclableWidget = t;
                    synchronized (viewModelStore) {
                        if (interfaceC65784Pro5 == null || (newInstanceFactory = interfaceC65784Pro5.invoke()) == null) {
                            newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
                        }
                        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, newInstanceFactory, null, 4, null);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("widget_");
                        LIZ2.append(interfaceC65350Pko.LJFF());
                        LIZ2.append('_');
                        LIZ2.append(liveRecyclableWidget.widgetCallback.getRootLifeCycleOwner().hashCode());
                        liveWidgetViewModel = (LiveWidgetViewModel) viewModelProvider.get(X1D.LIZIZ(LIZ2), C39557Ffl.LIZ(interfaceC65350Pko));
                        liveWidgetViewModel.setDataChannel(liveRecyclableWidget.dataChannel);
                    }
                    return liveWidgetViewModel;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }

    public static final /* synthetic */ <VM extends LiveWidgetViewModel, T extends LiveRecyclableWidget> C5H3<VM> widgetViewModel(T t, InterfaceC65350Pko<VM> viewModelClass, XJ8 xj8, InterfaceC65784Pro<String> keyFactory, InterfaceC65784Pro<? extends ViewModelProvider.Factory> interfaceC65784Pro, boolean z) {
        o.LJIIIZ(t, "<this>");
        o.LJIIIZ(viewModelClass, "viewModelClass");
        o.LJIIIZ(keyFactory, "keyFactory");
        if (xj8 == null) {
            xj8 = XJ8.WIDGET;
        }
        if (interfaceC65784Pro == null) {
            interfaceC65784Pro = getDefaultViewModelProviderFactoryProducer(t);
        }
        return provideViewModelDelegate(t, viewModelClass, xj8, keyFactory, interfaceC65784Pro, z);
    }

    public static /* synthetic */ C5H3 provideViewModelDelegate$default(LiveRecyclableWidget liveRecyclableWidget, InterfaceC65350Pko interfaceC65350Pko, XJ8 xj8, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z, int i, Object obj) {
        XJ8 xj82 = xj8;
        boolean z2 = z;
        InterfaceC65784Pro interfaceC65784Pro3 = null;
        if ((i & 2) != 0) {
            xj82 = null;
        }
        if ((i & 8) == 0) {
            interfaceC65784Pro3 = interfaceC65784Pro2;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return provideViewModelDelegate(liveRecyclableWidget, interfaceC65350Pko, xj82, interfaceC65784Pro, interfaceC65784Pro3, z2);
    }

    public static C5H3 widgetViewModel$default(LiveRecyclableWidget liveRecyclableWidget, InterfaceC65350Pko viewModelClass, XJ8 xj8, InterfaceC65784Pro keyFactory, InterfaceC65784Pro interfaceC65784Pro, boolean z, int i, Object obj) {
        if ((i & 1) == 0) {
            if ((i & 2) != 0) {
                xj8 = null;
            }
            if ((i & 4) != 0) {
                keyFactory = new AqS160S0100000_10(viewModelClass, 42);
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro = null;
            }
            if ((i & 16) != 0) {
                z = WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync();
            }
            o.LJIIIZ(liveRecyclableWidget, "<this>");
            o.LJIIIZ(viewModelClass, "viewModelClass");
            o.LJIIIZ(keyFactory, "keyFactory");
            if (xj8 == null) {
                xj8 = XJ8.WIDGET;
            }
            if (interfaceC65784Pro == null) {
                interfaceC65784Pro = getDefaultViewModelProviderFactoryProducer(liveRecyclableWidget);
            }
            return provideViewModelDelegate(liveRecyclableWidget, viewModelClass, xj8, keyFactory, interfaceC65784Pro, z);
        }
        o.LJIJ();
        throw null;
    }
}
