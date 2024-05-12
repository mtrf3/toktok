package X;

import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class YZQ extends YZT {
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Finish-CancelFinish info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZQ(InterfaceC87606YZu<AbstractC87589YZd> context, Object obj) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = obj;
    }
}
