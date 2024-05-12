package X;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.o;

/* renamed from: X.8s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224878s7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        try {
            if (C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
