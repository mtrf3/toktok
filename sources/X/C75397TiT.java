package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TiT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75397TiT<T> implements InterfaceC73592SuS {
    public final /* synthetic */ C75396TiS LJLIL;

    public C75397TiT(C75396TiS c75396TiS) {
        this.LJLIL = c75396TiS;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LIZ <= 0 || (System.currentTimeMillis() - this.LJLIL.LIZ) / 1000 >= 60) {
            return true;
        }
        return false;
    }
}
