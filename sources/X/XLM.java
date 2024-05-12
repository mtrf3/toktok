package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLM<T> extends XLN<XLR> implements C33R<T>, InterfaceC65462ha, InterfaceC79903Bq<T> {
    public int LJLJJL;
    public volatile /* synthetic */ Object _state;

    @Override // X.XLN
    public final XLT[] LJFF() {
        return new XLR[2];
    }

    @Override // X.C3BJ
    public final void LIZ() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // X.XLN
    public final XLR LJ() {
        return new XLR();
    }

    @Override // X.C33R, X.InterfaceC71762rk
    public final T getValue() {
        C3BS c3bs = C94103mg.LIZ;
        T t = (T) this._state;
        if (t == c3bs) {
            return null;
        }
        return t;
    }

    public XLM(Object obj) {
        this._state = obj;
    }

    @Override // X.C3BJ
    public final boolean LIZIZ(T t) {
        setValue(t);
        return true;
    }

    @Override // X.C33R
    public final void setValue(T t) {
        if (t == null) {
            t = (T) C94103mg.LIZ;
        }
        LJII(null, t);
    }

    public final boolean LJII(Object obj, Object obj2) {
        C3BS c3bs;
        int i;
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !o.LJ(obj3, obj)) {
                return false;
            }
            if (o.LJ(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.LJLJJL;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.LJLJJL = i3;
                Object obj4 = this.LJLIL;
                while (true) {
                    XLR[] xlrArr = (XLR[]) obj4;
                    if (xlrArr != null) {
                        for (XLR xlr : xlrArr) {
                            if (xlr != null) {
                                while (true) {
                                    Object obj5 = xlr._state;
                                    if (obj5 != null && obj5 != (c3bs = V8H.LIZIZ)) {
                                        C3BS c3bs2 = V8H.LIZ;
                                        if (obj5 == c3bs2) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = XLR.LIZ;
                                            while (!atomicReferenceFieldUpdater.compareAndSet(xlr, obj5, c3bs)) {
                                                if (atomicReferenceFieldUpdater.get(xlr) != obj5) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = XLR.LIZ;
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(xlr, obj5, c3bs2)) {
                                                if (atomicReferenceFieldUpdater2.get(xlr) != obj5) {
                                                    break;
                                                }
                                            }
                                            C76800UCe c76800UCe = C76800UCe.LIZ;
                                            C3C5.m7constructorimpl(c76800UCe);
                                            ((XKS) obj5).resumeWith(c76800UCe);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.LJLJJL;
                        if (i == i3) {
                            this.LJLJJL = i3 + 1;
                            return true;
                        }
                        obj4 = this.LJLIL;
                    }
                    i3 = i;
                }
            } else {
                this.LJLJJL = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r1) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        if (X.C76800UCe.LIZ == r9) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:13:0x0037, B:14:0x0086, B:18:0x0093, B:20:0x00b8, B:23:0x00cb, B:24:0x00e3, B:30:0x00e9, B:36:0x0101, B:26:0x00f2, B:29:0x00f8, B:40:0x0099, B:43:0x00a0, B:49:0x008b, B:51:0x0107, B:52:0x010b, B:57:0x00b5, B:59:0x0076, B:60:0x0079), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:13:0x0037, B:14:0x0086, B:18:0x0093, B:20:0x00b8, B:23:0x00cb, B:24:0x00e3, B:30:0x00e9, B:36:0x0101, B:26:0x00f2, B:29:0x00f8, B:40:0x0099, B:43:0x00a0, B:49:0x008b, B:51:0x0107, B:52:0x010b, B:57:0x00b5, B:59:0x0076, B:60:0x0079), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.concurrent.atomic.AtomicReferenceFieldUpdater] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2kd] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.XLR] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.XLT] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.XLR] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.XLR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.XLR] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ca -> B:14:0x0086). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC65462ha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC64672gJ<? super T> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XLM.collect(X.2gJ, X.2kd):java.lang.Object");
    }

    @Override // X.C33R
    public final boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) C94103mg.LIZ;
        }
        if (t2 == null) {
            t2 = (T) C94103mg.LIZ;
        }
        return LJII(t, t2);
    }

    @Override // X.C3BJ, X.InterfaceC64672gJ
    public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        setValue(t);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
    
        if (r4 == X.XKI.DROP_OLDEST) goto L7;
     */
    @Override // X.InterfaceC79903Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65462ha<T> fuse(X.MBA r2, int r3, X.XKI r4) {
        /*
            r1 = this;
            if (r3 < 0) goto Lb
            r0 = 1
            if (r3 > r0) goto Lf
        L5:
            X.XKI r0 = X.XKI.DROP_OLDEST
            if (r4 != r0) goto Lf
        L9:
            r0 = r1
        La:
            return r0
        Lb:
            r0 = -2
            if (r3 != r0) goto Lf
            goto L5
        Lf:
            if (r3 == 0) goto L14
            r0 = -3
            if (r3 != r0) goto L19
        L14:
            X.XKI r0 = X.XKI.SUSPEND
            if (r4 != r0) goto L19
            goto L9
        L19:
            X.3BZ r0 = new X.3BZ
            r0.<init>(r3, r2, r4, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XLM.fuse(X.MBA, int, X.XKI):X.2ha");
    }
}
