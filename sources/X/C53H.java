package X;

import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editorpro.EditorProScene$onResume$1;
import com.ss.ugc.android.editor.bottom.functionbar.HorizontalFuncBarFragment;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.53H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53H {
    public final ActivityC45651qj LIZ;
    public final C50Q LIZIZ;
    public final HorizontalFuncBarFragment LIZJ;
    public Integer LIZLLL;

    public final RecyclerView LIZIZ() {
        HorizontalFuncBarFragment horizontalFuncBarFragment = this.LIZJ;
        if (horizontalFuncBarFragment.LJLLILLLL && o.LJ(horizontalFuncBarFragment.LJLLJ.getValue(), Boolean.TRUE)) {
            return horizontalFuncBarFragment.LJLJI;
        }
        return horizontalFuncBarFragment.LJLILLLLZI;
    }

    public final void LIZJ() {
        View view = this.LIZJ.LJLJL;
        if (view != null) {
            view.performClick();
        }
    }

    public final void LIZ(EditorProScene$onResume$1 editorProScene$onResume$1) {
        this.LIZJ.getLifecycle().addObserver(editorProScene$onResume$1);
    }

    public final void LIZLLL(LifecycleObserver listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZJ.getLifecycle().removeObserver(listener);
    }

    public final void LJ(boolean z) {
        HorizontalFuncBarFragment horizontalFuncBarFragment = this.LIZJ;
        C1296757b c1296757b = horizontalFuncBarFragment.LJLJJI;
        if (c1296757b != null) {
            c1296757b.LJLILLLLZI = z;
        }
        C1296757b c1296757b2 = horizontalFuncBarFragment.LJLJJL;
        if (c1296757b2 == null) {
            return;
        }
        c1296757b2.LJLILLLLZI = z;
    }

    public final void LJFF(boolean z) {
        int i;
        Integer num = this.LIZLLL;
        if (num != null) {
            View findViewById = this.LIZ.findViewById(num.intValue());
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
    }

    public C53H(ActivityC45651qj activity, C50Q funcBarController) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(funcBarController, "funcBarController");
        this.LIZ = activity;
        this.LIZIZ = funcBarController;
        this.LIZJ = new HorizontalFuncBarFragment();
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 668));
        C221108m2.LIZIZ(AnonymousClass538.LJLIL);
    }
}
