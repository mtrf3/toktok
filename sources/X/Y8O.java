package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8O {
    public final /* synthetic */ Y8N LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "hostUserDepend is null", 8);
    }

    public Y8O(Y8N y8n, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = y8n;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZIZ(Y8Q y8q, String msg) {
        o.LJIIJ(msg, "msg");
        Boolean bool = y8q.LIZIZ;
        if (bool != null) {
            bool.booleanValue();
            Boolean bool2 = y8q.LIZJ;
            if (bool2 != null) {
                bool2.booleanValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool3 = y8q.LIZIZ;
                if (bool3 != null) {
                    linkedHashMap.put("hasLoggedIn", Boolean.valueOf(bool3.booleanValue()));
                }
                Boolean bool4 = y8q.LIZJ;
                if (bool4 != null) {
                    linkedHashMap.put("isLogin", Boolean.valueOf(bool4.booleanValue()));
                }
                Y8S y8s = y8q.LIZ;
                if (y8s != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    String str = y8s.LIZ;
                    if (str != null) {
                        linkedHashMap2.put("userID", str);
                    }
                    String str2 = y8s.LIZIZ;
                    if (str2 != null) {
                        linkedHashMap2.put("secUserID", str2);
                    }
                    String str3 = y8s.LIZJ;
                    if (str3 != null) {
                        linkedHashMap2.put("uniqueID", str3);
                    }
                    String str4 = y8s.LIZLLL;
                    if (str4 != null) {
                        linkedHashMap2.put("shortID", str4);
                    }
                    String str5 = y8s.LJ;
                    if (str5 != null) {
                        linkedHashMap2.put("nickname", str5);
                    }
                    String str6 = y8s.LJFF;
                    if (str6 != null) {
                        linkedHashMap2.put("avatarURL", str6);
                    }
                    Boolean bool5 = y8s.LJI;
                    if (bool5 != null) {
                        linkedHashMap2.put("hasBoundPhone", Boolean.valueOf(bool5.booleanValue()));
                    }
                    Boolean bool6 = y8s.LJII;
                    if (bool6 != null) {
                        linkedHashMap2.put("isBoundPhone", Boolean.valueOf(bool6.booleanValue()));
                    }
                    Boolean bool7 = y8s.LJIIIIZZ;
                    if (bool7 != null) {
                        linkedHashMap2.put("isBoundEmail", Boolean.valueOf(bool7.booleanValue()));
                    }
                    List<? extends EnumC85538Xhe> list = y8s.LJIIIZ;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                        Iterator it = ((ArrayList) list).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((EnumC85538Xhe) it.next()).name());
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            linkedHashMap2.put("boundThirdPartyPlatforms", array);
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    linkedHashMap.put("userInfo", linkedHashMap2);
                }
                Y8N y8n = this.LIZ;
                InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                y8n.getClass();
                AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                return;
            }
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
