package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SimpleEventListener implements EventListener {
    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onConnectingWebSocket(int i) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onDeduplicateInterceptorMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImFetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImFetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImFetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImPrefetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImPrefetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onImPrefetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onInterceptMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onMessageConsumed(OnMessageListener onMessageListener, IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onPreDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onReset() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onRoomEntered() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onSwitchToHttp(String str) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onWebSocketConnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public void onWebSocketDisconnected() {
    }
}
