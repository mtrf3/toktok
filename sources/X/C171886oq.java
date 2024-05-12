package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171886oq {
    public static final /* synthetic */ int LIZ = 0;

    public static C171856on LIZIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        C171856on LIZ2 = C171866oo.LIZ(intent);
        if (LIZ2 != null) {
            return LIZ2;
        }
        return null;
    }

    public static Intent LIZ(Context context, C171856on c171856on, String str) {
        List<ResolveInfo> queryIntentActivities;
        o.LJIIIZ(context, "context");
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        c171856on.LIZ(intent);
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "4379474079149241261"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        }
        if (queryIntentActivities.size() > 0) {
            return intent;
        }
        return null;
    }
}
