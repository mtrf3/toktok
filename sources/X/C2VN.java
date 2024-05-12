package X;

import android.content.Context;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2VN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VN {
    public final Context LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2VN)) {
            return false;
        }
        C2VN c2vn = (C2VN) obj;
        return o.LJ(this.LIZ, c2vn.LIZ) && this.LIZIZ == c2vn.LIZIZ && o.LJ(this.LIZJ, c2vn.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicTitleClickInfo(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", targetViewId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", awemeId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C2VN(Context context, int i, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
