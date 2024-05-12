package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FXS implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.hihonor.android.launcher");
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
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(UriProtector.parse("content://com.hihonor.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
