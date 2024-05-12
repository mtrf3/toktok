package X;

import okhttp3.Request;

/* renamed from: X.PgR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC65079PgR<T> extends Cloneable {
    void LLLZ(InterfaceC64642PYo<T> interfaceC64642PYo);

    void cancel();

    InterfaceC65079PgR<T> clone();

    C64653PYz<T> execute();

    boolean isCanceled();

    Request request();
}
