package X;

import Y.ARunnableS14S0101000_10;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.NdR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractViewOnClickListenerC59797NdR implements View.OnClickListener {
    public static boolean LJLJJL = true;
    public boolean LJLJI = true;
    public final ARunnableS14S0101000_10 LJLJJI = new ARunnableS14S0101000_10(6, this, 2);
    public final int LJLIL = 300;
    public final boolean LJLILLLLZI = true;

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        boolean z;
        o.LJIIIZ(v, "v");
        boolean z2 = this.LJLILLLLZI;
        if (z2) {
            z = LJLJJL;
        } else {
            z = this.LJLJI;
        }
        if (z) {
            if (z2) {
                LJLJJL = false;
            } else {
                this.LJLJI = false;
            }
            v.postDelayed(this.LJLJJI, this.LJLIL);
            ((C59798NdS) this).LJLJJLL.invoke();
        }
    }
}
