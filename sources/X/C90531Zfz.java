package X;

import X.InterfaceC90530Zfy;
import android.media.MediaRouter;

/* renamed from: X.Zfz, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90531Zfz<T extends InterfaceC90530Zfy> extends MediaRouter.VolumeCallback {
    public final T LIZ;

    public C90531Zfz(T t) {
        this.LIZ = t;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.LIZ.LJIIIIZZ(i, routeInfo);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.LIZ.LIZLLL(i, routeInfo);
    }
}
