package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.FqP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40217FqP implements InterfaceC40219FqR {
    @Override // X.InterfaceC40219FqR
    public boolean LIZ() {
        return this instanceof C40218FqQ;
    }

    @Override // X.InterfaceC40219FqR
    public Intent LIZIZ(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("package:");
        LIZ.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
    }
}
