package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WdT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82731WdT<T> implements InterfaceC73592SuS {
    public final /* synthetic */ InterfaceC65052gv<Integer> LJLIL;

    public C82731WdT(C73578SuE c73578SuE) {
        this.LJLIL = c73578SuE;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C69084R9k c69084R9k = (C69084R9k) it;
        ((C73578SuE) this.LJLIL).onSuccess(Integer.valueOf(c69084R9k.getErrorCode()));
        int errorCode = c69084R9k.getErrorCode();
        if (C82727WdP.LJ.contains(Integer.valueOf(errorCode)) || errorCode < 0) {
            return true;
        }
        return false;
    }
}
