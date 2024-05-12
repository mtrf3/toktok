package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Blq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29742Blq {
    public final SubscribeBadge LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C29742Blq() {
        /*
            r3 = this;
            r2 = 0
            r1 = 15
            r0 = 0
            r3.<init>(r0, r2, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29742Blq.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29742Blq)) {
            return false;
        }
        C29742Blq c29742Blq = (C29742Blq) obj;
        return o.LJ(this.LIZ, c29742Blq.LIZ) && this.LIZIZ == c29742Blq.LIZIZ && this.LIZJ == c29742Blq.LIZJ && o.LJ(this.LIZLLL, c29742Blq.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        SubscribeBadge subscribeBadge = this.LIZ;
        int hashCode = (subscribeBadge == null ? 0 : subscribeBadge.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZLLL.hashCode() + ((((hashCode + i) * 31) + (this.LIZJ ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscribeSuccessData(subscribeBadge=");
        LIZ.append(this.LIZ);
        LIZ.append(", needOpenOnBoarding=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isGiftSub=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fromUsername=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C29742Blq(SubscribeBadge subscribeBadge, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? null : subscribeBadge, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : null);
    }

    public C29742Blq(SubscribeBadge subscribeBadge, boolean z, boolean z2, String fromUsername) {
        o.LJIIIZ(fromUsername, "fromUsername");
        this.LIZ = subscribeBadge;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = fromUsername;
    }
}
