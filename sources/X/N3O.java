package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class N3O implements N3N {
    public static final N3O LIZ = new N3O();
    public static final List<N3N> LIZIZ = ORZ.LLJI(C47261Igj.LJJIJIL(new N3L()));

    @Override // X.N3N
    public final String LIZ(String url) {
        o.LJIIIZ(url, "url");
        if (s.LJJJLZIJ(url, "x-signature", false)) {
            return url;
        }
        Iterator<N3N> it = LIZIZ.iterator();
        while (it.hasNext()) {
            url = it.next().LIZ(url);
        }
        return url;
    }

    public final android.net.Uri LIZIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        android.net.Uri parse = UriProtector.parse(LIZ(uri2));
        o.LJIIIIZZ(parse, "parse(url)");
        return parse;
    }
}
