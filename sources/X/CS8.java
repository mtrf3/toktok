package X;

import com.bytedance.android.livesdk.model.message.PinMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CS8 {
    public static CR6 LIZ(PinMessage pinMessage) {
        if (pinMessage != null) {
            String str = pinMessage.method;
            if (o.LJ(str, EnumC31509CYf.CHAT.getWsMethod())) {
                return pinMessage.chatMessage;
            }
            if (o.LJ(str, EnumC31509CYf.SOCIAL.getWsMethod())) {
                return pinMessage.socialMessage;
            }
            if (o.LJ(str, EnumC31509CYf.MEMBER.getWsMethod())) {
                return pinMessage.memberMessage;
            }
            if (o.LJ(str, EnumC31509CYf.GIFT.getWsMethod())) {
                return pinMessage.giftMessage;
            }
            if (o.LJ(str, EnumC31509CYf.LIKE.getWsMethod())) {
                return pinMessage.likeMessage;
            }
            return null;
        }
        return null;
    }
}
