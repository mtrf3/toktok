package X;

import android.util.ArrayMap;
import java.lang.ref.SoftReference;
import ujb.o;

/* renamed from: X.KMb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51577KMb {
    public static boolean LIZ() {
        return ((Boolean) C51576KMa.LLIL.getValue()).booleanValue();
    }

    public static InterfaceC46330IGg LIZIZ(String str) {
        SoftReference<InterfaceC46330IGg> softReference;
        if (str != null && !o.LJJJJJL(str) && !C51576KMa.LLIILZL) {
            ArrayMap<String, SoftReference<InterfaceC46330IGg>> arrayMap = C51576KMa.LLIILII;
            if (arrayMap.containsKey(str) && (softReference = arrayMap.get(str)) != null) {
                return softReference.get();
            }
        }
        return null;
    }

    public static void LIZJ(String str) {
        InterfaceC46330IGg interfaceC46330IGg;
        if (str == null || o.LJJJJJL(str) || C51576KMa.LLIILZL) {
            return;
        }
        ArrayMap<String, SoftReference<InterfaceC46330IGg>> arrayMap = C51576KMa.LLIILII;
        if (!arrayMap.containsKey(str)) {
            return;
        }
        SoftReference<InterfaceC46330IGg> softReference = arrayMap.get(str);
        if (softReference != null && (interfaceC46330IGg = softReference.get()) != null) {
            interfaceC46330IGg.release();
        }
        arrayMap.remove(str);
    }
}
