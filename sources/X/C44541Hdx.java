package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44541Hdx {
    public final String LIZ;
    public final int LIZIZ;

    public C44541Hdx() {
        this("", 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44541Hdx)) {
            return false;
        }
        C44541Hdx c44541Hdx = (C44541Hdx) obj;
        return o.LJ(this.LIZ, c44541Hdx.LIZ) && this.LIZIZ == c44541Hdx.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeviceInfo(region=");
        LIZ.append(this.LIZ);
        LIZ.append(", internetSpeed=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C44541Hdx(String region, int i) {
        o.LJIIIZ(region, "region");
        this.LIZ = region;
        this.LIZIZ = i;
    }
}
