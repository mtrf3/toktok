package X;

import com.bytedance.android.livesdk.model.message.SocialMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRZ implements InterfaceC31330CRi<SocialMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(SocialMessage socialMessage, CQQ context) {
        SocialMessage message = socialMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.shareDisplayStyle == 1 && context.LJIIZILJ) {
            return true;
        }
        return false;
    }
}
