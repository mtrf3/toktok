package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LeX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54769LeX<T> implements InterfaceC73592SuS {
    public final /* synthetic */ AbstractC54806Lf8 LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public C54769LeX(C54808LfA c54808LfA, Object obj) {
        this.LJLIL = c54808LfA;
        this.LJLILLLLZI = obj;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        C54789Ler it = (C54789Ler) obj;
        o.LJIIIZ(it, "it");
        if (o.LJ(this.LJLIL.LIZ(it.LIZIZ, it.LIZJ), this.LJLILLLLZI) && (!it.LIZ.isEmpty())) {
            return true;
        }
        return false;
    }
}
