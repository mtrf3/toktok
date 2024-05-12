package X;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PwV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66075PwV {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final HashMap<String, java.util.Set<String>> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;

    public C66075PwV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66075PwV)) {
            return false;
        }
        C66075PwV c66075PwV = (C66075PwV) obj;
        return this.LIZ == c66075PwV.LIZ && this.LIZIZ == c66075PwV.LIZIZ && this.LIZJ == c66075PwV.LIZJ && o.LJ(this.LIZLLL, c66075PwV.LIZLLL) && o.LJ(this.LJ, c66075PwV.LJ) && o.LJ(this.LJFF, c66075PwV.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + (this.LIZJ ? 1 : 0)) * 31;
        HashMap<String, java.util.Set<String>> hashMap = this.LIZLLL;
        int hashCode = (i3 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list = this.LJ;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.LJFF;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareConfig(enabled=");
        LIZ.append(this.LIZ);
        LIZ.append(", reportEnabled=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mNeedMaskValue=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mBinderMethodMap=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mSkipActions=");
        LIZ.append(this.LJ);
        LIZ.append(", mSkipProviders=");
        LIZ.append(this.LJFF);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C66075PwV(Object obj) {
        HashMap<String, java.util.Set<String>> hashMap = new HashMap<>();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = hashMap;
        this.LJ = copyOnWriteArrayList;
        this.LJFF = copyOnWriteArrayList2;
    }
}
