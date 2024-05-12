package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xo1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85933Xo1 {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(": [inner: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sys: ");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ']', LIZ);
    }

    public C85933Xo1(String channelName) {
        o.LJIIIZ(channelName, "channelName");
        this.LIZ = channelName;
        this.LIZIZ = C85940Xo8.LIZIZ.LIZLLL(channelName) == 1;
        this.LIZJ = C85926Xnu.LIZ(channelName);
    }
}
