package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS70S0400000_10;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Oij, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62673Oij {
    public static boolean LIZ = true;

    public static void LIZIZ(Activity activity) {
        Context applicationContext;
        if (!u.LJII()) {
            Q4J.LIZLLL("597615686992125", "applicationId");
            u.LIZJ = "597615686992125";
            if (activity == null) {
                InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
                if (interfaceC62484Ofg != null && (applicationContext = interfaceC62484Ofg.getApplicationContext()) != null) {
                    u.LJIIJ(applicationContext);
                }
            } else {
                u.LJIIJ(activity);
            }
        }
        C62703OjD.LIZ(new String[]{"LDU"}, TokenCert.Companion.with("bpea-facebook_androidsdk_6807"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(C62313Ocv content, Activity activity, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(content, "content");
        List<String> list = content.LJI;
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(android.net.Uri.fromFile(new File(it.next())));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            LIZIZ(activity);
            TokenCert cert = TokenCert.Companion.with("bpea-facebook_androidsdk_363");
            o.LJIIIZ(cert, "cert");
            Boolean bool = (Boolean) C1GE.LJIJJ(cert, "Facebook", "sharePhotos", new AqS70S0400000_10(arrayList, (List<? extends android.net.Uri>) activity, (Activity) null, (Q97) null, (Q82<Q8F>) 2)).LIZJ;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return ((Boolean) interfaceC65784Pro.invoke()).booleanValue();
    }

    public static boolean LIZJ(Activity activity, android.net.Uri uri, String str, String str2, String shareTitle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(shareTitle, "shareTitle");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//facebook/share");
        buildRoute.withParam(uri);
        buildRoute.withParam("share_mode", str);
        buildRoute.withParam("cert_token", str2);
        buildRoute.withParam("title", shareTitle);
        buildRoute.open();
        return LIZ;
    }
}
