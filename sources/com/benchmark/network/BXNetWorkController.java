package com.benchmark.network;

import X.C1NR;
import X.C47261Igj;
import X.C64797Pbt;
import X.C65083PgV;
import X.C79146V4k;
import X.InterfaceC08580Vi;
import X.X1D;
import com.benchmark.netUtils.BytebenchAPI;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class BXNetWorkController {
    public static InterfaceC08580Vi mNetWorker;

    public static void init() {
        if (mNetWorker == null) {
            mNetWorker = new C1NR();
        }
    }

    public static String getNetworkClassify() {
        return C79146V4k.LJJIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (0 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.benchmark.network.ByteBenchResponse execute(com.benchmark.network.ByteBenchRequest r4) {
        /*
            com.benchmark.network.ByteBenchResponse r3 = new com.benchmark.network.ByteBenchResponse
            r3.<init>()
            X.0Vi r0 = com.benchmark.network.BXNetWorkController.mNetWorker
            r2 = -1
            if (r0 == 0) goto L36
            r1 = 0
            X.1NR r0 = (X.C1NR) r0     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            java.io.ByteArrayOutputStream r1 = r0.LIZ(r4, r3)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            if (r1 != 0) goto L16
            r3.mErrorCode = r2     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            return r3
        L16:
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            r3.mData = r0     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            r0 = 0
            r3.mErrorCode = r0     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L2f
            goto L2b
        L20:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2f
            r3.mMessage = r0     // Catch: java.lang.Throwable -> L2f
            r3.mErrorCode = r2     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L38
        L2b:
            r1.close()     // Catch: java.lang.Exception -> L38
            goto L38
        L2f:
            r0 = move-exception
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.lang.Exception -> L35
        L35:
            throw r0
        L36:
            r3.mErrorCode = r2
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.network.BXNetWorkController.execute(com.benchmark.network.ByteBenchRequest):com.benchmark.network.ByteBenchResponse");
    }

    public static void setNetWorkImp(InterfaceC08580Vi interfaceC08580Vi) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNetWorkImp: ");
        LIZ.append(interfaceC08580Vi.toString());
        X1D.LIZIZ(LIZ);
        C47261Igj.LJJIIJ("BXNetWorkController");
        mNetWorker = interfaceC08580Vi;
    }

    public static boolean downloadFile(String str, String str2, String str3) {
        BufferedOutputStream bufferedOutputStream;
        if (mNetWorker == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                C64797Pbt<TypedInput> execute = ((BytebenchAPI) C65083PgV.LJIIL(str).LIZ(BytebenchAPI.class)).downloadFile("", linkedHashMap, hashMap).execute();
                if (!execute.LIZIZ()) {
                    return false;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(execute.LIZIZ.in());
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str2);
                    LIZ.append("/");
                    LIZ.append(str3);
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(X1D.LIZIZ(LIZ))));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    C47261Igj.LJIILJJIL("ByteBenchNetWorkImp");
                    return true;
                } catch (Exception unused3) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    bufferedInputStream.close();
                    if (bufferedOutputStream2 == null) {
                        return false;
                    }
                    bufferedOutputStream2.close();
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    try {
                        bufferedInputStream.close();
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                            throw th;
                        }
                        throw th;
                    } catch (Exception unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (Exception unused5) {
            return false;
        }
    }
}
