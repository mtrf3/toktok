package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29683Bkt {
    public static C29682Bks LIZ(String schema) {
        o.LJIIIZ(schema, "schema");
        C29682Bks c29682Bks = new C29682Bks();
        android.net.Uri parse = UriProtector.parse(schema);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        Uri.Builder builder = c29682Bks.LIZIZ;
        if (builder != null) {
            builder.scheme(parse.getScheme());
        }
        Uri.Builder builder2 = c29682Bks.LIZIZ;
        if (builder2 != null) {
            builder2.authority(parse.getAuthority());
        }
        Iterator LIZ = C47117IeP.LIZ(parse, "uri.queryParameterNames");
        while (LIZ.hasNext()) {
            String key = (String) LIZ.next();
            String queryParameter = UriProtector.getQueryParameter(parse, key);
            if (queryParameter != null) {
                o.LJIIIIZZ(key, "key");
                c29682Bks.LJJI(key, queryParameter);
            }
        }
        return c29682Bks;
    }

    public static C29682Bks LIZIZ(String url) {
        o.LJIIIZ(url, "url");
        C29682Bks c29682Bks = new C29682Bks();
        c29682Bks.LJIJJLI(url);
        c29682Bks.LIZIZ.authority("lynxview_popup");
        return c29682Bks;
    }

    public static C29682Bks LIZJ(String url) {
        o.LJIIIZ(url, "url");
        C29682Bks c29682Bks = new C29682Bks();
        c29682Bks.LJIJJLI(url);
        c29682Bks.LIZIZ.authority("webview_popup");
        return c29682Bks;
    }
}
