package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.JFz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48871JFz {
    public Pattern LIZ;

    public final boolean LIZ(java.net.URI uri) {
        if (uri == null || TextUtils.isEmpty(uri.getHost()) || this.LIZ == null) {
            return false;
        }
        String host = uri.getHost();
        if (!TextUtils.isEmpty(uri.getPath())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(host);
            LIZ.append(uri.getPath());
            host = X1D.LIZIZ(LIZ);
        }
        return this.LIZ.matcher(host).matches();
    }
}
