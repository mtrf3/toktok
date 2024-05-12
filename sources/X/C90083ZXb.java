package X;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import java.util.List;

/* renamed from: X.ZXb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90083ZXb extends MediaRouter2.RouteCallback {
    public final /* synthetic */ C90597Zh3 LIZ;

    public C90083ZXb(C90597Zh3 c90597Zh3) {
        this.LIZ = c90597Zh3;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesAdded(List<MediaRoute2Info> list) {
        this.LIZ.LJIJ();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesChanged(List<MediaRoute2Info> list) {
        this.LIZ.LJIJ();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesRemoved(List<MediaRoute2Info> list) {
        this.LIZ.LJIJ();
    }
}
