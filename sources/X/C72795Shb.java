package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Shb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72795Shb extends AbstractC72800Shg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Effect LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72795Shb)) {
            return false;
        }
        C72795Shb c72795Shb = (C72795Shb) obj;
        return o.LJ(this.LIZ, c72795Shb.LIZ) && o.LJ(this.LIZIZ, c72795Shb.LIZIZ) && o.LJ(this.LIZJ, c72795Shb.LIZJ) && o.LJ(this.LIZLLL, c72795Shb.LIZLLL) && this.LJ == c72795Shb.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Effect effect = this.LIZLLL;
        return ((hashCode3 + (effect != null ? effect.hashCode() : 0)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropShow(searchMethod=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", panelUnfold=");
        LIZ.append(this.LIZJ);
        LIZ.append(", effect=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", index=");
        return C08380Uo.LIZ(LIZ, this.LJ, ")", LIZ);
    }

    public C72795Shb(int i, Effect effect, String str, String str2, String str3) {
        HH1.LIZ(str, "searchMethod", str2, "searchId", str3, "panelUnfold");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = effect;
        this.LJ = i;
    }
}
