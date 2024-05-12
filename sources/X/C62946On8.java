package X;

import kotlin.jvm.internal.o;

/* renamed from: X.On8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62946On8<T> implements InterfaceC64592gB {
    public static final C62946On8<T> LJLIL = new C62946On8<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        int i;
        Throwable th = (Throwable) obj;
        ((RBX) HG3.LJIILL()).getCurUser().setAcceptPrivatePolicy(false);
        String str2 = "";
        if (th == null) {
            str = "";
        } else {
            str = C78688UuS.LJJIJL(th);
            String stackTraceString = android.util.Log.getStackTraceString(th);
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(this)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error_code = ");
            if (th instanceof C38306F1q) {
                i = ((C38306F1q) th).getErrorCode();
            } else {
                i = -1;
            }
            LIZ.append(i);
            LIZ.append('\n');
            LIZ.append(th.getMessage());
            LIZ.append('\n');
            LIZ.append(stackTraceString);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (LIZIZ != null) {
                str2 = LIZIZ;
            }
        }
        C25574A1y.LIZJ("/aweme/v1/accept-private-policy/", str, str2);
    }
}
