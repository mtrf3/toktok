package X;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: X.Fc3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC39327Fc3<V> implements Callable {
    public static final CallableC39327Fc3<V> LJLIL = new CallableC39327Fc3<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            CookieManager.getInstance().flush();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
