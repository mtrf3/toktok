package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.vesdk.VEException;
import defpackage.e1;
import java.io.IOException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gu3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42991Gu3 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Throwable error) {
        o.LJIIIZ(error, "error");
        if (e1.LIZ(31744, "studio_optimize_no_space_left_error_report", true, false)) {
            if ((error.getCause() instanceof IOException) && (LIZLLL(error) || Math.min(C39579Fg7.LJIILIIL(), 2147483647L) < 100)) {
                return true;
            }
            return false;
        }
        Throwable cause = error.getCause();
        if ((cause instanceof IOException) && (o.LJ(cause.getMessage(), "write failed: ENOSPC (No space left on device)") || Math.min(C39579Fg7.LJIILIIL(), 2147483647L) < 100)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Throwable th) {
        Throwable th2;
        if (!(th instanceof C43466H4c)) {
            if (th != null) {
                th2 = th.getCause();
            } else {
                th2 = null;
            }
            if (!(th2 instanceof C43466H4c)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZJ(Throwable error) {
        o.LJIIIZ(error, "error");
        int LJFF = LJFF(error);
        if (LJFF == -66666 || LJFF == -6666601) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Throwable th) {
        if (th == null) {
            return false;
        }
        do {
            String message = th.getMessage();
            if (message != null && s.LJJJLZIJ(message, "No space left on device", false)) {
                return true;
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    public static final String LJ(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (th instanceof C38333F2r) {
            Object rawResponse = ((C38333F2r) th).getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) rawResponse).extra) != null) {
                String str = serverTimeExtra.logid;
                if (str == null) {
                    return "empty_log_id";
                }
                return str;
            }
            return "";
        }
        if (th instanceof C42360Gjs) {
            return LJ(th.getCause());
        }
        return "";
    }

    public static final int LJFF(Throwable th) {
        int i;
        if (th instanceof C42990Gu2) {
            i = ((C42990Gu2) th).getCode();
        } else if (th instanceof VEException) {
            i = ((VEException) th).getRetCd();
        } else if (th instanceof C42360Gjs) {
            i = ((C42360Gjs) th).getCode();
        } else {
            i = 10038;
        }
        if (e1.LIZ(31744, "studio_optimize_no_space_left_error_report", true, false) && LIZLLL(th)) {
            return 100101;
        }
        return i;
    }

    public static final int LJII(Throwable th) {
        long errorCode;
        if (th instanceof C41767GaJ) {
            C41767GaJ c41767GaJ = (C41767GaJ) th;
            if (c41767GaJ.getErrorCode() != 0) {
                errorCode = c41767GaJ.getErrorCode();
                return (int) errorCode;
            }
        }
        if (th instanceof C42360Gjs) {
            return ((C42360Gjs) th).getCode();
        }
        if (th instanceof C42993Gu5) {
            errorCode = ((C42993Gu5) th).getErrorCode();
            return (int) errorCode;
        }
        return 12;
    }

    public static final int LJI(int i, Throwable th) {
        if (th instanceof C38333F2r) {
            return ((C38306F1q) th).getErrorCode();
        }
        if (th instanceof C42360Gjs) {
            return ((C42360Gjs) th).getCode();
        }
        if (th instanceof C43466H4c) {
            return -88888888;
        }
        if (!(th instanceof C2R2)) {
            return i;
        }
        return 2713;
    }
}
