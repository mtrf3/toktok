package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38571fJ implements InterfaceC24100x4 {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;

    @Override // X.InterfaceC24100x4
    public final void LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZIZ = 0;
        this.LIZ = 0;
        this.LIZJ = 0L;
    }

    @Override // X.InterfaceC24100x4
    public final void y3(Fragment fragment, DataChannel dataChannel) {
        long j;
        IMessageManager iMessageManager;
        Room room;
        o.LJIIIZ(fragment, "fragment");
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LIZJ = j;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.GIFT.getIntType(), new OnMessageListener() { // from class: X.1fI
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
                public final void onMessage(IMessage iMessage) {
                    o.LJII(iMessage, "null cannot be cast to non-null type com.bytedance.android.livesdk.message.model.BaseLiveMessage");
                    if (!((BaseMessage) iMessage).isCurrentRoom(C38571fJ.this.LIZJ)) {
                        return;
                    }
                    if (iMessage instanceof GiftMessage) {
                        GiftMessage giftMessage = (GiftMessage) iMessage;
                        Gift gift = giftMessage.mGift;
                        if (gift != null && gift.LIZ()) {
                            C38571fJ.this.LIZIZ += giftMessage.comboCount;
                        } else {
                            C38571fJ.this.LIZ += giftMessage.comboCount;
                        }
                    }
                    JSONObject putOpt = new JSONObject().putOpt("small_gifts", Integer.valueOf(C38571fJ.this.LIZ)).putOpt("large_gifts", Integer.valueOf(C38571fJ.this.LIZIZ));
                    o.LJIIIIZZ(putOpt, "JSONObject()\n           …rge_gifts\", largeGiftCnt)");
                    C18180nW.LIZ("livesdk_custom_log_sum_gifts", putOpt);
                }
            });
        }
    }
}
