package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dzh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35697Dzh {
    public final CharSequence LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35697Dzh)) {
            return false;
        }
        C35697Dzh c35697Dzh = (C35697Dzh) obj;
        return o.LJ(this.LIZ, c35697Dzh.LIZ) && o.LJ(this.LIZIZ, c35697Dzh.LIZIZ) && o.LJ(this.LIZJ, c35697Dzh.LIZJ);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List<String> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LIZJ;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TitleUIData(text=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", logoUrls=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", darkLogoUrls=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C35697Dzh(CharSequence charSequence, List<String> list, List<String> list2) {
        this.LIZ = charSequence;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
