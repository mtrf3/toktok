package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FXO implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.teslacoilsw.launcher");
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(componentName.getPackageName());
        LIZ.append("/");
        LIZ.append(componentName.getClassName());
        contentValues.put("tag", X1D.LIZIZ(LIZ));
        contentValues.put("count", Integer.valueOf(i));
        try {
            context.getContentResolver().insert(UriProtector.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }
}
