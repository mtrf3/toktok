package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HLk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43916HLk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final HashMap<String, String> LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43916HLk)) {
            return false;
        }
        C43916HLk c43916HLk = (C43916HLk) obj;
        return o.LJ(this.LIZ, c43916HLk.LIZ) && o.LJ(this.LIZIZ, c43916HLk.LIZIZ) && o.LJ(this.LIZJ, c43916HLk.LIZJ) && o.LJ(this.LIZLLL, c43916HLk.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HashMap<String, String> hashMap = this.LIZLLL;
        return hashCode3 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryData(tabId=");
        LIZ.append(this.LIZ);
        LIZ.append(", tabName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tabKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C43916HLk(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
