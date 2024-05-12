package X;

import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItemDescriptionChunk;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Abr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26575Abr {
    public final String LIZ;
    public final List<UserTrustItemDescriptionChunk> LIZIZ;
    public boolean LIZJ;

    public C26575Abr() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26575Abr)) {
            return false;
        }
        C26575Abr c26575Abr = (C26575Abr) obj;
        return o.LJ(this.LIZ, c26575Abr.LIZ) && o.LJ(this.LIZIZ, c26575Abr.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserTrustItemDescriptionChunk> list = this.LIZIZ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserTrustItemVO(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", description=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26575Abr(String str, List<UserTrustItemDescriptionChunk> list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = true;
    }
}
