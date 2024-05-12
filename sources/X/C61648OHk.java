package X;

/* renamed from: X.OHk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61648OHk extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C61648OHk(int i, String str, Object obj, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        obj = (i2 & 4) != 0 ? null : obj;
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = obj;
    }
}
