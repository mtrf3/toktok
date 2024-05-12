package X;

import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;

/* renamed from: X.EaG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36668EaG<T> implements InterfaceC64592gB {
    public static final C36668EaG<T> LJLIL = new C36668EaG<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Uncaught EC error in ");
        InterfaceC37828Esy interfaceC37828Esy = (InterfaceC37828Esy) ORZ.LJLLLL(PageMonitor.LJFF);
        String str2 = null;
        if (interfaceC37828Esy != null) {
            str = interfaceC37828Esy.getPageName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", msg =  ");
        Throwable cause = th.getCause();
        if (cause != null) {
            str2 = cause.getMessage();
        }
        LIZ.append(str2);
        C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
    }
}
