package com.bytedance.ies.sdk.widgets;

import X.InterfaceC31781Cdd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes6.dex */
public abstract class LayeredLiveWidget extends LiveWidget {
    public LayeredElementContext layeredElementContext;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void hide() {
        ConstraintProperty constraintPropertyById;
        LayeredElementContext layeredElementContext = this.layeredElementContext;
        if (layeredElementContext == null || (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) == null) {
            super.hide();
            return;
        }
        if (constraintPropertyById.visibility() == 0) {
            constraintPropertyById.visibility(8);
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null) {
                interfaceC31781Cdd.onHide(this);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        ConstraintProperty constraintPropertyById;
        LayeredElementContext layeredElementContext = this.layeredElementContext;
        if (layeredElementContext == null || (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) == null) {
            super.show();
            return;
        }
        if (constraintPropertyById.visibility() == 8) {
            constraintPropertyById.visibility(0);
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null) {
                interfaceC31781Cdd.onShow(this);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.ILayeredWidget
    public LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.ILayeredWidget
    public void setLayeredElementContext(LayeredElementContext layeredElementContext) {
        this.layeredElementContext = layeredElementContext;
    }
}
