package X;

import android.view.ViewTreeObserver;

/* renamed from: X.Zqe, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class ViewTreeObserverOnWindowAttachListenerC91192Zqe implements ViewTreeObserver.OnWindowAttachListener {
    public final /* synthetic */ C91197Zqj LIZ;

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        C91408Zu8 c91408Zu8 = this.LIZ.LJIJ;
        if (c91408Zu8 != null) {
            C91215Zr1.LIZIZ(c91408Zu8);
        }
    }

    public ViewTreeObserverOnWindowAttachListenerC91192Zqe(C91197Zqj c91197Zqj) {
        this.LIZ = c91197Zqj;
    }
}
