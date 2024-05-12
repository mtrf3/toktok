package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.N3m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58738N3m {
    public static android.net.Uri LIZ(String url) {
        o.LJIIIZ(url, "url");
        android.net.Uri parse = UriProtector.parse(url);
        o.LJIIIIZZ(parse, "parse(url)");
        return parse;
    }
}
