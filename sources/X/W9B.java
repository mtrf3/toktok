package X;

/* loaded from: classes15.dex */
public class W9B {
    public int LIZ;
    public int LIZIZ;

    public final void LIZ(int i) {
        int i2;
        int i3 = this.LIZIZ;
        if (i3 >= i && (i2 = this.LIZ) > 0) {
            this.LIZ = i2 - 1;
            this.LIZIZ = i3 - i;
        } else {
            W58.LJIJI("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZ));
        }
    }
}
