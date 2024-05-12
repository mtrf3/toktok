package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CNY implements InterfaceC25290yz {
    public final /* synthetic */ CNV LJLIL;

    @Override // X.InterfaceC25290yz
    public final void LIZJ() {
    }

    public CNY(CNV cnv) {
        this.LJLIL = cnv;
    }

    @Override // X.InterfaceC25290yz
    public final void LIZ(String containerType) {
        long j;
        o.LJIIIZ(containerType, "containerType");
        this.LJLIL.setEndTime(SystemClock.elapsedRealtime());
        String containerId = this.LJLIL.getContainerId();
        String name = this.LJLIL.getName();
        String url = this.LJLIL.getConfig().getUrl();
        if (this.LJLIL.getStartTime() != -1) {
            j = this.LJLIL.getEndTime() - this.LJLIL.getStartTime();
        } else {
            j = -1;
        }
        C31218CNa.LIZIZ(j, containerId, name, "live", url);
    }

    @Override // X.InterfaceC25290yz
    public final void LIZLLL(String containerType) {
        o.LJIIIZ(containerType, "containerType");
        C31218CNa.LIZ(this.LJLIL.getContainerId(), this.LJLIL.getName(), null, "live", this.LJLIL.getConfig().getUrl(), null);
    }

    @Override // X.InterfaceC25290yz
    public final void LLLLLLL(String containerType) {
        o.LJIIIZ(containerType, "containerType");
        this.LJLIL.setStartTime(SystemClock.elapsedRealtime());
    }
}
