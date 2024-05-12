package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import org.json.JSONObject;

/* renamed from: X.PiV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65207PiV implements InterfaceC84214X3i {
    public static volatile boolean LIZIZ;
    public static volatile C65206PiU LIZJ;
    public static volatile Class<?> LIZLLL;
    public final C65209PiX LIZ;

    static {
        try {
            Class.forName("com.bytedance.ttnet.TTNetInit");
            LIZIZ = true;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Fail to get TTNetInit with: ");
            LIZ.append(th.toString());
            C65210PiY.LIZJ("TTNetHandlerImpl", "Init", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC84214X3i
    public final InterfaceC48252Iwi LIZJ() {
        if (LIZIZ) {
            if (LIZJ == null) {
                synchronized (C65207PiV.class) {
                    if (LIZJ == null) {
                        LIZJ = new C65206PiU(this.LIZ);
                    }
                }
            }
            return LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC84214X3i
    public final InterfaceC84217X3l getTTNetDownloadHttpService() {
        if (LIZIZ) {
            if (LIZJ == null) {
                synchronized (C65207PiV.class) {
                    if (LIZJ == null) {
                        LIZJ = new C65206PiU(this.LIZ);
                    }
                }
            }
            return LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC84214X3i
    public final boolean LIZIZ() {
        return LIZIZ;
    }

    public C65207PiV(C65209PiX c65209PiX) {
        this.LIZ = c65209PiX;
    }

    public static int LJ(Throwable th) {
        int errorCode;
        if (th == null) {
            return -1;
        }
        if (th instanceof C64802Pby) {
            return ((C64802Pby) th).getStatusCode();
        }
        if (!(th instanceof DownloadTTNetException) || (errorCode = ((BaseException) th).getErrorCode()) >= 4000 || errorCode <= 3000) {
            return -1;
        }
        return errorCode - 3000;
    }

    @Override // X.InterfaceC84214X3i
    public final int LIZLLL(Throwable th) {
        if (!LIZIZ || th == null || LJ(th) > 0) {
            return -1;
        }
        return LJ(th.getCause());
    }

    @Override // X.InterfaceC84214X3i
    public final DownloadTTNetException LIZ(String str, Throwable th) {
        int i;
        int intValue;
        if (!LIZIZ || th == null) {
            return null;
        }
        if (th instanceof DownloadTTNetException) {
            DownloadTTNetException downloadTTNetException = (DownloadTTNetException) th;
            if (!TextUtils.isEmpty(str)) {
                downloadTTNetException.setRequestLog(str);
            }
            return downloadTTNetException;
        }
        if (th instanceof C64802Pby) {
            C64802Pby c64802Pby = (C64802Pby) th;
            if (c64802Pby.getStatusCode() > 0) {
                DownloadTTNetException downloadTTNetException2 = new DownloadTTNetException(c64802Pby.getStatusCode() + 3000, th);
                downloadTTNetException2.setRequestLog(str);
                return downloadTTNetException2;
            }
            DownloadTTNetException downloadTTNetException3 = new DownloadTTNetException(1082, th);
            downloadTTNetException3.setRequestLog(str);
            return downloadTTNetException3;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        if (LIZLLL == null) {
            try {
                LIZLLL = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
            } catch (Throwable th2) {
                if (C65210PiY.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Fail to get Cronet Class ");
                    LIZ.append(th2.toString());
                    C65210PiY.LIZIZ("TTNetHandlerImpl", "translateTTNetException", X1D.LIZIZ(LIZ));
                }
            }
        }
        try {
            if (LIZLLL != null && LIZLLL.isInstance(th) && (intValue = ((Integer) Reflect.on(th).call("getCronetInternalErrorCode").get()).intValue()) < 0) {
                DownloadTTNetException downloadTTNetException4 = new DownloadTTNetException(Math.abs(intValue) + LiveNetAdaptiveHurryTimeSetting.DEFAULT, th);
                downloadTTNetException4.setRequestLog(str);
                return downloadTTNetException4;
            }
        } catch (Throwable th3) {
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Fail to call NetworkExceptionImpl function ");
                LIZ2.append(th3.toString());
                C65210PiY.LIZIZ("TTNetHandlerImpl", "translateTTNetException", X1D.LIZIZ(LIZ2));
            }
        }
        if (!(th instanceof C64799Pbv)) {
            return null;
        }
        try {
            String requestLog = ((C64799Pbv) th).getRequestLog();
            if (!TextUtils.isEmpty(requestLog)) {
                JSONObject jSONObject = new JSONObject(requestLog);
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "base");
                if (jSONObject2.has("net_error")) {
                    DownloadTTNetException downloadTTNetException5 = new DownloadTTNetException(Math.abs(JSONObjectProtectorUtils.getInt(jSONObject2, "net_error")) + LiveNetAdaptiveHurryTimeSetting.DEFAULT, th);
                    downloadTTNetException5.setRequestLog(requestLog);
                    return downloadTTNetException5;
                }
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "response");
                if (jSONObject3.has("code") && (i = JSONObjectProtectorUtils.getInt(jSONObject3, "code")) > 0) {
                    DownloadTTNetException downloadTTNetException6 = new DownloadTTNetException(i + 3000, th);
                    downloadTTNetException6.setRequestLog(requestLog);
                    return downloadTTNetException6;
                }
            }
        } catch (Throwable unused) {
        }
        DownloadTTNetException downloadTTNetException7 = new DownloadTTNetException(1078, th);
        downloadTTNetException7.setRequestLog(str);
        return downloadTTNetException7;
    }
}
