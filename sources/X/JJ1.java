package X;

/* loaded from: classes9.dex */
public class JJ1 implements R47 {
    public final JJ4 LIZ;

    public JJ1(JJ4 jj4) {
        this.LIZ = jj4;
    }

    @Override // X.R47
    public void onResult(int i, int i2, Object obj) {
        JJ4 jj4 = this.LIZ;
        if (jj4 != null && i == 1) {
            if (i2 == 1) {
                jj4.LIZ();
            } else {
                jj4.LIZIZ();
            }
        }
    }
}
