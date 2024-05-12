package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SV3 {
    public final EnumC72191SUx LIZ;
    public final Context LIZIZ;
    public final TTMStoreLink LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SV3)) {
            return false;
        }
        SV3 sv3 = (SV3) obj;
        return this.LIZ == sv3.LIZ && o.LJ(this.LIZIZ, sv3.LIZIZ) && o.LJ(this.LIZJ, sv3.LIZJ) && o.LJ(this.LIZLLL, sv3.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        TTMStoreLink tTMStoreLink = this.LIZJ;
        return this.LIZLLL.hashCode() + ((hashCode + (tTMStoreLink == null ? 0 : tTMStoreLink.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorToAFData(anchorType=");
        LIZ.append(this.LIZ);
        LIZ.append(", context=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", store=");
        LIZ.append(this.LIZJ);
        LIZ.append(", aid=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public SV3(EnumC72191SUx enumC72191SUx, Context context, TTMStoreLink tTMStoreLink, String str) {
        this.LIZ = enumC72191SUx;
        this.LIZIZ = context;
        this.LIZJ = tTMStoreLink;
        this.LIZLLL = str;
    }
}
