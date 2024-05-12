package X;

import kotlin.jvm.internal.o;

/* renamed from: X.38r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C791338r implements InterfaceC789838c {
    public static final C791338r LIZIZ = new C791338r();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C791338r() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = ((C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI)).LJFF();
    }
}
