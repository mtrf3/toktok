package X;

import com.byted.cast.common.source.ServiceInfo;

/* renamed from: X.ZeL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90429ZeL {
    public final int LIZ;
    public final ServiceInfo LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        String serviceInfo;
        StringBuilder LIZ = X1D.LIZ();
        ServiceInfo serviceInfo2 = this.LIZIZ;
        if (serviceInfo2 == null) {
            serviceInfo = "";
        } else {
            serviceInfo = serviceInfo2.toString();
        }
        LIZ.append(serviceInfo);
        LIZ.append(", type=");
        LIZ.append(this.LIZ);
        LIZ.append(", what=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public C90429ZeL(int i, ServiceInfo serviceInfo, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = serviceInfo;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
