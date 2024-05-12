package X;

import android.os.Trace;
import androidx.compose.ui.platform.g1;
import com.google.gson.internal.b;
import kotlin.jvm.internal.IDqS180S0200000;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07720Sa {
    public static InterfaceC07790Sh LIZLLL(InterfaceC07790Sh clickable, InterfaceC65784Pro onClick) {
        o.LJIIIZ(clickable, "$this$clickable");
        o.LJIIIZ(onClick, "onClick");
        return C07770Sf.LIZ(clickable, g1.LIZ, new C49331wf(true, null, null, onClick));
    }

    public static final void LIZ(C1OH interactionSource, InterfaceC35811ar<C1OJ> pressedInteraction, java.util.Map<C24860yI, C1OJ> currentKeyPressInteractions, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(pressedInteraction, "pressedInteraction");
        o.LJIIIZ(currentKeyPressInteractions, "currentKeyPressInteractions");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1297229208);
        Trace.beginSection("clickable:DisposableEffect");
        try {
            C24610xt.LIZIZ(interactionSource, new IDqS28S0300000((InterfaceC35811ar) pressedInteraction, (InterfaceC35811ar<C1OJ>) currentKeyPressInteractions, (java.util.Map<C24860yI, C1OJ>) interactionSource, (C1OH) 13), LJIL);
            Trace.endSection();
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS1S0301000(interactionSource, (C1OH) pressedInteraction, (InterfaceC35811ar<C1OJ>) currentKeyPressInteractions, (java.util.Map<C24860yI, C1OJ>) i, 4);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final InterfaceC07790Sh LIZIZ(InterfaceC07790Sh clickable, C1OH interactionSource, C0SU c0su, boolean z, String str, C0QW c0qw, InterfaceC65784Pro<C76800UCe> onClick) {
        o.LJIIIZ(clickable, "$this$clickable");
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(onClick, "onClick");
        return C07770Sf.LIZ(clickable, g1.LIZ, new C49291wb(z, str, c0qw, onClick, c0su, interactionSource));
    }

    public static /* synthetic */ InterfaceC07790Sh LIZJ(InterfaceC07790Sh interfaceC07790Sh, C1OH c1oh, C0SU c0su, boolean z, String str, C0QW c0qw, InterfaceC65784Pro interfaceC65784Pro, int i) {
        boolean z2 = z;
        String str2 = str;
        if ((i & 4) != 0) {
            z2 = true;
        }
        C0QW c0qw2 = null;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) == 0) {
            c0qw2 = c0qw;
        }
        return LIZIZ(interfaceC07790Sh, c1oh, c0su, z2, str2, c0qw2, interfaceC65784Pro);
    }

    public static final InterfaceC07790Sh LJ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC07790Sh gestureModifiers, C1OH interactionSource, C0SU c0su, InterfaceC70422pa indicationScope, java.util.Map currentKeyPressInteractions, InterfaceC35811ar keyClickOffset, boolean z, String str, C0QW c0qw, InterfaceC65784Pro onClick) {
        o.LJIIIZ(gestureModifiers, "gestureModifiers");
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(indicationScope, "indicationScope");
        o.LJIIIZ(currentKeyPressInteractions, "currentKeyPressInteractions");
        o.LJIIIZ(keyClickOffset, "keyClickOffset");
        o.LJIIIZ(onClick, "onClick");
        InterfaceC07790Sh LJJII = b.LJJII(interfaceC07790Sh, true, new C48981w6(c0qw, str, z, onClick));
        C49071wF c49071wF = new C49071wF(z, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource);
        o.LJIIIZ(LJJII, "<this>");
        InterfaceC07790Sh LIZ = g1.LIZ(LJJII, new C531626u(c49071wF, null));
        o.LJIIIZ(LIZ, "<this>");
        C45301qA c45301qA = g1.LIZ;
        InterfaceC07790Sh LIZ2 = C07770Sf.LIZ(LIZ, c45301qA, new IDqS180S0200000(c0su, interactionSource, 3));
        o.LJIIIZ(LIZ2, "<this>");
        InterfaceC07790Sh LIZ3 = C07770Sf.LIZ(LIZ2, c45301qA, new C49211wT(interactionSource, z));
        o.LJIIIZ(LIZ3, "<this>");
        return C07770Sf.LIZ(LIZ3, c45301qA, new C48991w7(z, interactionSource)).LLLIIIL(gestureModifiers);
    }
}
