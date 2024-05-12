package X;

import Y.IDCListenerS113S0200000;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.19k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283619k implements C04W {
    public static final C283619k LIZIZ = new C283619k();

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.IDqS176S0200000, T] */
    @Override // X.C04W
    public final InterfaceC65784Pro<C76800UCe> LIZ(C04D view) {
        o.LJIIIZ(view, "view");
        if (view.isAttachedToWindow()) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                o.LJIIIIZZ(lifecycle, "lco.lifecycle");
                return C78996UzQ.LIZJ(view, lifecycle);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("View tree for ");
            LIZ.append(view);
            LIZ.append(" has no ViewTreeLifecycleOwner");
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            LIZIZ2.toString();
            throw new IllegalStateException(LIZIZ2);
        }
        C68322mC c68322mC = new C68322mC();
        IDCListenerS113S0200000 iDCListenerS113S0200000 = new IDCListenerS113S0200000(view, c68322mC, 0);
        view.addOnAttachStateChangeListener(iDCListenerS113S0200000);
        c68322mC.element = new IDqS176S0200000(view, iDCListenerS113S0200000, 0);
        return new IDqS420S0100000(c68322mC, (C68322mC<InterfaceC65784Pro<C76800UCe>>) 3);
    }
}
