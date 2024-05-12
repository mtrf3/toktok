package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.6bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163796bn {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle LIZ(WM7 wm7) {
        Activity activity;
        if (wm7 != null && (activity = wm7.mActivity) != 0) {
            if (activity instanceof InterfaceC163766bk) {
                ((InterfaceC163766bk) activity).LJIJI();
                WM7 LJIIL = C1XY.LJIIL(wm7);
                if (LJIIL != null) {
                    return LJIIL.mArguments;
                }
            }
            Intent intent = activity.getIntent();
            o.LJIIIIZZ(intent, "activity.intent");
            return C16880lQ.LLJJIJI(intent);
        }
        return null;
    }

    public static final Bundle LIZIZ(WMH wmh) {
        Bundle LIZ2 = LIZ(wmh);
        if (LIZ2 != null) {
            return LIZ2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
