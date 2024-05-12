package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: X.LAh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53819LAh {
    public static final /* synthetic */ int LIZ = 0;

    public static Activity LIZ(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
