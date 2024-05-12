package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XI7 {
    public Object LIZ;
    public Serializable LIZIZ;
    public Object LIZJ;

    public XI7(int i) {
        if (i != 1) {
            this.LIZ = new C0M6(Integer.MAX_VALUE);
            this.LIZIZ = new CopyOnWriteArraySet();
            this.LIZJ = C79853Bl.LIZ(0, 1, XKI.DROP_OLDEST, 1);
        } else {
            this.LIZ = "";
            this.LIZIZ = "";
            this.LIZJ = "";
        }
    }

    public final void LIZLLL(String id) {
        o.LJIIIZ(id, "id");
        OSZ osz = (OSZ) ((C0M6) this.LIZ).LIZIZ(id);
        if (osz != null) {
            Object first = osz.getFirst();
            C0M6 c0m6 = (C0M6) this.LIZ;
            OSZ osz2 = new OSZ(first, first);
            o.LJIIIZ(c0m6, "<this>");
            c0m6.LIZJ(id, osz2);
            LIZ(id, first, EnumC2063587z.ROLLBACK);
        }
    }

    public final void LIZIZ(Object obj, String id) {
        o.LJIIIZ(id, "id");
        OSZ osz = (OSZ) ((C0M6) this.LIZ).LIZIZ(id);
        if (osz != null) {
            Object first = osz.getFirst();
            C0M6 c0m6 = (C0M6) this.LIZ;
            OSZ osz2 = new OSZ(first, obj);
            o.LJIIIZ(c0m6, "<this>");
            c0m6.LIZJ(id, osz2);
            LIZ(id, obj, EnumC2063587z.OPTIMISTIC);
        }
    }

    public final void LIZJ(Object obj, String id) {
        o.LJIIIZ(id, "id");
        OSZ osz = (OSZ) ((C0M6) this.LIZ).LIZIZ(id);
        if (osz != null) {
            if (!o.LJ(osz.getFirst(), obj)) {
                LIZ(id, obj, EnumC2063587z.MUTATION);
            }
            C0M6 c0m6 = (C0M6) this.LIZ;
            OSZ osz2 = new OSZ(obj, obj);
            o.LJIIIZ(c0m6, "<this>");
            c0m6.LIZJ(id, osz2);
        }
    }

    public final void LIZ(String id, Object obj, EnumC2063587z source) {
        if (!C52535Kjb.LIZIZ()) {
            o.LJIIIZ(id, "id");
            o.LJIIIZ(source, "source");
            ((C3BJ) this.LIZJ).LIZIZ(new AnonymousClass883(id, obj, source));
        }
        Iterator it = ((CopyOnWriteArraySet) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((AnonymousClass885) it.next()).id(id, obj, source);
        }
    }
}
