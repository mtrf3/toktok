package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H3k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43448H3k extends AbstractC43460H3w {
    @Override // X.AbstractC43460H3w
    public final H4Z LIZLLL() {
        if (C42991Gu3.LIZIZ(this.LIZ)) {
            return H4Z.CLIENT;
        }
        try {
            if (C2NU.LIZ.LIZIZ()) {
                return H4Z.CLIENT;
            }
        } catch (Exception unused) {
        }
        return H4Z.SERVER;
    }

    @Override // X.AbstractC43460H3w
    public final int LIZJ() {
        return C42991Gu3.LJI(13, LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43448H3k(Throwable error) {
        super(error);
        o.LJIIIZ(error, "error");
    }
}
