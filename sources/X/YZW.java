package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YZW extends YZU {
    public final AbstractC42983Gtv LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Finish-Canceled cause:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LIZ(Object obj) {
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZQ(interfaceC87606YZu, obj));
        this.LIZ.LIZLLL(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZW(InterfaceC87606YZu<AbstractC87589YZd> context, AbstractC42983Gtv cause) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cause, "cause");
        this.LIZJ = cause;
    }
}
