package X;

import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GWm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41656GWm {
    public final DraftRestoreResult LIZ;
    public final VideoPublishEditModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41656GWm)) {
            return false;
        }
        C41656GWm c41656GWm = (C41656GWm) obj;
        return o.LJ(this.LIZ, c41656GWm.LIZ) && o.LJ(this.LIZIZ, c41656GWm.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        return hashCode + (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftRestoreResultWrap(restoreResult=");
        LIZ.append(this.LIZ);
        LIZ.append(", editModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41656GWm(DraftRestoreResult restoreResult, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(restoreResult, "restoreResult");
        this.LIZ = restoreResult;
        this.LIZIZ = videoPublishEditModel;
    }
}
