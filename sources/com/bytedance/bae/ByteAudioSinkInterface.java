package com.bytedance.bae;

/* loaded from: classes17.dex */
public interface ByteAudioSinkInterface {

    /* loaded from: classes17.dex */
    public interface ByteAudioAuxSink {
        void onMixingBegin(ByteAudioAuxStream byteAudioAuxStream);

        void onMixingEnd(ByteAudioAuxStream byteAudioAuxStream);

        int onPullAudioBufferToAuxStream(ByteAudioAuxStream byteAudioAuxStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    /* loaded from: classes17.dex */
    public interface ByteAudioFilterSink {
        int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    /* loaded from: classes17.dex */
    public interface ByteAudioInputSink {
        int onPushAudioBufferFromStream(ByteAudioInputStream byteAudioInputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    /* loaded from: classes17.dex */
    public interface ByteAudioOutputSink {
        int onPullAudioBufferToStream(ByteAudioOutputStream byteAudioOutputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }
}
