package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;

/* renamed from: X.Cdd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31781Cdd {
    Fragment getFragment();

    LifecycleOwner getRootLifeCycleOwner();

    void loadWidget(int i, Widget widget, boolean z);

    void loadWidget(Widget widget);

    void onHide(Widget widget);

    void onPostCreate(Widget widget);

    void onPostDestroy(Widget widget);

    void onPreCreate(Widget widget);

    void onPreDestroy(Widget widget);

    void onShow(Widget widget);

    void removeAllMessages(Object obj);

    void unloadWidget(Widget widget);
}
