package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeQueueMessage;
import com.bytedance.android.livesdk.model.message.KaraokeReqMessage;
import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import com.bytedance.android.livesdkapi.depend.model.live.KaraokeInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.1Z1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z1 implements OnMessageListener {
    public final LifecycleOwner LJLIL;
    public final KaraokeViewModel LJLILLLLZI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof KaraokeQueueMessage) {
            C0NB.LIZIZ("KaraokeManager", "receive queue msg");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), null, null, new C55352Ff((KaraokeQueueMessage) iMessage, this, null), 3);
        } else if (iMessage instanceof KaraokeReqMessage) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), null, null, new C55362Fg((KaraokeReqMessage) iMessage, this, null), 3);
        } else {
            if (!(iMessage instanceof KaraokeSwitchMessage)) {
                return;
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), null, null, new C55372Fh((KaraokeSwitchMessage) iMessage, this, null), 3);
        }
    }

    public C1Z1(int i, DataChannel dataChannel, LifecycleOwner lifecycleOwner, KaraokeViewModel karaokeViewModel, KaraokeInfo karaokeInfo) {
        Boolean bool;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = karaokeViewModel;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            if (i == 1) {
                iMessageManager.addAsyncMessageListener(EnumC31509CYf.KARAOKE_REQ_MESSAGE.getIntType(), this);
                return;
            }
            if (i != 2) {
                return;
            }
            if (karaokeInfo != null) {
                bool = Boolean.valueOf(karaokeInfo.displayKaraoke);
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                return;
            }
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.KARAOKE_QUEUE_MESSAGE.getIntType(), this);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.KARAOKE_SWITCH_MESSAGE.getIntType(), this);
            iMessageManager.addAsyncMessageListener(EnumC31509CYf.KARAOKE_REQ_MESSAGE.getIntType(), this);
        }
    }
}
