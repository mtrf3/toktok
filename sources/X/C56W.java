package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.56W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56W {
    public static final /* synthetic */ int LIZ = 0;

    public static int[] LIZ(int i, int i2, int i3, int i4, int i5) {
        int i6 = (int) (i * ((i4 * 1.0f) / i2));
        return new int[]{(i3 - i6) / 2, i5, i6, i4};
    }

    public static void LIZIZ(EditorProContext editorContext, int i, int i2, int i3, int i4, SurfaceView surfaceView, int i5) {
        int[] LIZ2;
        o.LJIIIZ(editorContext, "editorContext");
        if (surfaceView == null || surfaceView.getWidth() == 0 || surfaceView.getHeight() == 0) {
            return;
        }
        OSZ osz = new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (i4 / i3 > intValue2 / intValue) {
            LIZ2 = new int[]{0, AnonymousClass030.LIZJ(i4, intValue2, 2, i5), i3, intValue2};
        } else {
            LIZ2 = LIZ(intValue, intValue2, i3, i4, i5);
        }
        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CanvasViewExt setDisplayPos in editorPro ");
        String arrays = Arrays.toString(LIZ2);
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ3.append(arrays);
        LIZ3.append(" surface w: ");
        LIZ3.append(surfaceView.getWidth());
        LIZ3.append(" h: ");
        LIZ3.append(surfaceView.getHeight());
        LIZ3.append(" marginTop: ");
        LIZ3.append(marginLayoutParams.topMargin);
        LIZ3.append(" marginStart: ");
        LIZ3.append(marginLayoutParams.getMarginStart());
        H7B.LJ(X1D.LIZIZ(LIZ3));
        editorContext.getPlayer().LIZ(LIZ2[0], LIZ2[1], LIZ2[2], LIZ2[3]);
    }
}
