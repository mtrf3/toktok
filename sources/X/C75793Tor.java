package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tor, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75793Tor {
    public final EnumC32197CkL LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final ImageModel LIZLLL;
    public final C75330ThO LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75793Tor)) {
            return false;
        }
        C75793Tor c75793Tor = (C75793Tor) obj;
        return this.LIZ == c75793Tor.LIZ && this.LIZIZ == c75793Tor.LIZIZ && o.LJ(this.LIZJ, c75793Tor.LIZJ) && o.LJ(this.LIZLLL, c75793Tor.LIZLLL) && o.LJ(this.LJ, c75793Tor.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedBusinessMicInfo(pageType=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAnchor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", layoutId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", avatar=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", micInfo=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode2 + i) * 31, 31);
        ImageModel imageModel = this.LIZLLL;
        if (imageModel == null) {
            hashCode = 0;
        } else {
            hashCode = imageModel.hashCode();
        }
        return this.LJ.hashCode() + ((LJ + hashCode) * 31);
    }

    public C75793Tor(EnumC32197CkL enumC32197CkL, boolean z, String str, ImageModel imageModel, C75330ThO c75330ThO) {
        this.LIZ = enumC32197CkL;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = imageModel;
        this.LJ = c75330ThO;
    }
}
