package com.ss.mediakit.net;

import X.C16880lQ;
import android.os.Handler;

/* loaded from: classes7.dex */
public class DefaultConstructor implements CreateConstructor {
    @Override // com.ss.mediakit.net.CreateConstructor
    public BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        try {
            return new HTTPDNS(str, aVMDLNetClient, i, handler);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
