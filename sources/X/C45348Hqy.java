package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45348Hqy {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(AppLog.getServerDeviceId());
        LIZ2.append(System.currentTimeMillis());
        return C38352F3k.LIZJ(X1D.LIZIZ(LIZ2));
    }

    public static String LIZIZ(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("ins_special");
        } else {
            sb.append("topleft");
        }
        if (!DownloadServiceImpl.LJ().LIZJ() && z && C44496HdE.LIZ()) {
            sb.append(",ins_ending");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }
}
