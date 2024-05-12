package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CQn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31309CQn implements InterfaceC48038ItG, ILogger, InterfaceC45510Hta, InterfaceC31408CUi, InterfaceC16660l4, XF0 {
    public static final C31309CQn LJLIL = new C31309CQn();

    @Override // X.InterfaceC45510Hta
    public boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC45510Hta
    public int LIZJ(MyMediaModel myMediaModel, boolean z) {
        return 0;
    }

    @Override // X.InterfaceC45510Hta
    public void LIZLLL(MyMediaModel myMediaModel, View view) {
    }

    @Override // X.InterfaceC45510Hta
    public /* synthetic */ boolean LJ() {
        return false;
    }

    @Override // X.XF0
    public void LJFF(String effectId, String filePath) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(filePath, "filePath");
    }

    @Override // X.XF0
    public void LJI(String effectId, C57M c57m) {
        o.LJIIIZ(effectId, "effectId");
    }

    @Override // X.InterfaceC45510Hta
    public boolean LJII(MyMediaModel myMediaModel) {
        return true;
    }

    public void LJIIIIZZ(View view) {
    }

    @Override // X.XF0
    public void LJIIIZ(int i, String effectId) {
        o.LJIIIZ(effectId, "effectId");
    }

    public void LJIIJ() {
    }

    @Override // X.InterfaceC45510Hta
    public boolean LJIIJJI(MyMediaModel myMediaModel) {
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public /* synthetic */ boolean LJIILJJIL() {
        return false;
    }

    @Override // X.InterfaceC45510Hta
    public void LJIILL(List list, EnumC44979Hl1 enumC44979Hl1, MyMediaModel myMediaModel) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public boolean supportDebugInfo() {
        return false;
    }

    @Override // X.InterfaceC45510Hta
    public void LJIIL(MediaModel mediaModel) {
        throw null;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        boolean z;
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static RoomMessage LJIJ(long j, String str) {
        RoomMessage roomMessage = new RoomMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        roomMessage.baseMessage = commonMessageData;
        roomMessage.content = str;
        return roomMessage;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public void log(String str, String str2) {
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII(str, str2);
    }

    public static SocialMessage LJIJI(long j, Text text, User user) {
        if (text == null) {
            return null;
        }
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        commonMessageData.displayText = text;
        SocialMessage socialMessage = new SocialMessage();
        socialMessage.isLocalInsertMsg = true;
        socialMessage.baseMessage = commonMessageData;
        socialMessage.user = user;
        return socialMessage;
    }

    public static EmoteChatMessage LJIIZILJ(long j, List list, long j2, InterfaceC05190Ih interfaceC05190Ih, User user) {
        EmoteChatMessage emoteChatMessage = new EmoteChatMessage();
        emoteChatMessage.emoteList = list;
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j2;
        commonMessageData.showMsg = true;
        emoteChatMessage.baseMessage = commonMessageData;
        if (user != null) {
            emoteChatMessage.user = user;
        } else {
            emoteChatMessage.user = User.from(interfaceC05190Ih);
        }
        return emoteChatMessage;
    }

    public static ChatMessage LJIILLIIL(long j, ChatResult chatResult, User user, InterfaceC05190Ih interfaceC05190Ih, List list, boolean z) {
        User user2;
        User user3;
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.chatId = chatResult.getMsgId();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = chatResult.getMsgId();
        commonMessageData.showMsg = true;
        commonMessageData.displayText = chatResult.getDisplayText();
        chatMessage.baseMessage = commonMessageData;
        Text displayText = chatResult.getDisplayText();
        if (displayText != null && !C79004UzY.LJJIFFI(displayText.pieces)) {
            for (TextPiece textPiece : displayText.pieces) {
                TextPieceUser textPieceUser = textPiece.userValue;
                if (textPieceUser != null && (user3 = textPieceUser.user) != null && interfaceC05190Ih != null && user3.getId() == interfaceC05190Ih.getId()) {
                    user2 = textPiece.userValue.user;
                    break;
                }
            }
        }
        user2 = null;
        chatMessage.f117emotes = list;
        chatMessage.background = chatResult.getBackground();
        chatMessage.content = chatResult.getContent();
        chatMessage.fullScreenTextColor = chatResult.getFullScreenTextColor();
        if (user2 != null) {
            chatMessage.userInfo = user2;
        } else if (user != null) {
            chatMessage.userInfo = user;
        } else {
            chatMessage.userInfo = User.from(interfaceC05190Ih);
        }
        if (z) {
            chatMessage.quickChatScene = 3;
        }
        return chatMessage;
    }
}
