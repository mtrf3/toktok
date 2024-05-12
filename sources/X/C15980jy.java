package X;

import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.0jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15980jy {
    public static final void LIZ(final boolean z, InterfaceC65784Pro<C76800UCe> onBack, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(onBack, "onBack");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-971160336);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(onBack)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if (((i3 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            if (i6 != 0) {
                z = true;
            }
            final InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(onBack, LJIL);
            LJIL.LJJIIJ(-3687241);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = new AbstractC008101l(z) { // from class: X.1Uj
                    @Override // X.AbstractC008101l
                    public final void LIZ() {
                        LJJJJIZL.getValue().invoke();
                    }
                };
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            C33811Uj c33811Uj = (C33811Uj) LJJJZ;
            Boolean valueOf = Boolean.valueOf(z);
            LJIL.LJJIIJ(-3686552);
            boolean LJIJJ = LJIL.LJIJJ(valueOf) | LJIL.LJIJJ(c33811Uj);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                LJJJZ2 = new AnonymousClass220(c33811Uj, z);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LJI((InterfaceC65784Pro) LJJJZ2, LJIL);
            C18I LIZ = C16000k0.LIZ(LJIL);
            if (LIZ != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = LIZ.getOnBackPressedDispatcher();
                o.LJIIIIZZ(onBackPressedDispatcher, "checkNotNull(LocalOnBackPressedDispatcherOwner.current) {\n        \"No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner\"\n    }.onBackPressedDispatcher");
                LifecycleOwner lifecycleOwner = (LifecycleOwner) LJIL.LJIILLIIL(C04Q.LJ);
                C24610xt.LIZ(lifecycleOwner, onBackPressedDispatcher, new IDqS28S0300000(onBackPressedDispatcher, lifecycleOwner, c33811Uj, 20), LJIL);
            } else {
                "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString();
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AnonymousClass221(i, i2, onBack, z);
    }
}
