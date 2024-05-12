package com.ttnet.org.chromium.net;

import X.JFJ;
import X.O6T;
import X.X1D;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes9.dex */
public class HttpNegotiateAuthenticator {
    public static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator();
    }

    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = O6T.LIZ;
        JFJ jfj = new JFJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SPNEGO:HOSTBASED:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        AccountManager.get(context);
        Bundle bundle = new Bundle();
        jfj.LIZ = bundle;
        if (str2 != null) {
            bundle.putString("incomingAuthToken", str2);
        }
        jfj.LIZ.putBoolean("canDelegate", z);
    }
}
