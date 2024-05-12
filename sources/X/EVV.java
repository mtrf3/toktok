package X;

import com.bytedance.common.jato.shrinker.Shrinker;

/* loaded from: classes7.dex */
public final class EVV implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Shrinker.getInstance().doShrink(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public EVV(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
