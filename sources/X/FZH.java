package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZH implements FZX {
    public final android.net.Uri LIZ = UriProtector.parse("content://com.android.badge/badge");

    @Override // X.FZX
    public final List<String> LIZ() {
        return Collections.singletonList("com.zui.launcher");
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
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(this.LIZ, "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
