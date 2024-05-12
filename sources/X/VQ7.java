package X;

import com.lynx.react.bridge.ReadableArray;

/* loaded from: classes15.dex */
public final class VQ7 {
    public static final VQ7 LJ = new VQ7();
    public final float LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public VQ7() {
        this.LIZ = 0.5f;
        this.LIZIZ = 1;
        this.LIZJ = 0.5f;
        this.LIZLLL = 1;
    }

    public VQ7(ReadableArray readableArray) {
        this.LIZ = (float) readableArray.getDouble(0);
        this.LIZIZ = readableArray.getInt(1);
        if (readableArray.size() >= 4) {
            this.LIZJ = (float) readableArray.getDouble(2);
            this.LIZLLL = readableArray.getInt(3);
        } else {
            this.LIZJ = 0.5f;
            this.LIZLLL = 1;
        }
    }
}
