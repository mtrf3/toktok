package X;

import android.os.Bundle;
import defpackage.i0;

/* renamed from: X.043, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass043 {
    public static void LIZ(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
        } else {
            throw new IllegalArgumentException(i0.LJFF("Bundle must contain ", str));
        }
    }
}
