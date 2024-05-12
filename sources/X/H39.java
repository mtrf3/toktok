package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H39 extends AbstractC43460H3w {
    @Override // X.AbstractC43460H3w
    public final String LIZIZ() {
        C42990Gu2 c42990Gu2;
        C41359GLb cancelCause;
        String str;
        Throwable th = this.LIZ;
        if (!C42991Gu3.LIZJ(th)) {
            return "";
        }
        Throwable cause = th.getCause();
        if (!(cause instanceof C42990Gu2) || (c42990Gu2 = (C42990Gu2) cause) == null || (cancelCause = c42990Gu2.getCancelCause()) == null || (str = cancelCause.LIZ) == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC43460H3w
    public final int LIZJ() {
        return C42991Gu3.LJFF(this.LIZ);
    }

    @Override // X.AbstractC43460H3w
    public final H4Z LIZLLL() {
        Throwable th = this.LIZ;
        if (C42991Gu3.LIZIZ(th)) {
            return H4Z.CLIENT;
        }
        if (C42991Gu3.LIZ(th)) {
            return H4Z.CLIENT;
        }
        if (C42991Gu3.LIZJ(th)) {
            return H4Z.CLIENT;
        }
        return H4Z.VESDK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H39(Throwable error) {
        super(error);
        o.LJIIIZ(error, "error");
    }
}
