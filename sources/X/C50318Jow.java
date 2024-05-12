package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jow, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50318Jow implements InterfaceC50310Joo {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50318Jow)) {
            return false;
        }
        C50318Jow c50318Jow = (C50318Jow) obj;
        return this.LIZ == c50318Jow.LIZ && o.LJ(this.LIZIZ, c50318Jow.LIZIZ) && o.LJ(this.LIZJ, c50318Jow.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAutoPlayAction(duration=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", videoGroupId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C50318Jow(long j, String enterFrom, String videoGroupId) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(videoGroupId, "videoGroupId");
        this.LIZ = j;
        this.LIZIZ = enterFrom;
        this.LIZJ = videoGroupId;
    }
}
