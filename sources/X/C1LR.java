package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1LR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LR extends AbstractC07660Ru {
    public final String LIZ;
    public final List<C279917z> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LR)) {
            return false;
        }
        C1LR c1lr = (C1LR) obj;
        return o.LJ(this.LIZ, c1lr.LIZ) && o.LJ(this.LIZIZ, c1lr.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateSearchList(keyword=");
        LIZ.append(this.LIZ);
        LIZ.append(", songList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LR(String keyword, List<C279917z> songList) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(songList, "songList");
        this.LIZ = keyword;
        this.LIZIZ = songList;
    }
}
