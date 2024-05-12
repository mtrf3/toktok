package com.ss.ttlivestreamer.core.transport;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.Transport;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class NativeTransport extends Transport {
    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    public static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void sendPacket(Buffer buffer, int i) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
