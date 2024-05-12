package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class INT {
    public final String LIZ;
    public final INS LIZIZ;
    public final InterfaceC88472Yns<Aweme, Boolean> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof INT)) {
            return false;
        }
        INT r5 = (INT) obj;
        return o.LJ(this.LIZ, r5.LIZ) && this.LIZIZ == r5.LIZIZ && o.LJ(this.LIZJ, r5.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipAwemeFilter(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", filter=");
        return C249109q6.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public INT(String str, INS type, InterfaceC88472Yns<? super Aweme, Boolean> filter) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(filter, "filter");
        this.LIZ = str;
        this.LIZIZ = type;
        this.LIZJ = filter;
    }
}
