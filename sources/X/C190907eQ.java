package X;

import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import kotlin.jvm.internal.o;

/* renamed from: X.7eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190907eQ implements InterfaceC87283bg {
    public final String LJLIL;
    public final LocationDetailMobParam LJLILLLLZI;

    public C190907eQ() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190907eQ)) {
            return false;
        }
        C190907eQ c190907eQ = (C190907eQ) obj;
        return o.LJ(this.LJLIL, c190907eQ.LJLIL) && o.LJ(this.LJLILLLLZI, c190907eQ.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocationDetailMobParam locationDetailMobParam = this.LJLILLLLZI;
        return hashCode + (locationDetailMobParam != null ? locationDetailMobParam.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationDetailInfoHierarchyData(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mobParam=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C190907eQ(String str, LocationDetailMobParam locationDetailMobParam) {
        this.LJLIL = str;
        this.LJLILLLLZI = locationDetailMobParam;
    }
}
