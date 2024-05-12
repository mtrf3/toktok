package X;

import com.bytedance.forest.model.Request;
import com.bytedance.forest.model.RequestParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FlI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39900FlI {
    public static final List<InterfaceC39901FlJ> LIZ = new ArrayList();
    public static final List<InterfaceC39899FlH> LIZIZ = new ArrayList();

    public static void LIZ(C61295O3v response) {
        o.LJIIJ(response, "response");
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC39901FlJ) it.next()).LIZ(response);
            } catch (Throwable th) {
                C39930Flm.LIZIZ("GlobalInterceptor", "monitor onLoadFinished error", th);
            }
        }
    }

    public static void LIZJ(Request request) {
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC39899FlH) it.next()).LIZ(request);
            } catch (Throwable th) {
                C39930Flm.LIZIZ("GlobalInterceptor", "intercept onLoadStart error", th);
            }
        }
    }

    public static void LIZIZ(String url, RequestParams requestParams) {
        o.LJIIJ(url, "url");
        o.LJIIJ(requestParams, "requestParams");
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC39901FlJ) it.next()).LIZIZ(url, requestParams);
            } catch (Throwable th) {
                C39930Flm.LIZIZ("GlobalInterceptor", "monitor onLoadStart error", th);
            }
        }
    }
}
