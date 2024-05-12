package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener;
import java.util.List;

/* renamed from: X.Bbt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29125Bbt extends SimpleEventListener {
    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onConnectingWebSocket(int i) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onInterceptMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onMessageConsumed(OnMessageListener onMessageListener, IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onReset() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onRoomEntered() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onSwitchToHttp(String str) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketConnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketDisconnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) {
        String methodName;
        if (iMessage != null && (methodName = iMessage.getMethodName()) != null && LiveSlardarTagSetting.INSTANCE.getCurrentValue().enable) {
            ((C65816PsK) C29121Bbp.LIZIZ.getValue()).LIZ(methodName);
        }
    }
}
