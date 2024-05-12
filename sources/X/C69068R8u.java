package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R8u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69068R8u extends R40<C69069R8v> {
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final C69069R8v LJIIL;
    public final JSONObject LJIILIIL;
    public final String LJIILJJIL;
    public final QTZ LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69068R8u)) {
            return false;
        }
        C69068R8u c69068R8u = (C69068R8u) obj;
        return this.LJIIJ == c69068R8u.LJIIJ && this.LJIIJJI == c69068R8u.LJIIJJI && o.LJ(this.LJIIL, c69068R8u.LJIIL) && o.LJ(this.LJIILIIL, c69068R8u.LJIILIIL) && o.LJ(this.LJIILJJIL, c69068R8u.LJIILJJIL) && o.LJ(this.LJIILL, c69068R8u.LJIILL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        boolean z = this.LJIIJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJIILIIL.hashCode() + ((this.LJIIL.hashCode() + (((r0 * 31) + this.LJIIJJI) * 31)) * 31)) * 31;
        String str = this.LJIILJJIL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        QTZ qtz = this.LJIILL;
        return hashCode2 + (qtz != null ? qtz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForceResetPasswordResponse(success=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", api=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", queryObj=");
        LIZ.append(this.LJIIL);
        LIZ.append(", rawData=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", mErrorCaptcha=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", userInfo=");
        LIZ.append(this.LJIILL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69068R8u(boolean z, int i, C69069R8v queryObj, JSONObject rawData, String str, QTX qtx) {
        super(z, i, queryObj);
        o.LJIIIZ(queryObj, "queryObj");
        o.LJIIIZ(rawData, "rawData");
        this.LJIIJ = z;
        this.LJIIJJI = i;
        this.LJIIL = queryObj;
        this.LJIILIIL = rawData;
        this.LJIILJJIL = str;
        this.LJIILL = qtx;
    }
}
