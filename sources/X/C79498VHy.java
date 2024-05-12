package X;

import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.VHy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79498VHy implements InterfaceC79499VHz {
    public final java.util.Map<VI8, InterfaceC79497VHx> LIZ = new HashMap();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.VHw] */
    public final InterfaceC79497VHx LIZIZ(VI8 vi8) {
        C79495VHv c79495VHv;
        if (vi8.LJFF) {
            synchronized (this) {
                c79495VHv = (C79495VHv) ThreadUtils.LIZIZ(new Callable() { // from class: X.VHw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C79495VHv(C16880lQ.LLIIIJ());
                    }
                });
            }
            return c79495VHv;
        }
        return new VI6(vi8);
    }

    @Override // X.InterfaceC79499VHz
    public final synchronized void LIZ(VI8 vi8, Runnable runnable) {
        if (vi8.LIZLLL != 0) {
            LIZIZ(vi8).LIZ(runnable);
        } else {
            InterfaceC79497VHx interfaceC79497VHx = (InterfaceC79497VHx) ((HashMap) this.LIZ).get(vi8);
            if (interfaceC79497VHx == null) {
                interfaceC79497VHx = LIZIZ(vi8);
                ((HashMap) this.LIZ).put(vi8, interfaceC79497VHx);
            }
            interfaceC79497VHx.LIZ(runnable);
        }
    }
}
