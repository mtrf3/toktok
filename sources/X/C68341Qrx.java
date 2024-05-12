package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.Qrx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68341Qrx {
    public final TreeMap LIZ = new TreeMap();
    public final TreeMap LIZIZ = new TreeMap();

    public final void LIZ(C68377QsX c68377QsX, C68284Qr2 c68284Qr2) {
        int LIZIZ;
        C68362QsI c68362QsI = new C68362QsI(c68284Qr2);
        for (Object obj : this.LIZ.keySet()) {
            C68276Qqu clone = c68284Qr2.LIZIZ.clone();
            InterfaceC68379QsZ LIZ = ((AbstractC68364QsK) this.LIZ.get(obj)).LIZ(c68377QsX, Collections.singletonList(c68362QsI));
            if (!(LIZ instanceof C68366QsM) || (LIZIZ = C68368QsO.LIZIZ(LIZ.LJI().doubleValue())) == 2 || LIZIZ == -1) {
                c68284Qr2.LIZIZ = clone;
            }
        }
        Iterator it = this.LIZIZ.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC68379QsZ LIZ2 = ((AbstractC68364QsK) this.LIZIZ.get(it.next())).LIZ(c68377QsX, Collections.singletonList(c68362QsI));
            if (LIZ2 instanceof C68366QsM) {
                C68368QsO.LIZIZ(LIZ2.LJI().doubleValue());
            }
        }
    }
}
