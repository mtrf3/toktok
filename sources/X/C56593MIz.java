package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MIz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56593MIz<T> implements InterfaceC58602MzG<T, T> {
    public final String LIZ;
    public final boolean LIZIZ;
    public final InterfaceC88472Yns<M95, T> LIZJ;

    @Override // X.InterfaceC58602MzG
    public final T LIZ(T t) {
        return t;
    }

    @Override // X.InterfaceC58602MzG
    public final InterfaceC88472Yns<M95, T> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC58602MzG
    public final boolean LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final String getName() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56593MIz(String name, boolean z, InterfaceC88472Yns<? super M95, ? extends T> interfaceC88472Yns) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = z;
        this.LIZJ = interfaceC88472Yns;
    }
}
