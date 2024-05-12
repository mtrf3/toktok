package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W4H implements W4L {
    @Override // X.W4L
    public final boolean LIZ(View surfaceView, View surfaceContainer, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(surfaceContainer, "surfaceContainer");
        UC0.LJJJLZIJ(surfaceContainer, 0.08f);
        ViewGroup.LayoutParams layoutParams = surfaceContainer.getLayoutParams();
        int LJ = C81184Vtc.LJ(surfaceContainer.getContext());
        layoutParams.width = LJ;
        layoutParams.height = (int) (LJ / 0.75f);
        surfaceContainer.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = surfaceView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            Context context = surfaceView.getContext();
            o.LJIIIIZZ(context, "surfaceView.context");
            C26338AVi.LJII(marginLayoutParams, context, 0, 0, 0, 0, 32);
        }
        surfaceView.setLayoutParams(layoutParams2);
        Context context2 = surfaceContainer.getContext();
        o.LJIIIIZZ(context2, "surfaceContainer.context");
        C6IA.LJII(context2, surfaceContainer);
        return true;
    }
}
