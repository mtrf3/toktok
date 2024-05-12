package X;

import com.ss.android.common.applog.AppLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GvV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43081GvV {
    public static final String LIZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(Calendar.getInstance().getTime());
        StringBuilder LIZ = X1D.LIZ();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        LIZ.append(AppLog.getServerDeviceId());
        LIZ.append(format);
        return X1D.LIZIZ(LIZ);
    }
}
