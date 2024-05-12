package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UV6 extends UV5 {
    public final UV2 LIZ;
    public final UVH LIZIZ;
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StateFail:");
        LIZ.append(this.LIZ.LJIIIZ());
        LIZ.append(" reason:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" ext:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public UV6(UV2 sendInfo, UVH uvh, Object obj) {
        o.LJIIIZ(sendInfo, "sendInfo");
        this.LIZ = sendInfo;
        this.LIZIZ = uvh;
        this.LIZJ = obj;
    }
}
