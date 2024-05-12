package X;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125244vo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ArrayList<EnumC126884yS> LJ;
    public final EnumC126954yZ LJFF;
    public final HashMap<String, Object> LJI;

    public C125244vo() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125244vo)) {
            return false;
        }
        C125244vo c125244vo = (C125244vo) obj;
        return o.LJ(this.LIZ, c125244vo.LIZ) && o.LJ(this.LIZIZ, c125244vo.LIZIZ) && o.LJ(this.LIZJ, c125244vo.LIZJ) && o.LJ(this.LIZLLL, c125244vo.LIZLLL) && o.LJ(this.LJ, c125244vo.LJ) && this.LJFF == c125244vo.LJFF && o.LJ(this.LJI, c125244vo.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MagicResourceItem(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", resourceId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effectId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", resourcePath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", magicResourceTypeList=");
        LIZ.append(this.LJ);
        LIZ.append(", magicType=");
        LIZ.append(this.LJFF);
        LIZ.append(", extra=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31)) * 31;
        EnumC126954yZ enumC126954yZ = this.LJFF;
        int i = 0;
        if (enumC126954yZ == null) {
            hashCode = 0;
        } else {
            hashCode = enumC126954yZ.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        HashMap<String, Object> hashMap = this.LJI;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return i2 + i;
    }

    public C125244vo(String name, String resourceId, String effectId, String resourcePath, ArrayList magicResourceTypeList, EnumC126954yZ enumC126954yZ, int i) {
        name = (i & 1) != 0 ? "" : name;
        resourceId = (i & 2) != 0 ? "" : resourceId;
        effectId = (i & 4) != 0 ? "" : effectId;
        resourcePath = (i & 8) != 0 ? "" : resourcePath;
        magicResourceTypeList = (i & 16) != 0 ? new ArrayList() : magicResourceTypeList;
        enumC126954yZ = (i & 32) != 0 ? null : enumC126954yZ;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(resourcePath, "resourcePath");
        o.LJIIIZ(magicResourceTypeList, "magicResourceTypeList");
        this.LIZ = name;
        this.LIZIZ = resourceId;
        this.LIZJ = effectId;
        this.LIZLLL = resourcePath;
        this.LJ = magicResourceTypeList;
        this.LJFF = enumC126954yZ;
        this.LJI = null;
    }
}
