package X;

/* loaded from: classes13.dex */
public final class T1K implements Comparable<T1K> {
    public final Runnable LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public volatile boolean LJLJJI;

    @Override // java.lang.Comparable
    public final int compareTo(T1K t1k) {
        T1K t1k2 = t1k;
        long j = this.LJLILLLLZI;
        long j2 = t1k2.LJLILLLLZI;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        int i = this.LJLJI;
        int i2 = t1k2.LJLJI;
        if (i < i2) {
            return -1;
        }
        if (i <= i2) {
            return 0;
        }
        return 1;
    }

    public T1K(Runnable runnable, Long l, int i) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = l.longValue();
        this.LJLJI = i;
    }
}
