package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32991Rf implements InterfaceC24760y8<Object> {
    public final List<InterfaceC13460fu> LJLIL;
    public final C13450ft LJLILLLLZI;
    public final C13420fq LJLJI;
    public final InterfaceC88472Yns<C42871mF, C76800UCe> LJLJJI;
    public final InterfaceC13350fj LJLJJL;
    public final ParcelableSnapshotMutableState LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC24760y8
    public final Object getValue() {
        return this.LJLJJLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (0 != 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[Catch: all -> 0x00f3, TRY_ENTER, TryCatch #2 {all -> 0x00f3, blocks: (B:13:0x00a2, B:29:0x00a5, B:36:0x008f, B:50:0x004e), top: B:49:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009f -> B:13:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991Rf.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC13460fu r9, X.InterfaceC67352kd<java.lang.Object> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21A
            if (r0 == 0) goto L21
            r7 = r10
            X.21A r7 = (X.C21A) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r2 = r7.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLJJI
            r0 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2b
            X.0fu r9 = r7.LJLIL
            goto L27
        L21:
            X.21A r7 = new X.21A
            r7.<init>(r8, r10)
            goto L12
        L27:
            X.C141335gf.LIZJ(r2)     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            goto L48
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C141335gf.LIZJ(r2)
            X.2EE r2 = new X.2EE     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            r2.<init>(r8, r9, r6)     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            r7.LJLIL = r9     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            r7.LJLJJI = r0     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = X.C74209TAn.LIZJ(r0, r2, r7)     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L56
            if (r2 != r3) goto L48
            return r3
        L48:
            r6 = r2
            goto L81
        L4a:
            r1 = move-exception
            X.MBA r0 = r7.getContext()
            boolean r0 = X.C79146V4k.LJJJ(r0)
            if (r0 == 0) goto L82
            goto L81
        L56:
            r5 = move-exception
            X.MBA r1 = r7.getContext()
            X.315 r0 = kotlinx.coroutines.CoroutineExceptionHandler.LJJJJIZL
            X.MBD r4 = r1.get(r0)
            kotlinx.coroutines.CoroutineExceptionHandler r4 = (kotlinx.coroutines.CoroutineExceptionHandler) r4
            if (r4 == 0) goto L81
            X.MBA r3 = r7.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Unable to load font "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0, r5)
            r4.handleException(r3, r2)
        L81:
            return r6
        L82:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32991Rf.LJFF(X.0fu, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32991Rf(List<? extends InterfaceC13460fu> list, Object initialType, C13450ft c13450ft, C13420fq asyncTypefaceCache, InterfaceC88472Yns<? super C42871mF, C76800UCe> onCompletion, InterfaceC13350fj interfaceC13350fj) {
        o.LJIIIZ(initialType, "initialType");
        o.LJIIIZ(asyncTypefaceCache, "asyncTypefaceCache");
        o.LJIIIZ(onCompletion, "onCompletion");
        this.LJLIL = list;
        this.LJLILLLLZI = c13450ft;
        this.LJLJI = asyncTypefaceCache;
        this.LJLJJI = onCompletion;
        this.LJLJJL = interfaceC13350fj;
        this.LJLJJLL = C78966Uyw.LJJJIL(initialType);
        this.LJLJL = true;
    }
}
