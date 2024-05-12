package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8VC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VC {
    public static C8VB LIZJ(Fragment fragment, C65776Prg c65776Prg) {
        C8VB LIZIZ;
        o.LJIIIZ(fragment, "<this>");
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C8VA kv0 = C7EG.LIZ(requireActivity).kv0(fragment);
        if (kv0 != null && (LIZIZ = kv0.LIZIZ(C39557Ffl.LIZ(c65776Prg), null)) != null) {
            return LIZIZ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static C8V9 LIZLLL(Fragment fragment, C65776Prg c65776Prg) {
        C8V9 LIZJ;
        o.LJIIIZ(fragment, "<this>");
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C8VA kv0 = C7EG.LIZ(requireActivity).kv0(fragment);
        if (kv0 != null && (LIZJ = kv0.LIZJ(C39557Ffl.LIZ(c65776Prg), null)) != null) {
            return LIZJ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static C8V9 LJI(Fragment fragment, C65776Prg c65776Prg) {
        ActivityC45651qj mo49getActivity;
        C8VA kv0;
        o.LJIIIZ(fragment, "<this>");
        if (!fragment.isAdded() || (mo49getActivity = fragment.mo49getActivity()) == null || mo49getActivity.isFinishing() || (kv0 = C7EG.LIZ(mo49getActivity).kv0(fragment)) == null) {
            return null;
        }
        return kv0.LIZJ(C39557Ffl.LIZ(c65776Prg), null);
    }

    public static C8V9 LJII(C8W0 c8w0, C65776Prg c65776Prg) {
        o.LJIIIZ(c8w0, "<this>");
        return c8w0.getSupervisor().LIZLLL().LIZJ(C39557Ffl.LIZ(c65776Prg), null);
    }

    public static InterfaceC198557ql LJIIIIZZ(C8W0 c8w0, C65776Prg c65776Prg) {
        o.LJIIIZ(c8w0, "<this>");
        if (LJFF(c8w0, c65776Prg, null) == null) {
            return null;
        }
        return c8w0.getSupervisor().LIZLLL().LIZ(C39557Ffl.LIZ(c65776Prg), null);
    }

    public static InterfaceC198557ql LJIIIZ(AssemViewModel assemViewModel, C65776Prg c65776Prg) {
        C8VA c8va;
        o.LJIIIZ(assemViewModel, "<this>");
        C8VA c8va2 = assemViewModel.hierarchyServiceStore;
        if (c8va2 == null || c8va2.LIZIZ(C39557Ffl.LIZ(c65776Prg), null) == null || (c8va = assemViewModel.hierarchyServiceStore) == null) {
            return null;
        }
        return c8va.LIZ(C39557Ffl.LIZ(c65776Prg), null);
    }

    public static final C8VB LIZ(C8W0 c8w0, C65776Prg c65776Prg, String str) {
        o.LJIIIZ(c8w0, "<this>");
        C8VB LIZIZ = c8w0.getSupervisor().LIZLLL().LIZIZ(C39557Ffl.LIZ(c65776Prg), str);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static final C8V9 LIZIZ(C8W0 c8w0, C65776Prg c65776Prg, String str) {
        o.LJIIIZ(c8w0, "<this>");
        C8V9 LIZJ = c8w0.getSupervisor().LIZLLL().LIZJ(C39557Ffl.LIZ(c65776Prg), str);
        if (LIZJ != null) {
            return LIZJ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static final C8VB LJ(Fragment fragment, C65776Prg c65776Prg, String str) {
        ActivityC45651qj mo49getActivity;
        C8VA kv0;
        o.LJIIIZ(fragment, "<this>");
        if (!fragment.isAdded() || (mo49getActivity = fragment.mo49getActivity()) == null || mo49getActivity.isFinishing() || (kv0 = C7EG.LIZ(mo49getActivity).kv0(fragment)) == null) {
            return null;
        }
        return kv0.LIZIZ(C39557Ffl.LIZ(c65776Prg), str);
    }

    public static final C8VB LJFF(C8W0 c8w0, C65776Prg c65776Prg, String str) {
        o.LJIIIZ(c8w0, "<this>");
        return c8w0.getSupervisor().LIZLLL().LIZIZ(C39557Ffl.LIZ(c65776Prg), str);
    }

    public static final void LJIIJJI(C8W0 c8w0, C65776Prg c65776Prg, TBT prop1, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(prop1, "prop1");
        c8w0.getSupervisor().LIZLLL().LJFF(c8w0, C39557Ffl.LIZ(c65776Prg), new AqS169S0100000_3(prop1, 759), new AqS134S0200000_3(interfaceC88472Yns, new C68322mC(), 215));
    }

    public static final void LJIIL(AssemViewModel assemViewModel, C65776Prg c65776Prg, TBT prop1, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        C68322mC c68322mC = new C68322mC();
        C8VA c8va = assemViewModel.hierarchyServiceStore;
        if (c8va != null) {
            c8va.LJFF(assemViewModel, C39557Ffl.LIZ(c65776Prg), new AqS169S0100000_3(prop1, 758), new AqS134S0200000_3(interfaceC88472Yns, c68322mC, 214));
        }
    }

    public static final void LJIIJ(C8W0 c8w0, C65776Prg c65776Prg, TBT prop1, TBT prop2, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        c8w0.getSupervisor().LIZLLL().LJFF(c8w0, C39557Ffl.LIZ(c65776Prg), new AqS134S0200000_3(prop1, prop2, 216), new AqS134S0200000_3(interfaceC88471Ynr, new C68322mC(), 217));
    }
}
