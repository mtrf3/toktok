package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EZv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36647EZv {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36647EZv)) {
            return false;
        }
        C36647EZv c36647EZv = (C36647EZv) obj;
        return o.LJ(this.LIZ, c36647EZv.LIZ) && this.LIZIZ == c36647EZv.LIZIZ && o.LJ(this.LIZJ, c36647EZv.LIZJ) && o.LJ(this.LIZLLL, c36647EZv.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.LIZLLL;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAbilityRequestParam(userPrompt=");
        LIZ.append(this.LIZ);
        LIZ.append(", topK=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", frameExtractionUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", featureBits=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C36647EZv(String str, int i, String str2, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = list;
    }
}
