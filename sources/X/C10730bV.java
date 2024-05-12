package X;

import android.content.Context;
import android.os.UserManager;

/* renamed from: X.0bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10730bV {
    public static boolean LIZ(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
