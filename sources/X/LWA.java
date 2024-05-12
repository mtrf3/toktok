package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.follow.api.FollowFeedPreload;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWA implements InterfaceC84349X8n {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        Bundle bundle = new Bundle();
        bundle.putLong("preload_start_time", this.LIZ);
        bundle.putBoolean("power_net_preload_key_strict_mode", true);
        trigger.LIZIZ(bundle, FollowFeedPreload.class, new LWI(this.LIZIZ, this.LIZ));
    }

    public LWA(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
