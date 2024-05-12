package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: X.6or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171896or {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "3552899045825971930"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 0);
    }
}
