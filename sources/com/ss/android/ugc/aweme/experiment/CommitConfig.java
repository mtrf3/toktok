package com.ss.android.ugc.aweme.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CommitConfig {

    @InterfaceC65349Pkn("affect_scene")
    public final String affectScene;

    @InterfaceC65349Pkn("delay_time")
    public final long delayTime;

    @InterfaceC65349Pkn("open")
    public final boolean open;

    /* JADX WARN: Multi-variable type inference failed */
    public CommitConfig() {
        this(false, null, 0L, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitConfig)) {
            return false;
        }
        CommitConfig commitConfig = (CommitConfig) obj;
        return this.open == commitConfig.open && o.LJ(this.affectScene, commitConfig.affectScene) && this.delayTime == commitConfig.delayTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.open;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.affectScene;
        return C16880lQ.LLJIJIL(this.delayTime) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommitConfig(open=");
        LIZ.append(this.open);
        LIZ.append(", affectScene=");
        LIZ.append(this.affectScene);
        LIZ.append(", delayTime=");
        return C47135Ieh.LIZIZ(LIZ, this.delayTime, ')', LIZ);
    }

    public CommitConfig(boolean z, String str, long j) {
        this.open = z;
        this.affectScene = str;
        this.delayTime = j;
    }

    public /* synthetic */ CommitConfig(boolean z, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 5000L : j);
    }
}
