package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H3l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43449H3l extends AbstractC43460H3w {
    @Override // X.AbstractC43460H3w
    public final int LIZJ() {
        return C42991Gu3.LJI(11, LIZ());
    }

    @Override // X.AbstractC43460H3w
    public final H4Z LIZLLL() {
        if (LIZ() instanceof C43466H4c) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43449H3l(Throwable error) {
        super(error);
        o.LJIIIZ(error, "error");
    }
}
