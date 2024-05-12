package X;

import java.util.ArrayList;

/* renamed from: X.CUk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31410CUk<T> {
    public final C31413CUn LIZ;
    public final Class<? extends T> LIZIZ;
    public AbstractC31414CUo<T, ?>[] LIZJ;

    public final void LIZ(InterfaceC31400CUa<T> interfaceC31400CUa) {
        for (AbstractC31414CUo<T, ?> abstractC31414CUo : this.LIZJ) {
            C31413CUn c31413CUn = this.LIZ;
            Class<? extends T> cls = this.LIZIZ;
            C31411CUl c31411CUl = (C31411CUl) c31413CUn.LJLILLLLZI;
            ((ArrayList) c31411CUl.LIZ).add(cls);
            ((ArrayList) c31411CUl.LIZIZ).add(abstractC31414CUo);
            ((ArrayList) c31411CUl.LIZJ).add(interfaceC31400CUa);
        }
    }

    public C31410CUk(C31413CUn c31413CUn, Class<? extends T> cls) {
        this.LIZIZ = cls;
        this.LIZ = c31413CUn;
    }
}
