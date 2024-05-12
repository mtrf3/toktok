package X;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q3k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66380Q3k {
    public static List LIZ(List requests, HttpURLConnection httpURLConnection, Q4W q4w) {
        o.LJIIIZ(requests, "requests");
        ArrayList arrayList = new ArrayList(C32I.LJJL(requests, 10));
        Iterator it = requests.iterator();
        while (it.hasNext()) {
            arrayList.add(new C66381Q3l((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, q4w)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.io.InputStream r12, java.net.HttpURLConnection r13, X.C66390Q3u r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66380Q3k.LIZJ(java.io.InputStream, java.net.HttpURLConnection, X.Q3u):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C66381Q3l LIZIZ(com.facebook.GraphRequest r33, java.net.HttpURLConnection r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66380Q3k.LIZIZ(com.facebook.GraphRequest, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):X.Q3l");
    }
}
