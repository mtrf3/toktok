package X;

import java.io.Serializable;

/* renamed from: X.ODm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61546ODm<IN> implements InterfaceC61556ODw<IN>, Serializable {
    public final InterfaceC61556ODw<IN> LJLIL;

    @Override // X.InterfaceC61556ODw
    public final Object LIZ() {
        return this.LJLIL.LIZ();
    }

    public C61546ODm(C61548ODo c61548ODo) {
        this.LJLIL = c61548ODo;
    }

    @Override // X.InterfaceC61556ODw
    public final <I> I LIZIZ(Class<? extends AbstractC61551ODr<I, ?>> cls) {
        return (I) this.LJLIL.LIZIZ(cls);
    }

    @Override // X.InterfaceC61556ODw
    public final Object LIZJ(String str) {
        return this.LJLIL.LIZJ(str);
    }

    @Override // X.InterfaceC61556ODw
    public final Object LJ(IN in) {
        return this.LJLIL.LJ(in);
    }

    @Override // X.InterfaceC61556ODw
    public final <O> O LJFF(Class<? extends AbstractC61551ODr<?, O>> cls) {
        return (O) this.LJLIL.LJFF(cls);
    }

    @Override // X.InterfaceC61556ODw
    public final void LIZLLL(Object obj, String str) {
        this.LJLIL.LIZLLL(obj, str);
    }
}
