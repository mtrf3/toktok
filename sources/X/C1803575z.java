package X;

import com.ss.android.ugc.now.interaction.api.Interaction;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.75z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1803575z extends Interaction {
    public final long LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LLJIJIL + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewState(viewCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", awemeId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public final String getAwemeId() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1803575z)) {
            return false;
        }
        C1803575z c1803575z = (C1803575z) obj;
        if (this.LIZ == c1803575z.LIZ && o.LJ(this.LIZIZ, c1803575z.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1803575z(long j, String str) {
        super(null, 1, null);
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
