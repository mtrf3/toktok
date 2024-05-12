package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;

/* renamed from: X.Bz8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30566Bz8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ LiveBroadcastFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30566Bz8(LiveBroadcastFragment liveBroadcastFragment) {
        super(0);
        this.LJLIL = liveBroadcastFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle bundle;
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null && (bundle = arguments.getBundle("extra")) != null) {
            z = bundle.getBoolean("interact_is_only_push_rtc", false);
        }
        return Boolean.valueOf(z);
    }
}
