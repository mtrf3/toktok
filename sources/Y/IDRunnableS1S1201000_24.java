package Y;

import com.byted.cast.common.config.IInitListener;

/* loaded from: classes29.dex */
public class IDRunnableS1S1201000_24 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void run$0(IDRunnableS1S1201000_24 iDRunnableS1S1201000_24) {
        IInitListener iInitListener = (IInitListener) iDRunnableS1S1201000_24.l1;
        int i = iDRunnableS1S1201000_24.i3;
        String str = iDRunnableS1S1201000_24.s0;
        Exception exc = (Exception) iDRunnableS1S1201000_24.l2;
        if (iInitListener != null) {
            iInitListener.onFail(i, str, exc);
        }
    }

    public static final void run$1(IDRunnableS1S1201000_24 iDRunnableS1S1201000_24) {
        IInitListener iInitListener = (IInitListener) iDRunnableS1S1201000_24.l1;
        int i = iDRunnableS1S1201000_24.i3;
        String str = iDRunnableS1S1201000_24.s0;
        Exception exc = (Exception) iDRunnableS1S1201000_24.l2;
        if (iInitListener != null) {
            iInitListener.onFail(i, str, exc);
        }
    }

    public IDRunnableS1S1201000_24(IInitListener iInitListener, int i, String str, Exception exc, int i2) {
        this.$t = i2;
        this.l1 = iInitListener;
        this.i3 = i;
        this.s0 = str;
        this.l2 = exc;
    }
}
