package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class BNV implements BTW {
    public static final String LIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        android.net.Uri parse = UriProtector.parse(queryParameter);
        String queryParameter2 = UriProtector.getQueryParameter(uri, "status_bar_height");
        if (!TextUtils.isEmpty(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    @Override // X.BTW
    public final boolean canHandle(android.net.Uri uri) {
        if (TextUtils.equals("webcast_lynxview", uri.getHost()) && !TextUtils.equals("1", UriProtector.getQueryParameter(uri, "use_new_container"))) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(android.net.Uri uri, String str) {
        try {
            String queryParameter = UriProtector.getQueryParameter(uri, str);
            Objects.requireNonNull(queryParameter);
            return queryParameter;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0321  */
    @Override // X.BTW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handle(android.content.Context r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BNV.handle(android.content.Context, android.net.Uri):boolean");
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

    public static String LJ(android.net.Uri uri, String str, String str2) {
        try {
            String queryParameter = UriProtector.getQueryParameter(uri, str);
            Objects.requireNonNull(queryParameter);
            return queryParameter;
        } catch (Exception unused) {
            return str2;
        }
    }

    @Override // X.BTW
    public final boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        return handle(context, uri);
    }
}
