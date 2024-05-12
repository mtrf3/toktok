package X;

import kotlin.jvm.internal.o;

/* renamed from: X.38n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C790938n implements InterfaceC789838c {
    public static final C790938n LIZIZ = new C790938n();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C790938n() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = ((C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI)).LJFF();
    }
}
