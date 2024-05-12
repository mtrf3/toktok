package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZR implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (!C77412UZs.LJFF(context, intent) && !C77412UZs.LJFF(context, intent2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unable to resolve intent: ");
            LIZ.append(intent2.toString());
            throw new FXW(X1D.LIZIZ(LIZ));
        }
        try {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
