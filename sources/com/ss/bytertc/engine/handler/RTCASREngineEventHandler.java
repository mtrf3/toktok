package com.ss.bytertc.engine.handler;

/* loaded from: classes33.dex */
public class RTCASREngineEventHandler {
    public IRTCASREngineEventHandler asrEventHandler;

    public void onSuccess() {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onSuccess();
        }
    }

    public void onMessage(String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onMessage(str);
        }
    }

    public void setAsrEventHandler(IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        this.asrEventHandler = iRTCASREngineEventHandler;
    }

    public void onError(int i, String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onError(i, str);
        }
    }
}
