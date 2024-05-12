package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H3m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43450H3m extends AbstractC43460H3w {
    @Override // X.AbstractC43460H3w
    public final H4Z LIZLLL() {
        if (C42991Gu3.LIZIZ(this.LIZ)) {
            return H4Z.CLIENT;
        }
        return H4Z.UPLOAD_SDK;
    }

    @Override // X.AbstractC43460H3w
    public final int LIZJ() {
        return C42991Gu3.LJII(LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43450H3m(Throwable error) {
        super(error);
        o.LJIIIZ(error, "error");
    }
}
