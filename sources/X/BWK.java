package X;

import com.bytedance.android.livesdk.model.message.QuestionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWK implements InterfaceC30921CBp<QuestionMessage> {
    @Override // X.InterfaceC30921CBp
    public final CRD b5(QuestionMessage questionMessage) {
        QuestionMessage message = questionMessage;
        o.LJIIIZ(message, "message");
        return new BWH(message);
    }
}
