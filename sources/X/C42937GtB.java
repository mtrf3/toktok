package X;

import Y.IDLCallbackS106S0200000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.GtB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42937GtB extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "shoutouts/publish", false);
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        AVExternalServiceImpl.LIZ().asyncService(activity, "deep_link_shoutouts_publish_video", new IDLCallbackS106S0200000_7(activity, uri, 0));
    }
}
