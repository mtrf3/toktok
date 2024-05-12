package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vkn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80637Vkn implements Runnable {
    public final /* synthetic */ Drawable LJLIL;
    public final /* synthetic */ Matrix LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ AbstractC80634Vkk LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LJIIJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80637Vkn(AbstractC80634Vkk abstractC80634Vkk, Drawable drawable, Matrix matrix, float f, float f2) {
        this.LJLJJL = abstractC80634Vkk;
        this.LJLIL = drawable;
        this.LJLILLLLZI = matrix;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }
}
