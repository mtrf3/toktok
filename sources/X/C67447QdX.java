package X;

import android.content.Context;

/* renamed from: X.QdX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67447QdX implements InterfaceC67459Qdj<C79383VDn> {
    public final C4G1<Context> LIZ;
    public final C4G1<String> LIZIZ;
    public final C4G1<Integer> LIZJ;

    @Override // X.C4G1
    public final Object get() {
        return new C79383VDn(this.LIZ.get(), this.LIZJ.get().intValue(), this.LIZIZ.get());
    }

    public C67447QdX(C4G1 c4g1) {
        C67455Qdf c67455Qdf = C67464Qdo.LIZ;
        C67450Qda c67450Qda = C67465Qdp.LIZ;
        this.LIZ = c4g1;
        this.LIZIZ = c67455Qdf;
        this.LIZJ = c67450Qda;
    }
}
