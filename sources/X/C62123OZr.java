package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OZr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62123OZr extends AbstractC62121OZp {
    public C62123OZr(C62116OZk c62116OZk, ActivityC86117Xqz activityC86117Xqz) {
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
            if (!C79004UzY.LJJIFFI(pathSegments) && pathSegments.size() >= 3 && TextUtils.equals("share", (String) ListProtector.get(pathSegments, 0))) {
                String str2 = (String) ListProtector.get(pathSegments, 1);
                String str3 = (String) ListProtector.get(pathSegments, 2);
                int LJJIIZ = C45804HyK.LJJIIZ(str2);
                this.LIZ = C45804HyK.LJFF(LJJIIZ, str3);
                return ((C62116OZk) this.LIZIZ).LIZ(LJJIIZ, str3, str, null);
            }
        }
        return false;
    }
}
