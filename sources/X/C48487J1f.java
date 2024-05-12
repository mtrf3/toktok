package X;

import kotlin.jvm.internal.o;

/* renamed from: X.J1f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48487J1f extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC48485J1d> {
    public static final C48487J1f LJLIL = new C48487J1f();

    public C48487J1f() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.J1d, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final InterfaceC48485J1d invoke() {
        C48489J1h c48489J1h;
        if (C48488J1g.LIZ) {
            c48489J1h = (C48489J1h) C48488J1g.LIZJ.getValue();
        } else {
            c48489J1h = C48488J1g.LIZIZ;
            if (c48489J1h == null) {
                o.LJIJI("config");
                throw null;
            }
        }
        ?? LIZ = c48489J1h.LIZ(InterfaceC48485J1d.class);
        o.LJI(LIZ);
        return LIZ;
    }
}
