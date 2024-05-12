package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223878qV {
    public final HashMap<Integer, InterfaceC223888qW> LIZ = new HashMap<>();
    public final C62822Ol8 LIZIZ;

    public C223878qV(InterfaceC223648q8 interfaceC223648q8) {
        this.LIZIZ = C221108m2.LIZIZ(new AqS150S0200000_3(this, interfaceC223648q8, 103));
    }

    public final void LIZ(InterfaceC223888qW callback) {
        o.LJIIIZ(callback, "callback");
        C16880lQ.LLIIIJ().postFrameCallback((ChoreographerFrameCallbackC223868qU) this.LIZIZ.getValue());
        if (!this.LIZ.containsKey(Integer.valueOf(callback.hashCode()))) {
            this.LIZ.put(Integer.valueOf(callback.hashCode()), callback);
        }
    }
}
