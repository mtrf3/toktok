package com.bytedance.ttnet;

import X.C16880lQ;
import X.C64693PaD;
import X.C64752PbA;
import X.InterfaceC66023Pvf;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.ttnet.TTALog;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes12.dex */
public class TTALog {
    public static volatile long sALogFuncAddr;

    public static void ensureALogInitialized() {
        sALogFuncAddr = ALog.getALogWriteFuncAddr();
        if (sALogFuncAddr == 0) {
            ALog.addNativeFuncAddrCallback(new InterfaceC66023Pvf() { // from class: X.PbX
                @Override // X.InterfaceC66023Pvf
                public final void LIZ(long j) {
                    TTALog.lambda$ensureALogInitialized$0(j);
                }
            });
        }
    }

    public static C64693PaD getCronetHttpClient() {
        if (C64752PbA.LIZ()) {
            return C64693PaD.LJIILIIL(TTNetInit.getTTNetDepend().getContext());
        }
        return null;
    }

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    public static void init() {
        ensureALogInitialized();
    }

    public static void lambda$ensureALogInitialized$0(long j) {
        if (sALogFuncAddr != 0 || j == 0) {
            return;
        }
        sALogFuncAddr = j;
        try {
            if (getCronetHttpClient() != null) {
                long j2 = sALogFuncAddr;
                ICronetClient iCronetClient = C64693PaD.LIZLLL;
                if (iCronetClient != null) {
                    Reflect.on(iCronetClient).call("setAlogFuncAddr", new Class[]{Long.TYPE}, Long.valueOf(j2));
                    return;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
