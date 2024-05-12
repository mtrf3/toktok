package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.73f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1796373f extends RecyclerView.ViewHolder implements LifecycleOwner {
    public final C62822Ol8 LJLIL;

    public final void L() {
        ((LifecycleRegistry) this.LJLIL.getValue()).setCurrentState(Lifecycle.State.STARTED);
    }

    public final void M() {
        ((LifecycleRegistry) this.LJLIL.getValue()).setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LJLIL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1796373f(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1690));
    }
}
