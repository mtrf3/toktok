package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8P {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final AbstractC73638SvC<C35794E3a<ProviderEffectModel>> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E8P)) {
            return false;
        }
        E8P e8p = (E8P) obj;
        return this.LIZ == e8p.LIZ && o.LJ(this.LIZIZ, e8p.LIZIZ) && this.LIZJ == e8p.LIZJ && this.LIZLLL == e8p.LIZLLL && o.LJ(this.LJ, e8p.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryRequestItem(timestamp=");
        LIZ.append(this.LIZ);
        LIZ.append(", requestKeyword=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", requestCursor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", requestPageSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", data=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        AbstractC73638SvC<C35794E3a<ProviderEffectModel>> abstractC73638SvC = this.LJ;
        if (abstractC73638SvC == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC73638SvC.hashCode();
        }
        return LJ + hashCode;
    }

    public E8P(long j, String str, int i, int i2, AbstractC73638SvC<C35794E3a<ProviderEffectModel>> abstractC73638SvC) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = abstractC73638SvC;
    }
}
