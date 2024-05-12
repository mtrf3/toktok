package com.bytedance.bdlocation.network.response;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes2.dex */
public class LocationResp {

    @InterfaceC65349Pkn("data")
    public String data;

    @InterfaceC65349Pkn("err_no")
    public int resultCode;

    @InterfaceC65349Pkn("err_msg")
    public String resultMsg;

    @InterfaceC65349Pkn("err_tip")
    public String resultTip;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationResp{resultCode=");
        LIZ.append(this.resultCode);
        LIZ.append(", resultMsg='");
        Q89.LIZIZ(LIZ, this.resultMsg, '\'', ", resultTip='");
        Q89.LIZIZ(LIZ, this.resultTip, '\'', ", data='");
        return C77800Ug8.LIZJ(LIZ, this.data, '\'', '}', LIZ);
    }
}
