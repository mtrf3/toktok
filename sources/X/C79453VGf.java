package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VGf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79453VGf {
    public static final HashMap<String, HashMap<String, ? super InterfaceC79523VIx>> LIZ = new HashMap<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C79454VGg.LJLIL);

    public static List LIZ(String str, String str2) {
        HashMap<String, HashMap<String, ? super InterfaceC79523VIx>> hashMap = LIZ;
        synchronized (hashMap) {
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                HashMap<String, ? super InterfaceC79523VIx> hashMap2 = hashMap.get(str);
                if (hashMap2 == null) {
                    return null;
                }
                InterfaceC79523VIx interfaceC79523VIx = hashMap2.get(str2);
                if (!(interfaceC79523VIx instanceof InterfaceC79523VIx)) {
                    interfaceC79523VIx = null;
                }
                InterfaceC79523VIx interfaceC79523VIx2 = interfaceC79523VIx;
                if (interfaceC79523VIx2 == null) {
                    return null;
                }
                arrayList.add(interfaceC79523VIx2);
            } else {
                HashMap<String, ? super InterfaceC79523VIx> hashMap3 = hashMap.get(str);
                if (hashMap3 == null) {
                    return null;
                }
                for (InterfaceC79523VIx interfaceC79523VIx3 : hashMap3.values()) {
                    if (interfaceC79523VIx3 != null) {
                        arrayList.add(interfaceC79523VIx3);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xbridge.websocket.utils.IWebSocketTask");
                    }
                }
            }
            return arrayList;
        }
    }

    public static void LIZIZ(String str, String str2) {
        HashMap<String, HashMap<String, ? super InterfaceC79523VIx>> hashMap = LIZ;
        synchronized (hashMap) {
            HashMap<String, ? super InterfaceC79523VIx> hashMap2 = hashMap.get(str);
            if (hashMap2 != null) {
                hashMap2.remove(str2);
            }
            HashMap<String, ? super InterfaceC79523VIx> hashMap3 = hashMap.get(str);
            if (hashMap3 != null && hashMap3.isEmpty()) {
                hashMap.remove(str);
            }
        }
    }
}
