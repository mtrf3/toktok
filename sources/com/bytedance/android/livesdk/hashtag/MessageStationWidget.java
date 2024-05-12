package com.bytedance.android.livesdk.hashtag;

import X.C29047Bad;
import X.C29927Bop;
import X.C30079BrH;
import X.C32537Cpp;
import X.CXJ;
import X.EnumC31509CYf;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.HashtagMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes6.dex */
public final class MessageStationWidget extends LiveRecyclableWidget implements OnMessageListener {
    public IMessageManager LJLIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.HASHTAG.getIntType(), this);
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.bytedance.android.livesdk.model.Hashtag, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Text text;
        Hashtag hashtag;
        if (iMessage instanceof HashtagMessage) {
            HashtagMessage hashtagMessage = (HashtagMessage) iMessage;
            CommonMessageData commonMessageData = hashtagMessage.baseMessage;
            if (commonMessageData != null && (text = commonMessageData.displayText) != null && (hashtag = hashtagMessage.hashtag) != null) {
                hashtag.title = CXJ.LJFF(text, "").toString();
            }
            ?? r2 = hashtagMessage.hashtag;
            if (r2 != 0) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != 0) {
                    dataChannel.rv0(HashtagChangedChannel.class, r2);
                }
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29047Bad.class)).LIZ = r2;
            }
        }
    }
}
