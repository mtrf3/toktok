package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K0D {
    public SearchResultParam LIZ;
    public String LIZIZ;

    public K0D() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0D)) {
            return false;
        }
        K0D k0d = (K0D) obj;
        return o.LJ(this.LIZ, k0d.LIZ) && o.LJ(this.LIZIZ, k0d.LIZIZ);
    }

    public final int hashCode() {
        SearchResultParam searchResultParam = this.LIZ;
        int hashCode = (searchResultParam == null ? 0 : searchResultParam.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchSaveInfo(saveSearchResultParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", saveSugKeyword=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public K0D(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
