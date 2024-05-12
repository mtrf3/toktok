package X;

import defpackage.q;
import java.util.List;

/* renamed from: X.QRc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66996QRc {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public C66996QRc() {
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        List<String> list = this.LIZ;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<String> list2 = this.LIZIZ;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        return (i3 + i2) * 31 * 31;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IntentFilter{actions=");
        LIZ.append(this.LIZ);
        LIZ.append(", categories=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        LIZ.append((Object) null);
        LIZ.append(", mimetype=");
        return q.LIZIZ(LIZ, null, '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66996QRc)) {
            return false;
        }
        C66996QRc c66996QRc = (C66996QRc) obj;
        List<String> list = this.LIZ;
        if (list == null ? c66996QRc.LIZ != null : !list.equals(c66996QRc.LIZ)) {
            return false;
        }
        List<String> list2 = this.LIZIZ;
        if (list2 == null ? c66996QRc.LIZIZ != null : !list2.equals(c66996QRc.LIZIZ)) {
            return false;
        }
        c66996QRc.getClass();
        c66996QRc.getClass();
        return true;
    }

    public C66996QRc(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
