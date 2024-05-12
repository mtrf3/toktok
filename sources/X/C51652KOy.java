package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.KOy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51652KOy<T, R, E> implements InterfaceC1039145z<E> {
    public final InterfaceC1039145z<T> LIZ;
    public final InterfaceC88472Yns<T, R> LIZIZ;
    public final InterfaceC88472Yns<R, Iterator<E>> LIZJ;

    @Override // X.InterfaceC1039145z
    public final Iterator<E> iterator() {
        return new C51651KOx(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51652KOy(InterfaceC1039145z<? extends T> sequence, InterfaceC88472Yns<? super T, ? extends R> transformer, InterfaceC88472Yns<? super R, ? extends Iterator<? extends E>> iterator) {
        o.LJIIIZ(sequence, "sequence");
        o.LJIIIZ(transformer, "transformer");
        o.LJIIIZ(iterator, "iterator");
        this.LIZ = sequence;
        this.LIZIZ = transformer;
        this.LIZJ = iterator;
    }
}
