package X;

import com.linecorp.linesdk.LineApiError;

/* loaded from: classes12.dex */
public final class PPB<R> {
    public static final PPB<?> LIZLLL = new PPB<>(EnumC65312PkC.SUCCESS, null, LineApiError.DEFAULT);
    public final EnumC65312PkC LIZ;
    public final R LIZIZ;
    public final LineApiError LIZJ;

    public final int hashCode() {
        int i;
        int hashCode = this.LIZ.hashCode() * 31;
        R r = this.LIZIZ;
        if (r != null) {
            i = r.hashCode();
        } else {
            i = 0;
        }
        return this.LIZJ.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.LIZJ + ", responseCode=" + this.LIZ + ", responseData=" + this.LIZIZ + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PPB.class != obj.getClass()) {
            return false;
        }
        PPB ppb = (PPB) obj;
        if (this.LIZ != ppb.LIZ) {
            return false;
        }
        R r = this.LIZIZ;
        if (r == null ? ppb.LIZIZ != null : !r.equals(ppb.LIZIZ)) {
            return false;
        }
        return this.LIZJ.equals(ppb.LIZJ);
    }

    public PPB(EnumC65312PkC enumC65312PkC, R r, LineApiError lineApiError) {
        this.LIZ = enumC65312PkC;
        this.LIZIZ = r;
        this.LIZJ = lineApiError;
    }
}
