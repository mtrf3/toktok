package X;

import X.C0I6;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.o;

/* renamed from: X.6bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC163776bl<T extends JediViewModel<? extends UiState> & LifecycleOwner & C0I6> extends AbstractC165596eh<T> {
    @Override // X.AbstractC165596eh
    public final boolean LJJLIIIIJ() {
        ComponentCallbacks2 requireActivity = LJJLI().requireActivity();
        o.LJIIIIZZ(requireActivity, "parentScene.requireActivity()");
        if ((requireActivity instanceof InterfaceC163766bk) && !((InterfaceC163766bk) requireActivity).LJL()) {
            return true;
        }
        return false;
    }
}
