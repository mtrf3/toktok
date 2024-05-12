package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190407dc implements InterfaceC87283bg {
    public final String LJLIL;
    public final PoiListApi.PoiDetailResponse LJLILLLLZI;
    public final C190497dl LJLJI;

    public C190407dc() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190407dc)) {
            return false;
        }
        C190407dc c190407dc = (C190407dc) obj;
        return o.LJ(this.LJLIL, c190407dc.LJLIL) && o.LJ(this.LJLILLLLZI, c190407dc.LJLILLLLZI) && o.LJ(this.LJLJI, c190407dc.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode())) * 31;
        C190497dl c190497dl = this.LJLJI;
        return hashCode2 + (c190497dl != null ? c190497dl.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDetailContentHeaderHierarchyDataV3(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiDetail=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", videoListHierarchyData=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C190407dc(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C190497dl c190497dl) {
        this.LJLIL = str;
        this.LJLILLLLZI = poiDetailResponse;
        this.LJLJI = c190497dl;
    }
}
