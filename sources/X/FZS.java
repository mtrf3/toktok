package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZS implements FZX {
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
        Bundle LIZ = C141415gn.LIZ("app_badge_count", i);
        LIZ.putString("app_badge_component_name", componentName.flattenToString());
        try {
            context.getContentResolver().call(UriProtector.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, LIZ);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
