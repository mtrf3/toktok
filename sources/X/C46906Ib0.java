package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ib0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46906Ib0 implements InterfaceC46911Ib5 {
    public final String LIZ;
    public final ConcurrentHashMap<String, C46908Ib2> LIZIZ;

    @Override // X.InterfaceC46904Iay
    public final long LIZIZ() {
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LIZIZ, "children.values");
        long j = 0;
        while (LIZLLL.hasNext()) {
            j += ((C46908Ib2) LIZLLL.next()).LIZJ;
        }
        return j;
    }

    @Override // X.InterfaceC46904Iay
    public final List<InterfaceC46904Iay> LIZJ() {
        Collection<C46908Ib2> values = this.LIZIZ.values();
        o.LJIIIIZZ(values, "children.values");
        return ORZ.LLJI(values);
    }

    @Override // X.InterfaceC46904Iay
    public final long LIZLLL() {
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LIZIZ, "children.values");
        long j = 0;
        while (LIZLLL.hasNext()) {
            j += ((C46908Ib2) LIZLLL.next()).LIZIZ;
        }
        return j;
    }

    @Override // X.InterfaceC46904Iay
    public final float LJ() {
        return C46910Ib4.LIZ(this);
    }

    @Override // X.InterfaceC46904Iay
    public final String key() {
        return this.LIZ;
    }

    public C46906Ib0(String videoId) {
        o.LJIIIZ(videoId, "videoId");
        this.LIZ = videoId;
        this.LIZIZ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC46911Ib5
    public final void LIZ(long j, long j2, String key) {
        C46908Ib2 putIfAbsent;
        o.LJIIIZ(key, "key");
        ConcurrentHashMap<String, C46908Ib2> concurrentHashMap = this.LIZIZ;
        C46908Ib2 c46908Ib2 = concurrentHashMap.get(key);
        if (c46908Ib2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(key, (c46908Ib2 = new C46908Ib2(key)))) != null) {
            c46908Ib2 = putIfAbsent;
        }
        c46908Ib2.LIZ(j, j2, key);
    }
}
