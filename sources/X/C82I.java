package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.82I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82I {
    public final int LIZ;
    public final PhotoModeImageUrlModel LIZIZ;
    public final VideoItemParams LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82I)) {
            return false;
        }
        C82I c82i = (C82I) obj;
        return this.LIZ == c82i.LIZ && o.LJ(this.LIZIZ, c82i.LIZIZ) && o.LJ(this.LIZJ, c82i.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31;
        VideoItemParams videoItemParams = this.LIZJ;
        return hashCode + (videoItemParams == null ? 0 : videoItemParams.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindData(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", photoModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", param=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C82I(int i, PhotoModeImageUrlModel photoModeImageUrlModel, VideoItemParams videoItemParams) {
        this.LIZ = i;
        this.LIZIZ = photoModeImageUrlModel;
        this.LIZJ = videoItemParams;
    }
}
