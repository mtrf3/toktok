package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FXP implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        try {
            context.getContentResolver().insert(UriProtector.parse("content://me.everything.badger/apps"), contentValues);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
