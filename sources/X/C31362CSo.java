package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CSo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31362CSo extends QXX {
    public C31362CSo() {
        super((Object) null);
    }

    public static MGetTranslationRequest.Text LLLLZ(CQJ t) {
        o.LJIIIZ(t, "t");
        MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
        String str = ((ChatMessage) t.LJIJJLI).content;
        o.LJIIIIZZ(str, "t.message.content");
        text.text = str;
        ChatMessage chatMessage = (ChatMessage) t.LJIJJLI;
        CommonMessageData commonMessageData = chatMessage.baseMessage;
        if (commonMessageData != null) {
            text.msgId = commonMessageData.messageId;
            text.roomMessageHeatLevel = commonMessageData.roomMessageHeatLevel;
        }
        String LJ = C05170If.LJ(chatMessage.atUser);
        o.LJIIIIZZ(LJ, "getUsername(t.message.atUser)");
        text.atUsername = LJ;
        String LIZLLL = C05170If.LIZLLL(((ChatMessage) t.LJIJJLI).atUser);
        o.LJIIIIZZ(LIZLLL, "getNickname(t.message.atUser)");
        text.atNickname = LIZLLL;
        List<EmoteWithIndex> it = ((ChatMessage) t.LJIJJLI).f117emotes;
        StringBuilder sb = new StringBuilder();
        o.LJIIIIZZ(it, "it");
        int i = 0;
        for (EmoteWithIndex emoteWithIndex : it) {
            int i2 = i + 1;
            if (i >= 0) {
                EmoteWithIndex emoteWithIndex2 = emoteWithIndex;
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(emoteWithIndex2.index);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "t.message.emotes.let {\n ….toString()\n            }");
        text.emotesIndex = sb2;
        text.textSource = 1;
        return text;
    }

    public static void LLLLZIL(java.util.Map map, CQJ m) {
        String LIZIZ;
        o.LJIIIZ(map, "map");
        o.LJIIIZ(m, "m");
        if (((ChatMessage) m.LJIJJLI).f117emotes.isEmpty()) {
            LIZIZ = ((ChatMessage) m.LJIJJLI).content;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((ChatMessage) m.LJIJJLI).content);
            LIZ.append('^');
            LIZ.append(m.LJIJJLI.baseMessage.messageId);
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        MGetTranslationResponse.Data.Translation translation = (MGetTranslationResponse.Data.Translation) map.get(LIZIZ);
        if (translation != null && translation.translated) {
            m.LJJIJ = true;
            m.LJJIJIIJI = translation.translation;
            m.LJJL(translation.emotesIndexMap);
        }
    }
}
