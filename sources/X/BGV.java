package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverSelectDialog;
import com.bytedance.android.widget.Widget;

/* loaded from: classes6.dex */
public final class BGV implements InterfaceC31781Cdd {
    public final /* synthetic */ PreviewCoverSelectDialog LIZ;

    @Override // X.InterfaceC31781Cdd
    public final void loadWidget(int i, Widget widget, boolean z) {
    }

    @Override // X.InterfaceC31781Cdd
    public final void loadWidget(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onHide(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onPostCreate(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onPostDestroy(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onPreCreate(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onPreDestroy(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void onShow(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final /* synthetic */ void removeAllMessages(Object obj) {
    }

    @Override // X.InterfaceC31781Cdd
    public final void unloadWidget(Widget widget) {
    }

    @Override // X.InterfaceC31781Cdd
    public final Fragment getFragment() {
        return this.LIZ;
    }

    @Override // X.InterfaceC31781Cdd
    public final LifecycleOwner getRootLifeCycleOwner() {
        return this.LIZ;
    }

    public BGV(PreviewCoverSelectDialog previewCoverSelectDialog) {
        this.LIZ = previewCoverSelectDialog;
    }
}
