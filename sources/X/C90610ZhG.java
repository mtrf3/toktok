package X;

import android.media.MediaRouter;

/* renamed from: X.ZhG, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90610ZhG extends AbstractC90096ZXo {
    public final Object LIZ;

    public C90610ZhG(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.AbstractC90096ZXo
    public final void LJI(int i) {
        ((MediaRouter.RouteInfo) this.LIZ).requestSetVolume(i);
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIZ(int i) {
        ((MediaRouter.RouteInfo) this.LIZ).requestUpdateVolume(i);
    }
}
