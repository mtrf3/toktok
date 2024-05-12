package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KOl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51639KOl {
    public static final List<InterfaceC51640KOm> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(new C66141PxZ());
    }

    public static void LIZ(Object[] objArr) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC51640KOm) it.next()).LIZ(objArr);
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZIZ(Object[] objArr) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC51640KOm) it.next()).LIZIZ(objArr);
            } catch (Exception unused) {
            }
        }
    }
}
