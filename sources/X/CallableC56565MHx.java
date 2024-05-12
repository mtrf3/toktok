package X;

import java.util.concurrent.Callable;

/* renamed from: X.MHx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC56565MHx<V> implements Callable {
    public final /* synthetic */ C56563MHv LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI = 20;
    public final /* synthetic */ String LJLJJL;

    public CallableC56565MHx(C56563MHv c56563MHv, long j, int i, String str) {
        this.LJLIL = c56563MHv;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJL = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(3:3|(1:5)|(5:7|8|9|10|(2:12|13)(2:15|16)))|20|8|9|10|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r7 = this;
            X.MHv r0 = r7.LJLIL
            X.MI1 r0 = r0.LJLIL
            r1 = 0
            r0.LJ = r1
            long r2 = r7.LJLILLLLZI
            int r4 = r7.LJLJI
            int r5 = r7.LJLJJI
            java.lang.String r6 = r7.LJLJJL
            if (r6 == 0) goto L22
            int r0 = r6.length()
            if (r0 != 0) goto L19
            r1 = 1
        L19:
            if (r1 != 0) goto L22
            com.ss.android.ugc.aweme.question.api.QuestionApi$RealApi r1 = com.ss.android.ugc.aweme.question.api.QuestionApi.LIZ
            X.10K r1 = r1.queryQuestionVideos(r2, r4, r5, r6)
            goto L28
        L22:
            com.ss.android.ugc.aweme.question.api.QuestionApi$RealApi r0 = com.ss.android.ugc.aweme.question.api.QuestionApi.LIZ
            X.10K r1 = r0.queryQuestionVideos(r2, r4, r5)
        L28:
            r1.LJIJI()     // Catch: java.lang.InterruptedException -> L2c
            goto L30
        L2c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L30:
            boolean r0 = r1.LJIILJJIL()
            if (r0 != 0) goto L40
            java.lang.Object r1 = r1.LJIIJJI()
            java.lang.String r0 = "task.result"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L40:
            java.lang.Exception r1 = r1.LJIIJ()
            java.lang.String r0 = "task.error"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC56565MHx.call():java.lang.Object");
    }
}
