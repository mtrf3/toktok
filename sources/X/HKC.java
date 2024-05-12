package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKC {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HKD.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static PendingIntent LIZIZ(String str, String str2, String str3, String str4, Context context) {
        int i;
        Intent intent = new Intent(context, (Class<?>) CameraWidgetProvider.class);
        intent.setAction("");
        intent.putExtra("shoot_way", str);
        intent.putExtra("enter_from", str2);
        intent.putExtra("creation_id", str3);
        intent.putExtra(WM7.SCENE_SERVICE, str4);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i);
        o.LJIIIIZZ(broadcast, "getBroadcast(\n          …PDATE_CURRENT),\n        )");
        return broadcast;
    }
}
