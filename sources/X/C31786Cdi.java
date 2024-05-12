package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;

/* renamed from: X.Cdi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31786Cdi implements InterfaceC31781Cdd {
    public final /* synthetic */ WidgetManager LIZ;

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void removeAllMessages(Object obj) {
    }

    @Override // X.InterfaceC31781Cdd
    public final Fragment getFragment() {
        return this.LIZ.parentFragment;
    }

    @Override // X.InterfaceC31781Cdd
    public final LifecycleOwner getRootLifeCycleOwner() {
        WidgetManager widgetManager = this.LIZ;
        LifecycleOwner lifecycleOwner = widgetManager.rootLifeCycleOwner;
        if (lifecycleOwner == null) {
            return widgetManager.parentFragment;
        }
        return lifecycleOwner;
    }

    public C31786Cdi(WidgetManager widgetManager) {
        this.LIZ = widgetManager;
    }

    @Override // X.InterfaceC31781Cdd
    public final void loadWidget(Widget widget) {
        this.LIZ.load(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onHide(Widget widget) {
        this.LIZ.notifyHide(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onPostCreate(Widget widget) {
        this.LIZ.notifyOnPostCreate(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onPostDestroy(Widget widget) {
        this.LIZ.notifyOnPostDestroy(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onPreCreate(Widget widget) {
        this.LIZ.notifyOnPreCreate(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onPreDestroy(Widget widget) {
        this.LIZ.notifyOnPreDestroy(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void onShow(Widget widget) {
        this.LIZ.notifyShow(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void unloadWidget(Widget widget) {
        this.LIZ.unload(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public final void loadWidget(int i, Widget widget, boolean z) {
        this.LIZ.load(i, widget, z);
    }
}
