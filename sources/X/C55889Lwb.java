package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55889Lwb extends M56 {
    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "notice/detail", false);
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent LJFF = C55888Lwa.LIZIZ.LJFF(activity);
        LJFF.putExtra("from_where", UriProtector.getQueryParameter(uri, "from_where"));
        LJFF.putExtra("unRead_message_count", UriProtector.getQueryParameter(uri, "unRead_message_count"));
        LJFF.putExtra("second_tab_name", UriProtector.getQueryParameter(uri, "second_tab_name"));
        LJFF.putExtra("notice_name", UriProtector.getQueryParameter(uri, "notice_name"));
        return LJFF;
    }
}
