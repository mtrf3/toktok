package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.2sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72382sk {
    public final UrlModel LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC72332sf LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72382sk)) {
            return false;
        }
        C72382sk c72382sk = (C72382sk) obj;
        return o.LJ(this.LIZ, c72382sk.LIZ) && o.LJ(this.LIZIZ, c72382sk.LIZIZ) && o.LJ(this.LIZJ, c72382sk.LIZJ) && o.LJ(this.LIZLLL, c72382sk.LIZLLL) && o.LJ(this.LJ, c72382sk.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KidsProfileHeaderData(avatarModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", secId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", username=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", kidsUser=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        UrlModel urlModel = this.LIZ;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31), 31), 31);
    }

    public C72382sk(UrlModel urlModel, String str, String str2, String str3, InterfaceC72332sf interfaceC72332sf) {
        this.LIZ = urlModel;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = interfaceC72332sf;
    }
}
