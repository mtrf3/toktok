package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ORe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61902ORe {
    public final int LIZ;
    public final ORV<C109544Rq> LIZIZ;
    public final LinkedHashSet<String> LIZJ;

    public final void LIZ() {
        if (this.LIZIZ.size() <= this.LIZ) {
            ORZ.LLJI(this.LIZIZ);
            this.LIZIZ.clear();
            this.LIZJ.clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        while ((!this.LIZIZ.isEmpty()) && arrayList.size() < this.LIZ) {
            ORV<C109544Rq> orv = this.LIZIZ;
            C109544Rq c109544Rq = null;
            if (!orv.isEmpty()) {
                c109544Rq = orv.removeFirst();
            }
            C109544Rq c109544Rq2 = c109544Rq;
            if (c109544Rq2 == null) {
                return;
            }
            this.LIZJ.remove(c109544Rq2.getUuid());
            arrayList.add(c109544Rq2);
        }
    }

    public C61902ORe(int i) {
        this.LIZ = i;
        ORV<C109544Rq> orv = new ORV<>();
        this.LIZIZ = orv;
        this.LIZJ = new LinkedHashSet<>();
        orv.size();
    }

    public final void LIZIZ(C109544Rq message) {
        o.LJIIIZ(message, "message");
        if (this.LIZJ.contains(message.getUuid())) {
            return;
        }
        this.LIZIZ.addFirst(message);
        this.LIZJ.add(message.getUuid());
    }

    public final void LIZJ(List<? extends C109544Rq> msgList) {
        o.LJIIIZ(msgList, "msgList");
        Iterator<? extends C109544Rq> it = msgList.iterator();
        while (it.hasNext()) {
            LIZIZ(it.next());
        }
    }
}
