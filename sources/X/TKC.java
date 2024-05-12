package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKC implements TII {
    public final /* synthetic */ C82397WVl LIZ;

    public TKC(C82397WVl c82397WVl) {
        this.LIZ = c82397WVl;
    }

    @Override // X.TII
    public final <T> TIH LIZ(InterfaceC46243ICx<T> request) {
        o.LJIIIZ(request, "request");
        if (V16.LJJJJZ(this.LIZ.getShortVideoContext()) && this.LIZ.LJLLI && request.LIZ()) {
            return new TIH(true, null);
        }
        return new TIH(false, null);
    }
}
