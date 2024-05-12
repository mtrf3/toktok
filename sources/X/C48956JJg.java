package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JJg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48956JJg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, float f) {
        o.LJIIIZ(view, "view");
        if (view.getContext() == null) {
            return;
        }
        view.setOutlineProvider(new C73104Sma(f));
        view.setClipToOutline(true);
    }
}
