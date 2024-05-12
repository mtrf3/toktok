package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PRn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64459PRn implements InterfaceC64469PRx {
    @Override // X.InterfaceC64469PRx
    public final boolean LIZ(C64464PRs probeUnit, List messageList, long j) {
        o.LJIIIZ(probeUnit, "probeUnit");
        o.LJIIIZ(messageList, "messageList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : messageList) {
            long longValue = ((Number) ((C64466PRu) obj).LIZLLL.getValue()).longValue();
            if (5 <= longValue && longValue < 30) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        C64467PRv c64467PRv = new C64467PRv();
        c64467PRv.LIZ = 2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C64466PRu c64466PRu = (C64466PRu) it.next();
            C64468PRw c64468PRw = new C64468PRw();
            c64468PRw.LIZ = "";
            c64468PRw.LIZIZ = Q8U.LIZIZ(new Object[]{Float.valueOf(((float) ((Number) c64466PRu.LIZLLL.getValue()).longValue()) / ((float) j))}, 1, "%.2f", "format(format, *args)");
            arrayList2.add(c64468PRw);
        }
        c64467PRv.LIZJ = arrayList2;
        probeUnit.LIZ(c64467PRv);
        return true;
    }
}
