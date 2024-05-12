package X;

import Y.ARunnableS39S0100000_3;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemContainerBridge;
import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.jvm.internal.o;

/* renamed from: X.8Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212428Vi {
    public static final ActivityC45651qj LIZ(LifecycleOwner current) {
        o.LJIIIZ(current, "current");
        if (current instanceof Fragment) {
            return ((Fragment) current).mo49getActivity();
        }
        if (current instanceof C8VZ) {
            return ((C8VZ) current).getActivity();
        }
        if (current instanceof ActivityC45651qj) {
            return (ActivityC45651qj) current;
        }
        if (current instanceof C8W0) {
            return LIZ(((C8W0) current).getParent());
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final AssemSupervisor LIZIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return C7EG.LIZ(requireActivity).lv0(fragment);
    }

    public static final AssemSupervisor LIZJ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        ActivityC45651qj LIZ = LIZ(c8w0);
        if (LIZ == null) {
            return null;
        }
        return C7EG.LIZ(LIZ).lv0(c8w0);
    }

    public static final Fragment LIZLLL(LifecycleOwner current) {
        o.LJIIIZ(current, "current");
        if (current instanceof Fragment) {
            return (Fragment) current;
        }
        if (current instanceof ActivityC45651qj) {
            return null;
        }
        if (current instanceof C8W0) {
            return LIZLLL(((C8W0) current).getParent());
        }
        if (current instanceof C8VZ) {
            LifecycleOwner GW = ((C8VZ) current).GW();
            if (GW != null) {
                return LIZLLL(GW);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            C8VV.LIZ.post(new ARunnableS39S0100000_3((InterfaceC65784Pro) interfaceC65784Pro, 143));
        }
    }

    public static final void LJFF(C8W0 c8w0, LifecycleOwner lifecycleOwner, Intent intent, int i, Bundle bundle, InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> interfaceC88473Ynt) {
        AssemContainerBridge assemContainerBridge;
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(intent, "intent");
        ActivityC45651qj LIZ = LIZ(c8w0);
        if (LIZ == null) {
            return;
        }
        Fragment LJJJIL = LIZ.getSupportFragmentManager().LJJJIL("AssemContainerBridge");
        if (!(LJJJIL instanceof AssemContainerBridge) || (assemContainerBridge = (AssemContainerBridge) LJJJIL) == null) {
            assemContainerBridge = new AssemContainerBridge();
            FragmentManager supportFragmentManager = LIZ.getSupportFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ2.LJIIIIZZ(0, 1, assemContainerBridge, "AssemContainerBridge");
            LIZ2.LJI();
        }
        if (assemContainerBridge.isAdded()) {
            assemContainerBridge.vl(lifecycleOwner, intent, i, bundle, interfaceC88473Ynt);
        } else {
            assemContainerBridge.LJLJI.add(new C212438Vj(LIZ, lifecycleOwner, assemContainerBridge, intent, i, bundle, interfaceC88473Ynt));
        }
    }
}
