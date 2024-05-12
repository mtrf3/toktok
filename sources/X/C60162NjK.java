package X;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NjK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60162NjK {
    public static final /* synthetic */ int LIZ = 0;

    public static android.net.Uri LIZ(android.net.Uri uri, android.net.Uri outUrl, Bundle bundle, List list, boolean z) {
        o.LJIIJ(outUrl, "outUrl");
        o.LJIIJ(bundle, "bundle");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC60163NjL interfaceC60163NjL = (InterfaceC60163NjL) it.next();
                if (interfaceC60163NjL instanceof InterfaceC60164NjM) {
                    uri = interfaceC60163NjL.LIZ(uri, bundle);
                }
            }
        }
        Uri.Builder buildUpon = uri.buildUpon();
        java.util.Set LJIJJ = C78939UyV.LJIJJ(uri);
        List LJJIJIL = C47261Igj.LJJIJIL("package_name", "url", "surl", "fallback_url", "rn_schema", "lynx_schema");
        if (z) {
            LJJIJIL.add("channel");
            LJJIJIL.add("bundle");
            LJJIJIL.add("prefix");
            LJJIJIL.add("initial_data");
            LJJIJIL.add("lynx_landing_page_data");
            LJJIJIL.add("lynx_landing_page_title");
        }
        java.util.Set<String> LJIJJ2 = C78939UyV.LJIJJ(outUrl);
        if (LJIJJ2 != null) {
            for (String str : LJIJJ2) {
                if (str != null && (LJIJJ == null || !LJIJJ.contains(str))) {
                    if (!LJJIJIL.contains(str)) {
                        buildUpon.appendQueryParameter(str, C78939UyV.LJIJJLI(outUrl, str));
                    }
                }
            }
        }
        android.net.Uri uri2 = buildUpon.build();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C60165NjN) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                o.LJFF(uri2, "uri");
                next.getClass();
            }
        }
        o.LJFF(uri2, "uri");
        return uri2;
    }
}
