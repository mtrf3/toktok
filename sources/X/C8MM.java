package X;

import Y.AObserverS71S0100000_3;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8MM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MM {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C8MN.LJLIL);

    public final HashMap<String, Observer<C207668Da>> LIZIZ() {
        return (HashMap) this.LIZ.getValue();
    }

    public C8MM() {
        C221108m2.LIZIZ(C8MO.LJLIL);
    }

    public final void LIZ(String str, InterfaceC88472Yns observe) {
        o.LJIIIZ(observe, "observe");
        LIZIZ().put(str, new AObserverS71S0100000_3(observe, 78));
    }
}
