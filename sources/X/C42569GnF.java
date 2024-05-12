package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GnF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42569GnF implements InterfaceC42567GnD {
    @Override // X.InterfaceC42567GnD
    public final void LIZ(List<Object> list, Context context, Object obj) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C42571GnH) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String LLD = ORZ.LLD(arrayList, ",", null, null, C42578GnO.LJLIL, 30);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C42571GnH) it2.next()).LIZIZ);
        }
        String LLD2 = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        C42571GnH c42571GnH = (C42571GnH) ORZ.LJLLLL(arrayList);
        if (c42571GnH != null) {
            str = c42571GnH.LIZJ;
        } else {
            str = null;
        }
        C65542hi.LIZ("video_anchor_lost", C113554cx.LJJL(new OSZ("anchor_type", LLD), new OSZ("anchor_info", LLD2), new OSZ("error_stage", str), new OSZ("creation_id", C42090GfW.LIZJ(obj)), new OSZ("shoot_way", C42090GfW.LJI(obj, null)), new OSZ("enter_from", C42090GfW.LIZLLL(obj)), new OSZ("enter_method", C42090GfW.LJ(obj))));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((C42571GnH) next2).LIZLLL) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList3.isEmpty()) {
            C136125Vw.LIZ(context, "anchor", ORZ.LLD(arrayList3, "\n", null, null, C42573GnJ.LJLIL, 30));
        }
    }
}
