package X;

import android.app.Service;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pxv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66163Pxv {
    public static final List<InterfaceC66182PyE> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(new C66162Pxu());
    }

    public static void LIZ(Service service, Intent intent, int i, int i2) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC66182PyE) it.next()).LIZ(service, intent, i, i2);
            } catch (Exception unused) {
            }
        }
    }
}
