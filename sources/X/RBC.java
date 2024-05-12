package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* loaded from: classes12.dex */
public final class RBC implements RBL {
    public static final RBE LIZIZ = RBE.LETTER_AND_NUMBER_CONTAINED;
    public final RBK LIZ = new RBK();

    @Override // X.RBL
    public final RB8 LIZ(String str) {
        boolean z;
        RBE rbe = LIZIZ;
        this.LIZ.getClass();
        if (PatternProtector.compile(".*[A-Za-z].*").matcher(str).matches() && PatternProtector.compile(".*[\\d].*").matcher(str).matches()) {
            z = true;
        } else {
            z = false;
        }
        return new RB8(rbe, z, null);
    }
}
