package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import kotlin.jvm.internal.IDqS2S0301000_31;
import kotlin.jvm.internal.IDqS3S0201000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a3z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92019a3z {
    public static final void LIZIZ(C0MC c0mc, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-417208668);
        LJIL.LJJIIJ(564614654);
        ViewModelStoreOwner LIZ = C0XV.LIZ(LJIL);
        if (LIZ != null) {
            LJIL.LJJIIJ(564615719);
            ViewModel viewModel = new ViewModelProvider(LIZ).get(BackStackEntryIdViewModel.class);
            o.LJIIIIZZ(viewModel, "{\n        provider.get(javaClass)\n    }");
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
            backStackEntryIdViewModel.LJLILLLLZI = c0mc;
            c0mc.LIZIZ(backStackEntryIdViewModel.LJLIL, interfaceC88471Ynr, LJIL, (i & 112) | 520);
            C24610xt.LIZIZ(backStackEntryIdViewModel, new IDqS418S0100000_31(backStackEntryIdViewModel, 95), LJIL);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS3S0201000_31(c0mc, (C0MC) interfaceC88471Ynr, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 3);
            return;
        }
        "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public static final void LIZ(NavBackStackEntry navBackStackEntry, C0MC saveableStateHolder, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(navBackStackEntry, "<this>");
        o.LJIIIZ(saveableStateHolder, "saveableStateHolder");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1206422650);
        C24410xZ.LIZ(new C24620xu[]{C0XV.LIZ.LIZIZ(navBackStackEntry), C04Q.LJ.LIZIZ(navBackStackEntry), C04Q.LJFF.LIZIZ(navBackStackEntry)}, C1DJ.LJ(LJIL, -819892566, new IDqS3S0201000_31(saveableStateHolder, (C0MC) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 2)), LJIL, 56);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0301000_31(navBackStackEntry, (NavBackStackEntry) saveableStateHolder, (C0MC) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 1);
    }
}
