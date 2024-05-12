package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZg, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87592YZg extends AbstractC87594YZi {
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TotalFinish-CancelFinish info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87592YZg(InterfaceC87606YZu<AbstractC87590YZe> context, Object obj) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = obj;
    }

    @Override // X.AbstractC87594YZi, X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void LIZJ(Object obj, boolean z, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        LIZLLL("setSuccess");
    }
}
