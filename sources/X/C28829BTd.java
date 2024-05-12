package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.BTd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28829BTd {
    public static final /* synthetic */ int LIZ = 0;

    public static final android.net.Uri LIZ(String str) {
        boolean z;
        String str2;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse != null) {
                    str2 = parse.getScheme();
                } else {
                    str2 = null;
                }
                if (o.LJ("content", str2)) {
                    z2 = true;
                }
            } catch (Exception unused) {
            }
        }
        if (z2) {
            android.net.Uri parse2 = UriProtector.parse(str);
            o.LJIIIIZZ(parse2, "parse(path)");
            return parse2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("file://");
        LIZ2.append(str);
        android.net.Uri parse3 = UriProtector.parse(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(parse3, "parse(\"file://$path\")");
        return parse3;
    }
}
