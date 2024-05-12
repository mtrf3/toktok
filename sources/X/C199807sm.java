package X;

import java.util.Iterator;
import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.7sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199807sm<T> implements Iterable<C2058786d<? extends T>>, InterfaceC90533gv {
    public final InterfaceC65784Pro<Iterator<T>> LJLIL;

    @Override // java.lang.Iterable
    public final Iterator<C2058786d<T>> iterator() {
        return new C199797sl(this.LJLIL.invoke());
    }

    public C199807sm(AqS153S0100000_3 aqS153S0100000_3) {
        this.LJLIL = aqS153S0100000_3;
    }
}
