package com.benchmark.port.nativePort;

import X.C1FO;
import X.C32771Qj;
import X.C38891fp;
import X.C47261Igj;
import X.X1D;

/* loaded from: classes.dex */
public class ApplogUtilsInvoker {
    public static native void nativeInit();

    public static void Init() {
        if (C32771Qj.LIZIZ) {
            nativeInit();
        }
    }

    static {
        C32771Qj.LIZ();
        if (!C32771Qj.LIZIZ) {
            C32771Qj.LIZ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isInSampleList(java.lang.String r3) {
        /*
            r3.getClass()
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1204796109: goto L1f;
                case 1066706310: goto L16;
                case 1600846586: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "bytebench_strategy_request"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            goto Lc
        L16:
            java.lang.String r0 = "bytebench_collection_report_task"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            goto Lc
        L1f:
            java.lang.String r0 = "bytebench_strategy_get_operation_result"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            goto Lc
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.port.nativePort.ApplogUtilsInvoker.isInSampleList(java.lang.String):boolean");
    }

    public static void onNativeCallback_onAppLogJson(String str, String str2) {
        if (isInSampleList(str) && !C1FO.LJIIIIZZ(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Event: ");
            LIZ.append(str);
            LIZ.append(", filter upload by sample");
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILJJIL("AppLogOpt");
            return;
        }
        C38891fp.LJJIII(str, str2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Event:");
        LIZ2.append(str);
        LIZ2.append(",json: ");
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        C47261Igj.LJIILJJIL("ApplogUtilsInvoker");
    }
}
