package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190977eX implements C33Q {
    public final AbstractC72932td<PoiListApi.PoiDetailResponse> LJLIL;
    public final EnumC191017eb LJLILLLLZI;
    public final EnumC190987eY LJLJI;
    public final C191427fG LJLJJI;
    public final Float LJLJJL;

    public C190977eX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190977eX)) {
            return false;
        }
        C190977eX c190977eX = (C190977eX) obj;
        return o.LJ(this.LJLIL, c190977eX.LJLIL) && this.LJLILLLLZI == c190977eX.LJLILLLLZI && this.LJLJI == c190977eX.LJLJI && o.LJ(this.LJLJJI, c190977eX.LJLJJI) && o.LJ(this.LJLJJL, c190977eX.LJLJJL);
    }

    public final int hashCode() {
        int hashCode = (this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31)) * 31;
        C191427fG c191427fG = this.LJLJJI;
        int hashCode2 = (hashCode + (c191427fG == null ? 0 : c191427fG.hashCode())) * 31;
        Float f = this.LJLJJL;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiMapState(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(", uiStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiMapType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", latLon=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", zoomLevel=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C190977eX(int i) {
        this(C33X.LIZ, EnumC191017eb.STATUS_NONE, EnumC190987eY.TYPE_NONE, null, null);
    }

    public C190977eX(AbstractC72932td<PoiListApi.PoiDetailResponse> response, EnumC191017eb uiStatus, EnumC190987eY poiMapType, C191427fG c191427fG, Float f) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(uiStatus, "uiStatus");
        o.LJIIIZ(poiMapType, "poiMapType");
        this.LJLIL = response;
        this.LJLILLLLZI = uiStatus;
        this.LJLJI = poiMapType;
        this.LJLJJI = c191427fG;
        this.LJLJJL = f;
    }

    public static C190977eX LIZ(C190977eX c190977eX, AbstractC72932td abstractC72932td, EnumC191017eb enumC191017eb, EnumC190987eY enumC190987eY, Float f, int i) {
        C191427fG c191427fG;
        Float f2 = f;
        EnumC190987eY poiMapType = enumC190987eY;
        AbstractC72932td response = abstractC72932td;
        EnumC191017eb uiStatus = enumC191017eb;
        if ((i & 1) != 0) {
            response = c190977eX.LJLIL;
        }
        if ((i & 2) != 0) {
            uiStatus = c190977eX.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            poiMapType = c190977eX.LJLJI;
        }
        if ((i & 8) != 0) {
            c191427fG = c190977eX.LJLJJI;
        } else {
            c191427fG = null;
        }
        if ((i & 16) != 0) {
            f2 = c190977eX.LJLJJL;
        }
        c190977eX.getClass();
        o.LJIIIZ(response, "response");
        o.LJIIIZ(uiStatus, "uiStatus");
        o.LJIIIZ(poiMapType, "poiMapType");
        return new C190977eX(response, uiStatus, poiMapType, c191427fG, f2);
    }
}
