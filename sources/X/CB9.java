package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB9 extends CBF<ChatMessage> {
    @Override // X.CBF
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final boolean LIZ(ChatMessage message, CQQ context) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        List<EmoteWithIndex> list = message.f117emotes;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return super.LIZ(context, message);
    }
}
