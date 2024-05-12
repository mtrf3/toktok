package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.o;

/* renamed from: X.1qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45311qB extends AbstractC65781Prl implements InterfaceC65784Pro<MBA> {
    public static final C45311qB INSTANCE = new C45311qB();

    public C45311qB() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final MBA invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            choreographer = C16880lQ.LLIIIJ();
        } else {
            choreographer = (Choreographer) XKX.LJ(C36636EZk.LIZ, new C29X(null));
        }
        o.LJIIIIZZ(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler LIZ = C10640bM.LIZ(C16880lQ.LLJJJJ());
        o.LJIIIIZZ(LIZ, "createAsync(Looper.getMainLooper())");
        C29Y c29y = new C29Y(choreographer, LIZ);
        return c29y.plus(c29y.LJLL);
    }
}
