package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FXQ implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.vivo.launcher", "com.bbk.launcher2");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        try {
            Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("className", componentName.getClassName());
            intent.putExtra("notificationNum", i);
            if (Build.VERSION.SDK_INT >= 26) {
                intent.addFlags(16777216);
            }
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
