package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CKM<T> implements InterfaceC73592SuS {
    public final /* synthetic */ CKJ LJLIL;

    public CKM(CKJ ckj) {
        this.LJLIL = ckj;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL.LJ.size() < 5) {
            return true;
        }
        return false;
    }
}
