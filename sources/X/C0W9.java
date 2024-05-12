package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0W9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W9 {
    public final long LIZ;
    public final float LIZIZ;
    public final String LIZJ;
    public final LiveEffect LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0W9)) {
            return false;
        }
        C0W9 c0w9 = (C0W9) obj;
        return this.LIZ == c0w9.LIZ && Float.compare(this.LIZIZ, c0w9.LIZIZ) == 0 && o.LJ(this.LIZJ, c0w9.LIZJ) && o.LJ(this.LIZLLL, c0w9.LIZLLL) && this.LJ == c0w9.LJ && this.LJFF == c0w9.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.LIZLLL.hashCode() + ((LIZIZ + hashCode) * 31)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.LJFF) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BeautyLogBean(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZJ);
        LIZ.append(", liveEffect=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isDefaultValue=");
        LIZ.append(this.LJ);
        LIZ.append(", startTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0W9(C0W9 beautyLogBean) {
        this(beautyLogBean.LIZ, beautyLogBean.LIZIZ, beautyLogBean.LIZJ, beautyLogBean.LIZLLL, beautyLogBean.LJ);
        o.LJIIIZ(beautyLogBean, "beautyLogBean");
    }

    public /* synthetic */ C0W9(long j, float f, String str, LiveEffect liveEffect, boolean z) {
        this(j, f, str, liveEffect, z, System.currentTimeMillis());
    }

    public C0W9(long j, float f, String str, LiveEffect liveEffect, boolean z, long j2) {
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LIZ = j;
        this.LIZIZ = f;
        this.LIZJ = str;
        this.LIZLLL = liveEffect;
        this.LJ = z;
        this.LJFF = j2;
    }
}
