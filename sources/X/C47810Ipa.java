package X;

import com.ss.ttm.ttvideodecode.Native;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Ipa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47810Ipa {
    public static volatile boolean LIZ = false;
    public static volatile String LIZIZ = "";

    static {
        if (C47149Iev.LIZ.LJII == 1) {
            TTVideoEngineLog.d("JniUtils", "JniUtils.loadLibrary in static block");
            LIZJ();
        }
    }

    public static int LIZ() {
        String str = "exception is null";
        if (!LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("library not load suc exception:");
            if (LIZIZ != null) {
                str = LIZIZ;
            }
            LIZ2.append(str);
            throw new Exception(X1D.LIZIZ(LIZ2));
        }
        try {
            return Native._getSupportedMethod();
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            LIZ3.append(str);
            throw new Exception(X1D.LIZIZ(LIZ3));
        }
    }

    public static synchronized void LIZJ() {
        synchronized (C47810Ipa.class) {
            try {
                if (!LIZ) {
                    TTVideoEngineLog.d("JniUtils", "JniUtils.loadLibrary");
                    C16880lQ.LLJJJIL("videodec");
                    LIZ = true;
                }
            } finally {
            }
        }
    }

    public static String LIZIZ(byte[] bArr, byte[] bArr2) {
        String str = "exception is null";
        if (!LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("library not load suc exception:");
            if (LIZIZ != null) {
                str = LIZIZ;
            }
            LIZ2.append(str);
            throw new Exception(X1D.LIZIZ(LIZ2));
        }
        try {
            return Native._getDecodedStr(bArr, bArr2);
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            LIZ3.append(str);
            throw new Exception(X1D.LIZIZ(LIZ3));
        }
    }
}
