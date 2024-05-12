package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0Wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08790Wd {
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
        if (!(obj instanceof C08790Wd)) {
            return false;
        }
        C08790Wd c08790Wd = (C08790Wd) obj;
        return this.LIZ == c08790Wd.LIZ && Float.compare(this.LIZIZ, c08790Wd.LIZIZ) == 0 && o.LJ(this.LIZJ, c08790Wd.LIZJ) && o.LJ(this.LIZLLL, c08790Wd.LIZLLL) && this.LJ == c08790Wd.LJ && this.LJFF == c08790Wd.LJFF;
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
    public C08790Wd(C08790Wd beautyLogBean) {
        this(beautyLogBean.LIZ, beautyLogBean.LIZIZ, beautyLogBean.LIZJ, beautyLogBean.LIZLLL, beautyLogBean.LJ);
        o.LJIIIZ(beautyLogBean, "beautyLogBean");
    }

    public C08790Wd(long j, float f, String str, LiveEffect liveEffect, boolean z) {
        long LIZ = C30725C4b.LIZ();
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LIZ = j;
        this.LIZIZ = f;
        this.LIZJ = str;
        this.LIZLLL = liveEffect;
        this.LJ = z;
        this.LJFF = LIZ;
    }
}
