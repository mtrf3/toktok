package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.B6v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28249B6v {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, android.net.Uri uri, String str) {
        String queryParameter = UriProtector.getQueryParameter(uri, str);
        if (queryParameter != null) {
            return CastIntegerProtector.parseInt(queryParameter);
        }
        return i;
    }

    public static String LIZIZ(android.net.Uri uri, String str, String str2) {
        String queryParameter = UriProtector.getQueryParameter(uri, str);
        if (queryParameter == null) {
            return str2;
        }
        return queryParameter;
    }
}
