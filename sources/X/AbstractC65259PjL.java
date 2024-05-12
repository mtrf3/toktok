package X;

/* renamed from: X.PjL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65259PjL<T> implements InterfaceC64642PYo<T> {
    public abstract void LIZ(C65053Pg1 c65053Pg1);

    public abstract void LIZIZ(H4F h4f);

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<T> interfaceC65079PgR, Throwable th) {
        LIZ(new C65053Pg1("Request Failure", th));
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<T> interfaceC65079PgR, C64653PYz<T> c64653PYz) {
        if (c64653PYz.LIZ()) {
            LIZIZ(new H4F(c64653PYz.LIZIZ, c64653PYz));
        } else {
            LIZ(new C65052Pg0(c64653PYz));
        }
    }
}
