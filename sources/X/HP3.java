package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HP3 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (ujb.o.LJJJJIZL("studio", host, true) && ujb.o.LJJJJIZL("/upload", path, true)) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        AVExternalServiceImpl.LIZ().asyncServiceWithActivity(activity, "deep_link_upload_video", new HP2(activity));
    }
}
