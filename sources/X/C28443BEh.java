package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.BEh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28443BEh {
    public final Long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;

    public C28443BEh() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28443BEh)) {
            return false;
        }
        C28443BEh c28443BEh = (C28443BEh) obj;
        return o.LJ(this.LIZ, c28443BEh.LIZ) && o.LJ(this.LIZIZ, c28443BEh.LIZIZ) && o.LJ(this.LIZJ, c28443BEh.LIZJ) && o.LJ(this.LIZLLL, c28443BEh.LIZLLL) && o.LJ(this.LJ, c28443BEh.LJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageModel imageModel = this.LJ;
        return hashCode4 + (imageModel != null ? imageModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveIMUser(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", displayId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatar=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28443BEh(Long l, String str, String str2, String str3, ImageModel imageModel) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = imageModel;
    }
}
