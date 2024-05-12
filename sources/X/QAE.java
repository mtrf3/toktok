package X;

/* loaded from: classes12.dex */
public final class QAE extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Integer LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public QAE(int i, String str, Integer num, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
        this.LJLJJI = str2;
    }

    public /* synthetic */ QAE(String str, int i, String str2, int i2) {
        this(i, str, (Integer) null, (i2 & 8) != 0 ? null : str2);
    }
}
