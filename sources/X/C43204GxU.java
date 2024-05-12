package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GxU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43204GxU extends AbstractC43208GxY {
    public final VideoPublishEditModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43204GxU) && o.LJ(this.LIZ, ((C43204GxU) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowMoreOption(data=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C43204GxU(VideoPublishEditModel data) {
        o.LJIIIZ(data, "data");
        this.LIZ = data;
    }
}
