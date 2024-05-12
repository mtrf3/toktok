package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68312mB {
    public static final C69372nt LIZ(String uriString) {
        HashMap hashMap;
        o.LJIIIZ(uriString, "uriString");
        if (TextUtils.isEmpty(uriString)) {
            hashMap = new HashMap();
        } else {
            android.net.Uri parse = UriProtector.parse(uriString);
            hashMap = new HashMap();
            for (String queryName : UriProtector.getQueryParameterNames(parse)) {
                String queryParameter = UriProtector.getQueryParameter(parse, queryName);
                if (!TextUtils.isEmpty(queryParameter)) {
                    o.LJIIIIZZ(queryName, "queryName");
                    o.LJI(queryParameter);
                    hashMap.put(queryName, queryParameter);
                }
            }
        }
        Uri.Builder uriBuilder = UriProtector.parse(uriString).buildUpon().clearQuery();
        o.LJIIIIZZ(uriBuilder, "uriBuilder");
        return new C69372nt(hashMap, uriBuilder);
    }
}
