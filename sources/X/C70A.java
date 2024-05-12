package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.70A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C70A {
    public static AnonymousClass707 LIZ(View view) {
        InterfaceC55235Lm3 LJ;
        InterfaceC55251LmJ LIZLLL;
        AnonymousClass709 anonymousClass709;
        if (view == null) {
            return null;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if ((LJIIIZ != null && LJIIIZ.getContext() == null) || (LJ = C55230Lly.LJ(view)) == null || (LIZLLL = C55247LmF.LIZLLL(LJ, AnonymousClass709.class, "source_default_key")) == null || (anonymousClass709 = (AnonymousClass709) LIZLLL.getSource()) == null) {
            return null;
        }
        return anonymousClass709.getFragmentData();
    }
}
