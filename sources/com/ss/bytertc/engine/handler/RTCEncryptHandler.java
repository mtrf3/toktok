package com.ss.bytertc.engine.handler;

import X.X1D;
import com.ss.bytertc.engine.utils.LogUtil;

/* loaded from: classes33.dex */
public class RTCEncryptHandler {
    public IRTCEncryptionHandler mCustomizeEncryptHandler;

    public RTCEncryptHandler(IRTCEncryptionHandler iRTCEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRTCEncryptionHandler;
    }

    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.d("RtcEngineEncryptHandler", "onDecryptData...");
        byte[] bArr2 = null;
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler == null) {
                return null;
            }
            bArr2 = iRTCEncryptionHandler.onDecryptData(bArr);
            return bArr2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDecryptData callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcEngineEncryptHandler", X1D.LIZIZ(LIZ));
            return bArr2;
        }
    }

    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.d("RtcEngineEncryptHandler", "onEncryptData...");
        byte[] bArr2 = null;
        try {
            IRTCEncryptionHandler iRTCEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRTCEncryptionHandler == null) {
                return null;
            }
            bArr2 = iRTCEncryptionHandler.onEncryptData(bArr);
            return bArr2;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEncryptData callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcEngineEncryptHandler", X1D.LIZIZ(LIZ));
            return bArr2;
        }
    }
}
