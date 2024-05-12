package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4Vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110574Vp<T, R> implements InterfaceC1039145z<R> {
    public final InterfaceC1039145z<T> LIZ;
    public final InterfaceC88472Yns<T, R> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<R> iterator() {
        return new C110564Vo(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C110574Vp(InterfaceC1039145z<? extends T> sequence, InterfaceC88472Yns<? super T, ? extends R> transformer) {
        o.LJIIIZ(sequence, "sequence");
        o.LJIIIZ(transformer, "transformer");
        this.LIZ = sequence;
        this.LIZIZ = transformer;
    }
}
