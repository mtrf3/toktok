package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qr2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68284Qr2 {
    public C68276Qqu LIZ;
    public C68276Qqu LIZIZ;
    public final List LIZJ;

    public final /* bridge */ /* synthetic */ Object clone() {
        C68284Qr2 c68284Qr2 = new C68284Qr2(this.LIZ.clone());
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            C68276Qqu c68276Qqu = (C68276Qqu) it.next();
            ((ArrayList) c68284Qr2.LIZJ).add(c68276Qqu.clone());
        }
        return c68284Qr2;
    }

    public C68284Qr2() {
        this.LIZ = new C68276Qqu(0L, "", null);
        this.LIZIZ = new C68276Qqu(0L, "", null);
        this.LIZJ = new ArrayList();
    }

    public C68284Qr2(C68276Qqu c68276Qqu) {
        this.LIZ = c68276Qqu;
        this.LIZIZ = c68276Qqu.clone();
        this.LIZJ = new ArrayList();
    }
}
