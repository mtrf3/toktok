package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Esb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37805Esb {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() || !C37794EsQ.LIZJ(str)) {
            return false;
        }
        FC2.LIZ.getClass();
        if (!((Boolean) FC2.LJ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String url) {
        o.LJIIIZ(url, "url");
        if (!LIZ(url)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(url);
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(host);
        LIZ2.append(parse.getPath());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        FC2.LIZ.getClass();
        Iterator it = ((List) FC2.LIZLLL.getValue()).iterator();
        while (it.hasNext()) {
            if (ujb.o.LJJJLIIL(LIZIZ, (String) it.next(), false)) {
                return false;
            }
        }
        FC2.LIZ.getClass();
        Iterator it2 = ((List) FC2.LIZJ.getValue()).iterator();
        while (it2.hasNext()) {
            if (ujb.o.LJJJJ(host, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
