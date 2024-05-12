package com.bytedance.android.livesdk.interaction.poll.selectpoll;

import X.C29927Bop;
import X.C5H3;
import X.C78996UzQ;
import X.CCC;
import X.CCP;
import X.CCQ;
import X.CCR;
import X.CCS;
import X.CCT;
import X.CCU;
import X.CCV;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SelectPollViewModel extends ViewModel implements OnMessageListener {
    public final DataChannel LJLIL;
    public CCC LJLILLLLZI;
    public final CCP LJLJI = new CCP(this);
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(CCU.LJLIL);
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(CCV.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(CCS.LJLIL);
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(CCT.LJLIL);
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(CCR.LJLIL);
    public CCQ LJLJLLL;
    public final IMessageManager LJLL;

    public final NextLiveData<Throwable> gv0() {
        return (NextLiveData) this.LJLJJLL.getValue();
    }

    public SelectPollViewModel(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        this.LJLL = (IMessageManager) dataChannel.kv0(C29927Bop.class);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        Integer num;
        o.LJIIIZ(message, "message");
        if (message instanceof PollMessage) {
            PollMessage pollMessage = (PollMessage) message;
            Integer num2 = pollMessage.pollKind;
            if ((num2 == null || num2.intValue() != 1) && ((num = pollMessage.pollKind) == null || num.intValue() != 0)) {
                return;
            }
            long j = pollMessage.baseMessage.createTime / 1000;
            Object kv0 = this.LJLIL.kv0(RoomChannel.class);
            o.LJI(kv0);
            if (j < ((Room) kv0).nowTime) {
                return;
            }
            ((LiveData) this.LJLJJI.getValue()).postValue(message);
        }
    }
}
