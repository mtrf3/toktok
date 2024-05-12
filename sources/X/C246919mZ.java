package X;

import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.o;

/* renamed from: X.9mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246919mZ {
    public final String LIZ;
    public final SearchSugEntity LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C246919mZ)) {
            return false;
        }
        C246919mZ c246919mZ = (C246919mZ) obj;
        return o.LJ(this.LIZ, c246919mZ.LIZ) && o.LJ(this.LIZIZ, c246919mZ.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchMobParam(requestId=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchSugEntity=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C246919mZ(SearchSugEntity searchSugEntity, String str) {
        this.LIZ = str;
        this.LIZIZ = searchSugEntity;
    }
}
