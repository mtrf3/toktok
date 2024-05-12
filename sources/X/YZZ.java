package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YZZ extends YZX {
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Runnable-Paused info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void LJI(Object obj) {
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZY(interfaceC87606YZu));
        this.LIZ.LJ(obj, C87587YZb.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZZ(InterfaceC87606YZu<AbstractC87589YZd> context, Object obj) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = obj;
    }
}
