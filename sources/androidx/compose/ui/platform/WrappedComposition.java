package androidx.compose.ui.platform;

import X.AnonymousClass053;
import X.C1DJ;
import X.C43991o3;
import X.C45211q1;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC24790yB;
import X.InterfaceC88471Ynr;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class WrappedComposition implements InterfaceC24790yB, LifecycleEventObserver {
    public final C45211q1 LJLIL;
    public final InterfaceC24790yB LJLILLLLZI;
    public boolean LJLJI;
    public Lifecycle LJLJJI;
    public InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> LJLJJL = AnonymousClass053.LIZ;

    @Override // X.InterfaceC24790yB
    public final boolean LIZIZ() {
        return this.LJLILLLLZI.LIZIZ();
    }

    @Override // X.InterfaceC24790yB
    public final void LIZJ() {
        this.LJLILLLLZI.LIZJ();
    }

    @Override // X.InterfaceC24790yB
    public final boolean LJIJ() {
        return this.LJLILLLLZI.LJIJ();
    }

    @Override // X.InterfaceC24790yB
    public final void dispose() {
        if (!this.LJLJI) {
            this.LJLJI = true;
            C45211q1 c45211q1 = this.LJLIL;
            c45211q1.getView();
            c45211q1.setTag(R.id.njz, null);
            Lifecycle lifecycle = this.LJLJJI;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC24790yB
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC24790yB
    public final void LJIIL(boolean z) {
        this.LJLILLLLZI.LJIIL(z);
    }

    @Override // X.InterfaceC24790yB
    public final void LJIILJJIL(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content) {
        o.LJIIIZ(content, "content");
        this.LJLIL.setOnViewTreeOwnersAvailable(new IDqS28S0300000(this, (WrappedComposition) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) this, (WrappedComposition) 0));
    }

    public WrappedComposition(C45211q1 c45211q1, C43991o3 c43991o3) {
        this.LJLIL = c45211q1;
        this.LJLILLLLZI = c43991o3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
            return;
        }
        if (event != Lifecycle.Event.ON_CREATE || this.LJLJI) {
            return;
        }
        if (!LIZIZ()) {
            LJIILJJIL(this.LJLJJL);
        } else {
            this.LJLILLLLZI.LJIILJJIL(C1DJ.LJFF(new IDqS189S0200000(this, (WrappedComposition) this.LJLJJL, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) 1), 622464890, true));
        }
    }
}
