package X;

import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C199547sM<PO> extends AbstractC54815LfH<String, PO> {
    public final int LIZIZ;
    public final long LIZJ;
    public final C62822Ol8 LIZLLL;

    public C199547sM() {
        this(0);
    }

    public final C7T9 LJI() {
        return (C7T9) this.LIZLLL.getValue();
    }

    public /* synthetic */ C199547sM(int i) {
        this(Integer.MAX_VALUE, -1L);
    }

    @Override // X.AbstractC54815LfH
    public final Object LIZLLL(String k) {
        o.LJIIIZ(k, "k");
        C199557sN<Object> c199557sN = LJI().get(k);
        if (c199557sN != null) {
            if (this.LIZJ > 0 && System.currentTimeMillis() - c199557sN.LIZIZ > this.LIZJ) {
                remove(k);
            } else {
                return c199557sN.LIZ;
            }
        }
        return null;
    }

    @Override // X.AbstractC54815LfH
    public final C199567sO LJ(String k) {
        o.LJIIIZ(k, "k");
        return LJI().remove(k);
    }

    public C199547sM(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1469));
    }

    @Override // X.AbstractC54815LfH
    public final C199557sN LJFF(Object obj, Object obj2) {
        String k = (String) obj;
        o.LJIIIZ(k, "k");
        C199557sN c199557sN = new C199557sN(System.currentTimeMillis(), obj2, k);
        LJI().put(k, c199557sN);
        return c199557sN;
    }

    public final C199567sO LJII(Object obj, Object obj2) {
        long currentTimeMillis;
        String str = (String) obj;
        C199567sO<PO> remove = remove(str);
        if (remove != null) {
            currentTimeMillis = remove.LIZIZ;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        C199557sN c199557sN = new C199557sN(currentTimeMillis, obj2, str);
        LJI().put(str, c199557sN);
        return c199557sN;
    }
}
