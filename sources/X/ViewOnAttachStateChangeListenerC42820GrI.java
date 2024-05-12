package X;

import Y.IDrS46S0100000_7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.GrI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnAttachStateChangeListenerC42820GrI implements View.OnAttachStateChangeListener {
    public final /* synthetic */ IDrS46S0100000_7 LJLIL;
    public final /* synthetic */ RecyclerView LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        if (!(v instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) v).LJJLL(this.LJLIL);
        this.LJLILLLLZI.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC42820GrI(IDrS46S0100000_7 iDrS46S0100000_7, RecyclerView recyclerView) {
        this.LJLIL = iDrS46S0100000_7;
        this.LJLILLLLZI = recyclerView;
    }
}
