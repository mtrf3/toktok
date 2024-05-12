package X;

import java.util.concurrent.Callable;

/* renamed from: X.Stk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73548Stk {
    public static volatile InterfaceC64592gB<? super Throwable> LIZ;
    public static volatile InterfaceC48038ItG<? super AbstractC73946T0k, ? extends AbstractC73946T0k> LIZIZ;

    public static AbstractC73946T0k LIZ(Callable<AbstractC73946T0k> callable) {
        try {
            AbstractC73946T0k call = callable.call();
            C73320Sq4.LIZ(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw C73864Syq.LIZIZ(th);
        }
    }

    public static void LIZIZ(Throwable th) {
        InterfaceC64592gB<? super Throwable> interfaceC64592gB = LIZ;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof C73545Sth) && !(th instanceof C73799Sxn) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C63756P0m)) {
            th = new PD8(th);
        }
        if (interfaceC64592gB != null) {
            try {
                interfaceC64592gB.accept(th);
                return;
            } catch (Throwable th2) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                LLLLIIIILLL.getUncaughtExceptionHandler().uncaughtException(LLLLIIIILLL, th2);
            }
        }
        Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
        LLLLIIIILLL2.getUncaughtExceptionHandler().uncaughtException(LLLLIIIILLL2, th);
    }
}
