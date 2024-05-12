package X;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: X.06o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021406o {
    public static IBinder LIZ(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void LIZIZ(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
