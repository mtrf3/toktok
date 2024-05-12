package X;

/* loaded from: classes12.dex */
public final class PHI implements Comparable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public long LJLJJL = System.currentTimeMillis();
    public int LJLJJI = 1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.LJLJI;
        long j2 = ((PHI) obj).LJLJI;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public PHI(String str, long j, String str2) {
        this.LJLIL = str;
        this.LJLJI = j;
        this.LJLILLLLZI = str2;
    }
}
