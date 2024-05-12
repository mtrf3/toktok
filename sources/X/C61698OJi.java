package X;

import com.bytedance.common.utility.Logger;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.OJi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61698OJi extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C48302IxW LJLJL;

    public final void LIZJ() {
        C48302IxW c48302IxW = this.LJLJL;
        String str = this.LJLJJL;
        String str2 = this.LJLJJLL;
        c48302IxW.getClass();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler == null) {
            return;
        }
        List LIZIZ = C48302IxW.LIZIZ(str);
        List LIZIZ2 = C48302IxW.LIZIZ(str2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) LIZIZ2).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (V1M.LJJIIZ(str3, LIZIZ)) {
                Logger.debug();
                arrayList.add(str3);
            } else {
                Logger.debug();
                arrayList2.add(str3);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            arrayList = arrayList2;
        }
        java.util.Map<String, List<String>> hashMap = new HashMap<>();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                String str4 = (String) it2.next();
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("https://");
                    LIZ.append(str4);
                    LIZ.append("/");
                    hashMap = cookieHandler.get(new java.net.URI(X1D.LIZIZ(LIZ)), null);
                } catch (Throwable unused) {
                }
                if (hashMap.size() > 0) {
                    Logger.debug();
                    break;
                }
                continue;
            } else if (hashMap == null) {
                return;
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        List<String> list = hashMap.get("Cookie");
        if ((list == null || list.isEmpty()) && ((list = hashMap.get("cookie")) == null || list.isEmpty())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            for (String str5 : it3.next().split(";")) {
                if (!C38354F3m.LJ(str5)) {
                    arrayList3.add(str5.trim());
                }
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            String str6 = (String) it4.next();
            ArrayList arrayList4 = new ArrayList();
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("https://");
                LIZ2.append(str6);
                LIZ2.append("/");
                java.net.URI uri = new java.net.URI(X1D.LIZIZ(LIZ2));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    String str7 = (String) it5.next();
                    if (!C38354F3m.LJ(str7)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str7);
                        LIZ3.append("; Domain=");
                        LIZ3.append(str6);
                        arrayList4.add(X1D.LIZIZ(LIZ3));
                    }
                }
                linkedHashMap.put("Set-Cookie", arrayList4);
                cookieHandler.put(uri, linkedHashMap);
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61698OJi(C48302IxW c48302IxW, String str, String str2) {
        super((Object) null);
        this.LJLJL = c48302IxW;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }
}
