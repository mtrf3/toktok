package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.2mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68722mq {
    public final boolean LIZ;
    public final String LIZIZ;
    public final Bitmap LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final java.util.Map<String, String> LJFF;
    public final EnumC55811LvL LJI;

    public C68722mq() {
        this(false, null, null, null, 0L, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68722mq)) {
            return false;
        }
        C68722mq c68722mq = (C68722mq) obj;
        return this.LIZ == c68722mq.LIZ && o.LJ(this.LIZIZ, c68722mq.LIZIZ) && o.LJ(this.LIZJ, c68722mq.LIZJ) && o.LJ(this.LIZLLL, c68722mq.LIZLLL) && this.LJ == c68722mq.LJ && o.LJ(this.LJFF, c68722mq.LJFF) && this.LJI == c68722mq.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TooltipConfig(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", text=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", duration=");
        LIZ.append(this.LJ);
        LIZ.append(", bubbleExtraParams=");
        LIZ.append(this.LJFF);
        LIZ.append(", disappearType=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, r0 * 31, 31);
        Bitmap bitmap = this.LIZJ;
        int i = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, (i2 + hashCode2) * 31, 31);
        java.util.Map<String, String> map = this.LJFF;
        if (map != null) {
            i = map.hashCode();
        }
        return this.LJI.hashCode() + ((LIZJ + i) * 31);
    }

    public C68722mq(boolean z, String name, Bitmap bitmap, String str, long j, java.util.Map map, EnumC55811LvL disappearType, int i) {
        z = (i & 1) != 0 ? false : z;
        name = (i & 2) != 0 ? "" : name;
        bitmap = (i & 4) != 0 ? null : bitmap;
        str = (i & 8) != 0 ? null : str;
        j = (i & 16) != 0 ? 3000L : j;
        map = (i & 32) != 0 ? null : map;
        disappearType = (i & 64) != 0 ? EnumC55811LvL.OTHER : disappearType;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(disappearType, "disappearType");
        this.LIZ = z;
        this.LIZIZ = name;
        this.LIZJ = bitmap;
        this.LIZLLL = str;
        this.LJ = j;
        this.LJFF = map;
        this.LJI = disappearType;
    }
}
