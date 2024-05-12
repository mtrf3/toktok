package X;

import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLT {
    public final NoticePerfManager.JanusData LIZ;
    public final NoticePerfManager.NoticeData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MLT)) {
            return false;
        }
        MLT mlt = (MLT) obj;
        return o.LJ(this.LIZ, mlt.LIZ) && o.LJ(this.LIZIZ, mlt.LIZIZ);
    }

    public final int hashCode() {
        NoticePerfManager.JanusData janusData = this.LIZ;
        int hashCode = (janusData == null ? 0 : janusData.hashCode()) * 31;
        NoticePerfManager.NoticeData noticeData = this.LIZIZ;
        return hashCode + (noticeData != null ? noticeData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataCache(janusData=");
        LIZ.append(this.LIZ);
        LIZ.append(", noticeData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public MLT(NoticePerfManager.JanusData janusData, NoticePerfManager.NoticeData noticeData) {
        this.LIZ = janusData;
        this.LIZIZ = noticeData;
    }
}
