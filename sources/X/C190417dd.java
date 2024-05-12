package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190417dd implements InterfaceC87283bg {
    public final String LJLIL;
    public final PoiListApi.PoiDetailResponse LJLILLLLZI;
    public final C190497dl LJLJI;

    public C190417dd() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190417dd)) {
            return false;
        }
        C190417dd c190417dd = (C190417dd) obj;
        return o.LJ(this.LJLIL, c190417dd.LJLIL) && o.LJ(this.LJLILLLLZI, c190417dd.LJLILLLLZI) && o.LJ(this.LJLJI, c190417dd.LJLJI);
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
        LIZ.append("PoiDetailContentHeaderHierarchyData(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiDetail=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", videoListHierarchyData=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C190417dd(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C190497dl c190497dl) {
        this.LJLIL = str;
        this.LJLILLLLZI = poiDetailResponse;
        this.LJLJI = c190497dl;
    }
}
