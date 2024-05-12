package X;

import com.bytedance.android.livesdk.livesetting.portal.PortalPersonalizeSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYJ implements InterfaceC31330CRi<EnvelopePortalMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(EnvelopePortalMessage envelopePortalMessage, CQQ context) {
        long j;
        String str;
        InterfaceC29405BgP LIZIZ;
        EnvelopePortalMessage message = envelopePortalMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            j = LIZIZ.getCurrentUserId();
        } else {
            j = 0;
        }
        String valueOf = String.valueOf(j);
        EnvelopePortalMessage.PortalInfo portalInfo = message.portalInfo;
        if (portalInfo == null || (str = portalInfo.senderId) == null) {
            str = "";
        }
        if (!o.LJ(valueOf, str) && !C29306Beo.LJIIJ(context.LJIIIIZZ) && PortalPersonalizeSetting.INSTANCE.getValue() != 2) {
            return true;
        }
        return false;
    }
}
