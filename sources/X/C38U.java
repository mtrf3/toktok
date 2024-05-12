package X;

import kotlin.jvm.internal.o;

/* renamed from: X.38U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38U implements InterfaceC789838c {
    public static final C38U LIZIZ = new C38U();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C38U() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = ((C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI)).LJFF();
    }
}
