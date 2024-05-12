package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZQ implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return new ArrayList(0);
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
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
