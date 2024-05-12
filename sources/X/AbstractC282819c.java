package X;

import X.AbstractC282819c;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.19c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC282819c extends C04D {
    public final C1A3 LJLJLJ;
    public final C40031hf LJLJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLL;

    @Override // X.C04D, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this, null);
        C10A.LIZIZ(this, null);
        InterfaceC24790yB composition = getComposition();
        if (composition != null) {
            composition.LJIIL(false);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        InterfaceC36571c5 LIZ = C10A.LIZ(this);
        if (lifecycleOwner != null) {
            if (LIZ != null) {
                final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                if (lifecycle != null) {
                    this.LJLJLLL.LJLIL = LIZ;
                    ViewTreeLifecycleOwner.set(this, this.LJLJLJ);
                    C10A.LIZIZ(this, this.LJLJLLL);
                    lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.AbstractPreComposeView$onAttachedToWindow$1
                        public final AbstractPreComposeView$onAttachedToWindow$1 LJLIL = this;

                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            AbstractC282819c.this.LJLJLJ.LJLIL.handleLifecycleEvent(event);
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                lifecycle.removeObserver(this.LJLIL);
                            }
                        }
                    });
                    super.onAttachedToWindow();
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ViewTreeLifecycleOwner not found from ");
                LIZ2.append(this);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
            throw new IllegalStateException("Composed into the View which doesn't propagaterealSavedStateRegistryOwner!");
        }
        throw new IllegalStateException("Composed into the View which doesn't propagate realSavedStateRegistryOwner!");
    }

    @Override // android.view.View
    public Handler getHandler() {
        return new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.C04D
    public final void LJ() {
        if (getComposition() == null) {
            try {
                setCreatingComposition(true);
                C36001bA LIZ = AnonymousClass059.LIZ(this);
                o.LJI(LIZ);
                setComposition(C04S.LIZ(this, LIZ, C1DJ.LJFF(new IDqS443S0100000(this, 0), 2107267151, true)));
            } finally {
                setCreatingComposition(false);
            }
        }
    }

    public final InterfaceC65784Pro<C76800UCe> getBlock() {
        return this.LJLL;
    }

    public final void setBlock(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLL = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC282819c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLJLJ = new C1A3();
        this.LJLJLLL = new C40031hf();
    }
}
