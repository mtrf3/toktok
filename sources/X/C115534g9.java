package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4g9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115534g9<T> implements InterfaceC1039145z<T> {
    public final InterfaceC1039145z<T> LIZ;
    public final boolean LIZIZ;
    public final InterfaceC88472Yns<T, Boolean> LIZJ;

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        return new C115524g8(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C115534g9(InterfaceC1039145z<? extends T> sequence, boolean z, InterfaceC88472Yns<? super T, Boolean> predicate) {
        o.LJIIIZ(sequence, "sequence");
        o.LJIIIZ(predicate, "predicate");
        this.LIZ = sequence;
        this.LIZIZ = z;
        this.LIZJ = predicate;
    }
}
