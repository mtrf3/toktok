package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.M3m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56190M3m extends M56 {
    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return null;
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (SC5.LIZIZ(str, "host", str2, "path", str, "mobile") || o.LJ(str, "bind_phone")) {
            return true;
        }
        return false;
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        HG3.LJFF().bindMobile(activity, "scheme", null, null);
    }
}
