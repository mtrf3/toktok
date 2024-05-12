package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PortalMessage;

/* renamed from: X.CTo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31388CTo extends CQO<PortalMessage> {
    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        MESSAGE message = this.LJIJJLI;
        if (((PortalMessage) message).payload instanceof PortalMessage.PortalFinish) {
            return ((PortalMessage.PortalFinish) ((PortalMessage) message).payload).luckyPerson;
        }
        return null;
    }

    public C31388CTo(PortalMessage portalMessage) {
        super(portalMessage);
    }
}
