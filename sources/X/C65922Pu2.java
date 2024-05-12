package X;

import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65922Pu2 {
    public final int LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final transient Object LJ;
    public final transient Object[] LJFF;
    public final String LJI;
    public final transient Object LJII;
    public final boolean LJIIIIZZ;
    public final transient Object LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final java.util.Set<String> LJIIL;

    public C65922Pu2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65922Pu2)) {
            return false;
        }
        C65922Pu2 c65922Pu2 = (C65922Pu2) obj;
        return this.LIZ == c65922Pu2.LIZ && o.LJ(this.LIZIZ, c65922Pu2.LIZIZ) && o.LJ(this.LIZJ, c65922Pu2.LIZJ) && o.LJ(this.LIZLLL, c65922Pu2.LIZLLL) && o.LJ(this.LJ, c65922Pu2.LJ) && o.LJ(this.LJFF, c65922Pu2.LJFF) && o.LJ(this.LJI, c65922Pu2.LJI) && o.LJ(this.LJII, c65922Pu2.LJII) && this.LJIIIIZZ == c65922Pu2.LJIIIIZZ && o.LJ(this.LJIIIZ, c65922Pu2.LJIIIZ) && o.LJ(this.LJIIJ, c65922Pu2.LJIIJ) && o.LJ(this.LJIIJJI, c65922Pu2.LJIIJJI) && o.LJ(this.LJIIL, c65922Pu2.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.LJ;
        int hashCode4 = (hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object[] objArr = this.LJFF;
        int hashCode5 = (hashCode4 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31;
        String str4 = this.LJI;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Object obj2 = this.LJII;
        int hashCode7 = (hashCode6 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        boolean z = this.LJIIIIZZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode7 + i2) * 31;
        Object obj3 = this.LJIIIZ;
        int hashCode8 = (i3 + (obj3 != null ? obj3.hashCode() : 0)) * 31;
        String str5 = this.LJIIJ;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LJIIJJI;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        java.util.Set<String> set = this.LJIIL;
        return hashCode10 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginalInvokeContext(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", invokeType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", className=");
        LIZ.append(this.LIZJ);
        LIZ.append(", memberName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", thisOrClass=");
        LIZ.append(this.LJ);
        LIZ.append(", parameters=");
        LIZ.append(Arrays.toString(this.LJFF));
        LIZ.append(", returnType=");
        LIZ.append(this.LJI);
        LIZ.append(", result=");
        LIZ.append(this.LJII);
        LIZ.append(", isOriginalCalled=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", extraInfo=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", resourceId=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", resourceName=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", dataTypes=");
        LIZ.append(this.LJIIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C65922Pu2(int i) {
        this(0, "", "", "", null, null, "", null, true, null, "", "", new LinkedHashSet());
    }

    public static C65922Pu2 LIZ(C65922Pu2 c65922Pu2) {
        int i = c65922Pu2.LIZ;
        String className = c65922Pu2.LIZJ;
        String memberName = c65922Pu2.LIZLLL;
        Object obj = c65922Pu2.LJ;
        Object[] objArr = c65922Pu2.LJFF;
        String returnType = c65922Pu2.LJI;
        Object obj2 = c65922Pu2.LJII;
        boolean z = c65922Pu2.LJIIIIZZ;
        Object obj3 = c65922Pu2.LJIIIZ;
        String resourceId = c65922Pu2.LJIIJ;
        String resourceName = c65922Pu2.LJIIJJI;
        java.util.Set<String> dataTypes = c65922Pu2.LJIIL;
        c65922Pu2.getClass();
        o.LJIIIZ(className, "className");
        o.LJIIIZ(memberName, "memberName");
        o.LJIIIZ(returnType, "returnType");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(dataTypes, "dataTypes");
        return new C65922Pu2(i, "after", className, memberName, obj, objArr, returnType, obj2, z, obj3, resourceId, resourceName, dataTypes);
    }

    public C65922Pu2(int i, String invokeType, String className, String memberName, Object obj, Object[] objArr, String returnType, Object obj2, boolean z, Object obj3, String resourceId, String resourceName, java.util.Set<String> dataTypes) {
        o.LJIIIZ(invokeType, "invokeType");
        o.LJIIIZ(className, "className");
        o.LJIIIZ(memberName, "memberName");
        o.LJIIIZ(returnType, "returnType");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(dataTypes, "dataTypes");
        this.LIZ = i;
        this.LIZIZ = invokeType;
        this.LIZJ = className;
        this.LIZLLL = memberName;
        this.LJ = obj;
        this.LJFF = objArr;
        this.LJI = returnType;
        this.LJII = obj2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = obj3;
        this.LJIIJ = resourceId;
        this.LJIIJJI = resourceName;
        this.LJIIL = dataTypes;
    }
}
