package com.ss.bytertc.engine.handler;

import X.X1D;
import android.text.TextUtils;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCEngineInternalEventHandler {
    public String mCurrConfigAddr;
    public String mCurrSignalingAddr;
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public WeakReference<IRTCEngineInternalEventHandler> mRtcEngineInternalEventHandler;
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCEngineInternalEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onChannelTypeChanged(boolean z) {
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler;
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null && (iRTCEngineInternalEventHandler = weakReference.get()) != null) {
                iRTCEngineInternalEventHandler.onChannelTypeChanged(z);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onChannelTypeChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("REngineInternalEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onConfigAddrChanged(String str) {
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler;
        try {
            this.mCurrConfigAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null && (iRTCEngineInternalEventHandler = weakReference.get()) != null) {
                iRTCEngineInternalEventHandler.onConfigAddrChanged(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onConfigAddrChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("REngineInternalEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onPeerConnectionICEMux(boolean z) {
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler;
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null && (iRTCEngineInternalEventHandler = weakReference.get()) != null) {
                iRTCEngineInternalEventHandler.onPeerConnectionICEMux(z);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPeerConnectionICEMux callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("REngineInternalEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSignalingAddrChanged(String str) {
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler;
        try {
            this.mCurrSignalingAddr = str;
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null && (iRTCEngineInternalEventHandler = weakReference.get()) != null) {
                iRTCEngineInternalEventHandler.onSignalingAddrChanged(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSignalingAddrChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("REngineInternalEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        WeakReference<IRTCEngineInternalEventHandler> weakReference = new WeakReference<>(iRTCEngineInternalEventHandler);
        this.mRtcEngineInternalEventHandler = weakReference;
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler2 = weakReference.get();
        if (iRTCEngineInternalEventHandler2 != null) {
            if (!TextUtils.isEmpty(this.mCurrConfigAddr)) {
                iRTCEngineInternalEventHandler2.onConfigAddrChanged(this.mCurrConfigAddr);
            }
            if (!TextUtils.isEmpty(this.mCurrSignalingAddr)) {
                iRTCEngineInternalEventHandler2.onSignalingAddrChanged(this.mCurrSignalingAddr);
            }
        }
    }

    public RTCEngineInternalEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onSystemInfoLog(double d, double d2, double d3) {
        IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler;
        try {
            WeakReference<IRTCEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference != null && (iRTCEngineInternalEventHandler = weakReference.get()) != null) {
                iRTCEngineInternalEventHandler.onSystemInfoLog(d, d2, d3);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSystemInfoLog callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("REngineInternalEventHandler", X1D.LIZIZ(LIZ));
        }
    }
}
