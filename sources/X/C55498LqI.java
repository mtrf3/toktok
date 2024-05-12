package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LqI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55498LqI<T> implements InterfaceC64592gB {
    public static final C55498LqI<T> LJLIL = new C55498LqI<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Boolean enterBackground = (Boolean) obj;
        o.LJIIIIZZ(enterBackground, "enterBackground");
        if (enterBackground.booleanValue()) {
            if (C55499LqJ.LJFF) {
                C55499LqJ.LJ = Long.valueOf(System.currentTimeMillis());
            }
        } else {
            if (!C55499LqJ.LJFF) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = C55499LqJ.LJ;
            if (l == null || currentTimeMillis - l.longValue() < 1800000) {
                return;
            }
            C55499LqJ.LIZJ();
        }
    }
}
