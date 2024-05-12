package X;

import java.util.HashMap;

/* renamed from: X.Ckc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32214Ckc<T> implements InterfaceC64592gB<T> {
    public final InterfaceC64592gB<T> LJLIL;

    public C32214Ckc(InterfaceC64592gB<T> interfaceC64592gB) {
        this.LJLIL = interfaceC64592gB;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(T t) {
        try {
            this.LJLIL.accept(t);
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("stack", V0N.LJJIJL(th));
            C78983UzD.LJIJI(new C31101CIn(), String.valueOf(C65352Pkq.LIZ(this.LJLIL.getClass()).LJFF()), hashMap);
        }
    }
}
