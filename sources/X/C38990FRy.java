package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.FRy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38990FRy extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "learn");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
        intent.addFlags(536870912);
        intent.addFlags(32768);
        intent.putExtra("page_type", 16000);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return intent;
    }
}
