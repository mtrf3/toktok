package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73768SxI<T, U> extends AtomicInteger implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public static final C73769SxJ<?, ?>[] LJZ = new C73769SxJ[0];
    public static final C73769SxJ<?, ?>[] LJZI = new C73769SxJ[0];
    public static final long serialVersionUID = -2117620485640801370L;
    public final InterfaceC73740Swq<? super U> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends U>> LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public volatile InterfaceC73767SxH<U> LJLJJLL;
    public volatile boolean LJLJL;
    public final C73568Su4 LJLJLJ = new C73568Su4();
    public volatile boolean LJLJLLL;
    public final AtomicReference<C73769SxJ<?, ?>[]> LJLL;
    public final AtomicLong LJLLI;
    public InterfaceC73651SvP LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;

    public final boolean LIZIZ() {
        if (this.LJLJLLL) {
            InterfaceC73767SxH<U> interfaceC73767SxH = this.LJLJJLL;
            if (interfaceC73767SxH != null) {
                interfaceC73767SxH.clear();
            }
            return true;
        }
        if (!this.LJLJI && this.LJLJLJ.get() != null) {
            InterfaceC73767SxH<U> interfaceC73767SxH2 = this.LJLJJLL;
            if (interfaceC73767SxH2 != null) {
                interfaceC73767SxH2.clear();
            }
            Throwable terminate = this.LJLJLJ.terminate();
            if (terminate != C73864Syq.LIZ) {
                this.LJLIL.onError(terminate);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0190, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0167, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0116, code lost:
    
        r20 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x011c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0122, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0123, code lost:
    
        X.V0N.LJJIL(r1);
        X.EnumC73755Sx5.cancel(r12);
        r22.LJLJLJ.addThrowable(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0130, code lost:
    
        if (r22.LJLJI == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0132, code lost:
    
        r22.LJLLILLLL.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x013b, code lost:
    
        if (LIZIZ() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r20 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x013e, code lost:
    
        LJFF(r12);
        r13 = r13 + 1;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x013d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x009c, code lost:
    
        if (r7 > r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r7 = r8.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x009e, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x009f, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a6, code lost:
    
        if (r8[r6].LJLIL != r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0169, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x016b, code lost:
    
        if (r6 != r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x016d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x016e, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0170, code lost:
    
        if (r13 >= r7) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (LIZIZ() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00a8, code lost:
    
        r22.LJLLLL = r6;
        r22.LJLLL = r8[r6].LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0061, code lost:
    
        r1 = r22.LJLJLJ.terminate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0069, code lost:
    
        if (r1 == X.C73864Syq.LIZ) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x006b, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x006d, code lost:
    
        r11.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0071, code lost:
    
        r11.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x008c, code lost:
    
        if (r7 == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0174, code lost:
    
        r1 = 0;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        r11.onNext(r7);
        r4 = r4 + 1;
        r2 = r2 + 1;
        r20 = r20 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r2 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r19 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r20 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r7 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r20 = r22.LJLLI.addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r20 == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        r2 = r22.LJLJL;
        r1 = r22.LJLJJLL;
        r8 = r22.LJLL.get();
        r7 = r8.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (r1.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        if (r7 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        r2 = r22.LJLLL;
        r6 = r22.LJLLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r7 <= r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r8[r6].LJLIL == r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        r16 = false;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (LIZIZ() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        r12 = r8[r6];
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (LIZIZ() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        r15 = r12.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r20 == r17) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        r14 = r15.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
    
        if (r14 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
    
        r11.onNext(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f4, code lost:
    
        if (LIZIZ() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        r20 = r20 - 1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        if (r2 == r17) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0101, code lost:
    
        if (r19 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
    
        r20 = r22.LJLLI.addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        r12.LIZIZ(r2);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0111, code lost:
    
        if (r20 == r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        if (r14 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011f, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        r1 = r12.LJLJJL;
        r0 = r12.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cc, code lost:
    
        if (r1 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d4, code lost:
    
        if (r0.isEmpty() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d6, code lost:
    
        LJFF(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dd, code lost:
    
        if (LIZIZ() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        r4 = r4 + 1;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00df, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r20 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0163, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0165, code lost:
    
        if (r6 != r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        r13 = r13 + 1;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
    
        if (r13 < r7) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0158, code lost:
    
        r22.LJLLLL = r6;
        r22.LJLLL = r8[r6].LJLIL;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017a, code lost:
    
        if (r4 != r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
    
        r22.LJLLILLLL.request(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        if (r16 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r2 = 0;
        r7 = (U) null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73768SxI.LIZLLL():void");
    }

    public final InterfaceC73767SxH LJ() {
        InterfaceC73767SxH<U> interfaceC73767SxH = this.LJLJJLL;
        if (interfaceC73767SxH == null) {
            if (this.LJLJJI == Integer.MAX_VALUE) {
                interfaceC73767SxH = new C73912Szc<>(this.LJLJJL);
            } else {
                interfaceC73767SxH = new C73913Szd<>(this.LJLJJI);
            }
            this.LJLJJLL = interfaceC73767SxH;
        }
        return interfaceC73767SxH;
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        InterfaceC73767SxH<U> interfaceC73767SxH;
        C73769SxJ<?, ?>[] andSet;
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            this.LJLLILLLL.cancel();
            C73769SxJ<?, ?>[] c73769SxJArr = this.LJLL.get();
            C73769SxJ<?, ?>[] c73769SxJArr2 = LJZI;
            if (c73769SxJArr != c73769SxJArr2 && (andSet = this.LJLL.getAndSet(c73769SxJArr2)) != c73769SxJArr2) {
                for (C73769SxJ<?, ?> c73769SxJ : andSet) {
                    c73769SxJ.getClass();
                    EnumC73755Sx5.cancel(c73769SxJ);
                }
                Throwable terminate = this.LJLJLJ.terminate();
                if (terminate != null && terminate != C73864Syq.LIZ) {
                    C73548Stk.LIZIZ(terminate);
                }
            }
            if (getAndIncrement() == 0 && (interfaceC73767SxH = this.LJLJJLL) != null) {
                interfaceC73767SxH.clear();
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        LIZJ();
    }

    public final void LIZJ() {
        if (getAndIncrement() == 0) {
            LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(C73769SxJ<T, U> c73769SxJ) {
        C73769SxJ<?, ?>[] c73769SxJArr;
        while (true) {
            C73769SxJ<?, ?>[] c73769SxJArr2 = this.LJLL.get();
            int length = c73769SxJArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c73769SxJArr2[i] != c73769SxJ) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c73769SxJArr = LJZ;
            } else {
                c73769SxJArr = new C73769SxJ[length - 1];
                System.arraycopy(c73769SxJArr2, 0, c73769SxJArr, 0, i);
                System.arraycopy(c73769SxJArr2, i + 1, c73769SxJArr, i, (length - i) - 1);
            }
            AtomicReference<C73769SxJ<?, ?>[]> atomicReference = this.LJLL;
            while (!atomicReference.compareAndSet(c73769SxJArr2, c73769SxJArr)) {
                if (atomicReference.get() != c73769SxJArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJL) {
            C73548Stk.LIZIZ(th);
        } else if (this.LJLJLJ.addThrowable(th)) {
            this.LJLJL = true;
            LIZJ();
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.Su6, X.SxH] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Su6] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.InterfaceC73740Swq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(T r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73768SxI.onNext(java.lang.Object):void");
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLLILLLL, interfaceC73651SvP)) {
            this.LJLLILLLL = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            if (!this.LJLJLLL) {
                int i = this.LJLJJI;
                if (i == Integer.MAX_VALUE) {
                    interfaceC73651SvP.request(Long.MAX_VALUE);
                } else {
                    interfaceC73651SvP.request(i);
                }
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLLI, j);
            LIZJ();
        }
    }

    public C73768SxI(InterfaceC73740Swq<? super U> interfaceC73740Swq, InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends U>> interfaceC48038ItG, boolean z, int i, int i2) {
        AtomicReference<C73769SxJ<?, ?>[]> atomicReference = new AtomicReference<>();
        this.LJLL = atomicReference;
        this.LJLLI = new AtomicLong();
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLZ = Math.max(1, i >> 1);
        atomicReference.lazySet(LJZ);
    }
}
