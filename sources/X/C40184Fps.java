package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fps, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40184Fps {
    public final String LIZ;
    public final String LIZIZ;
    public final HashMap<String, Object> LIZJ;
    public final EnumC39924Flg LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40184Fps)) {
            return false;
        }
        C40184Fps c40184Fps = (C40184Fps) obj;
        return o.LJ(this.LIZ, c40184Fps.LIZ) && o.LJ(this.LIZIZ, c40184Fps.LIZIZ) && o.LJ(this.LIZJ, c40184Fps.LIZJ) && this.LIZLLL == c40184Fps.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionInfo(projectName=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", extraQuery=");
        LIZ.append(this.LIZJ);
        LIZ.append(", type=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31;
        EnumC39924Flg enumC39924Flg = this.LIZLLL;
        if (enumC39924Flg == null) {
            hashCode = 0;
        } else {
            hashCode = enumC39924Flg.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public C40184Fps(String str, String str2, HashMap<String, Object> hashMap, EnumC39924Flg enumC39924Flg) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = hashMap;
        this.LIZLLL = enumC39924Flg;
    }
}
