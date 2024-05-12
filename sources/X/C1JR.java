package X;

import X.C0Q9;
import kotlin.jvm.internal.o;

/* renamed from: X.1JR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JR<T, V extends C0Q9> implements C0QC<T, V> {
    public final InterfaceC88472Yns<T, V> LIZ;
    public final InterfaceC88472Yns<V, T> LIZIZ;

    @Override // X.C0QC
    public final InterfaceC88472Yns<T, V> LIZ() {
        return this.LIZ;
    }

    @Override // X.C0QC
    public final InterfaceC88472Yns<V, T> LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1JR(InterfaceC88472Yns<? super T, ? extends V> convertToVector, InterfaceC88472Yns<? super V, ? extends T> convertFromVector) {
        o.LJIIIZ(convertToVector, "convertToVector");
        o.LJIIIZ(convertFromVector, "convertFromVector");
        this.LIZ = convertToVector;
        this.LIZIZ = convertFromVector;
    }
}
