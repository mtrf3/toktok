package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Mp5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57971Mp5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C57972Mp6 LIZ;
    public final AbstractC57774Mlu<RecUser> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57971Mp5)) {
            return false;
        }
        C57971Mp5 c57971Mp5 = (C57971Mp5) obj;
        return o.LJ(this.LIZ, c57971Mp5.LIZ) && o.LJ(this.LIZIZ, c57971Mp5.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadResult(isRefresh: ");
        LIZ.append(this.LIZ.LIZ);
        LIZ.append(", origin:");
        LIZ.append(this.LIZ.LIZJ);
        LIZ.append(", pageResult:");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C57971Mp5(C57972Mp6 loadContext, AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
        o.LJIIIZ(loadContext, "loadContext");
        this.LIZ = loadContext;
        this.LIZIZ = abstractC57774Mlu;
    }
}
