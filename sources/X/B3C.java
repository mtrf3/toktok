package X;

import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.stream.performance.abs.AudienceBlockHeartBeatMonitorEnableSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B3C {
    public final BKJ LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public B3C(BKJ livePlayFragment) {
        o.LJIIIZ(livePlayFragment, "livePlayFragment");
        this.LIZ = livePlayFragment;
        this.LIZIZ = AudienceBlockHeartBeatMonitorEnableSetting.INSTANCE.getValue();
    }

    public final void LIZIZ(boolean z) {
        B42 ea;
        BLB blb;
        C28601BKj c28601BKj;
        if (this.LIZIZ && (ea = this.LIZ.ea()) != null && (blb = ((LiveRoomFragment) ea).LJZ) != null && (c28601BKj = (C28601BKj) blb.LIZJ) != null) {
            String currentUrl = this.LIZ.getCurrentUrl();
            o.LJIIIIZZ(currentUrl, "livePlayFragment.currentUrl");
            c28601BKj.LIZ(this.LIZ.getRoomId(), currentUrl, z);
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        B42 ea;
        BLB blb;
        C28601BKj c28601BKj;
        if (this.LIZIZ && (ea = this.LIZ.ea()) != null && (blb = ((LiveRoomFragment) ea).LJZ) != null && (c28601BKj = (C28601BKj) blb.LIZJ) != null) {
            String currentUrl = this.LIZ.getCurrentUrl();
            o.LJIIIIZZ(currentUrl, "livePlayFragment.currentUrl");
            long roomId = this.LIZ.getRoomId();
            if (!c28601BKj.LIZIZ) {
                return;
            }
            if (z) {
                c28601BKj.LIZ(roomId, currentUrl, false);
            } else {
                if (!z2) {
                    return;
                }
                c28601BKj.LIZ(roomId, currentUrl, true);
            }
        }
    }
}
