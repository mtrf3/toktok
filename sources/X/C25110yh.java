package X;

/* renamed from: X.0yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25110yh implements Comparable<C25110yh> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // java.lang.Comparable
    public final int compareTo(C25110yh c25110yh) {
        C25110yh c25110yh2 = c25110yh;
        int i = this.LJLIL - c25110yh2.LJLIL;
        if (i == 0) {
            return this.LJLILLLLZI - c25110yh2.LJLILLLLZI;
        }
        return i;
    }

    public C25110yh(int i, int i2, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
