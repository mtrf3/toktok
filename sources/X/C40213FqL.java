package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.FqL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40213FqL extends C40217FqP {
    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final boolean LIZ() {
        return this instanceof C40218FqQ;
    }

    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final Intent LIZIZ(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}
