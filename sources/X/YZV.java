package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YZV extends YZU {
    public final C42360Gjs LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Finish-Failed exception:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LIZ(Object obj) {
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZS(interfaceC87606YZu, obj));
        this.LIZ.LIZLLL(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZV(InterfaceC87606YZu<AbstractC87589YZd> context, C42360Gjs exception) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(exception, "exception");
        this.LIZJ = exception;
    }
}
