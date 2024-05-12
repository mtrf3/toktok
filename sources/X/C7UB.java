package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7UB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UB {
    public final List<Aweme> LIZ;
    public final C7UF LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7UB)) {
            return false;
        }
        C7UB c7ub = (C7UB) obj;
        return o.LJ(this.LIZ, c7ub.LIZ) && o.LJ(this.LIZIZ, c7ub.LIZIZ) && this.LIZJ == c7ub.LIZJ;
    }

    public final int hashCode() {
        List<Aweme> list = this.LIZ;
        return ((this.LIZIZ.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubOnlyVideoItemList(awemeList=");
        LIZ.append(this.LIZ);
        LIZ.append(", cursor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasMore=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7UB(List<? extends Aweme> list, C7UF c7uf, int i) {
        this.LIZ = list;
        this.LIZIZ = c7uf;
        this.LIZJ = i;
    }
}
