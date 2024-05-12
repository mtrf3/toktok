package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55894Lwg extends M56 {
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
        return SC5.LIZIZ(str, "host", str2, "path", str, "change_phone");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        HG3.LJFF().modifyMobile(activity, "scheme", null, null);
    }
}
