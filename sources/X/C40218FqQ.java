package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.FqQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40218FqQ extends C40217FqP {
    @Override // X.C40217FqP, X.InterfaceC40219FqR
    public final Intent LIZIZ(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}
