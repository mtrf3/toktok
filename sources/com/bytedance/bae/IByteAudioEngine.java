package com.bytedance.bae;

/* loaded from: classes17.dex */
public abstract class IByteAudioEngine {
    public static ByteAudioEngine mInstance;

    public abstract int addEnableAudioRouteReference();

    public abstract void addEventHandler(ByteAudioEventHandler byteAudioEventHandler);

    public abstract int adjustHeadsetMonitorVolume(int i);

    public abstract int adjustPlaybackVolume(int i);

    public abstract int adjustRecordVolume(int i);

    public abstract ByteAudioAuxStream createAuxStream(String str);

    public abstract ByteAudioInputStream createInputStream(String str);

    public abstract ByteAudioOutputStream createOutputStream(String str);

    public abstract int enableEarMonitor(boolean z);

    public abstract ByteAudioStreamOption getValue(int i);

    public abstract int pushExternalReferenceBuffer(int i, ByteAudioStreamBuffer byteAudioStreamBuffer, int i2);

    public abstract int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream);

    public abstract int releaseInputStream(ByteAudioInputStream byteAudioInputStream);

    public abstract int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream);

    public abstract int removeEnableAudioRouteReference();

    public abstract void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler);

    public abstract int setAudioModeStrategy(ByteAudioModeStrategyTable byteAudioModeStrategyTable);

    public abstract int setDefaultAudioRoute(int i);

    public abstract void setEarMonitorFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public abstract void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public abstract void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public abstract void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2);

    public abstract int setServerConfigure(String str);

    public abstract int setValue(int i, ByteAudioStreamOption byteAudioStreamOption);

    public abstract int stopPushExternalReferenceBuffer(int i);

    public static synchronized IByteAudioEngine getInstance() {
        ByteAudioEngine byteAudioEngine;
        synchronized (IByteAudioEngine.class) {
            if (mInstance == null) {
                mInstance = new ByteAudioEngine();
            }
            byteAudioEngine = mInstance;
        }
        return byteAudioEngine;
    }

    public static synchronized void releaseInstance() {
        synchronized (IByteAudioEngine.class) {
            ByteAudioEngine byteAudioEngine = mInstance;
            if (byteAudioEngine != null) {
                byteAudioEngine.release();
            }
            mInstance = null;
        }
    }

    public static void setLibraryLoaded(boolean z) {
        ByteAudioEngine.setLibraryLoaded(z);
    }
}