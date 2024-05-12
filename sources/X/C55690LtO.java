package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LtO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55690LtO implements InterfaceC789838c {
    public static final C55690LtO LIZIZ = new C55690LtO();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C55690LtO() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        InterfaceC790538j LJIILLIIL = C46104I7o.LJIILLIIL(API_URL_PREFIX_SI);
        C65087PgZ c65087PgZ = (C65087PgZ) LJIILLIIL;
        c65087PgZ.LJIIIIZZ.LIZ(new C64884PdI());
        this.LIZ = c65087PgZ.LJFF();
    }
}
