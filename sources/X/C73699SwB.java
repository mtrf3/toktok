package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SwB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73699SwB<T> implements InterfaceC115714gR<T> {
    public final AtomicReference<C73698SwA<T>> LJLIL;

    public C73699SwB(AtomicReference<C73698SwA<T>> atomicReference) {
        this.LJLIL = atomicReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0008, code lost:
    
        continue;
     */
    @Override // X.InterfaceC115714gR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC116954iR<? super T> r8) {
        /*
            r7 = this;
            X.SwC r4 = new X.SwC
            r4.<init>(r8)
            r8.onSubscribe(r4)
        L8:
            java.util.concurrent.atomic.AtomicReference<X.SwA<T>> r0 = r7.LJLIL
            java.lang.Object r2 = r0.get()
            X.SwA r2 = (X.C73698SwA) r2
            r6 = 0
            if (r2 == 0) goto L19
            boolean r0 = r2.isDisposed()
            if (r0 == 0) goto L60
        L19:
            X.SwA r5 = new X.SwA
            java.util.concurrent.atomic.AtomicReference<X.SwA<T>> r0 = r7.LJLIL
            r5.<init>(r0)
            java.util.concurrent.atomic.AtomicReference<X.SwA<T>> r1 = r7.LJLIL
        L22:
            boolean r0 = r1.compareAndSet(r2, r5)
            if (r0 == 0) goto L59
        L28:
            java.util.concurrent.atomic.AtomicReference<X.SwC<T>[]> r0 = r5.LJLILLLLZI
            java.lang.Object r3 = r0.get()
            X.SwC[] r3 = (X.C73700SwC[]) r3
            X.SwC[] r0 = X.C73698SwA.LJLJJLL
            if (r3 != r0) goto L35
            goto L8
        L35:
            int r1 = r3.length
            int r0 = r1 + 1
            X.SwC[] r2 = new X.C73700SwC[r0]
            java.lang.System.arraycopy(r3, r6, r2, r6, r1)
            r2[r1] = r4
            java.util.concurrent.atomic.AtomicReference<X.SwC<T>[]> r1 = r5.LJLILLLLZI
        L41:
            boolean r0 = r1.compareAndSet(r3, r2)
            if (r0 == 0) goto L52
            r0 = 0
            boolean r0 = r4.compareAndSet(r0, r5)
            if (r0 != 0) goto L51
            r5.LIZ(r4)
        L51:
            return
        L52:
            java.lang.Object r0 = r1.get()
            if (r0 == r3) goto L41
            goto L28
        L59:
            java.lang.Object r0 = r1.get()
            if (r0 == r2) goto L22
            goto L8
        L60:
            r5 = r2
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73699SwB.LIZ(X.4iR):void");
    }
}
