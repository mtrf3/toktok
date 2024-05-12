package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* loaded from: classes12.dex */
public final class RBD implements RBL {
    public static final RBE LIZIZ = RBE.SPECIAL_CHAR_CONTAINED;
    public final RBK LIZ = new RBK();

    @Override // X.RBL
    public final RB8 LIZ(String str) {
        RBE rbe = LIZIZ;
        this.LIZ.getClass();
        return new RB8(rbe, PatternProtector.compile(".*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*").matcher(str).matches(), null);
    }
}
