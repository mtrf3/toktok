package X;

import X.InterfaceC90841Zkz;
import android.media.MediaRouter;

/* renamed from: X.Zl0, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90842Zl0<T extends InterfaceC90841Zkz> extends C90529Zfx<T> {
    public C90842Zl0(T t) {
        super(t);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((InterfaceC90841Zkz) this.LIZ).LIZIZ(routeInfo);
    }
}
