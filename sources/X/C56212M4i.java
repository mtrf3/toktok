package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.M4i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56212M4i extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "profile_edit";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "profileEdit");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        return new Intent(activity, (Class<?>) ProfileEditActivity.class);
    }
}
