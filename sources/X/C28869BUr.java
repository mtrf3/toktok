package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Objects;

/* renamed from: X.BUr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28869BUr implements BTW {
    public static final String LIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (C38354F3m.LJ(queryParameter)) {
            return null;
        }
        android.net.Uri parse = UriProtector.parse(queryParameter);
        String queryParameter2 = UriProtector.getQueryParameter(uri, "status_bar_height");
        if (!C38354F3m.LJ(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    @Override // X.BTW
    public final boolean canHandle(android.net.Uri uri) {
        if ((!TextUtils.equals("webcast_webview", uri.getHost()) || TextUtils.equals("1", UriProtector.getQueryParameter(uri, "use_new_container"))) && (TextUtils.equals("webcast_lynxview", uri.getHost()) || TextUtils.equals(UriProtector.getQueryParameter(uri, "use_spark"), "1") || !TextUtils.equals(UriProtector.getQueryParameter(uri, "__live_platform__"), "webcast"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ef, code lost:
    
        if (r0 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037c A[RETURN] */
    @Override // X.BTW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handle(android.content.Context r21, android.net.Uri r22) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28869BUr.handle(android.content.Context, android.net.Uri):boolean");
    }

    public static int LIZIZ(int i, android.net.Uri uri, String str) {
        try {
            String queryParameter = UriProtector.getQueryParameter(uri, str);
            Objects.requireNonNull(queryParameter);
            return CastIntegerProtector.parseInt(queryParameter);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // X.BTW
    public final boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        return handle(context, uri);
    }
}
