package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NUK {
    public static final boolean LIZ(Context context, Intent intent) {
        PackageManager packageManager;
        ActivityInfo resolveActivityInfo;
        if (context == null || intent == null) {
            return false;
        }
        Activity LIZ = C27740Aue.LIZ(context);
        String str = null;
        if (LIZ == null || (packageManager = LIZ.getPackageManager()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getPackageName();
        }
        if (o.LJ(packageName, str) || (resolveActivityInfo = intent.resolveActivityInfo(packageManager, 65536)) == null || !resolveActivityInfo.exported) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.intent.action.CHOOSER");
        hashSet.add("android.intent.action.SEND");
        hashSet.add("android.intent.action.SEND_MULTIPLE");
        hashSet.add("android.media.action.IMAGE_CAPTURE");
        hashSet.add("android.media.action.IMAGE_CAPTURE_SECURE");
        hashSet.add("android.media.action.VIDEO_CAPTURE");
        if (ORZ.LJLJJI(intent.getAction(), hashSet)) {
            return false;
        }
        intent.putExtra("pns.sandbox.dataflow_id", 1207964161);
        C16880lQ.LIZJ(context, intent);
        return true;
    }
}
