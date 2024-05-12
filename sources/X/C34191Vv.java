package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34191Vv extends AbstractC17370mD {
    public final long LIZ;
    public final C33541Ti LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34191Vv)) {
            return false;
        }
        C34191Vv c34191Vv = (C34191Vv) obj;
        return this.LIZ == c34191Vv.LIZ && o.LJ(this.LIZIZ, c34191Vv.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchSongListSuccess(albumId=");
        LIZ.append(this.LIZ);
        LIZ.append(", songList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C34191Vv(long j, C33541Ti c33541Ti) {
        this.LIZ = j;
        this.LIZIZ = c33541Ti;
    }
}
