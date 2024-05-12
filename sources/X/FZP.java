package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZP implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.smartisanos.launcher", "com.smartisanos.home");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Intent intent = new Intent("com.smartisanos.launcher.new_message");
        intent.putExtra("extra_packagename", componentName.getPackageName());
        intent.putExtra("extra_componentname", componentName.getClassName());
        intent.putExtra("extra_message_count", i);
        if (C77412UZs.LJFF(context, intent)) {
            try {
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new FXW(th.getMessage());
            }
        } else {
            context.getContentResolver().call(UriProtector.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", (String) null, C141415gn.LIZ("badge_num", i));
        }
    }
}
