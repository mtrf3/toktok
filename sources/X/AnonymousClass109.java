package X;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.109, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass109 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC36571c5 LIZ;
    public final AnonymousClass107 LIZIZ = new AnonymousClass107();
    public boolean LIZJ;

    public final void LIZ() {
        Lifecycle lifecycle = this.LIZ.getLifecycle();
        o.LJIIIIZZ(lifecycle, "owner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED) {
            lifecycle.addObserver(new Recreator(this.LIZ));
            final AnonymousClass107 anonymousClass107 = this.LIZIZ;
            anonymousClass107.getClass();
            if (!anonymousClass107.LIZIZ) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: X.1oF
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        AnonymousClass107 this$0 = AnonymousClass107.this;
                        o.LJIIIZ(this$0, "this$0");
                        o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_START) {
                            this$0.LJFF = true;
                        } else {
                            if (event != Lifecycle.Event.ON_STOP) {
                                return;
                            }
                            this$0.LJFF = false;
                        }
                    }
                });
                anonymousClass107.LIZIZ = true;
                this.LIZJ = true;
                return;
            }
            "SavedStateRegistry was already attached.".toString();
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        "Restarter must be created only during owner's initialization stage".toString();
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public AnonymousClass109(InterfaceC36571c5 interfaceC36571c5) {
        this.LIZ = interfaceC36571c5;
    }

    public final void LIZIZ(Bundle bundle) {
        Bundle bundle2;
        if (!this.LIZJ) {
            LIZ();
        }
        Lifecycle lifecycle = this.LIZ.getLifecycle();
        o.LJIIIIZZ(lifecycle, "owner.lifecycle");
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            AnonymousClass107 anonymousClass107 = this.LIZIZ;
            if (anonymousClass107.LIZIZ) {
                if (!anonymousClass107.LIZLLL) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    anonymousClass107.LIZJ = bundle2;
                    anonymousClass107.LIZLLL = true;
                    return;
                }
                "SavedStateRegistry was already restored.".toString();
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            "You must call performAttach() before calling performRestore(Bundle).".toString();
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("performRestore cannot be called when owner is ");
        LIZ.append(lifecycle.getCurrentState());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public final void LIZJ(Bundle outBundle) {
        o.LJIIIZ(outBundle, "outBundle");
        AnonymousClass107 anonymousClass107 = this.LIZIZ;
        anonymousClass107.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = anonymousClass107.LIZJ;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, AnonymousClass106>.d iteratorWithAdditions = anonymousClass107.LIZ.iteratorWithAdditions();
        o.LJIIIIZZ(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            bundle.putBundle((String) entry.getKey(), ((AnonymousClass106) entry.getValue()).saveState());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
