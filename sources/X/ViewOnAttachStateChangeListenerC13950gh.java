package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC13950gh implements View.OnAttachStateChangeListener {
    public static final C1TO LJLIL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1TO] */
    static {
        final int i = 0;
        LJLIL = new C0A6(i) { // from class: X.1TO
            @Override // X.C0A6
            public final void LJIILJJIL(int i2, RecyclerView recyclerView) {
                if (i2 == 0) {
                    C13930gf.LIZIZ();
                }
            }
        };
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).LJIIJJI(LJLIL);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).LJJLL(LJLIL);
        }
    }
}
