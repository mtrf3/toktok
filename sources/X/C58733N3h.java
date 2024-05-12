package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N3h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58733N3h implements InterfaceC58734N3i {
    public static final C58733N3h LIZ = new C58733N3h();
    public static final List<InterfaceC58734N3i> LIZIZ = new ArrayList();

    @Override // X.InterfaceC58734N3i
    public final String LIZ() {
        return "web";
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC58734N3i) it.next()).LIZIZ(i, str);
        }
        return false;
    }
}
