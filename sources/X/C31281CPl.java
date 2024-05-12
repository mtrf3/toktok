package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.live.publicscreen.api.NonGiftMessageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.StarCommentPushMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.CPl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31281CPl implements C3T, OnMessageListener {
    public final DataChannel LJLIL;
    public IMessageManager LJLILLLLZI;
    public LinkedList<ChatMessage> LJLJI;
    public LinkedList<GiftMessage> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;

    @Override // X.C3T
    public final void LIZ() {
        this.LJLJJL = true;
    }

    @Override // X.C3T
    public final void LIZIZ() {
        this.LJLJJLL = false;
        LJII().clear();
    }

    @Override // X.C3T
    public final void LIZLLL() {
        this.LJLJL = false;
        LJI().clear();
    }

    @Override // X.C3T
    public final void LJ() {
        this.LJLJJL = false;
        LJI().clear();
        LJII().clear();
    }

    @Override // X.C3T
    public final void LJFF() {
        this.LJLIL.rv0(NewMessageNumChannel.class, 0);
        this.LJLIL.rv0(NonGiftMessageChannel.class, 0);
    }

    public final LinkedList<ChatMessage> LJI() {
        LinkedList<ChatMessage> linkedList = this.LJLJI;
        if (linkedList != null) {
            return linkedList;
        }
        o.LJIJI("chatMessageList");
        throw null;
    }

    public final LinkedList<GiftMessage> LJII() {
        LinkedList<GiftMessage> linkedList = this.LJLJJI;
        if (linkedList != null) {
            return linkedList;
        }
        o.LJIJI("giftMessageList");
        throw null;
    }

    @Override // X.C3T
    public final void release() {
        LJFF();
        IMessageManager iMessageManager = this.LJLILLLLZI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLILLLLZI = null;
    }

    public C31281CPl(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        this.LJLJJLL = true;
        this.LJLJL = true;
        this.LJLJLJ = "";
        BroadcastGameFloatWindowLibra broadcastGameFloatWindowLibra = BroadcastGameFloatWindowLibra.INSTANCE;
        this.LJLJLLL = broadcastGameFloatWindowLibra.isExperimentGroup2();
        this.LJLL = broadcastGameFloatWindowLibra.isExperimentGroup();
    }

    @Override // X.C3T
    public final void LIZJ(IMessageManager iMessageManager) {
        if (iMessageManager == null || o.LJ(this.LJLILLLLZI, iMessageManager)) {
            return;
        }
        IMessageManager iMessageManager2 = this.LJLILLLLZI;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(this);
        }
        this.LJLILLLLZI = iMessageManager;
        iMessageManager.addMessageListener(EnumC31509CYf.GIFT.getIntType(), this);
        iMessageManager.addMessageListener(EnumC31509CYf.CHAT.getIntType(), this);
        iMessageManager.addMessageListener(EnumC31509CYf.SOCIAL.getIntType(), this);
        iMessageManager.addMessageListener(EnumC31509CYf.ROOM.getIntType(), this);
        iMessageManager.addMessageListener(EnumC31509CYf.STAR_COMMENT_PUSH_MESSAGE.getIntType(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        String str;
        o.LJIIIZ(message, "message");
        if (!this.LJLL && !o.LJ(InterfaceC30442Bx8.LJIIZILJ.LIZJ(), Boolean.TRUE)) {
            return;
        }
        int i = 0;
        if (message instanceof StarCommentPushMessage) {
            Boolean LIZJ = InterfaceC30442Bx8.LJJIL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GAME_STAR_COMMENT_MSG_PUSH.value");
            if (LIZJ.booleanValue()) {
                StarCommentMessage starCommentMessage = ((StarCommentPushMessage) message).current;
                if (starCommentMessage != null) {
                    str = starCommentMessage.starCommentId;
                } else {
                    str = null;
                }
                if (!o.LJ(str, this.LJLJLJ) && !o.LJ(str, "") && str != null) {
                    this.LJLJLJ = str;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (message instanceof GiftMessage) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LJJIJIIJIL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_GAME_GIFT_MSG_PUSH.value");
            if (!LIZJ2.booleanValue()) {
                return;
            }
            GiftMessage giftMessage = (GiftMessage) message;
            Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(giftMessage.giftId);
            if (findGiftById == null) {
                findGiftById = giftMessage.mGift;
            }
            if ((giftMessage.repeatEnd == 0 && findGiftById.combo) || findGiftById.type == 11) {
                return;
            }
            Boolean LIZJ3 = InterfaceC30442Bx8.LJJIJIL.LIZJ();
            o.LJIIIIZZ(LIZJ3, "LIVE_GAME_SHOW_BUBBLE_GIFT.value");
            if (LIZJ3.booleanValue() && this.LJLJJL && this.LJLJLLL && this.LJLJJLL) {
                LJII().add(message);
                if (LJII().size() > 50) {
                    LJII().poll();
                }
            }
        } else if (message instanceof ChatMessage) {
            if (o.LJ(((BaseMessage) message).baseMessage.describe, "star_comment")) {
                Boolean LIZJ4 = InterfaceC30442Bx8.LJJIJLIJ.LIZJ();
                o.LJIIIIZZ(LIZJ4, "LIVE_GAME_SHOW_BUBBLE_STAR_COMMENT.value");
                if (LIZJ4.booleanValue()) {
                    return;
                }
            }
            Boolean LIZJ5 = InterfaceC30442Bx8.LJJIJIIJI.LIZJ();
            o.LJIIIIZZ(LIZJ5, "LIVE_GAME_COMMENT_MSG_PUSH.value");
            boolean booleanValue = LIZJ5.booleanValue();
            Boolean LIZJ6 = InterfaceC30442Bx8.LJJIJL.LIZJ();
            o.LJIIIIZZ(LIZJ6, "LIVE_GAME_SHOW_BUBBLE_COMMENT.value");
            if (LIZJ6.booleanValue() && this.LJLJJL && this.LJLL && this.LJLJL) {
                LJI().add(message);
                if (LJI().size() > 50) {
                    LJI().poll();
                }
            }
            if (!booleanValue) {
                return;
            }
        } else if (message instanceof SocialMessage) {
            Boolean LIZJ7 = InterfaceC30442Bx8.LJJJ.LIZJ();
            o.LJIIIIZZ(LIZJ7, "GAME_MESSAGE_NOTIFICATION_ATTENTION_MESSAGE.value");
            if (!LIZJ7.booleanValue() || ((SocialMessage) message).action != 1) {
                return;
            }
        } else {
            if (!(message instanceof RoomMessage)) {
                return;
            }
            RoomMessage roomMessage = (RoomMessage) message;
            if (roomMessage.source != 3 && !o.LJ(roomMessage.baseMessage.describe, "LiveGoal")) {
                return;
            }
        }
        Integer num = (Integer) this.LJLIL.kv0(NewMessageNumChannel.class);
        if (num == null || (i = num.intValue()) < 100) {
            this.LJLIL.rv0(NewMessageNumChannel.class, Integer.valueOf(i + 1));
        }
    }

    public final void LJIIIIZZ(LinkedList<ChatMessage> chatMessageList, LinkedList<GiftMessage> giftMessageList) {
        o.LJIIIZ(chatMessageList, "chatMessageList");
        o.LJIIIZ(giftMessageList, "giftMessageList");
        LJFF();
        this.LJLJI = chatMessageList;
        this.LJLJJI = giftMessageList;
    }
}
