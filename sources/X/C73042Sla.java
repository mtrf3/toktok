package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Sla, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73042Sla {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C73043Slb videoSize, C73043Slb screenSize) {
        o.LJIIIZ(videoSize, "videoSize");
        o.LJIIIZ(screenSize, "screenSize");
        if (view != null) {
            int i = videoSize.LIZ;
            int i2 = videoSize.LIZIZ;
            int i3 = screenSize.LIZ;
            int i4 = screenSize.LIZIZ;
            double d = i;
            double d2 = i2;
            double d3 = i3;
            double d4 = i4;
            if (d / d2 > d3 / d4) {
                i4 = (int) ((d3 * d2) / d);
            } else {
                i3 = (int) ((d4 * d) / d2);
            }
            C73043Slb c73043Slb = new C73043Slb(i3, i4);
            int i5 = c73043Slb.LIZ;
            int i6 = c73043Slb.LIZIZ;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.width == i5 && marginLayoutParams.height == i6) {
                return;
            }
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i6;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
