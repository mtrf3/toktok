package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;

/* renamed from: X.Cdc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31780Cdc implements InterfaceC31781Cdd {
    public final InterfaceC31781Cdd callback;

    @Override // X.InterfaceC31781Cdd
    public Fragment getFragment() {
        return this.callback.getFragment();
    }

    @Override // X.InterfaceC31781Cdd
    public LifecycleOwner getRootLifeCycleOwner() {
        if (this.callback.getRootLifeCycleOwner() == null) {
            return this.callback.getFragment();
        }
        return this.callback.getRootLifeCycleOwner();
    }

    public C31780Cdc(InterfaceC31781Cdd interfaceC31781Cdd) {
        this.callback = interfaceC31781Cdd;
    }

    @Override // X.InterfaceC31781Cdd
    public void loadWidget(Widget widget) {
        this.callback.loadWidget(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onHide(Widget widget) {
        this.callback.onHide(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onPostCreate(Widget widget) {
        this.callback.onPostCreate(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onPostDestroy(Widget widget) {
        this.callback.onPostDestroy(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onPreCreate(Widget widget) {
        this.callback.onPreCreate(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onPreDestroy(Widget widget) {
        this.callback.onPreDestroy(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void onShow(Widget widget) {
        this.callback.onShow(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void removeAllMessages(Object obj) {
        this.callback.removeAllMessages(obj);
    }

    @Override // X.InterfaceC31781Cdd
    public void unloadWidget(Widget widget) {
        this.callback.unloadWidget(widget);
    }

    @Override // X.InterfaceC31781Cdd
    public void loadWidget(int i, Widget widget, boolean z) {
        this.callback.loadWidget(i, widget, z);
    }
}
