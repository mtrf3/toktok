package X;

import Y.IDCallbackS366S0100000;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: X.15Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15Y {
    public final C15V LIZ;
    public final Handler LIZIZ;
    public final C44831pP LIZJ;

    public C15Y(Context context) {
        IDCallbackS366S0100000 iDCallbackS366S0100000 = new IDCallbackS366S0100000(this, 0);
        this.LIZ = new C15V(context);
        this.LIZIZ = new Handler(iDCallbackS366S0100000);
        this.LIZJ = C44831pP.LJLJI;
    }

    public final void LIZ(int i, ViewGroup viewGroup, C15X c15x) {
        C15W LIZIZ = this.LIZJ.LJLILLLLZI.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new C15W();
        }
        LIZIZ.LIZ = this;
        LIZIZ.LIZJ = i;
        LIZIZ.LIZIZ = viewGroup;
        LIZIZ.LJ = c15x;
        C44831pP c44831pP = this.LIZJ;
        c44831pP.getClass();
        try {
            c44831pP.LJLIL.put(LIZIZ);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
