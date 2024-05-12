package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZT implements FZX {
    public final android.net.Uri LIZ = UriProtector.parse("content://com.sonymobile.home.resourceprovider/badge");
    public FZU LIZIZ;

    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    public static void LIZJ(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        context.sendBroadcast(intent);
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
            if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                LIZLLL(context, componentName, i);
            } else {
                LIZJ(context, componentName, i);
            }
        } catch (Throwable th) {
            throw new FXW(th.getMessage());
        }
    }

    public final void LIZLLL(Context context, ComponentName componentName, int i) {
        if (i < 0) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new FZU(C16880lQ.LLLLL(context).getContentResolver());
        }
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        this.LIZIZ.startInsert(0, null, this.LIZ, contentValues);
    }
}
