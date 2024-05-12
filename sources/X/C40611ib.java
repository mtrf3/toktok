package X;

import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40611ib implements OnIMMessageListener {
    public final DataChannel LJLIL;
    public IMessageManager LJLILLLLZI;
    public final ConcurrentHashMap<Class<? extends IMessage>, C0EA<? extends IMessage>> LJLJI = new ConcurrentHashMap<>();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "GameInteractionNoticeStrategy";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    public C40611ib(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    public final void LIZ(IMessageManager iMessageManager) {
        if (this.LJLIL == null || this.LJLILLLLZI != null) {
            return;
        }
        this.LJLILLLLZI = iMessageManager;
        this.LJLJI.put(GoodyBagMessage.class, new C29431Dn());
        this.LJLJI.put(RedEnvelopMessage.class, new C29501Du());
        this.LJLJI.put(LiveStreamGoalServerMessage.class, new C29481Ds());
        Iterator<Class<? extends IMessage>> it = this.LJLJI.keySet().iterator();
        while (it.hasNext()) {
            C0EA<? extends IMessage> c0ea = this.LJLJI.get(it.next());
            if (c0ea != null) {
                IMessageManager iMessageManager2 = this.LJLILLLLZI;
                if (iMessageManager2 != null) {
                    iMessageManager2.addAsyncMessageListener(c0ea.LIZ(), this);
                }
                c0ea.LIZIZ(this.LJLIL);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            C0EA<? extends IMessage> c0ea = this.LJLJI.get(iMessage.getClass());
            if (c0ea != null) {
                c0ea.onMessage(iMessage);
            }
        }
    }
}
