package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.o;

/* renamed from: X.EhS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37114EhS {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0);
            if (LLLLLLZ != null) {
                return LLLLLLZ.firstInstallTime;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1L;
    }
}
