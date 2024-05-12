package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: X.0EA, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0EA<T extends IMessage> {
    int LIZ();

    void LIZIZ(DataChannel dataChannel);

    void onMessage(IMessage iMessage);

    void onRelease();
}
