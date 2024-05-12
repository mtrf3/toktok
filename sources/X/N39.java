package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N39 {
    public final long LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final DataChannel LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N39)) {
            return false;
        }
        N39 n39 = (N39) obj;
        return this.LIZ == n39.LIZ && o.LJ(this.LIZIZ, n39.LIZIZ) && o.LJ(this.LIZJ, n39.LIZJ) && o.LJ(this.LIZLLL, n39.LIZLLL);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        InterfaceC65784Pro<String> interfaceC65784Pro = this.LIZIZ;
        int hashCode = (LLJIJIL + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = this.LIZJ;
        int hashCode2 = (hashCode + (interfaceC65784Pro2 == null ? 0 : interfaceC65784Pro2.hashCode())) * 31;
        DataChannel dataChannel = this.LIZLLL;
        return hashCode2 + (dataChannel != null ? dataChannel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionBusinessConfig(noFirstFrameTimeoutInSeconds=");
        LIZ.append(this.LIZ);
        LIZ.append(", getLayoutName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasModeratorPermission=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public N39(long j, InterfaceC65784Pro<String> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, DataChannel dataChannel) {
        this.LIZ = j;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC65784Pro2;
        this.LIZLLL = dataChannel;
    }
}
