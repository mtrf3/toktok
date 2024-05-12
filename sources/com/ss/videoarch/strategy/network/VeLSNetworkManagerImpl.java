package com.ss.videoarch.strategy.network;

import X.C63988P9k;
import X.C63989P9l;
import X.PMW;
import X.X1D;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VeLSNetworkManagerImpl {
    public static String TAG = "VeLSSettingsManager";
    public C63988P9k mHttpApi;

    public static VeLSNetworkManagerImpl getInstance() {
        return PMW.LIZ;
    }

    private String sendRequestByGet(String str) {
        C63988P9k c63988P9k = this.mHttpApi;
        if (c63988P9k == null) {
            return "";
        }
        try {
            c63988P9k.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c63988P9k.LIZ);
            LIZ.append(str);
            return new JSONObject(c63988P9k.LIZIZ.executeGet(C63988P9k.LIZ(X1D.LIZIZ(LIZ), c63988P9k.LIZJ))).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String SendRequest(String str) {
        return sendRequestByGet(str);
    }

    public void init(C63989P9l c63989P9l) {
        this.mHttpApi = new C63988P9k(c63989P9l);
    }

    private String sendRequestByPost(String str, String str2) {
        if (this.mHttpApi == null) {
            return "";
        }
        try {
            return this.mHttpApi.LIZIZ(new JSONObject(str2), str).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String SendRequest(String str, String str2) {
        return sendRequestByPost(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String SendRequestWithNodeInfo(java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, java.lang.String r12) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r3 = ""
            if (r0 == 0) goto L9
            return r3
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r6 = 0
            if (r0 == 0) goto L11
            r12 = r6
        L11:
            com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer r4 = com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LJFF()
            r4.getClass()
            boolean r0 = android.text.TextUtils.equals(r12, r6)
            r2 = 1
            java.lang.String r1 = ","
            if (r0 == 0) goto L90
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mEnableHttpDns
            if (r0 != r2) goto L8e
            if (r10 == 0) goto L8e
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mSendHttpDnsByLocalDnsTimeout
            if (r0 != r2) goto L4b
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mSendHttpDnsByLocalDnsTimeout
            if (r0 != r2) goto L8e
            boolean r0 = r4.LJJIIJ
            if (r0 == 0) goto L8e
        L4b:
            java.lang.String r5 = r4.LIZIZ(r6)
        L4f:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            boolean r0 = r0.LJIILL
            if (r0 == 0) goto L8c
            if (r11 == 0) goto L8c
            java.lang.String r4 = r4.LIZJ(r6)
        L5d:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L6d
            boolean r0 = r5.equals(r3)
            if (r0 != 0) goto Lc1
            java.lang.String r5 = defpackage.a1.LJ(r4, r1, r5)
        L6d:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L87
            r0 = 0
            java.lang.String r0 = X.C79061V1d.LJ(r9, r2, r0)
            java.lang.String r0 = defpackage.i0.LJFF(r0, r1)
            java.lang.String r1 = defpackage.i0.LJFF(r0, r5)
            java.lang.String r0 = "}"
            java.lang.String r9 = defpackage.i0.LJFF(r1, r0)
        L87:
            java.lang.String r0 = r7.sendRequestByPost(r8, r9)
            return r0
        L8c:
            r4 = r3
            goto L5d
        L8e:
            r5 = r3
            goto L4f
        L90:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mEnableHttpDns
            if (r0 != r2) goto Lbf
            java.lang.String r5 = r4.LIZIZ(r12)
        La0:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            boolean r0 = r0.LJIILL
            if (r0 == 0) goto Lbd
            java.lang.String r4 = r4.LIZJ(r12)
        Lac:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L6d
            boolean r0 = r5.equals(r3)
            if (r0 != 0) goto Lc1
            java.lang.String r5 = defpackage.a1.LJ(r4, r1, r5)
            goto L6d
        Lbd:
            r4 = r3
            goto Lac
        Lbf:
            r5 = r3
            goto La0
        Lc1:
            r5 = r4
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.network.VeLSNetworkManagerImpl.SendRequestWithNodeInfo(java.lang.String, java.lang.String, boolean, boolean, java.lang.String):java.lang.String");
    }
}
