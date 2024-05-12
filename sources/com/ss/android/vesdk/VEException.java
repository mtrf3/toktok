package com.ss.android.vesdk;

import X.C012403c;

/* loaded from: classes12.dex */
public class VEException extends RuntimeException {
    public String msgDes;
    public int ret;

    public String getMsgDes() {
        return this.msgDes;
    }

    public int getRetCd() {
        return this.ret;
    }

    public VEException(int i, String str) {
        super(C012403c.LIZLLL("VESDK exception ret: ", i, "msg: ", str));
        this.ret = i;
        this.msgDes = str;
    }
}
