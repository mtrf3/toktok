package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPJ extends AbstractC31313CQr<QuestionMessage> {
    public static final CPJ LIZJ = new CPJ();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        QuestionMessage t = (QuestionMessage) obj;
        o.LJIIIZ(t, "t");
        return t.question.user;
    }
}
