package X;

import android.view.Choreographer;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EWL extends AbstractC65781Prl implements InterfaceC65784Pro<Method> {
    public static final EWL LJLIL = new EWL();

    public EWL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Method invoke() {
        try {
            return C36508EUm.LIZIZ(Choreographer.class, "removeCallbacksInternal", Integer.TYPE, Object.class, Object.class);
        } catch (Throwable unused) {
            EWM.LIZIZ = false;
            return null;
        }
    }
}
