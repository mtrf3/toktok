package X;

import kotlin.jvm.internal.o;

/* renamed from: X.38p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C791138p implements InterfaceC789838c {
    public static final C791138p LIZIZ = new C791138p();
    public final /* synthetic */ InterfaceC789838c LIZ;

    @Override // X.InterfaceC789838c
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C791138p() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        this.LIZ = ((C65087PgZ) C46104I7o.LJIILLIIL(API_URL_PREFIX_SI)).LJFF();
    }
}
