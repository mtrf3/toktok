package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FQa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38940FQa<T> implements FTR<T> {
    public final String LIZ;
    public final InterfaceC65784Pro<T> LIZIZ;

    @Override // X.FTR
    public final T getValue() {
        return this.LIZIZ.invoke();
    }

    @Override // X.FTR
    public final String name() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38940FQa(String key, Class<T> clazz, InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        o.LJIIJ(key, "key");
        o.LJIIJ(clazz, "clazz");
        this.LIZ = key;
        this.LIZIZ = interfaceC65784Pro;
    }
}
