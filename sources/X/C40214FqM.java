package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: X.FqM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40214FqM extends C40217FqP {
    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final boolean LIZ() {
        if (Build.VERSION.SDK_INT == 23) {
            return true;
        }
        return this instanceof C40218FqQ;
    }

    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final Intent LIZIZ(Context context) {
        String string;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
        }
        intent.putExtra("app_name", string);
        intent.putExtra("class_name", C16880lQ.LJLLJ(C40214FqM.class));
        return intent;
    }
}
