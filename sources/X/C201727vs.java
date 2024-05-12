package X;

import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.7vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201727vs implements C33Q {
    public final boolean LJLIL;
    public final VideoMaskInfo LJLILLLLZI;

    public C201727vs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C201727vs)) {
            return false;
        }
        C201727vs c201727vs = (C201727vs) obj;
        return this.LJLIL == c201727vs.LJLIL && o.LJ(this.LJLILLLLZI, c201727vs.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        VideoMaskInfo videoMaskInfo = this.LJLILLLLZI;
        return i + (videoMaskInfo == null ? 0 : videoMaskInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportVideoState(showReport=");
        LIZ.append(this.LJLIL);
        LIZ.append(", maskInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C201727vs(int i) {
        this(false, null);
    }

    public C201727vs(boolean z, VideoMaskInfo videoMaskInfo) {
        this.LJLIL = z;
        this.LJLILLLLZI = videoMaskInfo;
    }
}
