package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JUo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49250JUo {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Aweme LIZLLL;
    public final C49128JPw LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49250JUo)) {
            return false;
        }
        C49250JUo c49250JUo = (C49250JUo) obj;
        return this.LIZ == c49250JUo.LIZ && this.LIZIZ == c49250JUo.LIZIZ && o.LJ(this.LIZJ, c49250JUo.LIZJ) && o.LJ(this.LIZLLL, c49250JUo.LIZLLL) && o.LJ(this.LJ, c49250JUo.LJ) && this.LJFF == c49250JUo.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Aweme aweme = this.LIZLLL;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C49128JPw c49128JPw = this.LJ;
        int hashCode3 = (hashCode2 + (c49128JPw != null ? c49128JPw.hashCode() : 0)) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopFeedFocusState(pageHash=");
        LIZ.append(this.LIZ);
        LIZ.append(", viewType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZJ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", holderInternalIndex=");
        LIZ.append(this.LJ);
        LIZ.append(", hasReachedTop=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C49250JUo(int i, int i2, Integer num, Aweme aweme, C49128JPw c49128JPw, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = aweme;
        this.LJ = c49128JPw;
        this.LJFF = z;
    }
}
