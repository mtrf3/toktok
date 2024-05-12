package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UEp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76863UEp {
    public final int LIZ = R.drawable.amr;
    public final InterfaceC78716Uuu LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76863UEp)) {
            return false;
        }
        C76863UEp c76863UEp = (C76863UEp) obj;
        return this.LIZ == c76863UEp.LIZ && o.LJ(this.LIZIZ, c76863UEp.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        InterfaceC78716Uuu interfaceC78716Uuu = this.LIZIZ;
        return i + (interfaceC78716Uuu == null ? 0 : interfaceC78716Uuu.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FailureImage(resourceId=");
        LIZ.append(this.LIZ);
        LIZ.append(", scaleType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
