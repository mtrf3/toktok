package com.bytedance.ies.sdk.widgets;

import X.C0MB;
import X.C221108m2;
import X.C31808Ce4;
import X.C5H3;
import X.C76800UCe;
import X.EnumC221088m0;
import X.InterfaceC31781Cdd;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LayeredWidgetManager extends RecyclableWidgetManager {
    public static final Companion Companion = new Companion();
    public final C5H3 animatableRecyclableWidgets$delegate;
    public boolean checkContentViewAttached;
    public final LayeredElementManager<? extends LayeredElementContext> layeredElementManager;

    @Override // com.bytedance.android.widget.WidgetManager
    public boolean checkWidgetContainer() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C0MB<IAnimatableWidget> getAnimatableRecyclableWidgets() {
        return (C0MB) this.animatableRecyclableWidgets$delegate.getValue();
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2) {
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(layeredElementManager, "layeredElementManager");
            return of$default(this, z, fragment, view, iWidgetProvider, fluencyOpt, layeredElementManager, z2, false, 0, 384, null);
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2, boolean z3) {
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(layeredElementManager, "layeredElementManager");
            return of$default(this, z, fragment, view, iWidgetProvider, fluencyOpt, layeredElementManager, z2, z3, 0, 256, null);
        }

        public Companion() {
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(layeredElementManager, "layeredElementManager");
            LayeredWidgetManager layeredWidgetManager = new LayeredWidgetManager(iWidgetProvider, layeredElementManager);
            layeredWidgetManager.config(z, null, fragment, view, fragment.getContext(), fluencyOpt);
            return layeredWidgetManager;
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2, boolean z3, int i) {
            Context context;
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(layeredElementManager, "layeredElementManager");
            LayeredWidgetManager layeredWidgetManager = new LayeredWidgetManager(iWidgetProvider, layeredElementManager);
            if (z2) {
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
            } else {
                context = fragment.getContext();
            }
            layeredWidgetManager.config(z, null, fragment, view, context, fluencyOpt, z3, i);
            return layeredWidgetManager;
        }

        public static /* synthetic */ LayeredWidgetManager of$default(Companion companion, boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager layeredElementManager, boolean z2, boolean z3, int i, int i2, Object obj) {
            if ((i2 & 128) != 0) {
                z3 = false;
            }
            if ((i2 & 256) != 0) {
                i = 0;
            }
            return companion.of(z, fragment, view, iWidgetProvider, fluencyOpt, layeredElementManager, z2, z3, i);
        }
    }

    public final boolean getCheckContentViewAttached() {
        return this.checkContentViewAttached;
    }

    public final LayeredElementManager<? extends LayeredElementContext> getLayeredElementManager() {
        return this.layeredElementManager;
    }

    /* loaded from: classes6.dex */
    public final class LayeredWidgetCallback extends LiveRecyclableWidget.RecyclableWidgetCallbackWrapper {
        public final /* synthetic */ LayeredWidgetManager this$0;

        @Override // X.C31780Cdc, X.InterfaceC31781Cdd
        public void onHide(com.bytedance.android.widget.Widget widget) {
            o.LJIIIZ(widget, "widget");
            super.onHide(widget);
            this.this$0.getLayeredElementManager().onWidgetHiddenChanged(widget.getId(), true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostUnload(LiveRecyclableWidget recyclableWidget) {
            IAnimatableWidget iAnimatableWidget;
            o.LJIIIZ(recyclableWidget, "recyclableWidget");
            super.onPostUnload(recyclableWidget);
            if ((recyclableWidget instanceof IAnimatableWidget) && (iAnimatableWidget = (IAnimatableWidget) recyclableWidget) != null) {
                this.this$0.getAnimatableRecyclableWidgets().LJII(iAnimatableWidget.getId());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreLoad(LiveRecyclableWidget recyclableWidget) {
            IAnimatableWidget iAnimatableWidget;
            o.LJIIIZ(recyclableWidget, "recyclableWidget");
            super.onPreLoad(recyclableWidget);
            if ((recyclableWidget instanceof IAnimatableWidget) && (iAnimatableWidget = (IAnimatableWidget) recyclableWidget) != null) {
                this.this$0.getAnimatableRecyclableWidgets().LJI(iAnimatableWidget.getId(), iAnimatableWidget);
            }
        }

        @Override // X.C31780Cdc, X.InterfaceC31781Cdd
        public void onShow(com.bytedance.android.widget.Widget widget) {
            o.LJIIIZ(widget, "widget");
            super.onShow(widget);
            this.this$0.getLayeredElementManager().onWidgetHiddenChanged(widget.getId(), false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayeredWidgetCallback(LayeredWidgetManager layeredWidgetManager, LiveRecyclableWidget.RecyclableWidgetCallback callback) {
            super(callback);
            o.LJIIIZ(callback, "callback");
            this.this$0 = layeredWidgetManager;
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onDetachContentView(LiveRecyclableWidget recyclableWidget, ViewGroup viewGroup, View view) {
            o.LJIIIZ(recyclableWidget, "recyclableWidget");
            if (view != null) {
                LayeredWidgetManager layeredWidgetManager = this.this$0;
                if ((!layeredWidgetManager.getCheckContentViewAttached() || recyclableWidget.getContentViewAttached()) && !layeredWidgetManager.getLayeredElementManager().detachView(view.getId())) {
                    super.onDetachContentView(recyclableWidget, viewGroup, view);
                }
                recyclableWidget.setContentViewAttached(false);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            super.onDetachContentView(recyclableWidget, viewGroup, view);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public View onProvideContainer(int i) {
        View findViewById = this.contentView.findViewById(i);
        if (findViewById instanceof C31808Ce4) {
            View view = this.contentView;
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            return view;
        }
        if (findViewById == null) {
            findViewById = this.contentView;
        }
        o.LJIIIIZZ(findViewById, "{\n            view ?: contentView\n        }");
        return findViewById;
    }

    public final void setCheckContentViewAttached(boolean z) {
        this.checkContentViewAttached = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayeredWidgetManager(IWidgetProvider iWidgetProvider, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
        super(iWidgetProvider);
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
        this.layeredElementManager = layeredElementManager;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        o.LJII(interfaceC31781Cdd, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback");
        this.widgetCallback = new LayeredWidgetCallback(this, (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd);
        layeredElementManager.setAnimationListener(new AnimationListener() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManager.1
            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onHideAnimationEnd(int i) {
                IAnimatableWidget LJ = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJ(i, null);
                if (LJ != null) {
                    LJ.onHideAnimationEnd();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onHideAnimationStart(int i) {
                IAnimatableWidget LJ = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJ(i, null);
                if (LJ != null) {
                    LJ.onHideAnimationStart();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onShowAnimationEnd(int i) {
                IAnimatableWidget LJ = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJ(i, null);
                if (LJ != null) {
                    LJ.onShowAnimationEnd();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onShowAnimationStart(int i) {
                IAnimatableWidget LJ = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJ(i, null);
                if (LJ != null) {
                    LJ.onShowAnimationStart();
                }
            }
        });
        this.animatableRecyclableWidgets$delegate = C221108m2.LIZ(EnumC221088m0.NONE, LayeredWidgetManager$animatableRecyclableWidgets$2.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.WidgetManager
    public void onAttachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        ILayeredWidget iLayeredWidget;
        if (viewGroup == null || view == null || widget == 0) {
            return;
        }
        if ((widget instanceof ILayeredWidget) && (iLayeredWidget = (ILayeredWidget) widget) != null) {
            iLayeredWidget.setLayeredElementContext(this.layeredElementManager.getLayeredElementContext());
            iLayeredWidget.setContentViewAttached(true);
        }
        if (this.contentView.findViewById(widget.getId()) instanceof C31808Ce4) {
            view.setId(widget.getId());
            this.layeredElementManager.attachView(widget.getId(), view);
        } else {
            viewGroup.addView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r4.getContentViewAttached() == true) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.WidgetManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetachContentView(com.bytedance.android.widget.Widget r4, android.view.ViewGroup r5, android.view.View r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            if (r6 != 0) goto L6
            return
        L6:
            if (r4 != 0) goto L9
            return
        L9:
            boolean r1 = r4 instanceof com.bytedance.ies.sdk.widgets.ILayeredWidget
            r0 = 0
            if (r1 == 0) goto L3a
            com.bytedance.ies.sdk.widgets.ILayeredWidget r4 = (com.bytedance.ies.sdk.widgets.ILayeredWidget) r4
            if (r4 != 0) goto L36
        L12:
            boolean r0 = r3.checkContentViewAttached
            r2 = 0
            if (r0 == 0) goto L20
            if (r4 == 0) goto L31
            boolean r1 = r4.getContentViewAttached()
            r0 = 1
            if (r1 != r0) goto L32
        L20:
            com.bytedance.ies.sdk.widgets.LayeredElementManager<? extends com.bytedance.ies.sdk.widgets.LayeredElementContext> r1 = r3.layeredElementManager
            int r0 = r6.getId()
            boolean r0 = r1.detachView(r0)
            if (r0 != 0) goto L2f
            X.C16880lQ.LJLLL(r6, r5)
        L2f:
            if (r4 != 0) goto L32
        L31:
            return
        L32:
            r4.setContentViewAttached(r2)
            goto L31
        L36:
            r4.setLayeredElementContext(r0)
            goto L12
        L3a:
            r4 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.LayeredWidgetManager.onDetachContentView(com.bytedance.android.widget.Widget, android.view.ViewGroup, android.view.View):void");
    }
}
