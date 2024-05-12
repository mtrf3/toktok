package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* loaded from: classes16.dex */
public abstract class XKU<T> extends X9P {
    public int LJLJI;

    public void LIZ(Object obj, Throwable th) {
    }

    public abstract InterfaceC67352kd<T> LIZIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T LJ(Object obj) {
        return obj;
    }

    public abstract Object LJII();

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|2|3|(1:5)(1:40)|6|7|(9:9|(2:26|(1:(1:32))(7:30|(1:15)|25|17|18|19|20))|13|(0)|25|17|18|19|20)|33|(0)|25|17|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r0 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x0090, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x0002, B:5:0x0019, B:15:0x0071, B:25:0x0077, B:36:0x0086, B:38:0x008f, B:39:0x008c, B:7:0x001f, B:9:0x002d, B:13:0x005a, B:26:0x0035, B:28:0x003f, B:30:0x0045, B:33:0x0065), top: B:2:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r11 = this;
            X.X9R r4 = r11.LJLILLLLZI
            X.2kd r0 = r11.LIZIZ()     // Catch: java.lang.Throwable -> L90
            X.XKT r0 = (X.XKT) r0     // Catch: java.lang.Throwable -> L90
            X.2kd<T> r6 = r0.LJLJJL     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.LJLJL     // Catch: java.lang.Throwable -> L90
            X.MBA r5 = r6.getContext()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r3 = X.XLG.LIZJ(r0, r5)     // Catch: java.lang.Throwable -> L90
            X.3BS r0 = X.XLG.LIZ     // Catch: java.lang.Throwable -> L90
            r2 = 0
            if (r3 == r0) goto L1e
            X.XKf r10 = X.C84648XKa.LIZIZ(r6, r5, r3)     // Catch: java.lang.Throwable -> L90
            goto L1f
        L1e:
            r10 = r2
        L1f:
            X.MBA r9 = r6.getContext()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r11.LJII()     // Catch: java.lang.Throwable -> L83
            java.lang.Throwable r7 = r11.LIZJ(r8)     // Catch: java.lang.Throwable -> L83
            if (r7 != 0) goto L65
            int r1 = r11.LJLJI     // Catch: java.lang.Throwable -> L83
            r0 = 1
            if (r1 == r0) goto L35
            r0 = 2
            if (r1 != r0) goto L5a
        L35:
            X.3T3 r0 = X.InterfaceC79150V4o.LJJJJJ     // Catch: java.lang.Throwable -> L83
            X.MBD r1 = r9.get(r0)     // Catch: java.lang.Throwable -> L83
            X.V4o r1 = (X.InterfaceC79150V4o) r1     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L57
            boolean r0 = r1.isActive()     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L57
            java.util.concurrent.CancellationException r0 = r1.LJJIIJ()     // Catch: java.lang.Throwable -> L83
            r11.LIZ(r8, r0)     // Catch: java.lang.Throwable -> L83
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L83
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L83
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L83
            goto L6f
        L57:
            if (r7 == 0) goto L5a
            goto L65
        L5a:
            java.lang.Object r0 = r11.LJ(r8)     // Catch: java.lang.Throwable -> L83
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L83
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L83
            goto L6f
        L65:
            X.3C4 r0 = X.C141335gf.LIZ(r7)     // Catch: java.lang.Throwable -> L83
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L83
            r6.resumeWith(r0)     // Catch: java.lang.Throwable -> L83
        L6f:
            if (r10 == 0) goto L77
            boolean r0 = r10.LJJZZIII()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L7a
        L77:
            X.XLG.LIZ(r3, r5)     // Catch: java.lang.Throwable -> L90
        L7a:
            r4.LJIILIIL()     // Catch: java.lang.Throwable -> Laa
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Laa
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Laa
            goto Lb2
        L83:
            r1 = move-exception
            if (r10 == 0) goto L8c
            boolean r0 = r10.LJJZZIII()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8f
        L8c:
            X.XLG.LIZ(r3, r5)     // Catch: java.lang.Throwable -> L90
        L8f:
            throw r1     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = move-exception
            r4.LJIILIIL()     // Catch: java.lang.Throwable -> L9a
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L9a
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L9a
            goto La2
        L9a:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        La2:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            r11.LJFF(r1, r0)
            goto Lb9
        Laa:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lb2:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)
            r11.LJFF(r2, r0)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XKU.LJI():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public XKU(int i) {
        this.LJLJI = i;
    }

    public Throwable LIZJ(Object obj) {
        CompletedExceptionally completedExceptionally;
        if (!(obj instanceof CompletedExceptionally) || (completedExceptionally = (CompletedExceptionally) obj) == null) {
            return null;
        }
        return completedExceptionally.cause;
    }

    public final void LJFF(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 == null) {
                return;
            } else {
                th = th2;
            }
        } else if (th2 != null) {
            V0N.LJFF(th, th2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fatal exception in coroutines machinery for ");
        LIZ.append(this);
        LIZ.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJI(th);
        C78540Us4.LJIIJ(LIZIZ().getContext(), new PPF(LIZIZ, th));
    }
}
