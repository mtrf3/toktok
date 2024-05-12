package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;

/* renamed from: X.JZs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class ViewOnAttachStateChangeListenerC49384JZs implements View.OnAttachStateChangeListener, Runnable {
    public final View LJLIL;
    public SearchChallengeAdData LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJI) {
                if (this.LJLILLLLZI != null) {
                    if (C27740Aue.LJI(this.LJLIL)) {
                        if (!this.LJLJJI) {
                            this.LJLJJI = true;
                        }
                    } else {
                        this.LJLJJI = false;
                    }
                }
                this.LJLIL.postDelayed(this, 500L);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ViewOnAttachStateChangeListenerC49384JZs(View view) {
        this.LJLIL = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LJLJI = true;
        this.LJLJJI = false;
        run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLIL.removeCallbacks(this);
    }
}
