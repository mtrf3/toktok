package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.FqN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40215FqN extends C40217FqP {
    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final boolean LIZ() {
        return this instanceof C40218FqQ;
    }

    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final Intent LIZIZ(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}
