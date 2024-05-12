package X;

/* loaded from: classes12.dex */
public final class RB9 implements RBL {
    public static final RBE LIZJ = RBE.LENGTH_RANGE_RULE;
    public final int LIZ = 8;
    public final int LIZIZ = 20;

    @Override // X.RBL
    public final RB8 LIZ(String str) {
        boolean z;
        RBE rbe = LIZJ;
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        int length = str.length();
        if (i <= length && length <= i2) {
            z = true;
        } else {
            z = false;
        }
        return new RB8(rbe, z, null);
    }
}
