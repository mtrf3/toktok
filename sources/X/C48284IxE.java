package X;

import ccb.t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IxE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48284IxE {
    public static InterfaceC48287IxH LIZ;
    public static final ConcurrentHashMap<Integer, InterfaceC48285IxF> LIZIZ = new ConcurrentHashMap<>();

    public static synchronized void LIZ(int i, int i2, String str, String str2) {
        InterfaceC48269Iwz interfaceC48269Iwz;
        synchronized (C48284IxE.class) {
            ConcurrentHashMap<Integer, InterfaceC48285IxF> concurrentHashMap = LIZIZ;
            if (concurrentHashMap != null) {
                if (i2 == -1) {
                    Iterator<InterfaceC48285IxF> it = concurrentHashMap.values().iterator();
                    while (it.hasNext()) {
                        LIZIZ(i, it.next(), str, str2);
                    }
                } else {
                    InterfaceC48285IxF interfaceC48285IxF = concurrentHashMap.get(Integer.valueOf(i2));
                    if (interfaceC48285IxF != null) {
                        LIZIZ(i, interfaceC48285IxF, str, str2);
                    }
                    InterfaceC48285IxF interfaceC48285IxF2 = concurrentHashMap.get(-1);
                    if (interfaceC48285IxF2 != null) {
                        LIZIZ(i, interfaceC48285IxF2, str, str2);
                    }
                }
            }
            InterfaceC48287IxH interfaceC48287IxH = LIZ;
            if (interfaceC48287IxH != null) {
                C46496IMq.LIZJ();
                t tVar = ((C48286IxG) interfaceC48287IxH).LIZ.get();
                if (tVar != null && (interfaceC48269Iwz = tVar.LJLJL) != null) {
                    ((VBU) interfaceC48269Iwz).LJ(str2);
                }
            }
        }
    }

    public static void LIZIZ(int i, InterfaceC48285IxF interfaceC48285IxF, String str, String str2) {
        switch (i) {
            case 1:
                interfaceC48285IxF.d(str, str2);
                return;
            case 2:
                interfaceC48285IxF.i(str, str2);
                return;
            case 3:
                interfaceC48285IxF.LIZIZ(str, str2);
                return;
            case 4:
                interfaceC48285IxF.LIZ(str, str2);
                return;
            case 5:
                interfaceC48285IxF.w(str, str2);
                return;
            case 6:
                interfaceC48285IxF.e(str, str2);
                return;
            default:
                return;
        }
    }
}
