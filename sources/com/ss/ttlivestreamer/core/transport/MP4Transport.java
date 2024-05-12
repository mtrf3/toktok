package com.ss.ttlivestreamer.core.transport;

import com.ss.ttlivestreamer.core.engine.Transport;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class MP4Transport extends NativeTransport {
    private native void nativeCreateNative(boolean z, boolean z2);

    public native void nativeStartRecord();

    public native void nativeStopRecord();

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.NativeObject
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    public MP4Transport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }
}
