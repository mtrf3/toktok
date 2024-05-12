package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import android.view.View;

/* renamed from: X.U5p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractViewOnClickListenerC76629U5p implements View.OnClickListener {
    public static final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLIL;
    public final long LJLILLLLZI;
    public final ARunnableS49S0100000_13 LJLJI;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC76629U5p(long j) {
        this.LJLIL = true;
        this.LJLJI = new ARunnableS49S0100000_13(this, 148);
        this.LJLILLLLZI = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLIL) {
            this.LJLIL = false;
            LJLJJI.postDelayed(this.LJLJI, this.LJLILLLLZI);
            LIZ(view);
        }
    }

    public /* synthetic */ AbstractViewOnClickListenerC76629U5p(int i) {
        this(500L);
    }
}
