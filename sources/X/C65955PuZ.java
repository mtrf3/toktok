package X;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PuZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65955PuZ {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public final int LJFF;
    public final boolean LJI;
    public final List<String> LJII;
    public final String LJIIIIZZ;

    public C65955PuZ() {
        throw null;
    }

    public final int hashCode() {
        return this.LJII.hashCode() + ((Boolean.valueOf(this.LJI).hashCode() + ((((C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31), 31), 31) + Arrays.hashCode(this.LJ)) * 31) + this.LJFF) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiConfig(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", abstractOfApi=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", resourceName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", resourceId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", permissions=");
        LIZ.append(Arrays.toString(this.LJ));
        LIZ.append(", permissionMode=");
        LIZ.append(this.LJFF);
        LIZ.append(", isCustomApi=");
        LIZ.append(this.LJI);
        LIZ.append(", dataTypes=");
        LIZ.append(this.LJII);
        LIZ.append(", invokeType=");
        return JBR.LJFF(LIZ, this.LJIIIIZZ, ")", LIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C65955PuZ.class, cls)) {
            return false;
        }
        if (obj != null) {
            C65955PuZ c65955PuZ = (C65955PuZ) obj;
            if (this.LIZ == c65955PuZ.LIZ && !(!o.LJ(this.LIZIZ, c65955PuZ.LIZIZ)) && !(!o.LJ(this.LIZJ, c65955PuZ.LIZJ)) && !(!o.LJ(this.LIZLLL, c65955PuZ.LIZLLL)) && Arrays.equals(this.LJ, c65955PuZ.LJ) && this.LJFF == c65955PuZ.LJFF && this.LJI == c65955PuZ.LJI && !(!o.LJ(this.LJII, c65955PuZ.LJII))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.helios.sdk.config.SensitiveApiConfig");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public C65955PuZ(int i, String abstractOfApi, String str, String str2, String[] strArr, int i2, List dataTypes, String invokeType, int i3) {
        abstractOfApi = (i3 & 2) != 0 ? "" : abstractOfApi;
        str = (i3 & 4) != 0 ? "" : str;
        str2 = (i3 & 8) != 0 ? "" : str2;
        strArr = (i3 & 16) != 0 ? new String[0] : strArr;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        dataTypes = (i3 & 128) != 0 ? C61878OQg.INSTANCE : dataTypes;
        invokeType = (i3 & 256) != 0 ? "before" : invokeType;
        o.LJIIIZ(abstractOfApi, "abstractOfApi");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(dataTypes, "dataTypes");
        o.LJIIIZ(invokeType, "invokeType");
        this.LIZ = i;
        this.LIZIZ = abstractOfApi;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = strArr;
        this.LJFF = i2;
        this.LJI = false;
        this.LJII = dataTypes;
        this.LJIIIIZZ = invokeType;
    }
}
