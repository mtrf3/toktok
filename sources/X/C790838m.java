package X;

import kotlin.jvm.internal.o;

/* renamed from: X.38m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C790838m implements InterfaceC789838c {
    public static final C790838m LIZIZ = new C790838m();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C790838m() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = ((C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI)).LJFF();
    }
}
