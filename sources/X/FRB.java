package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FRB extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "growth_activity_dialog");
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
