package com.ss.ttlivestreamer.livestreamv2.game;

import android.os.Message;

/* loaded from: classes12.dex */
public class MessageBox {
    public Message mMessage;
    public Message mResponse;
    public ResponHandler mResponseHandler;

    /* loaded from: classes12.dex */
    public interface ResponHandler {
        void onError(MessageBox messageBox, Throwable th);

        void onSucceed(MessageBox messageBox);
    }

    public Message getMessage() {
        return this.mMessage;
    }

    public Message getResponse() {
        return this.mResponse;
    }

    public ResponHandler getResponseHandler() {
        return this.mResponseHandler;
    }

    public MessageBox(int i) {
        this(i, (ResponHandler) null);
    }

    public void setResponse(Message message) {
        this.mResponse = message;
    }

    public MessageBox(Message message) {
        this(message, (ResponHandler) null);
    }

    public MessageBox(Message message, ResponHandler responHandler) {
        this.mMessage = message;
        this.mResponseHandler = responHandler;
    }

    public MessageBox(int i, ResponHandler responHandler) {
        this(i, null, responHandler);
    }

    public MessageBox(int i, Object obj, ResponHandler responHandler) {
        this(Message.obtain(null, i, obj), responHandler);
    }
}
