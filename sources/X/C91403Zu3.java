package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zu3, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91403Zu3<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;

    public C91403Zu3(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object response) {
        C91208Zqu c91208Zqu = C91208Zqu.LIZ;
        String str = this.LJLIL;
        o.LJIIIIZZ(response, "response");
        synchronized (c91208Zqu) {
            C91208Zqu.LIZIZ.LIZJ(str, response);
        }
    }
}
