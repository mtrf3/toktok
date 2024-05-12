package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EsC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37780EsC implements InterfaceC37774Es6 {
    public C31926Cfy LIZ;

    @Override // X.InterfaceC37774Es6
    public Class<? extends AbstractC37843EtD> LIZ() {
        return null;
    }

    @Override // X.InterfaceC37774Es6
    public Class<? extends AbstractC37839Et9> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC37774Es6
    public void release() {
    }

    @Override // X.InterfaceC37774Es6
    public EnumC38005Evp getAccess() {
        return EnumC38005Evp.PRIVATE;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZIZ(C31926Cfy c31926Cfy) {
        this.LIZ = c31926Cfy;
    }

    public final <T> T LJII(Class<T> cls) {
        C31926Cfy c31926Cfy = this.LIZ;
        if (c31926Cfy != null) {
            return (T) c31926Cfy.LIZ(cls);
        }
        return null;
    }

    public static void LJI(InterfaceC31943CgF callback, String msg, java.util.Map map) {
        o.LJIIJ(callback, "callback");
        o.LJIIJ(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", msg);
        linkedHashMap.put("data", map);
        callback.LIZ(linkedHashMap);
    }

    public static void LJ(InterfaceC31943CgF callback, int i, String msg, java.util.Map data) {
        o.LJIIJ(callback, "callback");
        o.LJIIJ(msg, "msg");
        o.LJIIJ(data, "data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", msg);
        linkedHashMap.put("data", data);
        callback.LIZ(linkedHashMap);
    }

    public static /* synthetic */ void LJFF(AbstractC37780EsC abstractC37780EsC, InterfaceC31943CgF interfaceC31943CgF, int i, String str, int i2) {
        LinkedHashMap linkedHashMap;
        if ((i2 & 4) != 0) {
            str = "";
        }
        if ((i2 & 8) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        abstractC37780EsC.getClass();
        LJ(interfaceC31943CgF, i, str, linkedHashMap);
    }
}
