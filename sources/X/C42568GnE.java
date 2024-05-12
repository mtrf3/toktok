package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GnE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42568GnE implements InterfaceC42567GnD {
    @Override // X.InterfaceC42567GnD
    public final void LIZ(List<Object> list, Context context, Object obj) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C42572GnI) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String LLD = ORZ.LLD(arrayList, ",", null, null, C42580GnQ.LJLIL, 30);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C42572GnI) it2.next()).LIZIZ);
        }
        String LLD2 = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        C42572GnI c42572GnI = (C42572GnI) ORZ.LJLLLL(arrayList);
        if (c42572GnI != null) {
            str = c42572GnI.LIZJ;
        } else {
            str = null;
        }
        C65542hi.LIZ("commercial_hashtag_lost", C113554cx.LJJL(new OSZ("hashtag_type", LLD), new OSZ("hashtag_name", LLD2), new OSZ("error_stage", str), new OSZ("creation_id", C42090GfW.LIZJ(obj)), new OSZ("shoot_way", C42090GfW.LJI(obj, null)), new OSZ("enter_from", C42090GfW.LIZLLL(obj)), new OSZ("enter_method", C42090GfW.LJ(obj))));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((C42572GnI) next2).LIZLLL) {
                arrayList3.add(next2);
            }
        }
        if (!arrayList3.isEmpty()) {
            C136125Vw.LIZ(context, "hashtag", ORZ.LLD(arrayList3, "\n", null, null, C42574GnK.LJLIL, 30));
        }
    }
}
