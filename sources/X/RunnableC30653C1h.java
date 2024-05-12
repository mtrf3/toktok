package X;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.C1h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC30653C1h implements Runnable {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;

    public RunnableC30653C1h(LiveBroadcastFragment liveBroadcastFragment) {
        this.LJLIL = liveBroadcastFragment;
    }

    public final void LIZ() {
        if (!this.LJLIL.isViewValid()) {
            return;
        }
        this.LJLIL.LJIIL().pv0(BroadcastEndShowEvent.class);
        C7N.LJIIIIZZ().exitRoom(true, this.LJLIL.xl());
        this.LJLIL.Yl();
        C0NB.LIZIZ("LiveBroadcastFragment", "room close new NewLiveBroadcastEndFragment");
        C2M c2m = this.LJLIL.LJLLLLLL;
        if (c2m != null) {
            Bundle bundle = new Bundle();
            LiveBroadcastFragment liveBroadcastFragment = this.LJLIL;
            bundle.putString("live_end_banned_url", liveBroadcastFragment.LLIILII);
            bundle.putCharSequence("live_end_banned_title", liveBroadcastFragment.LLIILZL);
            bundle.putCharSequence("live_end_banned_reason", liveBroadcastFragment.LLIIZ);
            bundle.putCharSequence("live_end_banned_content", liveBroadcastFragment.LLIL);
            bundle.putBoolean("is_one_tap_go_live", LiveBroadcastFragment.LLJJIJIIJIL);
            c2m.LIZ(bundle);
            if (LiveBroadcastFragment.LLJJIJIIJIL) {
                ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29129Bbx.class);
                return;
            }
            return;
        }
        o.LJIJI("liveBroadcastCallback");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
