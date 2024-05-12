package X;

import android.os.Build;
import defpackage.i0;

/* renamed from: X.IRh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46617IRh {
    public static void LIZ(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            String LJFF = i0.LJFF("TRuntime.", str);
            if (LJFF.length() > 23) {
                LJFF.substring(0, 23);
                return;
            }
            return;
        }
        C1JX.LJIIIIZZ("TRuntime.", str);
    }
}
