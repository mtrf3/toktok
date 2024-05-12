package X;

import Y.IDCListenerS118S0200000_42;
import Y.IDRunnableS92S0100000_42;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93729aVZ {
    public static final Rect LIZ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static final Rect LIZIZ(View getLocationOnScreenExt) {
        o.LJIIIZ(getLocationOnScreenExt, "$this$getLocationOnScreenExt");
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreenExt.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], getLocationOnScreenExt.getWidth() + i, iArr[1] + getLocationOnScreenExt.getHeight());
        return rect;
    }

    public static final void LIZJ(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final void LIZLLL(View view) {
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    public static final void LJFF(View view) {
        Object LIZ;
        try {
            LIZ = Boolean.valueOf(view.performHapticFeedback(0, 2));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        Boolean bool = Boolean.FALSE;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = bool;
        }
        ((Boolean) LIZ).booleanValue();
    }

    public static final void LJI(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public static void LJ(View postCompat, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(postCompat, "$this$postCompat");
        IDRunnableS92S0100000_42 iDRunnableS92S0100000_42 = new IDRunnableS92S0100000_42(interfaceC65784Pro, 1);
        postCompat.postDelayed(iDRunnableS92S0100000_42, 0L);
        postCompat.addOnAttachStateChangeListener(new IDCListenerS118S0200000_42(postCompat, iDRunnableS92S0100000_42, 1));
    }
}
