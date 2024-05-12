package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.FDf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38607FDf extends AbstractC65781Prl implements InterfaceC65784Pro<Executor> {
    public static final C38607FDf LJLIL = new C38607FDf();

    public C38607FDf() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // X.InterfaceC65784Pro
    public final Executor invoke() {
        boolean z;
        Object obj;
        if (((Boolean) FDY.LIZIZ.getValue()).booleanValue()) {
            if (FDY.LIZ() == 2 || FDY.LIZ() == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Object LIZIZ = FOR.LJFF.LIZIZ();
                    C3C5.m7constructorimpl(LIZIZ);
                    obj = LIZIZ;
                } catch (Throwable th) {
                    Object LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                    obj = LIZ;
                }
                boolean m12isFailureimpl = C3C5.m12isFailureimpl(obj);
                ?? r1 = obj;
                if (m12isFailureimpl) {
                    r1 = 0;
                }
                if (r1 != 0) {
                    return r1;
                }
            }
        }
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
        return LIZLLL;
    }
}
