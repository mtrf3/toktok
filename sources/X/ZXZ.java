package X;

import android.media.MediaRouter2;

/* loaded from: classes29.dex */
public class ZXZ extends MediaRouter2.ControllerCallback {
    public final /* synthetic */ C90597Zh3 LIZ;

    public ZXZ(C90597Zh3 c90597Zh3) {
        this.LIZ = c90597Zh3;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.LIZ.LJIJI(routingController);
    }
}
