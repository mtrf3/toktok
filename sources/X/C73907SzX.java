package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73907SzX<T, K> extends AtomicInteger implements InterfaceC92693kP, InterfaceC115714gR<T> {
    public static final long serialVersionUID = -3852313036005250360L;
    public final K LJLIL;
    public final C73912Szc<T> LJLILLLLZI;
    public final C73908SzY<?, K, T> LJLJI;
    public final boolean LJLJJI;
    public volatile boolean LJLJJL;
    public Throwable LJLJJLL;
    public final AtomicBoolean LJLJL = new AtomicBoolean();
    public final AtomicBoolean LJLJLJ = new AtomicBoolean();
    public final AtomicReference<InterfaceC116954iR<? super T>> LJLJLLL = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLJL.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.LJLJLLL.lazySet(null);
            this.LJLJI.cancel(this.LJLIL);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJL.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0016, code lost:
    
        r1 = r9.LJLJJL;
        r4 = r8.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r9.LJLJL.get() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r3 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r1 = r9.LJLJJLL;
        r9.LJLJLLL.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r6.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r6.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r6.onNext(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r1 = r9.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r3 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        r9.LJLJLLL.lazySet(null);
        r6.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        r9.LJLILLLLZI.clear();
        r9.LJLJLLL.lazySet(null);
        r6.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0028, code lost:
    
        r9.LJLILLLLZI.clear();
        r9.LJLJI.cancel(r9.LJLIL);
        r9.LJLJLLL.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0072, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0077, code lost:
    
        if (r5 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007a -> B:7:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r9 = this;
            int r0 = r9.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            X.Szc<T> r8 = r9.LJLILLLLZI
            boolean r7 = r9.LJLJJI
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            java.lang.Object r6 = r0.get()
            X.4iR r6 = (X.InterfaceC116954iR) r6
            r5 = 1
        L14:
            if (r6 == 0) goto L72
        L16:
            boolean r1 = r9.LJLJJL
            java.lang.Object r4 = r8.poll()
            if (r4 != 0) goto L6e
            r3 = 1
        L1f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.LJLJL
            boolean r0 = r0.get()
            r2 = 0
            if (r0 == 0) goto L3a
            X.Szc<T> r0 = r9.LJLILLLLZI
            r0.clear()
            X.SzY<?, K, T> r1 = r9.LJLJI
            K r0 = r9.LJLIL
            r1.cancel(r0)
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            r0.lazySet(r2)
        L39:
            return
        L3a:
            if (r1 == 0) goto L70
            if (r7 == 0) goto L51
            if (r3 == 0) goto L85
            java.lang.Throwable r1 = r9.LJLJJLL
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            r0.lazySet(r2)
            if (r1 == 0) goto L4d
            r6.onError(r1)
            goto L39
        L4d:
            r6.onComplete()
            goto L39
        L51:
            java.lang.Throwable r1 = r9.LJLJJLL
            if (r1 == 0) goto L63
            X.Szc<T> r0 = r9.LJLILLLLZI
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            r0.lazySet(r2)
            r6.onError(r1)
            goto L39
        L63:
            if (r3 == 0) goto L85
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            r0.lazySet(r2)
            r6.onComplete()
            goto L39
        L6e:
            r3 = 0
            goto L1f
        L70:
            if (r3 == 0) goto L85
        L72:
            int r0 = -r5
            int r5 = r9.addAndGet(r0)
            if (r5 != 0) goto L7a
            return
        L7a:
            if (r6 != 0) goto L16
            java.util.concurrent.atomic.AtomicReference<X.4iR<? super T>> r0 = r9.LJLJLLL
            java.lang.Object r6 = r0.get()
            X.4iR r6 = (X.InterfaceC116954iR) r6
            goto L14
        L85:
            r6.onNext(r4)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73907SzX.LIZIZ():void");
    }

    @Override // X.InterfaceC115714gR
    public final void LIZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (this.LJLJLJ.compareAndSet(false, true)) {
            interfaceC116954iR.onSubscribe(this);
            this.LJLJLLL.lazySet(interfaceC116954iR);
            if (this.LJLJL.get()) {
                this.LJLJLLL.lazySet(null);
                return;
            } else {
                LIZIZ();
                return;
            }
        }
        EnumC73538Sta.error(new IllegalStateException("Only one Observer allowed!"), interfaceC116954iR);
    }

    public C73907SzX(int i, C73908SzY<?, K, T> c73908SzY, K k, boolean z) {
        this.LJLILLLLZI = new C73912Szc<>(i);
        this.LJLJI = c73908SzY;
        this.LJLIL = k;
        this.LJLJJI = z;
    }
}
