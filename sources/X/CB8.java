package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSubCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB8 extends CBF<SubscriptionGuideMessage> {
    @Override // X.CBF, X.InterfaceC31330CRi
    public final boolean LIZ(IMessage iMessage, CQQ context) {
        CR6 message = (CR6) iMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!LiveSubCapsuleGovernanceSetting.INSTANCE.subCapsuleDefault()) {
            return true;
        }
        return super.LIZ(context, message);
    }

    @Override // X.CBF
    /* renamed from: LIZIZ */
    public final boolean LIZ(CQQ context, CR6 message) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!LiveSubCapsuleGovernanceSetting.INSTANCE.subCapsuleDefault()) {
            return true;
        }
        return super.LIZ(context, message);
    }
}
