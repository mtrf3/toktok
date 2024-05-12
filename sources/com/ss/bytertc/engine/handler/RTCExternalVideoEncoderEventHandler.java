package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCExternalVideoEncoderEventHandler {
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCExternalVideoEncoderEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void OnStart(int i) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCEngineImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onStart(StreamIndex.fromId(i));
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onStart(StreamIndex.fromId(i));
        }
    }

    public void OnStop(int i) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCEngineImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onStop(StreamIndex.fromId(i));
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onStop(StreamIndex.fromId(i));
        }
    }

    public RTCExternalVideoEncoderEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void OnRequestKeyFrame(int i, int i2) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCEngineImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onRequestKeyFrame(StreamIndex.fromId(i), i2);
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onRequestKeyFrame(StreamIndex.fromId(i), i2);
        }
    }

    public void OnRateUpdate(int i, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCEngineImpl rTCEngineImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCEngineImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onRateUpdate(StreamIndex.fromId(i), i2, i3, i4);
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onRateUpdate(StreamIndex.fromId(i), i2, i3, i4);
        }
    }
}
