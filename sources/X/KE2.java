package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KE2 implements Serializable {
    public final SearchResultParam LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public KE2() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KE2 copy$default(KE2 ke2, SearchResultParam searchResultParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            searchResultParam = ke2.LJLIL;
        }
        if ((i & 2) != 0) {
            str = ke2.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = ke2.LJLJI;
        }
        return ke2.copy(searchResultParam, str, str2);
    }

    public final KE2 copy(SearchResultParam searchResultParam, String str, String str2) {
        return new KE2(searchResultParam, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KE2)) {
            return false;
        }
        KE2 ke2 = (KE2) obj;
        return o.LJ(this.LJLIL, ke2.LJLIL) && o.LJ(this.LJLILLLLZI, ke2.LJLILLLLZI) && o.LJ(this.LJLJI, ke2.LJLJI);
    }

    public int hashCode() {
        SearchResultParam searchResultParam = this.LJLIL;
        int hashCode = (searchResultParam == null ? 0 : searchResultParam.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcResultImmutableData(searchResultParam=");
        LIZ.append(this.LJLIL);
        LIZ.append(", ecSearchSessionId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", trafficSourceList=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final String getEcSearchSessionId() {
        return this.LJLILLLLZI;
    }

    public final SearchResultParam getSearchResultParam() {
        return this.LJLIL;
    }

    public final String getTrafficSourceList() {
        return this.LJLJI;
    }

    public KE2(SearchResultParam searchResultParam, String str, String str2) {
        this.LJLIL = searchResultParam;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    public /* synthetic */ KE2(SearchResultParam searchResultParam, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchResultParam, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
