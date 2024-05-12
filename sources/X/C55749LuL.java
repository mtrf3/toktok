package X;

import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.LuL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55749LuL<T> implements C5H3<T> {
    public final boolean LJLIL;
    public final InterfaceC65784Pro<T> LJLILLLLZI;
    public T LJLJI;

    @Override // X.C5H3
    public final T getValue() {
        T t = this.LJLJI;
        if (t == null) {
            return (T) SZE.LJ(C65352Pkq.LIZ(C88498YoI.class), new SZD(), new AqS159S0100000_9(this, 764));
        }
        return t;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        return this.LJLIL;
    }

    public C55749LuL(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
