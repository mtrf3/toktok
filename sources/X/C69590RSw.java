package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import kotlin.jvm.internal.o;

/* renamed from: X.RSw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69590RSw {
    public final Integer LIZ;
    public final UrlModel LIZIZ;
    public final Challenge LIZJ;

    public C69590RSw() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69590RSw)) {
            return false;
        }
        C69590RSw c69590RSw = (C69590RSw) obj;
        return o.LJ(this.LIZ, c69590RSw.LIZ) && o.LJ(this.LIZIZ, c69590RSw.LIZIZ) && o.LJ(this.LIZJ, c69590RSw.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UrlModel urlModel = this.LIZIZ;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Challenge challenge = this.LIZJ;
        return hashCode2 + (challenge != null ? challenge.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicBlockTitleViewData(blockTitleResId=");
        LIZ.append(this.LIZ);
        LIZ.append(", blockCover=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", challenge=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69590RSw(Integer num, UrlModel urlModel, Challenge challenge) {
        this.LIZ = num;
        this.LIZIZ = urlModel;
        this.LIZJ = challenge;
    }
}
