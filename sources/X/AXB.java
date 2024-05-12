package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXB implements InterfaceC56322M8o {
    public final Fragment LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "home_page";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        if (this.LJLIL.isDetached() || !this.LJLIL.isAdded() || this.LJLIL.mo49getActivity() == null) {
            return null;
        }
        Context requireContext = this.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        return C54081LKj.LIZ(requireContext, requireActivity);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (!this.LJLIL.isDetached() && this.LJLIL.isAdded() && this.LJLIL.mo49getActivity() != null && this.LJLIL.requireActivity().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            String str = this.LJLILLLLZI;
            ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
            if (LKR.LIZIZ(requireActivity, str)) {
                return true;
            }
        }
        return false;
    }

    public AXB(Fragment fragment, String tag) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tag, "tag");
        this.LJLIL = fragment;
        this.LJLILLLLZI = tag;
    }
}
