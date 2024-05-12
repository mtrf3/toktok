package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Egn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37073Egn implements InterfaceC37074Ego {
    public final int LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC37074Ego
    public final C37076Egq LIZ(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return new C37076Egq(this.LIZ, this.LIZIZ, true);
    }

    public C37073Egn(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZ = i;
        this.LIZIZ = errorMsg;
    }
}
