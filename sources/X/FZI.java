package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZI implements FZX {
    public int LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;

    @Override // X.FZX
    public final List<String> LIZ() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        int i2;
        if (context == null || componentName == null || (i2 = this.LIZ) == i) {
            return;
        }
        if (i2 > 99 && i > 99) {
            return;
        }
        this.LIZ = i;
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("upgradeNumber", i);
        intent.putExtra("number", i);
        intent.putExtra("pakeageName", componentName.getPackageName());
        if (C77412UZs.LJFF(context, intent)) {
            try {
                context.sendBroadcast(intent);
                if (i <= 0 && Build.VERSION.SDK_INT < 23) {
                    Intent intent2 = (Intent) intent.clone();
                    intent2.putExtra("number", -1);
                    intent2.putExtra("upgradeNumber", -1);
                    context.sendBroadcast(intent2);
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new FXW(th.getMessage());
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(UriProtector.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        if (i <= 0 && Build.VERSION.SDK_INT < 23) {
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putInt("app_badge_count", -1);
            context.getContentResolver().call(UriProtector.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle2);
        }
    }
}
