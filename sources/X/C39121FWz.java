package X;

import android.content.Intent;
import android.os.IBinder;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.ss.android.ugc.aweme.push.downgrade.ListenMainProcessService;

/* renamed from: X.FWz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39121FWz implements IBinder.DeathRecipient {
    public final /* synthetic */ ListenMainProcessService LJLIL;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.LJLIL.startService(new Intent(this.LJLIL, (Class<?>) WsChannelService.class));
    }

    public C39121FWz(ListenMainProcessService listenMainProcessService) {
        this.LJLIL = listenMainProcessService;
    }
}
