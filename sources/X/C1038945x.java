package X;

import java.util.Iterator;
import kotlin.jvm.internal.AqS120S0300000_1;

/* renamed from: X.45x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038945x<T, R> implements InterfaceC1039145z<R> {
    public final InterfaceC1039145z<T> LIZ;
    public final InterfaceC88471Ynr<Integer, T, R> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<R> iterator() {
        return new C1039045y(this);
    }

    public C1038945x(InterfaceC1039145z interfaceC1039145z, AqS120S0300000_1 aqS120S0300000_1) {
        this.LIZ = interfaceC1039145z;
        this.LIZIZ = aqS120S0300000_1;
    }
}
