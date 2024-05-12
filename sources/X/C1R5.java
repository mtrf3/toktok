package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1R5, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1R5 implements InterfaceC67207QZf {
    @Override // X.InterfaceC67207QZf
    public String LIZIZ(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static HashMap LIZ(String str, String str2) {
        o.LJIIIZ(str, str2);
        return new HashMap();
    }
}
