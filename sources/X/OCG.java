package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public final class OCG extends CookieManager {
    public final OCH LIZ;
    public final OCI LIZIZ;

    public OCG(OJZ ojz) {
        OCK ock = OCI.LIZ;
        this.LIZ = ojz;
        this.LIZIZ = ock;
    }

    public final void LIZ(java.net.URI uri, List<C61691OJb> list) {
        String substring;
        String lowerCase;
        if (C32151Nz.LJJIIJZLJL(list)) {
            return;
        }
        for (C61691OJb c61691OJb : list) {
            if (TextUtils.isEmpty(c61691OJb.LJLJJI)) {
                String host = uri.getHost();
                if (host == null) {
                    lowerCase = null;
                } else {
                    lowerCase = host.toLowerCase(Locale.US);
                }
                c61691OJb.LJLJJI = lowerCase;
            }
            if (TextUtils.isEmpty(c61691OJb.LJLJL)) {
                String path = uri.getPath();
                if (TextUtils.isEmpty(path)) {
                    substring = "/";
                } else {
                    substring = path.substring(0, path.lastIndexOf(47) + 1);
                }
                c61691OJb.LJLJL = substring;
            }
            if ("".equals(c61691OJb.LJLJLJ)) {
                c61691OJb.LJLJLJ = Integer.toString(C61690OJa.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (c61691OJb.LJLJLJ != null && !C61691OJb.LIZLLL(c61691OJb, uri)) {
            }
            if (this.LIZIZ.LIZ(c61691OJb, uri)) {
                this.LIZ.LIZ(c61691OJb, uri);
            }
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final java.util.Map<String, List<String>> get(java.net.URI uri, java.util.Map<String, List<String>> map) {
        int i;
        if (uri != null && map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C61691OJb> it = this.LIZ.get(uri).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C61691OJb next = it.next();
                String path = uri.getPath();
                String str = "/";
                if (path == null) {
                    path = "/";
                } else if (!path.endsWith("/")) {
                    path = i0.LJFF(path, "/");
                }
                String str2 = next.LJLJL;
                if (str2 != null) {
                    if (str2.endsWith("/")) {
                        str = str2;
                    } else {
                        str = i0.LJFF(str2, "/");
                    }
                }
                if (path.startsWith(str) && (!next.LJLJLLL || "https".equalsIgnoreCase(uri.getScheme()))) {
                    if (C61691OJb.LIZLLL(next, uri)) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyMap();
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                i2 = Math.min(i2, ((C61691OJb) it2.next()).LJLLILLLL);
            }
            if (i2 == 1) {
                sb.append("$Version=\"1\"; ");
            }
            sb.append(((C61691OJb) ListProtector.get(arrayList, 0)).toString());
            for (i = 1; i < arrayList.size(); i++) {
                sb.append("; ");
                sb.append(((C61691OJb) ListProtector.get(arrayList, i)).toString());
            }
            return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(java.net.URI uri, java.util.Map<String, List<String>> map) {
        if (uri != null && map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        try {
                            Iterator it2 = ((ArrayList) C61691OJb.LIZJ(it.next())).iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next());
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
            }
            LIZ(uri, arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }
}
