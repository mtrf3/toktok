package X;

import android.view.Choreographer;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EWK extends AbstractC65781Prl implements InterfaceC65784Pro<Method> {
    public static final EWK LJLIL = new EWK();

    public EWK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Method invoke() {
        try {
            return C36508EUm.LIZIZ(Choreographer.class, "postCallbackDelayedInternal", Integer.TYPE, Object.class, Object.class, Long.TYPE);
        } catch (Throwable unused) {
            EWM.LIZIZ = false;
            return null;
        }
    }
}
