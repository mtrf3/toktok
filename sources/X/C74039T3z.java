package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.T3z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74039T3z implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final DataChannel LJLILLLLZI;

    public C74039T3z() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74039T3z)) {
            return false;
        }
        C74039T3z c74039T3z = (C74039T3z) obj;
        return this.LJLIL == c74039T3z.LJLIL && o.LJ(this.LJLILLLLZI, c74039T3z.LJLILLLLZI);
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
        DataChannel dataChannel = this.LJLILLLLZI;
        return i + (dataChannel == null ? 0 : dataChannel.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TitleLayoutHierarchyData(isAnchor=");
        LIZ.append(this.LJLIL);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C74039T3z(DataChannel dataChannel, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = dataChannel;
    }
}
