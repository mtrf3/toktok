package X;

import X.InterfaceC67808QjM;
import android.content.Context;
import android.os.Looper;

/* renamed from: X.Qi3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67727Qi3<O extends InterfaceC67808QjM> extends C67726Qi2 {
    public final AbstractC67791Qj5<O> LJLJI;

    @Override // X.AbstractC67709Qhl
    public final Context LJIIIIZZ() {
        return this.LJLJI.LIZ;
    }

    @Override // X.AbstractC67709Qhl
    public final Looper LJIIIZ() {
        return this.LJLJI.LJFF;
    }

    public C67727Qi3(AbstractC67791Qj5<O> abstractC67791Qj5) {
        this.LJLJI = abstractC67791Qj5;
    }

    @Override // X.AbstractC67709Qhl
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LJI(T t) {
        this.LJLJI.LIZJ(1, t);
        return t;
    }

    public final AbstractC67748QiO LJIILJJIL(C67987QmF c67987QmF) {
        this.LJLJI.LIZJ(0, c67987QmF);
        return c67987QmF;
    }
}
