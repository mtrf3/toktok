package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ch9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31999Ch9 {
    public static final C31999Ch9 LIZJ = new C31999Ch9();
    public static final java.util.Map<String, WeakReference<InterfaceC60761Nsz>> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, WeakReference<InterfaceC60761Nsz>> LIZIZ = new LinkedHashMap();

    public static void LIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        EnumC39924Flg type;
        if (interfaceC60761Nsz != null) {
            String str = interfaceC60761Nsz.getHybridContext().containerId;
            InterfaceC60710NsA interfaceC60710NsA = interfaceC60761Nsz.getHybridContext().hybridParams;
            if (interfaceC60710NsA == null || (type = interfaceC60710NsA.getType()) == null) {
                return;
            }
            int i = C39923Flf.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LIZIZ.put(str, new WeakReference<>(interfaceC60761Nsz));
                return;
            }
            LIZ.put(str, new WeakReference<>(interfaceC60761Nsz));
        }
    }

    public static InterfaceC60761Nsz LIZIZ(String containerID) {
        o.LJIIJ(containerID, "containerID");
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        if (linkedHashMap.get(containerID) != null) {
            Reference reference = (Reference) linkedHashMap.get(containerID);
            if (reference != null) {
                return (InterfaceC60761Nsz) reference.get();
            }
        } else {
            Reference reference2 = (Reference) ((LinkedHashMap) LIZ).get(containerID);
            if (reference2 != null) {
                return (InterfaceC60761Nsz) reference2.get();
            }
        }
        return null;
    }
}
