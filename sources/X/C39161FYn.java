package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FYn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39161FYn<T> implements InterfaceC64592gB {
    public static final C39161FYn<T> LJLIL = new C39161FYn<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Boolean it = (Boolean) obj;
        if (!o.LJ(it, Boolean.valueOf(C39163FYp.LJII))) {
            o.LJIIIIZZ(it, "it");
            C39163FYp.LJII = it.booleanValue();
            C39163FYp.LJFF().storeLong("in_background_time", System.currentTimeMillis());
        }
        if (!it.booleanValue() && C39163FYp.LJIIIIZZ) {
            C39163FYp.LJIIIIZZ = false;
            C39163FYp.LJFF().storeBoolean("low_memory", false);
        }
    }
}
