package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public abstract class YZX extends AbstractC87589YZd {
    public YZX(InterfaceC87606YZu interfaceC87606YZu) {
        super(interfaceC87606YZu, true);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LJIIL(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZW(interfaceC87606YZu, cause));
        this.LIZ.LJIIIZ(cause);
    }
}
