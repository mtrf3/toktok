package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZJ implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("badgecount", i);
        intent.putExtra("class", componentName.getClassName());
        context.sendBroadcast(intent);
        if (C77412UZs.LJFF(context, intent)) {
            try {
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new FXW(th.getMessage());
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unable to resolve intent: ");
            LIZ.append(intent.toString());
            throw new FXW(X1D.LIZIZ(LIZ));
        }
    }
}
