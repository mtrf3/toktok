package X;

import Y.ARunnableS50S0100000_14;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VEE implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ VEF LJLJI;
    public final /* synthetic */ VED LJLJJI;
    public final /* synthetic */ Handler LJLJJL;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load font success ");
        LIZ.append(this.LJLIL);
        LIZ.append(this.LJLILLLLZI);
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
        if (Build.VERSION.SDK_INT >= 28) {
            this.LJLJI.LIZ(this.LJLJJI.LIZ(this.LJLILLLLZI), this.LJLILLLLZI);
        } else if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LJLJI.LIZ(this.LJLJJI.LIZ(this.LJLILLLLZI), this.LJLILLLLZI);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS50S0100000_14(this, 156));
        }
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

    public VEE(String str, int i, VEF vef, VED ved, Handler handler) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = vef;
        this.LJLJJI = ved;
        this.LJLJJL = handler;
    }
}
