package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GnG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42570GnG implements InterfaceC42567GnD {
    @Override // X.InterfaceC42567GnD
    public final void LIZ(List<Object> list, Context context, Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C42576GnM) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C65542hi.LIZ("commercial_data_trans_error", C113554cx.LJJL(new OSZ("data_type", ORZ.LLD(arrayList, ",", null, null, C42579GnP.LJLIL, 30)), new OSZ("data_info", ORZ.LLD(arrayList, ",", null, null, C42577GnN.LJLIL, 30)), new OSZ("creation_id", C42090GfW.LIZJ(obj)), new OSZ("enter_from", C42090GfW.LIZLLL(obj)), new OSZ("shoot_way", C42090GfW.LJI(obj, null))));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((C42576GnM) next2).LIZLLL) {
                arrayList2.add(next2);
            }
        }
        if (true ^ arrayList2.isEmpty()) {
            C136125Vw.LIZ(context, "data_trans", ORZ.LLD(arrayList2, "\n", null, null, C42575GnL.LJLIL, 30));
        }
    }
}
