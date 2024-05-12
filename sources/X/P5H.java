package X;

/* loaded from: classes12.dex */
public class P5H {
    public final P5I[] LIZ;

    public P5H(long[] jArr) {
        if (jArr != null) {
            if (jArr.length > 1) {
                this.LIZ = new P5I[jArr.length / 2];
                for (int i = 1; i < jArr.length; i++) {
                    P5I p5i = new P5I();
                    p5i.LIZ = jArr[i - 1];
                    p5i.LIZIZ = jArr[i];
                    p5i.LIZJ = -1L;
                    this.LIZ[i / 2] = p5i;
                }
            }
        }
    }
}
