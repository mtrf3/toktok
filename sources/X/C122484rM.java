package X;

import android.graphics.PointF;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4rM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122484rM {
    public final List<PointF> LIZ;
    public final String LIZIZ = "warpDemo";
    public final InterfaceC122454rJ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C122484rM)) {
            return false;
        }
        C122484rM c122484rM = (C122484rM) obj;
        return o.LJ(this.LIZ, c122484rM.LIZ) && o.LJ(this.LIZIZ, c122484rM.LIZIZ) && o.LJ(this.LIZJ, c122484rM.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeCurveSpeedParam(curvePoints=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", listener=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        InterfaceC122454rJ interfaceC122454rJ = this.LIZJ;
        if (interfaceC122454rJ == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC122454rJ.hashCode();
        }
        return LJ + hashCode;
    }

    public C122484rM(List list, C79057V0z c79057V0z) {
        this.LIZ = list;
        this.LIZJ = c79057V0z;
    }
}
