package X;

import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.Gm7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42499Gm7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View page, float f) {
        o.LJIIIZ(page, "page");
        ViewOutlineProvider outlineProvider = page.getOutlineProvider();
        if (!(outlineProvider instanceof C42500Gm8) || outlineProvider == null) {
            C42500Gm8 c42500Gm8 = new C42500Gm8();
            c42500Gm8.LIZ = f;
            page.setOutlineProvider(c42500Gm8);
            page.setClipToOutline(true);
            return;
        }
        page.invalidateOutline();
    }
}
