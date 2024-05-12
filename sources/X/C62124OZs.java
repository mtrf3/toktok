package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.OZs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62124OZs extends AbstractC62121OZp {
    public C62124OZs(C62116OZk c62116OZk) {
        super(c62116OZk);
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        String host = parse.getHost();
        if (!TextUtils.isEmpty(host) && C37208Eiy.LIZ(host)) {
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() > 1 && o.LJ(ListProtector.get(pathSegments, 0), "v")) {
                InterfaceC62128OZw interfaceC62128OZw = this.LIZIZ;
                Object obj = ListProtector.get(pathSegments, 1);
                o.LJIIIIZZ(obj, "pathSegments[1]");
                return ((C62116OZk) interfaceC62128OZw).LIZ(1, (String) ORZ.LJLLLL(s.LJLJJL((CharSequence) obj, new String[]{"."}, 0, 6)), str, null);
            }
            if (pathSegments.size() >= 4 && o.LJ(ListProtector.get(pathSegments, 2), "video")) {
                return ((C62116OZk) this.LIZIZ).LIZ(1, (String) ListProtector.get(pathSegments, 3), str, null);
            }
        }
        return false;
    }
}
