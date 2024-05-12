package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Szc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73912Szc<T> implements InterfaceC73767SxH<T> {
    public static final int LJLJLLL = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object LJLL = new Object();
    public final AtomicLong LJLIL;
    public int LJLILLLLZI;
    public long LJLJI;
    public final int LJLJJI;
    public AtomicReferenceArray<Object> LJLJJL;
    public final int LJLJJLL;
    public AtomicReferenceArray<Object> LJLJL;
    public final AtomicLong LJLJLJ;

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        if (this.LJLIL.get() == this.LJLJLJ.get()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73767SxH, X.InterfaceC73570Su6
    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.LJLJL;
        long j = this.LJLJLJ.get();
        int i = this.LJLJJLL;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        if (t == LJLL) {
            z = true;
        } else {
            z = false;
        }
        if (t != null) {
            if (!z) {
                atomicReferenceArray.lazySet(i2, null);
                this.LJLJLJ.lazySet(j + 1);
                return t;
            }
        } else if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.LJLJL = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            this.LJLJLJ.lazySet(j + 1);
        }
        return t2;
    }

    @Override // X.InterfaceC73570Su6
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public C73912Szc(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.LJLIL = atomicLong;
        this.LJLJLJ = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.LJLJJL = atomicReferenceArray;
        this.LJLJJI = i2;
        this.LJLILLLLZI = Math.min(numberOfLeadingZeros / 4, LJLJLLL);
        this.LJLJL = atomicReferenceArray;
        this.LJLJJLL = i2;
        this.LJLJI = i2 - 1;
        atomicLong.lazySet(0L);
    }

    @Override // X.InterfaceC73570Su6
    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.LJLJJL;
            long j = this.LJLIL.get();
            int i = this.LJLJJI;
            int i2 = ((int) j) & i;
            if (j < this.LJLJI) {
                atomicReferenceArray.lazySet(i2, t);
                this.LJLIL.lazySet(j + 1);
                return true;
            }
            long j2 = this.LJLILLLLZI + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.LJLJI = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.LJLIL.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.LJLIL.lazySet(j3);
                return true;
            }
            long j4 = i;
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.LJLJJL = atomicReferenceArray2;
            this.LJLJI = (j4 + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, LJLL);
            this.LJLIL.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
