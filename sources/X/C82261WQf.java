package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WQf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82261WQf implements InterfaceC82278WQw {
    public final String LIZ;

    public C82261WQf(String filterRootDir) {
        o.LJIIIZ(filterRootDir, "filterRootDir");
        this.LIZ = filterRootDir;
    }

    @Override // X.InterfaceC82278WQw
    public final String LIZIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C17N.LJJIJIL(this.LIZ));
        LIZ.append(i);
        return C17N.LJJIJIL(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC82278WQw
    public final String LIZLLL(int i) {
        return this.LIZ;
    }

    @Override // X.InterfaceC82278WQw
    public final String LJFF(int i) {
        return C72972SkS.LIZLLL(i, ".zip");
    }
}
