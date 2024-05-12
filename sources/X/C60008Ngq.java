package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ngq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60008Ngq {
    public static void LIZ(InterfaceC36488ETs interfaceC36488ETs, InterfaceC37146Ehy interfaceC37146Ehy) {
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        Activity activity = (Activity) ORY.LJJJLZIJ(activities);
        if (((activity instanceof CrossPlatformActivity) || (activity instanceof SparkActivity) || (activity instanceof AbstractActivityC60177NjZ)) && activity != null) {
            activity.finish();
            JSONObject jSONObject = new JSONObject();
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.onSuccess(jSONObject);
            }
            if (interfaceC37146Ehy != null) {
                interfaceC37146Ehy.onSuccess(jSONObject);
                return;
            }
            return;
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZ(-1, "Top activity is not web container");
        }
        if (interfaceC37146Ehy == null) {
            return;
        }
        interfaceC37146Ehy.LIZ(-1, "Top activity is not web container");
    }
}
