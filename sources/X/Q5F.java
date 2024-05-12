package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q5F {
    public static final ScheduledExecutorService LIZLLL = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("n/LoginLogger"));
    public final String LIZ;
    public final C66447Q5z LIZIZ;
    public final String LIZJ;

    public final void LIZ(String str) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            Bundle LIZ = Q5P.LIZ("");
            LIZ.putString("2_result", Q53.ERROR.getLoggingValue());
            LIZ.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            LIZ.putString("3_method", str);
            this.LIZIZ.getClass();
        } catch (Throwable unused) {
        }
    }

    public Q5F(Context context, String applicationId) {
        PackageInfo LLLLLLZ;
        o.LJIIIZ(applicationId, "applicationId");
        this.LIZ = applicationId;
        this.LIZIZ = new C66447Q5z(0);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, "com.facebook.katana", 0)) != null) {
                this.LIZJ = LLLLLLZ.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
