package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Xda, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85286Xda implements C33Q {
    public final AbstractC72932td<PoiSearchApi.PoiSearchResultWrapper> LJLIL;
    public final PoiData LJLILLLLZI;

    public C85286Xda() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85286Xda)) {
            return false;
        }
        C85286Xda c85286Xda = (C85286Xda) obj;
        return o.LJ(this.LJLIL, c85286Xda.LJLIL) && o.LJ(this.LJLILLLLZI, c85286Xda.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        PoiData poiData = this.LJLILLLLZI;
        return hashCode + (poiData == null ? 0 : poiData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishExtensionState(searchResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiItemSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C85286Xda(int i) {
        this(C33X.LIZ, null);
    }

    public C85286Xda(AbstractC72932td<PoiSearchApi.PoiSearchResultWrapper> searchResult, PoiData poiData) {
        o.LJIIIZ(searchResult, "searchResult");
        this.LJLIL = searchResult;
        this.LJLILLLLZI = poiData;
    }

    public static C85286Xda LIZ(C85286Xda c85286Xda, AbstractC72932td searchResult, PoiData poiData, int i) {
        if ((i & 1) != 0) {
            searchResult = c85286Xda.LJLIL;
        }
        if ((i & 2) != 0) {
            poiData = c85286Xda.LJLILLLLZI;
        }
        c85286Xda.getClass();
        o.LJIIIZ(searchResult, "searchResult");
        return new C85286Xda(searchResult, poiData);
    }
}
