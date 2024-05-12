package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTJ extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "aweme/create", false);
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
        boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
        boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
        String queryParameter = UriProtector.getQueryParameter(uri, "aweme_id");
        Intent intent = new Intent(activity, (Class<?>) PushCameraBlurActivity.class);
        intent.putExtra("show_dialog", booleanQueryParameter2);
        intent.putExtra("show_effect", booleanQueryParameter);
        intent.putExtra("show_duet", booleanQueryParameter3);
        intent.putExtra("aid", queryParameter);
        return intent;
    }
}
