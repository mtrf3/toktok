package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221958nP {
    public float LIZ;
    public EnumC221928nM LIZIZ;
    public String LIZJ;
    public Aweme LIZLLL;

    public C221958nP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C221958nP)) {
            return false;
        }
        C221958nP c221958nP = (C221958nP) obj;
        return Float.compare(this.LIZ, c221958nP.LIZ) == 0 && this.LIZIZ == c221958nP.LIZIZ && o.LJ(this.LIZJ, c221958nP.LIZJ) && o.LJ(this.LIZLLL, c221958nP.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, (this.LIZIZ.hashCode() + (Float.floatToIntBits(this.LIZ) * 31)) * 31, 31);
        Aweme aweme = this.LIZLLL;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryPublishData(progress=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", failReason=");
        LIZ.append(this.LIZJ);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C221958nP(int i) {
        EnumC221928nM status = EnumC221928nM.UPLOADING;
        o.LJIIIZ(status, "status");
        this.LIZ = 0.0f;
        this.LIZIZ = status;
        this.LIZJ = "";
        this.LIZLLL = null;
    }
}
