package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87593YZh extends AbstractC87594YZi {
    public final C42360Gjs LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TotalFinish-Failed exception:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87593YZh(InterfaceC87606YZu<AbstractC87590YZe> context, C42360Gjs exception) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(exception, "exception");
        this.LIZJ = exception;
    }
}
