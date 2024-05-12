package com.bytedance.ies.sdk.widgets;

import X.C31782Cde;
import X.C44384HbQ;
import X.C51029K0z;
import X.C73318Sq2;
import X.InterfaceC31781Cdd;
import X.InterfaceC31795Cdr;
import X.XJ8;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public abstract class LiveWidget extends com.bytedance.android.widget.Widget implements ILayeredWidget {
    public C73318Sq2 compositeDisposable;
    public boolean contentViewAttached;
    public DataChannel dataChannel;
    public LayeredElementContext layeredElementContext;
    public C31782Cde lifecycleTransformer;
    public RecyclableWidgetManager subWidgetManager;

    public void enableSubWidgetManager() {
        enableSubWidgetManager(false);
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public void hide() {
        LayeredElementContext layeredElementContext = this.layeredElementContext;
        if (layeredElementContext == null || layeredElementContext.getConstraintPropertyById(getId()) == null) {
            super.hide();
            return;
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(getId());
        if (constraintPropertyById == null || constraintPropertyById.visibility() != 0) {
            return;
        }
        constraintPropertyById.visibility(8);
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd == null) {
            return;
        }
        interfaceC31781Cdd.onHide(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onCreate() {
        C73318Sq2 c73318Sq2 = this.compositeDisposable;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        C73318Sq2 c73318Sq22 = new C73318Sq2();
        this.compositeDisposable = c73318Sq22;
        this.lifecycleTransformer = new C31782Cde(c73318Sq22);
        super.onCreate();
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            if (C44384HbQ.LJJJJ(interfaceC31781Cdd.getRootLifeCycleOwner()) == XJ8.WIDGET && this.widgetCallback.getFragment() != null && this.widgetCallback.getRootLifeCycleOwner() != null) {
                this.dataChannel = new CellDataChannelProvider(this.widgetCallback.getRootLifeCycleOwner().hashCode(), this.widgetCallback.getFragment()).getValue();
            } else {
                this.dataChannel = C51029K0z.LJIILIIL(this.widgetCallback.getFragment());
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        if (this instanceof IUnLoadWidget) {
            return;
        }
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.unloadWidget(this);
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            recyclableWidgetManager.detachWidget();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void show() {
        LayeredElementContext layeredElementContext = this.layeredElementContext;
        if (layeredElementContext == null || layeredElementContext.getConstraintPropertyById(getId()) == null) {
            super.show();
            return;
        }
        ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(getId());
        if (constraintPropertyById == null || constraintPropertyById.visibility() != 8) {
            return;
        }
        constraintPropertyById.visibility(0);
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd == null) {
            return;
        }
        interfaceC31781Cdd.onShow(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDestroy() {
        Fragment fragment;
        super.onDestroy();
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.removeAllMessages(this);
        }
        onDetachWidget();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.getClass();
            dataChannel.jv0(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        this.compositeDisposable.dispose();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && (fragment = recyclableWidgetManager.parentFragment) != null) {
            fragment.getLifecycle().removeObserver(this.subWidgetManager);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
        if (recyclableWidgetManager2 != null && (interfaceC31781Cdd instanceof LiveRecyclableWidget.RecyclableWidgetCallback)) {
            ((LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd).onDestroySubWidgetManager(recyclableWidgetManager2, this);
        }
        this.subWidgetManager = null;
    }

    public final <T> C31782Cde<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayeredWidget
    public boolean getContentViewAttached() {
        return this.contentViewAttached;
    }

    public Context getContext() {
        return this.context;
    }

    public LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    public DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    public void enableSubWidgetManager(boolean z) {
        enableSubWidgetManager(null, null, LiveWidgetNonOpProvider.getInstance(), z);
    }

    public final <T extends View> T findViewById(int i) {
        return (T) getView().findViewById(i);
    }

    @Override // com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            recyclableWidgetManager.onCustomInfoCallBack(t.getClass(), t);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayeredWidget
    public void setContentViewAttached(boolean z) {
        this.contentViewAttached = z;
    }

    public void setLayeredElementContext(LayeredElementContext layeredElementContext) {
        this.layeredElementContext = layeredElementContext;
    }

    @Override // com.bytedance.android.widget.Widget
    public void setWidgetCallback(InterfaceC31781Cdd interfaceC31781Cdd) {
        super.setWidgetCallback(interfaceC31781Cdd);
        if (interfaceC31781Cdd != null) {
            if (C44384HbQ.LJJJJ(interfaceC31781Cdd.getRootLifeCycleOwner()) == XJ8.WIDGET && interfaceC31781Cdd.getFragment() != null && interfaceC31781Cdd.getRootLifeCycleOwner() != null) {
                this.dataChannel = new CellDataChannelProvider(interfaceC31781Cdd.getRootLifeCycleOwner().hashCode(), interfaceC31781Cdd.getFragment()).getValue();
            } else {
                this.dataChannel = C51029K0z.LJIILIIL(interfaceC31781Cdd.getFragment());
            }
        }
    }

    public void enableSubWidgetManager(InterfaceC31795Cdr interfaceC31795Cdr, FluencyOpt fluencyOpt, IWidgetProvider iWidgetProvider) {
        enableSubWidgetManager(interfaceC31795Cdr, fluencyOpt, iWidgetProvider, false);
    }

    public void enableSubWidgetManager(InterfaceC31795Cdr interfaceC31795Cdr, FluencyOpt fluencyOpt, IWidgetProvider iWidgetProvider, boolean z) {
        InterfaceC31781Cdd interfaceC31781Cdd;
        if (this.subWidgetManager == null && (interfaceC31781Cdd = this.widgetCallback) != null) {
            if (C44384HbQ.LJJJJ(interfaceC31781Cdd.getRootLifeCycleOwner()) == XJ8.WIDGET) {
                this.subWidgetManager = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), this.widgetCallback.getRootLifeCycleOwner(), getView(), iWidgetProvider, fluencyOpt, z);
            } else {
                this.subWidgetManager = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), getView(), iWidgetProvider, fluencyOpt, z);
            }
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            recyclableWidgetManager.mWidgetCreateTimeListener = interfaceC31795Cdr;
            recyclableWidgetManager.isSubWidgetManager = true;
            InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
            if (interfaceC31781Cdd2 instanceof LiveRecyclableWidget.RecyclableWidgetCallback) {
                ((LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd2).onSubWidgetManagerCreated(recyclableWidgetManager, this);
            }
        }
    }
}
