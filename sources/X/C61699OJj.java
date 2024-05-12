package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OJj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61699OJj implements InterfaceC61701OJl {
    public final CookieHandler LIZIZ;

    public C61699OJj(CookieHandler cookieHandler) {
        PatternProtector.compile("(?<=Domain=)([^;]*)", 2);
        this.LIZIZ = cookieHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    @Override // X.InterfaceC61701OJl
    public final List<C61702OJm> LIZ(C64626PXy c64626PXy) {
        ?? arrayList;
        if (c64626PXy == null) {
            return Collections.emptyList();
        }
        try {
            java.util.Map<String, List<String>> map = this.LIZIZ.get(c64626PXy.LJIJJ(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList2 = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                        for (String str : entry.getValue()) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            if (TextUtils.isEmpty(str)) {
                                arrayList = Collections.emptyList();
                            } else {
                                arrayList = new ArrayList();
                                String[] split = str.split(";");
                                for (String str2 : split) {
                                    C61702OJm LIZIZ = C61702OJm.LIZIZ(c64626PXy, str2);
                                    if (LIZIZ != null) {
                                        arrayList.add(LIZIZ);
                                    }
                                }
                            }
                            arrayList2.addAll(arrayList);
                        }
                    }
                }
            }
            if (arrayList2 != null) {
                return Collections.unmodifiableList(arrayList2);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC61701OJl
    public final void LIZIZ(C64626PXy c64626PXy, List<C61702OJm> list) {
        if (c64626PXy == null || C32151Nz.LJJIIJZLJL(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C61702OJm> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        try {
            this.LIZIZ.put(c64626PXy.LJIJJ(), Collections.singletonMap("Set-Cookie", arrayList));
        } catch (IOException unused) {
        }
    }
}
