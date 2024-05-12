package X;

import android.view.KeyEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* renamed from: X.0ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16400ke {
    public static CharSequence LIZIZ(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean LIZJ(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean LIZLLL(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void LIZ(View view, final InterfaceC16450kj interfaceC16450kj) {
        C0MA c0ma = (C0MA) view.getTag(R.id.l0k);
        if (c0ma == null) {
            c0ma = new C0MA();
            view.setTag(R.id.l0k, c0ma);
        }
        Objects.requireNonNull(interfaceC16450kj);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: X.0km
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                boolean LIZ;
                LIZ = InterfaceC16450kj.this.LIZ();
                return LIZ;
            }
        };
        c0ma.put(interfaceC16450kj, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static void LJFF(View view, InterfaceC16450kj interfaceC16450kj) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0MA c0ma = (C0MA) view.getTag(R.id.l0k);
        if (c0ma != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0ma.getOrDefault(interfaceC16450kj, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T LJI(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void LJII(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void LJIIIIZZ(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void LJIIIZ(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
