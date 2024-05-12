package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83813Qr implements InterfaceC83863Qw {
    public final List<IMContact> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83813Qr)) {
            return false;
        }
        C83813Qr c83813Qr = (C83813Qr) obj;
        return o.LJ(this.LIZ, c83813Qr.LIZ) && this.LIZIZ == c83813Qr.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Loaded(data=");
        LIZ.append(this.LIZ);
        LIZ.append(", isLoading=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83813Qr(List<? extends IMContact> data, boolean z) {
        o.LJIIIZ(data, "data");
        this.LIZ = data;
        this.LIZIZ = z;
    }
}
