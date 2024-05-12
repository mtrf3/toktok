package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.4Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105574Cj {
    public static Activity LIZ(Context context) {
        if (context == null || (context instanceof Application)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }
}
