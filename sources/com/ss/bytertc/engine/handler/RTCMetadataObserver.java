package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCMetadataObserver {
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCMetadataObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public byte[] onReadyToSendMetadata(long j) {
        IMetadataObserver iMetadataObserver;
        RTCVideoImpl rTCVideoImpl;
        RTCEngineImpl rTCEngineImpl;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null) {
            iMetadataObserver = rTCEngineImpl.getMetadataObserver();
        } else {
            iMetadataObserver = null;
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null) {
            iMetadataObserver = rTCVideoImpl.getMetadataObserver();
        }
        if (iMetadataObserver == null) {
            return null;
        }
        return iMetadataObserver.onReadyToSendMetadata(j);
    }

    public RTCMetadataObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onMetadataReceived(byte[] bArr, String str, long j) {
        RTCVideoImpl rTCVideoImpl;
        IMetadataObserver metadataObserver;
        RTCEngineImpl rTCEngineImpl;
        IMetadataObserver metadataObserver2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (metadataObserver2 = rTCEngineImpl.getMetadataObserver()) != null) {
            metadataObserver2.onMetadataReceived(bArr, str, j);
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (metadataObserver = rTCVideoImpl.getMetadataObserver()) != null) {
            metadataObserver.onMetadataReceived(bArr, str, j);
        }
    }
}
