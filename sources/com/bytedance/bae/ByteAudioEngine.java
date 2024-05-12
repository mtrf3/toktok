package com.bytedance.bae;

import X.C16880lQ;
import com.bytedance.bae.base.Utils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class ByteAudioEngine extends IByteAudioEngine {
    public static Boolean sIsLibraryLoaded = Boolean.FALSE;
    public List<ByteAudioEventHandlerProxy> eventHandlerList = new ArrayList();
    public long nativeEnginePtr;

    @Override // com.bytedance.bae.IByteAudioEngine
    public int addEnableAudioRouteReference() {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAddEnableAudioRouteReference(j);
        }
        return -1;
    }

    public void release() {
        if (this.nativeEnginePtr != 0) {
            ByteAudioNativeFunctions.nativeReleaseInstance();
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int removeEnableAudioRouteReference() {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeRemoveEnableAudioRouteReference(j);
        }
        return -1;
    }

    public ByteAudioEngine() {
        if (!sIsLibraryLoaded.booleanValue()) {
            try {
                C16880lQ.LLJJJIL("byteaudio");
                sIsLibraryLoaded = Boolean.TRUE;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        this.nativeEnginePtr = ByteAudioNativeFunctions.nativeGetInstance();
    }

    public static void setLibraryLoaded(boolean z) {
        sIsLibraryLoaded = Boolean.valueOf(z);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void addEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        Iterator<ByteAudioEventHandlerProxy> it = this.eventHandlerList.iterator();
        while (it.hasNext()) {
            if (byteAudioEventHandler.equals(it.next().handler)) {
                return;
            }
        }
        ByteAudioEventHandlerProxy byteAudioEventHandlerProxy = new ByteAudioEventHandlerProxy(byteAudioEventHandler);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            long nativeAddEventHandler = ByteAudioNativeFunctions.nativeAddEventHandler(j, byteAudioEventHandlerProxy);
            if (nativeAddEventHandler != 0) {
                byteAudioEventHandlerProxy.setNativeHandler(nativeAddEventHandler);
                this.eventHandlerList.add(byteAudioEventHandlerProxy);
            }
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustHeadsetMonitorVolume(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAdjustHeadsetMonitorVolume(j, i);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustPlaybackVolume(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAdjustPlaybackVolume(j, i);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustRecordVolume(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeAdjustRecordVolume(j, i);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioAuxStream createAuxStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioAuxStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioInputStream createInputStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioInputStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioOutputStream createOutputStream(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return new ByteAudioOutputStream(j, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int enableEarMonitor(boolean z) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableEarMonitor(j, z);
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioStreamOption getValue(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeGetValue(j, i);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream) {
        byteAudioAuxStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseInputStream(ByteAudioInputStream byteAudioInputStream) {
        byteAudioInputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream) {
        byteAudioOutputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        if (this.nativeEnginePtr != 0) {
            for (int i = 0; i < this.eventHandlerList.size(); i++) {
                ByteAudioEventHandlerProxy byteAudioEventHandlerProxy = (ByteAudioEventHandlerProxy) ListProtector.get(this.eventHandlerList, i);
                if (byteAudioEventHandlerProxy.handler == byteAudioEventHandler) {
                    ByteAudioNativeFunctions.nativeRemoveEventHandler(this.nativeEnginePtr, byteAudioEventHandlerProxy.nativeHandlerPtr);
                    this.eventHandlerList.remove(byteAudioEventHandlerProxy);
                    byteAudioEventHandlerProxy.handler = null;
                    byteAudioEventHandlerProxy.nativeHandlerPtr = 0L;
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setAudioModeStrategy(ByteAudioModeStrategyTable byteAudioModeStrategyTable) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeSetAudioModeStrategy(j, Utils.convertAudioModeStrategyTable(byteAudioModeStrategyTable));
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setDefaultAudioRoute(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeSetDefaultAudioRoute(j, i);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setServerConfigure(String str) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeSetServerConfigure(j, str);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int stopPushExternalReferenceBuffer(int i) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeStopPushExternalReferenceBuffer(j, i);
            return -1;
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            return ByteAudioNativeFunctions.nativeSetValue(j, i, byteAudioStreamOption);
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int pushExternalReferenceBuffer(int i, ByteAudioStreamBuffer byteAudioStreamBuffer, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativePushExternalReferenceBuffer(j, i, byteAudioStreamBuffer, i2);
            return -1;
        }
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setEarMonitorFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetEarMonitorFilter(j, byteAudioFilterProxy, i, i2);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetFrontInputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetInputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetOutputFilter(j, byteAudioFilterProxy, i, i2);
        }
    }
}
