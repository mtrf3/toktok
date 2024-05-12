package X;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;
import p83.a;

/* renamed from: X.FdZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC39421FdZ<V> implements Callable {
    public static final CallableC39421FdZ<V> LJLIL = new CallableC39421FdZ<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        try {
            C39252Faq c39252Faq = C39253Far.LIZJ;
            Context LIZIZ = EF7.LIZIZ();
            c39252Faq.getClass();
            a.C0043a LIZIZ2 = C39252Faq.LIZIZ(LIZIZ);
            if (LIZIZ2 != null) {
                z = LIZIZ2.LIZIZ;
            } else {
                z = true;
            }
            C39424Fdc.LIZ = z;
        } catch (C39422Fda | PSW | IOException | IllegalStateException unused) {
        } catch (Throwable th) {
            C39424Fdc.LIZIZ = true;
            throw th;
        }
        C39424Fdc.LIZIZ = true;
        return C76800UCe.LIZ;
    }
}
