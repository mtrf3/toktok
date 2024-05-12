package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FQq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38956FQq {
    public static final String LIZ(String str) {
        if (str == null) {
            return "";
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            Uri.Builder buildUpon = parse.buildUpon();
            o.LJIIIIZZ(buildUpon, "uri.buildUpon()");
            if (TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "hybrid_sdk_version"))) {
                if (!TextUtils.isEmpty(null)) {
                    buildUpon.appendQueryParameter("package_name", null);
                }
                buildUpon.appendQueryParameter("hybrid_sdk_version", "bullet");
                parse = buildUpon.build();
            }
        }
        return String.valueOf(parse);
    }

    public static final android.net.Uri LIZIZ(String oldUri) {
        o.LJIIIZ(oldUri, "oldUri");
        return LIZJ(oldUri, null, null, null);
    }

    public static final String LJ(String str) {
        if (str == null) {
            return "";
        }
        return String.valueOf(LIZLLL(UriProtector.parse(str), "fullScreen"));
    }

    public static final android.net.Uri LIZLLL(android.net.Uri uri, String str) {
        if (uri == null) {
            return uri;
        }
        if (TextUtils.isEmpty(UriProtector.getQueryParameter(uri, str))) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        o.LJIIIIZZ(buildUpon, "uri.buildUpon()");
        buildUpon.clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!o.LJ(str2, str)) {
                Iterator<String> it = UriProtector.getQueryParameters(uri, str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static final android.net.Uri LJFF(android.net.Uri uri, String str) {
        if (uri == null) {
            return uri;
        }
        if (TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "url"))) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        o.LJIIIIZZ(buildUpon, "uri.buildUpon()");
        buildUpon.clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!o.LJ(str2, "url")) {
                Iterator<String> it = UriProtector.getQueryParameters(uri, str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            } else {
                buildUpon.appendQueryParameter(str2, str);
            }
        }
        return buildUpon.build();
    }

    public static final android.net.Uri LIZJ(String oldUri, List<String> list, Bundle bundle, InterfaceC38952FQm interfaceC38952FQm) {
        o.LJIIIZ(oldUri, "oldUri");
        InterfaceC60232NkS interfaceC60232NkS = (InterfaceC60232NkS) C60373Nmj.LIZIZ().LIZ(InterfaceC60232NkS.class);
        if (interfaceC60232NkS != null) {
            android.net.Uri parse = UriProtector.parse(oldUri);
            o.LJIIIIZZ(parse, "parse(oldUri)");
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C38954FQo(interfaceC38952FQm));
            arrayList.add(new C38953FQn());
            android.net.Uri LJIIJJI = interfaceC60232NkS.LJIIJJI(parse, bundle, list, arrayList);
            if (LJIIJJI != null) {
                return LJIIJJI;
            }
        }
        android.net.Uri build = new C39433Fdl().LIZ().build();
        o.LJIIIIZZ(build, "BulletLoaderParamsUriBui…).createBuilder().build()");
        return build;
    }
}
