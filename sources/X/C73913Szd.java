package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Szd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73913Szd<E> extends AtomicReferenceArray<E> implements InterfaceC73767SxH<E> {
    public static final Integer LJLJJLL = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public static final long serialVersionUID = -1296597691183856449L;
    public final int LJLIL;
    public final AtomicLong LJLILLLLZI;
    public long LJLJI;
    public final AtomicLong LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC73570Su6
    public boolean isEmpty() {
        if (this.LJLILLLLZI.get() == this.LJLJJI.get()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73767SxH, X.InterfaceC73570Su6
    public E poll() {
        long j = this.LJLJJI.get();
        int i = ((int) j) & this.LJLIL;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.LJLJJI.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    @Override // X.InterfaceC73570Su6
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public C73913Szd(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.LJLIL = length() - 1;
        this.LJLILLLLZI = new AtomicLong();
        this.LJLJJI = new AtomicLong();
        this.LJLJJL = Math.min(i / 4, LJLJJLL.intValue());
    }

    @Override // X.InterfaceC73570Su6
    public boolean offer(E e) {
        if (e != null) {
            int i = this.LJLIL;
            long j = this.LJLILLLLZI.get();
            int i2 = ((int) j) & i;
            if (j >= this.LJLJI) {
                long j2 = this.LJLJJL + j;
                if (get(i & ((int) j2)) == null) {
                    this.LJLJI = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.LJLILLLLZI.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public boolean offer(E e, E e2) {
        if (offer(e) && offer(e2)) {
            return true;
        }
        return false;
    }
}
