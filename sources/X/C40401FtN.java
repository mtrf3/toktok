package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FtN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40401FtN extends G46 {
    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<InterfaceC28616BKy> LIZ = LJIILJJIL().LIZ();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC28616BKy interfaceC28616BKy : LIZ) {
            if (interfaceC28616BKy instanceof C40400FtM) {
                arrayList.add(interfaceC28616BKy);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C40400FtM) it.next()).LJLIL.onActivityResult(i, i2, intent);
        }
    }
}
