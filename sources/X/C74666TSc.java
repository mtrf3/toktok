package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import kotlin.jvm.internal.o;
import webcast.im.LinkStateMessage;

/* renamed from: X.TSc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74666TSc implements TT7 {
    public final /* synthetic */ GameLinkGuestPresenter LIZ;

    public C74666TSc(GameLinkGuestPresenter gameLinkGuestPresenter) {
        this.LIZ = gameLinkGuestPresenter;
    }

    @Override // X.TT7
    public final void LLFFF(LinkStateMessage message) {
        o.LJIIIZ(message, "message");
        this.LIZ.diffAndEmitStateChange(message);
        if (message.needAck == 1) {
            this.LIZ.ackStateMessage(message);
        }
    }
}
