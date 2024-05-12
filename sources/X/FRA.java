package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FRA extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "user/referral", false);
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return new Intent(activity, (Class<?>) MainActivity.class);
    }
}
