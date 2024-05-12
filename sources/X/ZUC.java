package X;

import android.os.RemoteException;
import com.benchmark.tools.DefaultSharedpreference;
import java.util.concurrent.Callable;

/* loaded from: classes19.dex */
public final class ZUC implements Callable<Void> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ZUU LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        String string = DefaultSharedpreference.getInstance().getString(C09590Zf.LJIILLIIL.LIZ, "benchmark");
        if (string == null || string.length() <= 0) {
            C47261Igj.LJIILL("BytebenchV2");
            return null;
        }
        try {
            this.LJLILLLLZI.LIZIZ.LIZ(this.LJLIL, ZU4.LIZJ.LIZIZ.LIZJ, string);
            return null;
        } catch (RemoteException e) {
            if (this.LJLILLLLZI.LIZ == null) {
                return null;
            }
            C38901fq.LJIIIZ(e);
            this.LJLILLLLZI.LIZ.LIZ(101, -1, "Start Task failed because of RemoteException");
            return null;
        }
    }

    public ZUC(ZUU zuu, int i) {
        this.LJLILLLLZI = zuu;
        this.LJLIL = i;
    }
}
