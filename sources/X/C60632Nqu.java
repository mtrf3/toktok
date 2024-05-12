package X;

import java.util.HashMap;

/* renamed from: X.Nqu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60632Nqu {
    public static HashMap<String, InterfaceC60636Nqy> LIZ = new HashMap<>();

    public static InterfaceC60410NnK LIZ(Class cls, String str) {
        InterfaceC60636Nqy interfaceC60636Nqy = LIZ.get(str);
        if (interfaceC60636Nqy == null) {
            synchronized (C60632Nqu.class) {
                interfaceC60636Nqy = LIZ.get(str);
                if (interfaceC60636Nqy == null) {
                    interfaceC60636Nqy = new C60626Nqo(str);
                    HashMap<String, InterfaceC60636Nqy> hashMap = new HashMap<>(LIZ);
                    hashMap.put(str, interfaceC60636Nqy);
                    LIZ = hashMap;
                }
            }
        }
        return interfaceC60636Nqy.LIZ(cls);
    }
}
