package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147535qf {
    public final VideoPublishEditModel LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final AVMusic LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C147535qf)) {
            return false;
        }
        C147535qf c147535qf = (C147535qf) obj;
        return o.LJ(this.LIZ, c147535qf.LIZ) && this.LIZIZ == c147535qf.LIZIZ && this.LIZJ == c147535qf.LIZJ && o.LJ(this.LIZLLL, c147535qf.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.LIZJ) * 31;
        AVMusic aVMusic = this.LIZLLL;
        return i2 + (aVMusic == null ? 0 : aVMusic.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditActivityData(publishEditModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", mIsFromSysShare=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", draftToEditFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mOldMusicModel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C147535qf(VideoPublishEditModel videoPublishEditModel, boolean z, int i, AVMusic aVMusic) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = aVMusic;
    }
}
