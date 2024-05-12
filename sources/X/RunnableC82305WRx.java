package X;

import Y.ARunnableS50S0100000_14;
import android.widget.TextView;

/* renamed from: X.WRx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC82305WRx implements Runnable {
    public final CharSequence LJLIL;
    public final CharSequence LJLILLLLZI;
    public final boolean LJLJI;
    public final /* synthetic */ C82304WRw LJLJJI;

    public final void LIZ() {
        float f;
        TextView textView;
        TextView textView2;
        float f2;
        C82304WRw c82304WRw = this.LJLJJI;
        if (c82304WRw.LJLIL == null || c82304WRw.LJLILLLLZI == null) {
            return;
        }
        c82304WRw.animate().cancel();
        this.LJLJJI.LJLIL.animate().cancel();
        this.LJLJJI.LJLILLLLZI.animate().cancel();
        C82304WRw c82304WRw2 = this.LJLJJI;
        c82304WRw2.removeCallbacks(c82304WRw2.LJLJJL);
        this.LJLJJI.setAlpha(1.0f);
        this.LJLJJI.setVisibility(0);
        boolean z = this.LJLJI;
        if (z) {
            f = this.LJLJJI.LJLJI;
        } else {
            f = 0.0f;
        }
        C82304WRw c82304WRw3 = this.LJLJJI;
        if (z) {
            textView = c82304WRw3.LJLIL;
            textView2 = c82304WRw3.LJLILLLLZI;
            f2 = 0.0f;
        } else {
            textView = c82304WRw3.LJLILLLLZI;
            textView2 = c82304WRw3.LJLIL;
            f2 = c82304WRw3.LJLJI;
        }
        textView.setTranslationX(f2);
        textView2.setTranslationX(f2);
        textView.setAlpha(1.0f);
        textView2.setAlpha(0.0f);
        textView.setText(this.LJLIL);
        textView2.setText(this.LJLILLLLZI);
        textView.animate().translationX(f).alpha(0.0f).withEndAction(new ARunnableS50S0100000_14(this, 236)).setDuration(300L).start();
        textView2.animate().translationX(f).alpha(1.0f).setDuration(300L).start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC82305WRx(C82304WRw c82304WRw, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.LJLJJI = c82304WRw;
        this.LJLIL = charSequence;
        this.LJLILLLLZI = charSequence2;
        this.LJLJI = z;
    }
}
