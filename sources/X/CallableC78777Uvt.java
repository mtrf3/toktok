package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.Uvt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class CallableC78777Uvt<V> implements Callable {
    public final /* synthetic */ String LJLIL;

    public CallableC78777Uvt(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!C78766Uvi.LIZIZ(UriProtector.parse(this.LJLIL))) {
            String str = this.LJLIL;
            C78894Uxm c78894Uxm = new C78894Uxm();
            if (str != null && !str.isEmpty() && !C78766Uvi.LIZIZ(UriProtector.parse(str))) {
                W8E.LJII().LJI().LJIIL(W5O.LIZIZ(str), null).LJ(new C78776Uvs(c78894Uxm), (Executor) C78779Uvv.LIZ.getValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
