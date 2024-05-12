package X;

import Y.ARunnableS7S0201000_4;
import android.widget.PopupWindow;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.ARc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26228ARc {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(PopupWindow popupWindow) {
        String str;
        o.LJIIIZ(popupWindow, "popupWindow");
        int hashCode = popupWindow.hashCode();
        if (!AX9.LIZIZ()) {
            return;
        }
        Exception exc = new Exception();
        if (exc.getStackTrace().length >= 14) {
            str = Arrays.toString(Arrays.copyOfRange(exc.getStackTrace(), 6, 14));
            o.LJIIIIZZ(str, "toString(Arrays.copyOfRange(ex.stackTrace, 6, 14))");
        } else {
            str = "null";
        }
        C26240ARo c26240ARo = new C26240ARo(AX9.LIZ(), "PopupWindow", str);
        AX9.LIZJ(c26240ARo);
        C37179EiV.LIZ().post(new ARunnableS7S0201000_4(hashCode, popupWindow, c26240ARo, 1));
    }
}
