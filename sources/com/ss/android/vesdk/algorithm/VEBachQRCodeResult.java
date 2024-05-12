package com.ss.android.vesdk.algorithm;

import X.C72416SbU;
import X.C74221TAz;
import X.C84127Wzz;
import X.Q89;
import X.X1D;

/* loaded from: classes13.dex */
public class VEBachQRCodeResult extends C72416SbU {
    public int mCodeType;
    public String mResult = "";
    public float zoomRefactor;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEBachQRCodeResult{mResult='");
        Q89.LIZIZ(LIZ, this.mResult, '\'', ", mCodeType=");
        LIZ.append(this.mCodeType);
        LIZ.append(", zoomRefactor=");
        return C74221TAz.LIZLLL(LIZ, this.zoomRefactor, '}', LIZ);
    }

    public int getCodeType() {
        return this.mCodeType;
    }

    public String getResult() {
        return this.mResult;
    }

    public float getZoomRefactor() {
        return this.zoomRefactor;
    }

    public static VEBachQRCodeResult fromCameraParcel(byte[] bArr) {
        C84127Wzz c84127Wzz = new C84127Wzz(bArr);
        VEBachQRCodeResult vEBachQRCodeResult = new VEBachQRCodeResult();
        vEBachQRCodeResult.retCode = c84127Wzz.LIZJ();
        vEBachQRCodeResult.setCodeType(c84127Wzz.LIZJ());
        vEBachQRCodeResult.setZoomRefactor(c84127Wzz.LIZIZ());
        int LIZJ = c84127Wzz.LIZJ();
        vEBachQRCodeResult.setResult(c84127Wzz.LIZLLL(LIZJ, LIZJ));
        return vEBachQRCodeResult;
    }

    public void setCodeType(int i) {
        this.mCodeType = i;
    }

    public void setResult(String str) {
        this.mResult = str;
    }

    public void setZoomRefactor(float f) {
        this.zoomRefactor = f;
    }
}
