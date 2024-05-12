package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229618zl {
    public final Integer LIZ;
    public final List<Aweme> LIZIZ;
    public final boolean LIZJ;

    public C229618zl() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C229618zl)) {
            return false;
        }
        C229618zl c229618zl = (C229618zl) obj;
        return o.LJ(this.LIZ, c229618zl.LIZ) && o.LJ(this.LIZIZ, c229618zl.LIZIZ) && this.LIZJ == c229618zl.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Aweme> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PanelState(event=");
        LIZ.append(this.LIZ);
        LIZ.append(", list=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C229618zl(Integer num, List<? extends Aweme> list, boolean z) {
        this.LIZ = num;
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
