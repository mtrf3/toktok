package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class OJ5 extends TBS implements InterfaceC88472Yns<Iterable<Object>, Iterator<Object>> {
    public static final OJ5 LJLIL = new OJ5();

    public OJ5() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        Iterable<Object> p0 = iterable;
        o.LJIIIZ(p0, "p0");
        return p0.iterator();
    }
}
