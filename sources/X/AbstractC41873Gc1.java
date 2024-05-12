package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gc1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41873Gc1 implements InterfaceC36938Eec {
    public final java.util.Map<Object, C41874Gc2> LIZ;
    public final java.util.Map<Object, Object> LIZIZ;
    public final Object LIZJ;
    public final List<Object> LIZLLL;

    public abstract void LIZ(Object obj, AbstractC42983Gtv abstractC42983Gtv, int i, int i2);

    public void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
    }

    public abstract void LIZJ(Object obj, C42360Gjs c42360Gjs, int i, int i2);

    public void LIZLLL(Object sourceTag, C41875Gc3 happenTime, AbstractC41872Gc0 event) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(event, "event");
    }

    public abstract void LJ(Object obj, ERR err);

    public abstract void LJFF(Object obj, Object obj2, boolean z, int i, int i2);

    @Override // X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        List<Object> list = this.LIZLLL;
        if (list != null && (event instanceof C41852Gbg) && list.contains(event.LIZ)) {
            this.LIZIZ.put(event.LIZ, ((C41852Gbg) event).LIZLLL);
        }
        if (this.LIZJ != null && (!o.LJ(r1, event.LIZ))) {
            return;
        }
        if (event instanceof C41870Gby) {
            C41870Gby c41870Gby = (C41870Gby) event;
            this.LIZ.put(event.LIZ, new C41874Gc2(event.LIZIZ, c41870Gby.LIZJ));
            LJ(event.LIZ, c41870Gby.LIZLLL);
            return;
        }
        if (event instanceof C41852Gbg) {
            Object obj = ((LinkedHashMap) this.LIZ).get(event.LIZ);
            o.LJI(obj);
            C41875Gc3 L = event.LIZIZ.L(((C41874Gc2) obj).LIZ);
            long j = L.LJLIL;
            long j2 = L.LJLILLLLZI;
            Object obj2 = event.LIZ;
            C41852Gbg c41852Gbg = (C41852Gbg) event;
            LJFF(obj2, c41852Gbg.LIZLLL, c41852Gbg.LJ, (int) j, (int) j2);
            return;
        }
        if (event instanceof C41851Gbf) {
            Object obj3 = ((LinkedHashMap) this.LIZ).get(event.LIZ);
            o.LJI(obj3);
            C41875Gc3 L2 = event.LIZIZ.L(((C41874Gc2) obj3).LIZ);
            LIZJ(event.LIZ, ((C41851Gbf) event).LIZLLL, (int) L2.LJLIL, (int) L2.LJLILLLLZI);
            return;
        }
        if (event instanceof C41853Gbh) {
            Object obj4 = ((LinkedHashMap) this.LIZ).get(event.LIZ);
            o.LJI(obj4);
            C41875Gc3 L3 = event.LIZIZ.L(((C41874Gc2) obj4).LIZ);
            LIZ(event.LIZ, ((C41853Gbh) event).LIZLLL, (int) L3.LJLIL, (int) L3.LJLILLLLZI);
            return;
        }
        if (event instanceof C41871Gbz) {
            LIZIZ(event.LIZIZ, event.LIZ, ((C41871Gbz) event).LIZJ);
        } else {
            LIZLLL(event.LIZ, event.LIZIZ, event);
        }
    }

    public AbstractC41873Gc1(Object obj, List<? extends Object> list) {
        this.LIZJ = obj;
        this.LIZLLL = list;
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
    }

    public /* synthetic */ AbstractC41873Gc1(Object obj, int i) {
        this((i & 1) != 0 ? null : obj, (List<? extends Object>) null);
    }
}
