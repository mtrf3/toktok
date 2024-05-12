package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.9AE, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9AE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C9AC type, float f) {
        o.LJIIIZ(type, "type");
        int i = C9AD.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || view == null) {
                        return;
                    }
                    view.setOnTouchListener(new ViewOnTouchListenerC76562zU(0.99f, null));
                    return;
                }
                if (view == null) {
                    return;
                }
                C78897Uxp.LJJJJL(view, f);
                return;
            }
            if (view == null) {
                return;
            }
            C78897Uxp.LJJJJJL(view, f);
            return;
        }
        if (view == null) {
            return;
        }
        C78897Uxp.LJJJJLI(view, null);
    }
}
