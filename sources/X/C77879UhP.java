package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.CalendarContract;
import android.text.TextUtils;

/* renamed from: X.UhP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77879UhP {
    public static boolean LIZ(C77880UhQ c77880UhQ, Activity activity, Integer num, String str) {
        String str2;
        PackageManager packageManager;
        if (!TextUtils.isEmpty(c77880UhQ.LJ) && c77880UhQ.LJFF > -1 && c77880UhQ.LJI > -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FREQ=");
            LIZ.append(c77880UhQ.LJ);
            LIZ.append(";INTERVAL=");
            LIZ.append(c77880UhQ.LJFF);
            LIZ.append(";COUNT=");
            LIZ.append(c77880UhQ.LJI);
            str2 = X1D.LIZIZ(LIZ);
        } else {
            str2 = "";
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", c77880UhQ.LIZ);
        intent.putExtra("description", c77880UhQ.LIZIZ);
        intent.putExtra("beginTime", c77880UhQ.LIZJ);
        intent.putExtra("endTime", c77880UhQ.LIZLLL);
        intent.putExtra("allDay", c77880UhQ.LJII);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("rrule", str2);
        }
        if (num != null) {
            intent.putExtra("pns.sandbox.dataflow_id", num.intValue());
        }
        if (str != null) {
            intent.putExtra("jsb_referer_url", str);
        }
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            C16880lQ.LIZIZ(activity, intent);
            return true;
        }
        return false;
    }
}
