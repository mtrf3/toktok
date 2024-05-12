package X;

import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB7 implements InterfaceC30921CBp<SubscriptionGuideMessage> {
    @Override // X.InterfaceC30921CBp
    public final CRD b5(SubscriptionGuideMessage subscriptionGuideMessage) {
        SubscriptionGuideMessage message = subscriptionGuideMessage;
        o.LJIIIZ(message, "message");
        return new CBD(message);
    }
}
