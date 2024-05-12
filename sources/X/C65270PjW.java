package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.PjW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65270PjW implements InterfaceC65285Pjl {
    public final SharedPreferences LIZ;

    public C65270PjW(Context context, String str) {
        if (context != null) {
            this.LIZ = F9J.LIZIZ(context, 0, str);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
