package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes12.dex */
public class Q9Y {
    public final String LIZ;
    public final android.net.Uri LIZIZ;
    public final android.net.Uri LIZJ;

    public Q9Y(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = str;
            this.LIZIZ = UriProtector.parse("https://access.line.me/v2");
            this.LIZJ = UriProtector.parse("https://access.line.me/dialog/oauth/weblogin");
            return;
        }
        throw new IllegalArgumentException("channelId is empty.");
    }
}
