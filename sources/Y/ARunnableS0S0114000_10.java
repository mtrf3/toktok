package Y;

import com.lynx.tasm.image.AutoSizeImage;

/* loaded from: classes11.dex */
public class ARunnableS0S0114000_10 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S0114000_10 aRunnableS0S0114000_10) {
        boolean LIZ;
        try {
            ((AutoSizeImage) aRunnableS0S0114000_10.l0).LJJIII(aRunnableS0S0114000_10.i2, aRunnableS0S0114000_10.i3, aRunnableS0S0114000_10.i4, aRunnableS0S0114000_10.i5, aRunnableS0S0114000_10.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0114000_10 aRunnableS0S0114000_10) {
        boolean LIZ;
        try {
            ((AutoSizeImage) aRunnableS0S0114000_10.l0).LJJIII(aRunnableS0S0114000_10.i2, aRunnableS0S0114000_10.i3, aRunnableS0S0114000_10.i4, aRunnableS0S0114000_10.i5, aRunnableS0S0114000_10.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0114000_10(AutoSizeImage autoSizeImage, boolean z, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = autoSizeImage;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
    }
}
