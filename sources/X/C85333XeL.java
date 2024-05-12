package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.o;

/* renamed from: X.XeL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85333XeL implements C33Q {
    public final AbstractC72932td<PoiSearchApi.PoiSearchResultWrapper> LJLIL;
    public final PoiData LJLILLLLZI;
    public final Boolean LJLJI;
    public final EnumC85338XeQ LJLJJI;

    public C85333XeL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85333XeL)) {
            return false;
        }
        C85333XeL c85333XeL = (C85333XeL) obj;
        return o.LJ(this.LJLIL, c85333XeL.LJLIL) && o.LJ(this.LJLILLLLZI, c85333XeL.LJLILLLLZI) && o.LJ(this.LJLJI, c85333XeL.LJLJI) && this.LJLJJI == c85333XeL.LJLJJI;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        PoiData poiData = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (poiData == null ? 0 : poiData.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EnumC85338XeQ enumC85338XeQ = this.LJLJJI;
        return hashCode3 + (enumC85338XeQ != null ? enumC85338XeQ.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishExtensionStateV2(searchResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiItemSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", locateSuccessful=");
        LIZ.append(this.LJLJI);
        LIZ.append(", permissionStatus=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C85333XeL(int i) {
        this(C33X.LIZ, null, null, null);
    }

    public C85333XeL(AbstractC72932td<PoiSearchApi.PoiSearchResultWrapper> searchResult, PoiData poiData, Boolean bool, EnumC85338XeQ enumC85338XeQ) {
        o.LJIIIZ(searchResult, "searchResult");
        this.LJLIL = searchResult;
        this.LJLILLLLZI = poiData;
        this.LJLJI = bool;
        this.LJLJJI = enumC85338XeQ;
    }

    public static C85333XeL LIZ(C85333XeL c85333XeL, AbstractC72932td searchResult, PoiData poiData, Boolean bool, EnumC85338XeQ enumC85338XeQ, int i) {
        if ((i & 1) != 0) {
            searchResult = c85333XeL.LJLIL;
        }
        if ((i & 2) != 0) {
            poiData = c85333XeL.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool = c85333XeL.LJLJI;
        }
        if ((i & 8) != 0) {
            enumC85338XeQ = c85333XeL.LJLJJI;
        }
        c85333XeL.getClass();
        o.LJIIIZ(searchResult, "searchResult");
        return new C85333XeL(searchResult, poiData, bool, enumC85338XeQ);
    }
}
